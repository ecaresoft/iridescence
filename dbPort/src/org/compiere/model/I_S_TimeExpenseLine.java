/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for S_TimeExpenseLine
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_S_TimeExpenseLine 
{

    /** TableName=S_TimeExpenseLine */
    public static final String Table_Name = "S_TimeExpenseLine";

    /** AD_Table_ID=488 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 1 - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

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

    /** Column name C_Activity_ID */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

	/** Set Responsible Units.
	  * Responsible Units
	  */
	public void setC_Activity_ID (int C_Activity_ID);

	/** Get Responsible Units.
	  * Responsible Units
	  */
	public int getC_Activity_ID();

	public I_C_Activity getC_Activity() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifier for a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifier for a Business Partner
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_Campaign_ID */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

	/** Set Program.
	  * Program
	  */
	public void setC_Campaign_ID (int C_Campaign_ID);

	/** Get Program.
	  * Program
	  */
	public int getC_Campaign_ID();

	public I_C_Campaign getC_Campaign() throws RuntimeException;

    /** Column name C_Currency_ID */
    public static final String COLUMNNAME_C_Currency_ID = "C_Currency_ID";

	/** Set Currency.
	  * The Currency for this record
	  */
	public void setC_Currency_ID (int C_Currency_ID);

	/** Get Currency.
	  * The Currency for this record
	  */
	public int getC_Currency_ID();

	public I_C_Currency getC_Currency() throws RuntimeException;

    /** Column name C_InvoiceLine_ID */
    public static final String COLUMNNAME_C_InvoiceLine_ID = "C_InvoiceLine_ID";

	/** Set Invoice Line.
	  * Invoice Detail Line
	  */
	public void setC_InvoiceLine_ID (int C_InvoiceLine_ID);

	/** Get Invoice Line.
	  * Invoice Detail Line
	  */
	public int getC_InvoiceLine_ID();

	public I_C_InvoiceLine getC_InvoiceLine() throws RuntimeException;

    /** Column name ConvertedAmt */
    public static final String COLUMNNAME_ConvertedAmt = "ConvertedAmt";

	/** Set Converted Amount.
	  * Converted Amount
	  */
	public void setConvertedAmt (BigDecimal ConvertedAmt);

	/** Get Converted Amount.
	  * Converted Amount
	  */
	public BigDecimal getConvertedAmt();

    /** Column name C_OrderLine_ID */
    public static final String COLUMNNAME_C_OrderLine_ID = "C_OrderLine_ID";

	/** Set Sales Order Line.
	  * Sales Order Line
	  */
	public void setC_OrderLine_ID (int C_OrderLine_ID);

	/** Get Sales Order Line.
	  * Sales Order Line
	  */
	public int getC_OrderLine_ID();

	public I_C_OrderLine getC_OrderLine() throws RuntimeException;

    /** Column name C_Project_ID */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

	/** Set Project.
	  * Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID);

	/** Get Project.
	  * Financial Project
	  */
	public int getC_Project_ID();

	public I_C_Project getC_Project() throws RuntimeException;

    /** Column name C_ProjectPhase_ID */
    public static final String COLUMNNAME_C_ProjectPhase_ID = "C_ProjectPhase_ID";

	/** Set Project Phase.
	  * Phase of a Project
	  */
	public void setC_ProjectPhase_ID (int C_ProjectPhase_ID);

	/** Get Project Phase.
	  * Phase of a Project
	  */
	public int getC_ProjectPhase_ID();

	public I_C_ProjectPhase getC_ProjectPhase() throws RuntimeException;

    /** Column name C_ProjectTask_ID */
    public static final String COLUMNNAME_C_ProjectTask_ID = "C_ProjectTask_ID";

	/** Set Project Task.
	  * Actual Project Task in a Phase
	  */
	public void setC_ProjectTask_ID (int C_ProjectTask_ID);

	/** Get Project Task.
	  * Actual Project Task in a Phase
	  */
	public int getC_ProjectTask_ID();

	public I_C_ProjectTask getC_ProjectTask() throws RuntimeException;

    /** Column name C_UOM_ID */
    public static final String COLUMNNAME_C_UOM_ID = "C_UOM_ID";

	/** Set UOM.
	  * Unit of Measure
	  */
	public void setC_UOM_ID (int C_UOM_ID);

	/** Get UOM.
	  * Unit of Measure
	  */
	public int getC_UOM_ID();

	public I_C_UOM getC_UOM() throws RuntimeException;

    /** Column name DateExpense */
    public static final String COLUMNNAME_DateExpense = "DateExpense";

	/** Set Expense Date.
	  * Date of expense
	  */
	public void setDateExpense (Timestamp DateExpense);

	/** Get Expense Date.
	  * Date of expense
	  */
	public Timestamp getDateExpense();

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

    /** Column name ExpenseAmt */
    public static final String COLUMNNAME_ExpenseAmt = "ExpenseAmt";

	/** Set Expense Amount.
	  * Amount for this expense
	  */
	public void setExpenseAmt (BigDecimal ExpenseAmt);

	/** Get Expense Amount.
	  * Amount for this expense
	  */
	public BigDecimal getExpenseAmt();

    /** Column name InvoicePrice */
    public static final String COLUMNNAME_InvoicePrice = "InvoicePrice";

	/** Set Invoice Price.
	  * Unit price to be invoiced or 0 for default price
	  */
	public void setInvoicePrice (BigDecimal InvoicePrice);

	/** Get Invoice Price.
	  * Unit price to be invoiced or 0 for default price
	  */
	public BigDecimal getInvoicePrice();

    /** Column name IsInvoiced */
    public static final String COLUMNNAME_IsInvoiced = "IsInvoiced";

	/** Set Invoiced.
	  * Is this invoiced?
	  */
	public void setIsInvoiced (boolean IsInvoiced);

	/** Get Invoiced.
	  * Is this invoiced?
	  */
	public boolean isInvoiced();

    /** Column name IsTimeReport */
    public static final String COLUMNNAME_IsTimeReport = "IsTimeReport";

	/** Set Time Report.
	  * Line is a time report only (no expense)
	  */
	public void setIsTimeReport (boolean IsTimeReport);

	/** Get Time Report.
	  * Line is a time report only (no expense)
	  */
	public boolean isTimeReport();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

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

    /** Column name Note */
    public static final String COLUMNNAME_Note = "Note";

	/** Set Note.
	  * Optional additional user defined information
	  */
	public void setNote (String Note);

	/** Get Note.
	  * Optional additional user defined information
	  */
	public String getNote();

    /** Column name PriceInvoiced */
    public static final String COLUMNNAME_PriceInvoiced = "PriceInvoiced";

	/** Set Price Invoiced.
	  * The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price
	  */
	public void setPriceInvoiced (BigDecimal PriceInvoiced);

	/** Get Price Invoiced.
	  * The priced invoiced to the customer (in the currency of the customer's AR price list) - 0 for default price
	  */
	public BigDecimal getPriceInvoiced();

    /** Column name PriceReimbursed */
    public static final String COLUMNNAME_PriceReimbursed = "PriceReimbursed";

	/** Set Price Reimbursed.
	  * The reimbursed price (in currency of the employee's AP price list)
	  */
	public void setPriceReimbursed (BigDecimal PriceReimbursed);

	/** Get Price Reimbursed.
	  * The reimbursed price (in currency of the employee's AP price list)
	  */
	public BigDecimal getPriceReimbursed();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Qty */
    public static final String COLUMNNAME_Qty = "Qty";

	/** Set Quantity.
	  * Quantity
	  */
	public void setQty (BigDecimal Qty);

	/** Get Quantity.
	  * Quantity
	  */
	public BigDecimal getQty();

    /** Column name QtyInvoiced */
    public static final String COLUMNNAME_QtyInvoiced = "QtyInvoiced";

	/** Set Quantity Invoiced.
	  * Invoiced Quantity
	  */
	public void setQtyInvoiced (BigDecimal QtyInvoiced);

	/** Get Quantity Invoiced.
	  * Invoiced Quantity
	  */
	public BigDecimal getQtyInvoiced();

    /** Column name QtyReimbursed */
    public static final String COLUMNNAME_QtyReimbursed = "QtyReimbursed";

	/** Set Quantity Reimbursed.
	  * The reimbursed quantity
	  */
	public void setQtyReimbursed (BigDecimal QtyReimbursed);

	/** Get Quantity Reimbursed.
	  * The reimbursed quantity
	  */
	public BigDecimal getQtyReimbursed();

    /** Column name S_ResourceAssignment_ID */
    public static final String COLUMNNAME_S_ResourceAssignment_ID = "S_ResourceAssignment_ID";

	/** Set Resource Assignment.
	  * Resource Assignment
	  */
	public void setS_ResourceAssignment_ID (int S_ResourceAssignment_ID);

	/** Get Resource Assignment.
	  * Resource Assignment
	  */
	public int getS_ResourceAssignment_ID();

    /** Column name S_TimeExpense_ID */
    public static final String COLUMNNAME_S_TimeExpense_ID = "S_TimeExpense_ID";

	/** Set Expense Report.
	  * Time and Expense Report
	  */
	public void setS_TimeExpense_ID (int S_TimeExpense_ID);

	/** Get Expense Report.
	  * Time and Expense Report
	  */
	public int getS_TimeExpense_ID();

	public I_S_TimeExpense getS_TimeExpense() throws RuntimeException;

    /** Column name S_TimeExpenseLine_ID */
    public static final String COLUMNNAME_S_TimeExpenseLine_ID = "S_TimeExpenseLine_ID";

	/** Set Expense Line.
	  * Time and Expense Report Line
	  */
	public void setS_TimeExpenseLine_ID (int S_TimeExpenseLine_ID);

	/** Get Expense Line.
	  * Time and Expense Report Line
	  */
	public int getS_TimeExpenseLine_ID();

    /** Column name S_TimeType_ID */
    public static final String COLUMNNAME_S_TimeType_ID = "S_TimeType_ID";

	/** Set Time Type.
	  * Type of time recorded
	  */
	public void setS_TimeType_ID (int S_TimeType_ID);

	/** Get Time Type.
	  * Type of time recorded
	  */
	public int getS_TimeType_ID();

	public I_S_TimeType getS_TimeType() throws RuntimeException;
}