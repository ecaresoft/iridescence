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
package org.compiere.model;

import java.math.*;
import java.sql.*;
import java.util.*;
import org.compiere.util.*;


/**
 *	RMA Line Model
 *	
 *  @author Jorg Janke
 *  @version $Id: MRMALine.java,v 1.3 2006/07/30 00:51:03 jjanke Exp $
 */
public class MRMALine extends X_M_RMALine
{

	/**
	 * 	Standard Constructor
	 *	@param ctx context
	 *	@param M_RMALine_ID id
	 *	@param trxName transaction
	 */
	public MRMALine (Properties ctx, int M_RMALine_ID, String trxName)
	{
		super (ctx, M_RMALine_ID, trxName);
		if (M_RMALine_ID == 0)
		{
			setQty(Env.ONE);
		}
	}	//	MRMALine

	/**
	 * 	Load Cosntructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MRMALine (Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}	//	MRMALine
	
	/**	Shipment Line			*/
	private MInOutLine m_ioLine = null;
	
	
	/**
	 * 	Set M_InOutLine_ID
	 *	@param M_InOutLine_ID
	 */
	public void setM_InOutLine_ID (int M_InOutLine_ID)
	{
		super.setM_InOutLine_ID (M_InOutLine_ID);
		m_ioLine = null;
	}	//	setM_InOutLine_ID
	
	/**
	 * 	Get Ship Line
	 *	@return ship line
	 */
	public MInOutLine getShipLine()
	{
		if (m_ioLine == null && getM_InOutLine_ID() != 0)
			m_ioLine = new MInOutLine (getCtx(), getM_InOutLine_ID(), get_TrxName());
		return m_ioLine;
	}	//	getShipLine
	
	/**
	 * 	Get Total Amt
	 *	@return amt
	 */
	public BigDecimal getAmt()
	{
		BigDecimal amt = Env.ZERO;
		getShipLine();
		if (m_ioLine != null)
		{
			if (m_ioLine.getC_OrderLine_ID() != 0)
			{
				MOrderLine ol = new MOrderLine (getCtx(), m_ioLine.getC_OrderLine_ID(), get_TrxName());
				amt = ol.getPriceActual();
			}
		}
		//
		return amt.multiply(getQty());
	}	//	getAmt
	
	/**
     * Get UOM
     * Based on Shipment line if present
     * Default to Each (100) for charge
     * @return UOM if based on shipment line and 100 for charge based
     */
    public int getC_UOM_ID()
    {
        if (m_ioLine == null) // Charge
        {
            return 100; // Each
        }
        
        return m_ioLine.getC_UOM_ID();
    }
    
    /**
     * Get Product
     * @return product if based on shipment line and 0 for charge based
     */
    public int getM_Product_ID()
    {
        if (getC_Charge_ID() != 0)
        {
            return 0;
        }
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getM_Product_ID();
    }
    
    /**
     * Get Project
     * @return project if based on shipment line and 0 for charge based
     */
    public int getC_Project_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getC_Project_ID();
    }
    
    /**
     * Get Project Phase
     * @return project phase if based on shipment line and 0 for charge based
     */
    public int getC_ProjectPhase_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getC_ProjectPhase_ID();
    }
    
    /**
     * Get Project Task
     * @return project task if based on shipment line and 0 for charge based
     */
    public int getC_ProjectTask_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getC_ProjectTask_ID();
    }
    
    /**
     * Get Activity
     * @return project phase if based on shipment line and 0 for charge based
     */
    public int getC_Activity_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getC_Activity_ID();
    }
    
    /**
     * Get Campaign
     * @return campaign if based on shipment line and 0 for charge based
     */
    public int getC_Campaign_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getC_Campaign_ID();
    }
    
    /**
     * Get Org Trx
     * @return Org Trx if based on shipment line and 0 for charge based
     */
    public int getAD_OrgTrx_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getAD_OrgTrx_ID();
    }
    
    /**
     * Get User1
     * @return user1 if based on shipment line and 0 for charge based
     */
    public int getUser1_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getUser1_ID();
    }
    
    /**
     * Get User2
     * @return user2 if based on shipment line and 0 for charge based
     */
    public int getUser2_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getUser2_ID();
    }
    
    /**
     * Get Attribute Set Instance
     * @return ASI if based on shipment line and 0 for charge based
     */
    public int getM_AttributeSetInstance_ID()
    {
        if (m_ioLine == null)
        {
            return 0;
        }
        return m_ioLine.getM_AttributeSetInstance_ID();
    }

	
	
}	//	MRMALine
