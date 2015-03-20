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

import java.sql.*;
import java.util.logging.*;
import org.compiere.model.*;
import org.compiere.util.*;


/**
 *	Order Batch Processing
 *	
 *  @author Jorg Janke
 *  @version $Id: OrderBatchProcess.java,v 1.2 2006/07/30 00:51:02 jjanke Exp $
 */
public class OrderBatchProcess extends SvrProcess
{
	private int			p_C_DocTypeTarget_ID = 0;
	private String 		p_DocStatus = null;
	private int			p_C_BPartner_ID = 0;
	private String 		p_IsSelfService = null;
	private Timestamp	p_DateOrdered_From = null;
	private Timestamp	p_DateOrdered_To = null;
	private String 		p_DocAction = null;

	/**
	 * 	Prepare
	 */
	protected void prepare ()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("C_DocTypeTarget_ID"))
				p_C_DocTypeTarget_ID = para[i].getParameterAsInt();
			else if (name.equals("DocStatus"))
				p_DocStatus = (String)para[i].getParameter();
			else if (name.equals("IsSelfService"))
				p_IsSelfService = (String)para[i].getParameter();
			else if (name.equals("C_BPartner_ID"))
				p_C_BPartner_ID = para[i].getParameterAsInt();
			else if (name.equals("DateOrdered"))
			{
				p_DateOrdered_From = (Timestamp)para[i].getParameter();
				p_DateOrdered_To = (Timestamp)para[i].getParameter_To();
			}
			else if (name.equals("DocAction"))
				p_DocAction = (String)para[i].getParameter();
			else
				log.log(Level.SEVERE, "Unknown Parameter: " + name);
		}
	}	//	prepare

	/**
	 * 	Process
	 *	@return msg
	 *	@throws Exception
	 */
	protected String doIt () throws Exception
	{
		log.info("C_DocTypeTarget_ID=" + p_C_DocTypeTarget_ID + ", DocStatus=" + p_DocStatus
			+ ", IsSelfService=" + p_IsSelfService + ", C_BPartner_ID=" + p_C_BPartner_ID
			+ ", DateOrdered=" + p_DateOrdered_From + "->" + p_DateOrdered_To
			+ ", DocAction=" + p_DocAction);
		
		if (p_C_DocTypeTarget_ID == 0)
			throw new CompiereUserError("@NotFound@: @C_DocTypeTarget_ID@");
		if (p_DocStatus == null || p_DocStatus.length() != 2)
			throw new CompiereUserError("@NotFound@: @DocStatus@");
		if (p_DocAction == null || p_DocAction.length() != 2)
			throw new CompiereUserError("@NotFound@: @DocAction@");
		
		//
		StringBuffer sql = new StringBuffer("SELECT * FROM C_Order "
			+ "WHERE C_DocTypeTarget_ID=? AND DocStatus=?");
		if (p_IsSelfService != null && p_IsSelfService.length() == 1)
			sql.append(" AND IsSelfService='").append(p_IsSelfService).append("'");
		if (p_C_BPartner_ID != 0)
			sql.append(" AND C_BPartner_ID=").append(p_C_BPartner_ID);
		if (p_DateOrdered_From != null) {
			if (DB.isOracle()) {
				sql.append(" AND TRUNC(DateOrdered) >= ").append(DB.TO_DATE(p_DateOrdered_From, true));
			} else if (DB.isPostgreSQL()) {
				sql.append(" AND DATE_TRUNC('day', DateOrdered) >= ").append(DB.TO_DATE(p_DateOrdered_From, true));
			}
		}
		if (p_DateOrdered_To != null) {
			if (DB.isOracle()) {
				sql.append(" AND TRUNC(DateOrdered) <= ").append(DB.TO_DATE(p_DateOrdered_To, true));
			} else if (DB.isPostgreSQL()) {
				sql.append(" AND DATE_TRUNC('day', DateOrdered) <= ").append(DB.TO_DATE(p_DateOrdered_To, true));
			}
		}
		
		int counter = 0;
		int errCounter = 0;
		PreparedStatement pstmt = null;
		try
		{
			pstmt = DB.prepareStatement(sql.toString(), get_TrxName());
			pstmt.setInt(1, p_C_DocTypeTarget_ID);
			pstmt.setString(2, p_DocStatus);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				if (process(new MOrder(getCtx(),rs, get_TrxName())))
					counter++;
				else
					errCounter++;
			}
			rs.close();
			pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			log.log(Level.SEVERE, sql.toString(), e);
		}
		try
		{
			if (pstmt != null)
				pstmt.close();
			pstmt = null;
		}
		catch (Exception e)
		{
			pstmt = null;
		}
		return "@Updated@=" + counter + ", @Errors@=" + errCounter;
	}	//	doIt
	
	/**
	 * 	Process Order
	 *	@param order order
	 *	@return true if ok
	 */
	private boolean process (MOrder order)
	{
		log.info(order.toString());
		//
		order.setDocAction(p_DocAction);
		if (order.processIt(p_DocAction))
		{
			order.save();
			addLog(0, null, null, order.getDocumentNo() + ": OK");
			return true;
		}
		addLog (0, null, null, order.getDocumentNo() + ": Error " + order.getProcessMsg());
		return false;
	}	//	process
	
}	//	OrderBatchProcess
