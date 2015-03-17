/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for A_Depreciation_Exp
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_A_Depreciation_Exp extends PO implements I_A_Depreciation_Exp, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_A_Depreciation_Exp (Properties ctx, int A_Depreciation_Exp_ID, String trxName)
    {
      super (ctx, A_Depreciation_Exp_ID, trxName);
      /** if (A_Depreciation_Exp_ID == 0)
        {
			setA_Account_Number (0);
			setA_Asset_ID (0);
			setA_Depreciation_Exp_ID (0);
			setA_Entry_Type (null);
			setA_Period (0);
			setDescription (null);
			setExpense (Env.ZERO);
			setIsDepreciated (false);
			setProcessed (false);
        } */
    }

    /** Load Constructor */
    public X_A_Depreciation_Exp (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_A_Depreciation_Exp[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set A_Account_Number.
		@param A_Account_Number A_Account_Number	  */
	public void setA_Account_Number (int A_Account_Number)
	{
		set_Value (COLUMNNAME_A_Account_Number, Integer.valueOf(A_Account_Number));
	}

	/** Get A_Account_Number.
		@return A_Account_Number	  */
	public int getA_Account_Number () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Account_Number);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
		set_Value (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Depreciation_Exp_ID.
		@param A_Depreciation_Exp_ID A_Depreciation_Exp_ID	  */
	public void setA_Depreciation_Exp_ID (int A_Depreciation_Exp_ID)
	{
		if (A_Depreciation_Exp_ID < 1)
			 throw new IllegalArgumentException ("A_Depreciation_Exp_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Depreciation_Exp_ID, Integer.valueOf(A_Depreciation_Exp_ID));
	}

	/** Get A_Depreciation_Exp_ID.
		@return A_Depreciation_Exp_ID	  */
	public int getA_Depreciation_Exp_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Depreciation_Exp_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Depreciation_Exp_ID()));
    }

	/** A_Entry_Type AD_Reference_ID=1200304 */
	public static final int A_ENTRY_TYPE_AD_Reference_ID=1200304;
	/** Depreciation = DEP */
	public static final String A_ENTRY_TYPE_Depreciation = "DEP";
	/** Disposals = DIS */
	public static final String A_ENTRY_TYPE_Disposals = "DIS";
	/** Forecasts = FOR */
	public static final String A_ENTRY_TYPE_Forecasts = "FOR";
	/** New = NEW */
	public static final String A_ENTRY_TYPE_New = "NEW";
	/** Splits = SPL */
	public static final String A_ENTRY_TYPE_Splits = "SPL";
	/** Transfers = TRN */
	public static final String A_ENTRY_TYPE_Transfers = "TRN";
	/** Set Entry Type.
		@param A_Entry_Type Entry Type	  */
	public void setA_Entry_Type (String A_Entry_Type)
	{
		if (A_Entry_Type == null) throw new IllegalArgumentException ("A_Entry_Type is mandatory");
		if (A_Entry_Type.equals("DEP") || A_Entry_Type.equals("DIS") || A_Entry_Type.equals("FOR") || A_Entry_Type.equals("NEW") || A_Entry_Type.equals("SPL") || A_Entry_Type.equals("TRN")); else throw new IllegalArgumentException ("A_Entry_Type Invalid value - " + A_Entry_Type + " - Reference_ID=1200304 - DEP - DIS - FOR - NEW - SPL - TRN");		set_Value (COLUMNNAME_A_Entry_Type, A_Entry_Type);
	}

	/** Get Entry Type.
		@return Entry Type	  */
	public String getA_Entry_Type () 
	{
		return (String)get_Value(COLUMNNAME_A_Entry_Type);
	}

	/** Set Period/Yearly.
		@param A_Period Period/Yearly	  */
	public void setA_Period (int A_Period)
	{
		set_Value (COLUMNNAME_A_Period, Integer.valueOf(A_Period));
	}

	/** Get Period/Yearly.
		@return Period/Yearly	  */
	public int getA_Period () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Period);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Account Date.
		@param DateAcct 
		Accounting Date
	  */
	public void setDateAcct (Timestamp DateAcct)
	{
		set_Value (COLUMNNAME_DateAcct, DateAcct);
	}

	/** Get Account Date.
		@return Accounting Date
	  */
	public Timestamp getDateAcct () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateAcct);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		if (Description == null)
			throw new IllegalArgumentException ("Description is mandatory.");
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Expense.
		@param Expense Expense	  */
	public void setExpense (BigDecimal Expense)
	{
		if (Expense == null)
			throw new IllegalArgumentException ("Expense is mandatory.");
		set_Value (COLUMNNAME_Expense, Expense);
	}

	/** Get Expense.
		@return Expense	  */
	public BigDecimal getExpense () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Expense);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Depreciate.
		@param IsDepreciated 
		The asset will be depreciated
	  */
	public void setIsDepreciated (boolean IsDepreciated)
	{
		set_Value (COLUMNNAME_IsDepreciated, Boolean.valueOf(IsDepreciated));
	}

	/** Get Depreciate.
		@return The asset will be depreciated
	  */
	public boolean isDepreciated () 
	{
		Object oo = get_Value(COLUMNNAME_IsDepreciated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Posting Type.
		@param PostingType 
		The type of posted amount for the transaction
	  */
	public void setPostingType (String PostingType)
	{
		set_Value (COLUMNNAME_PostingType, PostingType);
	}

	/** Get Posting Type.
		@return The type of posted amount for the transaction
	  */
	public String getPostingType () 
	{
		return (String)get_Value(COLUMNNAME_PostingType);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}