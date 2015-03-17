/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_BankAccount_Acct
 *  @author Generated Class 
 *  @version Version @VERSION@
 */
public interface I_C_BankAccount_Acct 
{

    /** TableName=C_BankAccount_Acct */
    public static final String Table_Name = "C_BankAccount_Acct";

    /** AD_Table_ID=391 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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

    /** Column name B_Asset_Acct */
    public static final String COLUMNNAME_B_Asset_Acct = "B_Asset_Acct";

	/** Set Bank Asset.
	  * Bank Asset Account
	  */
	public void setB_Asset_Acct (int B_Asset_Acct);

	/** Get Bank Asset.
	  * Bank Asset Account
	  */
	public int getB_Asset_Acct();

    /** Column name B_AssetFgn_Acct */
    public static final String COLUMNNAME_B_AssetFgn_Acct = "B_AssetFgn_Acct";

	/** Set Foreign Banks.
	  * Foreign Banks
	  */
	public void setB_AssetFgn_Acct (int B_AssetFgn_Acct);

	/** Get Foreign Banks.
	  * Foreign Banks
	  */
	public int getB_AssetFgn_Acct();

    /** Column name B_Expense_Acct */
    public static final String COLUMNNAME_B_Expense_Acct = "B_Expense_Acct";

	/** Set Bank Expense.
	  * Bank Expense Account
	  */
	public void setB_Expense_Acct (int B_Expense_Acct);

	/** Get Bank Expense.
	  * Bank Expense Account
	  */
	public int getB_Expense_Acct();

    /** Column name B_InterestExp_Acct */
    public static final String COLUMNNAME_B_InterestExp_Acct = "B_InterestExp_Acct";

	/** Set Bank Interest Expense.
	  * Bank Interest Expense Account
	  */
	public void setB_InterestExp_Acct (int B_InterestExp_Acct);

	/** Get Bank Interest Expense.
	  * Bank Interest Expense Account
	  */
	public int getB_InterestExp_Acct();

    /** Column name B_InterestRev_Acct */
    public static final String COLUMNNAME_B_InterestRev_Acct = "B_InterestRev_Acct";

	/** Set Bank Interest Revenue.
	  * Bank Interest Revenue Account
	  */
	public void setB_InterestRev_Acct (int B_InterestRev_Acct);

	/** Get Bank Interest Revenue.
	  * Bank Interest Revenue Account
	  */
	public int getB_InterestRev_Acct();

    /** Column name B_InTransit_Acct */
    public static final String COLUMNNAME_B_InTransit_Acct = "B_InTransit_Acct";

	/** Set Bank In Transit.
	  * Bank In Transit Account
	  */
	public void setB_InTransit_Acct (int B_InTransit_Acct);

	/** Get Bank In Transit.
	  * Bank In Transit Account
	  */
	public int getB_InTransit_Acct();

    /** Column name B_InTransitFgn_Acct */
    public static final String COLUMNNAME_B_InTransitFgn_Acct = "B_InTransitFgn_Acct";

	/** Set Foreign Banks In Transit.
	  * Foreign Banks In Transit
	  */
	public void setB_InTransitFgn_Acct (int B_InTransitFgn_Acct);

	/** Get Foreign Banks In Transit.
	  * Foreign Banks In Transit
	  */
	public int getB_InTransitFgn_Acct();

    /** Column name B_PaymentSelect_Acct */
    public static final String COLUMNNAME_B_PaymentSelect_Acct = "B_PaymentSelect_Acct";

	/** Set Payments.
	  * AP Payment Selection Clearing Account
	  */
	public void setB_PaymentSelect_Acct (int B_PaymentSelect_Acct);

	/** Get Payments.
	  * AP Payment Selection Clearing Account
	  */
	public int getB_PaymentSelect_Acct();

    /** Column name B_RevaluationGain_Acct */
    public static final String COLUMNNAME_B_RevaluationGain_Acct = "B_RevaluationGain_Acct";

	/** Set Bank Fluctuation Gain.
	  * Bank Fluctuation Gain
	  */
	public void setB_RevaluationGain_Acct (int B_RevaluationGain_Acct);

	/** Get Bank Fluctuation Gain.
	  * Bank Fluctuation Gain
	  */
	public int getB_RevaluationGain_Acct();

    /** Column name B_RevaluationLoss_Acct */
    public static final String COLUMNNAME_B_RevaluationLoss_Acct = "B_RevaluationLoss_Acct";

	/** Set Bank Fluctuation Loss.
	  * Bank Fluctuation Loss
	  */
	public void setB_RevaluationLoss_Acct (int B_RevaluationLoss_Acct);

	/** Get Bank Fluctuation Loss.
	  * Bank Fluctuation Loss
	  */
	public int getB_RevaluationLoss_Acct();

    /** Column name B_SettlementGain_Acct */
    public static final String COLUMNNAME_B_SettlementGain_Acct = "B_SettlementGain_Acct";

	/** Set Bank Settlement Gain.
	  * Bank Settlement Gain Account
	  */
	public void setB_SettlementGain_Acct (int B_SettlementGain_Acct);

	/** Get Bank Settlement Gain.
	  * Bank Settlement Gain Account
	  */
	public int getB_SettlementGain_Acct();

    /** Column name B_SettlementLoss_Acct */
    public static final String COLUMNNAME_B_SettlementLoss_Acct = "B_SettlementLoss_Acct";

	/** Set Bank Settlement Loss.
	  * Bank Settlement Loss Account
	  */
	public void setB_SettlementLoss_Acct (int B_SettlementLoss_Acct);

	/** Get Bank Settlement Loss.
	  * Bank Settlement Loss Account
	  */
	public int getB_SettlementLoss_Acct();

    /** Column name B_UnallocatedCash_Acct */
    public static final String COLUMNNAME_B_UnallocatedCash_Acct = "B_UnallocatedCash_Acct";

	/** Set Unallocated Cash.
	  * Unallocated Cash Clearing Account
	  */
	public void setB_UnallocatedCash_Acct (int B_UnallocatedCash_Acct);

	/** Get Unallocated Cash.
	  * Unallocated Cash Clearing Account
	  */
	public int getB_UnallocatedCash_Acct();

    /** Column name B_Unidentified_Acct */
    public static final String COLUMNNAME_B_Unidentified_Acct = "B_Unidentified_Acct";

	/** Set Bank Unidentified Receipts.
	  * Bank Unidentified Receipts Account
	  */
	public void setB_Unidentified_Acct (int B_Unidentified_Acct);

	/** Get Bank Unidentified Receipts.
	  * Bank Unidentified Receipts Account
	  */
	public int getB_Unidentified_Acct();

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

    /** Column name C_BankAccount_ID */
    public static final String COLUMNNAME_C_BankAccount_ID = "C_BankAccount_ID";

	/** Set Bank Account.
	  * Account at the Bank
	  */
	public void setC_BankAccount_ID (int C_BankAccount_ID);

	/** Get Bank Account.
	  * Account at the Bank
	  */
	public int getC_BankAccount_ID();

	public I_C_BankAccount getC_BankAccount() throws RuntimeException;
}