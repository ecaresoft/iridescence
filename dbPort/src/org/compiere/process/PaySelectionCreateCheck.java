/******************************************************************************
 * Product: Compiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.process;

import java.util.*;
import java.util.logging.*;
import org.compiere.model.*;
import org.compiere.util.DB;
 

/**
 *	Create Checks from Payment Selection Line
 *	
 *  @author Jorg Janke
 *  @version $Id: PaySelectionCreateCheck.java,v 1.6 2006/08/23 00:51:13 mrojas Exp $
 */
public class PaySelectionCreateCheck extends SvrProcess
{
	/**	Target Payment Rule			*/
	private String		p_PaymentRule = null;
	/**	Payment Selection			*/
	private int			p_C_PaySelection_ID = 0;
	/** The checks					*/
	private ArrayList<MPaySelectionCheck>	m_list = new ArrayList<MPaySelectionCheck>();
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("PaymentRule"))
				p_PaymentRule = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}
		p_C_PaySelection_ID = getRecord_ID();
	}	//	prepare

	/**
	 *  Perrform process.
	 *  @return Message (clear text)
	 *  @throws Exception if not successful
	 */
	protected String doIt () throws Exception
	{
		log.info ("doIt - C_PaySelection_ID=" + p_C_PaySelection_ID
			+ ", PaymentRule=" + p_PaymentRule);
		
		MPaySelection psel = new MPaySelection (getCtx(), p_C_PaySelection_ID, get_TrxName());
		if (psel.get_ID() == 0)
			throw new IllegalArgumentException("Not found C_PaySelection_ID=" + p_C_PaySelection_ID);
		if (psel.isProcessed())
			throw new IllegalArgumentException("@Processed@");
		if (p_PaymentRule == null)
			throw new IllegalArgumentException("No PaymentRule");
		//
		MPaySelectionLine[] lines = psel.getLines(false);
		for (int i = 0; i < lines.length; i++)
		{
			MPaySelectionLine line = lines[i];
			if (!line.isActive() || line.isProcessed())
				continue;
			createCheck (line);
		}
		//
		psel.setProcessed(true);
		psel.save();
		
		return "@C_PaySelectionCheck_ID@ - #" + m_list.size();
	}	//	doIt

	/**
	 * 	Create Check from line
	 *	@param line
	 */
	private void createCheck (MPaySelectionLine line)
	{
		//	Try to find one
		for (int i = 0; i < m_list.size(); i++)
		{
			MPaySelectionCheck check = (MPaySelectionCheck)m_list.get(i);
			//	Add to existing
			//Expert:Juan
			//int socio  = check.getC_BPartner_ID();
			//int soc = line.getPayment().getC_BPartner_ID();
			//int idpayment = line.getC_Payment_ID();
			//if (check.getC_BPartner_ID() == line.getInvoice().getC_BPartner_ID())Original
			if (check.getC_BPartner_ID() == line.getInvoice().getC_BPartner_ID() ||  //Juan
				check.getC_BPartner_ID() == line.getPayment().getC_BPartner_ID())//Juan
			//Expert:Juan
			{
				check.addLine(line);
				if (!check.save())
					throw new IllegalStateException("Cannot Save MPaySelectionCheck");
				line.setC_PaySelectionCheck_ID(check.getC_PaySelectionCheck_ID());
				line.setProcessed(true);
				if (!line.save())
					throw new IllegalStateException("Cannot Save MPaySelectionLine");
				//Expert:Juan
				if (line.getPayment().getC_BPartner_ID() > 0) {
					String sql = "UPDATE C_Payment_v SET IsAllocated='Y'"
					+ " WHERE"
					+ " C_Payment_ID=" +line.getC_Payment_ID();
					//int no = 
						DB.executeUpdate(sql, null);
					/*sql  = "Update C_AllocationHdr a set a.isactive = 'N' "
					+ "  where"
					+ " exists (select * from c_allocationline al where al.c_allocationhdr_id = a.c_allocationhdr_id"
					+ " and al.c_payment_id ="+line.getC_Payment_ID()+ ")";
					no = DB.executeUpdate(sql);*/
				}
				//Expert:Juan
				return;
			}
		}
		//	Create new
		MPaySelectionCheck check = new MPaySelectionCheck(line, p_PaymentRule);
		if (!check.save())
			throw new IllegalStateException("Cannot Save MPaySelectionCheck");
		line.setC_PaySelectionCheck_ID(check.getC_PaySelectionCheck_ID());
		line.setProcessed(true);
		if (!line.save())
			throw new IllegalStateException("Cannot Save MPaySelectionLine");
		//Expert:Juan
		if (line.getPayment().getC_BPartner_ID() > 0) {
			String sql = "UPDATE C_Payment_v SET IsAllocated='Y'"
				+ " WHERE"
				+ " C_Payment_ID=" +line.getC_Payment_ID();
			//int no = 
				DB.executeUpdate(sql, null);
			/*sql  = "Update C_AllocationHdr a set a.isactive = 'N' "
			+ "  where"
			+ " exists (select * from c_allocationline al where al.c_allocationhdr_id = a.c_allocationhdr_id"
			+ " and al.c_payment_id ="+line.getC_Payment_ID()+ ")";
			no = DB.executeUpdate(sql);*/
		}
		//Expert:Juan
		m_list.add(check);
	}	//	createCheck
	
}	//	PaySelectionCreateCheck