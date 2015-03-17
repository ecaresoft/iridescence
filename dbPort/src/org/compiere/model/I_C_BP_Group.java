/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_BP_Group
 *  @author Generated Class 
 *  @version Version @VERSION@
 */
public interface I_C_BP_Group 
{

    /** TableName=C_BP_Group */
    public static final String Table_Name = "C_BP_Group";

    /** AD_Table_ID=394 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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

    /** Column name AD_PrintColor_ID */
    public static final String COLUMNNAME_AD_PrintColor_ID = "AD_PrintColor_ID";

	/** Set Print Color.
	  * Color used for printing and display
	  */
	public void setAD_PrintColor_ID (int AD_PrintColor_ID);

	/** Get Print Color.
	  * Color used for printing and display
	  */
	public int getAD_PrintColor_ID();

	public I_AD_PrintColor getAD_PrintColor() throws RuntimeException;

    /** Column name C_BP_Group_ID */
    public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";

	/** Set Company Group.
	  * Company Group
	  */
	public void setC_BP_Group_ID (int C_BP_Group_ID);

	/** Get Company Group.
	  * Company Group
	  */
	public int getC_BP_Group_ID();

    /** Column name C_Dunning_ID */
    public static final String COLUMNNAME_C_Dunning_ID = "C_Dunning_ID";

	/** Set Dunning.
	  * Dunning Rules for overdue invoices
	  */
	public void setC_Dunning_ID (int C_Dunning_ID);

	/** Get Dunning.
	  * Dunning Rules for overdue invoices
	  */
	public int getC_Dunning_ID();

	public I_C_Dunning getC_Dunning() throws RuntimeException;

    /** Column name CreditWatchPercent */
    public static final String COLUMNNAME_CreditWatchPercent = "CreditWatchPercent";

	/** Set Credit Watch %.
	  * Credit Watch - Percent of Credit Limit when OK switches to Watch
	  */
	public void setCreditWatchPercent (BigDecimal CreditWatchPercent);

	/** Get Credit Watch %.
	  * Credit Watch - Percent of Credit Limit when OK switches to Watch
	  */
	public BigDecimal getCreditWatchPercent();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name IsConfidentialInfo */
    public static final String COLUMNNAME_IsConfidentialInfo = "IsConfidentialInfo";

	/** Set Confidential Info.
	  * Can enter confidential information
	  */
	public void setIsConfidentialInfo (boolean IsConfidentialInfo);

	/** Get Confidential Info.
	  * Can enter confidential information
	  */
	public boolean isConfidentialInfo();

    /** Column name IsDefault */
    public static final String COLUMNNAME_IsDefault = "IsDefault";

	/** Set Default.
	  * Default value
	  */
	public void setIsDefault (boolean IsDefault);

	/** Get Default.
	  * Default value
	  */
	public boolean isDefault();

    /** Column name M_DiscountSchema_ID */
    public static final String COLUMNNAME_M_DiscountSchema_ID = "M_DiscountSchema_ID";

	/** Set Discount Schema.
	  * Schema to calculate the trade discount percentage
	  */
	public void setM_DiscountSchema_ID (int M_DiscountSchema_ID);

	/** Get Discount Schema.
	  * Schema to calculate the trade discount percentage
	  */
	public int getM_DiscountSchema_ID();

    /** Column name M_PriceList_ID */
    public static final String COLUMNNAME_M_PriceList_ID = "M_PriceList_ID";

	/** Set Price List.
	  * Unique identifier of a Price List
	  */
	public void setM_PriceList_ID (int M_PriceList_ID);

	/** Get Price List.
	  * Unique identifier of a Price List
	  */
	public int getM_PriceList_ID();

	public I_M_PriceList getM_PriceList() throws RuntimeException;

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Payment_NotVoucher */
    public static final String COLUMNNAME_Payment_NotVoucher = "Payment_NotVoucher";

	/** Set Payment without voucher.
	  * Payment without voucher
	  */
	public void setPayment_NotVoucher (boolean Payment_NotVoucher);

	/** Get Payment without voucher.
	  * Payment without voucher
	  */
	public boolean isPayment_NotVoucher();

    /** Column name PO_DiscountSchema_ID */
    public static final String COLUMNNAME_PO_DiscountSchema_ID = "PO_DiscountSchema_ID";

	/** Set PO Discount Schema.
	  * Schema to calculate the purchase trade discount percentage
	  */
	public void setPO_DiscountSchema_ID (int PO_DiscountSchema_ID);

	/** Get PO Discount Schema.
	  * Schema to calculate the purchase trade discount percentage
	  */
	public int getPO_DiscountSchema_ID();

    /** Column name PO_PriceList_ID */
    public static final String COLUMNNAME_PO_PriceList_ID = "PO_PriceList_ID";

	/** Set Purchase Pricelist.
	  * Price List used by this Business Partner
	  */
	public void setPO_PriceList_ID (int PO_PriceList_ID);

	/** Get Purchase Pricelist.
	  * Price List used by this Business Partner
	  */
	public int getPO_PriceList_ID();

    /** Column name PriceMatchTolerance */
    public static final String COLUMNNAME_PriceMatchTolerance = "PriceMatchTolerance";

	/** Set Price Match Tolerance.
	  * PO-Invoice Match Price Tolerance in percent of the purchase price
	  */
	public void setPriceMatchTolerance (BigDecimal PriceMatchTolerance);

	/** Get Price Match Tolerance.
	  * PO-Invoice Match Price Tolerance in percent of the purchase price
	  */
	public BigDecimal getPriceMatchTolerance();

    /** Column name PriorityBase */
    public static final String COLUMNNAME_PriorityBase = "PriorityBase";

	/** Set Priority Base.
	  * Base of Priority
	  */
	public void setPriorityBase (String PriorityBase);

	/** Get Priority Base.
	  * Base of Priority
	  */
	public String getPriorityBase();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}