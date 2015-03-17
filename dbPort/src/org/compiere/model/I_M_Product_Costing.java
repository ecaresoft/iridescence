/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for M_Product_Costing
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_M_Product_Costing 
{

    /** TableName=M_Product_Costing */
    public static final String Table_Name = "M_Product_Costing";

    /** AD_Table_ID=327 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 2 - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

    /** Load Meta Data */

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_AcctSchema_ID */
    public static final String COLUMNNAME_C_AcctSchema_ID = "C_AcctSchema_ID";

	/** Set Accounting Schema.
	  * Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID);

	/** Get Accounting Schema.
	  * Rules for accounting
	  */
	public int getC_AcctSchema_ID();

	public I_C_AcctSchema getC_AcctSchema() throws RuntimeException;

    /** Column name CostAverage */
    public static final String COLUMNNAME_CostAverage = "CostAverage";

	/** Set Average Cost.
	  * Weighted average costs
	  */
	public void setCostAverage (BigDecimal CostAverage);

	/** Get Average Cost.
	  * Weighted average costs
	  */
	public BigDecimal getCostAverage();

    /** Column name CostAverageCumAmt */
    public static final String COLUMNNAME_CostAverageCumAmt = "CostAverageCumAmt";

	/** Set Average Cost Amount Sum.
	  * Cumulative average cost amounts (internal)
	  */
	public void setCostAverageCumAmt (BigDecimal CostAverageCumAmt);

	/** Get Average Cost Amount Sum.
	  * Cumulative average cost amounts (internal)
	  */
	public BigDecimal getCostAverageCumAmt();

    /** Column name CostAverageCumQty */
    public static final String COLUMNNAME_CostAverageCumQty = "CostAverageCumQty";

	/** Set Average Cost Quantity Sum.
	  * Cumulative average cost quantities (internal)
	  */
	public void setCostAverageCumQty (BigDecimal CostAverageCumQty);

	/** Get Average Cost Quantity Sum.
	  * Cumulative average cost quantities (internal)
	  */
	public BigDecimal getCostAverageCumQty();

    /** Column name CostStandard */
    public static final String COLUMNNAME_CostStandard = "CostStandard";

	/** Set Standard Cost.
	  * Standard Costs
	  */
	public void setCostStandard (BigDecimal CostStandard);

	/** Get Standard Cost.
	  * Standard Costs
	  */
	public BigDecimal getCostStandard();

    /** Column name CostStandardCumAmt */
    public static final String COLUMNNAME_CostStandardCumAmt = "CostStandardCumAmt";

	/** Set Std Cost Amount Sum.
	  * Standard Cost Invoice Amount Sum (internal)
	  */
	public void setCostStandardCumAmt (BigDecimal CostStandardCumAmt);

	/** Get Std Cost Amount Sum.
	  * Standard Cost Invoice Amount Sum (internal)
	  */
	public BigDecimal getCostStandardCumAmt();

    /** Column name CostStandardCumQty */
    public static final String COLUMNNAME_CostStandardCumQty = "CostStandardCumQty";

	/** Set Std Cost Quantity Sum.
	  * Standard Cost Invoice Quantity Sum (internal)
	  */
	public void setCostStandardCumQty (BigDecimal CostStandardCumQty);

	/** Get Std Cost Quantity Sum.
	  * Standard Cost Invoice Quantity Sum (internal)
	  */
	public BigDecimal getCostStandardCumQty();

    /** Column name CostStandardPOAmt */
    public static final String COLUMNNAME_CostStandardPOAmt = "CostStandardPOAmt";

	/** Set Std PO Cost Amount Sum.
	  * Standard Cost Purchase Order Amount Sum (internal)
	  */
	public void setCostStandardPOAmt (BigDecimal CostStandardPOAmt);

	/** Get Std PO Cost Amount Sum.
	  * Standard Cost Purchase Order Amount Sum (internal)
	  */
	public BigDecimal getCostStandardPOAmt();

    /** Column name CostStandardPOQty */
    public static final String COLUMNNAME_CostStandardPOQty = "CostStandardPOQty";

	/** Set Std PO Cost Quantity Sum.
	  * Standard Cost Purchase Order Quantity Sum (internal)
	  */
	public void setCostStandardPOQty (BigDecimal CostStandardPOQty);

	/** Get Std PO Cost Quantity Sum.
	  * Standard Cost Purchase Order Quantity Sum (internal)
	  */
	public BigDecimal getCostStandardPOQty();

    /** Column name CurrentCostPrice */
    public static final String COLUMNNAME_CurrentCostPrice = "CurrentCostPrice";

	/** Set Current Cost Price.
	  * The currently used cost price
	  */
	public void setCurrentCostPrice (BigDecimal CurrentCostPrice);

	/** Get Current Cost Price.
	  * The currently used cost price
	  */
	public BigDecimal getCurrentCostPrice();

    /** Column name FutureCostPrice */
    public static final String COLUMNNAME_FutureCostPrice = "FutureCostPrice";

	/** Set Future Cost Price	  */
	public void setFutureCostPrice (BigDecimal FutureCostPrice);

	/** Get Future Cost Price	  */
	public BigDecimal getFutureCostPrice();

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public I_M_Product getM_Product() throws RuntimeException;

    /** Column name PriceActual */
    public static final String COLUMNNAME_PriceActual = "PriceActual";

	/** Set Unit Price.
	  * Actual Price 
	  */
	public void setPriceActual (BigDecimal PriceActual);

	/** Get Unit Price.
	  * Actual Price 
	  */
	public BigDecimal getPriceActual();

    /** Column name PriceLastInv */
    public static final String COLUMNNAME_PriceLastInv = "PriceLastInv";

	/** Set Last Invoice Price.
	  * Price of the last invoice for the product
	  */
	public void setPriceLastInv (BigDecimal PriceLastInv);

	/** Get Last Invoice Price.
	  * Price of the last invoice for the product
	  */
	public BigDecimal getPriceLastInv();

    /** Column name PriceLastPO */
    public static final String COLUMNNAME_PriceLastPO = "PriceLastPO";

	/** Set Last PO Price.
	  * Price of the last purchase order for the product
	  */
	public void setPriceLastPO (BigDecimal PriceLastPO);

	/** Get Last PO Price.
	  * Price of the last purchase order for the product
	  */
	public BigDecimal getPriceLastPO();

    /** Column name PriceList */
    public static final String COLUMNNAME_PriceList = "PriceList";

	/** Set List Price.
	  * List Price
	  */
	public void setPriceList (BigDecimal PriceList);

	/** Get List Price.
	  * List Price
	  */
	public BigDecimal getPriceList();

    /** Column name TotalInvAmt */
    public static final String COLUMNNAME_TotalInvAmt = "TotalInvAmt";

	/** Set Total Invoice Amount.
	  * Cumulative total lifetime invoice amount
	  */
	public void setTotalInvAmt (BigDecimal TotalInvAmt);

	/** Get Total Invoice Amount.
	  * Cumulative total lifetime invoice amount
	  */
	public BigDecimal getTotalInvAmt();

    /** Column name TotalInvQty */
    public static final String COLUMNNAME_TotalInvQty = "TotalInvQty";

	/** Set Total Invoice Quantity.
	  * Cumulative total lifetime invoice quantity
	  */
	public void setTotalInvQty (BigDecimal TotalInvQty);

	/** Get Total Invoice Quantity.
	  * Cumulative total lifetime invoice quantity
	  */
	public BigDecimal getTotalInvQty();
}