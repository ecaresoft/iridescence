/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_Tax_Acct
 *  @author Generated Class 
 *  @version Version @VERSION@
 */
public interface I_C_Tax_Acct 
{

    /** TableName=C_Tax_Acct */
    public static final String Table_Name = "C_Tax_Acct";

    /** AD_Table_ID=399 */
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

    /** Column name C_Tax_ID */
    public static final String COLUMNNAME_C_Tax_ID = "C_Tax_ID";

	/** Set Tax.
	  * Tax identifier
	  */
	public void setC_Tax_ID (int C_Tax_ID);

	/** Get Tax.
	  * Tax identifier
	  */
	public int getC_Tax_ID();

	public I_C_Tax getC_Tax() throws RuntimeException;

    /** Column name T_Credit_Acct */
    public static final String COLUMNNAME_T_Credit_Acct = "T_Credit_Acct";

	/** Set Tax Credit.
	  * Account for Tax you can reclaim
	  */
	public void setT_Credit_Acct (int T_Credit_Acct);

	/** Get Tax Credit.
	  * Account for Tax you can reclaim
	  */
	public int getT_Credit_Acct();

    /** Column name T_Due_Acct */
    public static final String COLUMNNAME_T_Due_Acct = "T_Due_Acct";

	/** Set Tax Due.
	  * Account for Tax you have to pay
	  */
	public void setT_Due_Acct (int T_Due_Acct);

	/** Get Tax Due.
	  * Account for Tax you have to pay
	  */
	public int getT_Due_Acct();

    /** Column name T_Expense_Acct */
    public static final String COLUMNNAME_T_Expense_Acct = "T_Expense_Acct";

	/** Set Tax Expense.
	  * Account for paid tax you cannot reclaim
	  */
	public void setT_Expense_Acct (int T_Expense_Acct);

	/** Get Tax Expense.
	  * Account for paid tax you cannot reclaim
	  */
	public int getT_Expense_Acct();

    /** Column name T_HoldLiab_Acct */
    public static final String COLUMNNAME_T_HoldLiab_Acct = "T_HoldLiab_Acct";

	/** Set withholding taxes payable.
	  * withholding taxes payable
	  */
	public void setT_HoldLiab_Acct (int T_HoldLiab_Acct);

	/** Get withholding taxes payable.
	  * withholding taxes payable
	  */
	public int getT_HoldLiab_Acct();

    /** Column name T_HoldRec_Acct */
    public static final String COLUMNNAME_T_HoldRec_Acct = "T_HoldRec_Acct";

	/** Set Withholding a Favor.
	  * Withholding a Favor
	  */
	public void setT_HoldRec_Acct (int T_HoldRec_Acct);

	/** Get Withholding a Favor.
	  * Withholding a Favor
	  */
	public int getT_HoldRec_Acct();

    /** Column name T_Liability_Acct */
    public static final String COLUMNNAME_T_Liability_Acct = "T_Liability_Acct";

	/** Set Tax Liability.
	  * Account for Tax declaration liability
	  */
	public void setT_Liability_Acct (int T_Liability_Acct);

	/** Get Tax Liability.
	  * Account for Tax declaration liability
	  */
	public int getT_Liability_Acct();

    /** Column name T_Receivables_Acct */
    public static final String COLUMNNAME_T_Receivables_Acct = "T_Receivables_Acct";

	/** Set Tax Receivables.
	  * Account for Tax credit after tax declaration
	  */
	public void setT_Receivables_Acct (int T_Receivables_Acct);

	/** Get Tax Receivables.
	  * Account for Tax credit after tax declaration
	  */
	public int getT_Receivables_Acct();
}