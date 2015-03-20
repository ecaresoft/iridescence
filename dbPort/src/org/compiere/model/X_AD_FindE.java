/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_FindE
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_FindE extends PO implements I_AD_FindE, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_FindE (Properties ctx, int AD_FindE_ID, String trxName)
    {
      super (ctx, AD_FindE_ID, trxName);
      /** if (AD_FindE_ID == 0)
        {
			setAD_Column_ID (0);
			setAD_Find_ID (0);
			setAndOr (null);
// A
			setFind_ID (Env.ZERO);
			setOperation (null);
// ==
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_AD_FindE (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_FindE[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Column.
		@param AD_Column_ID 
		Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID)
	{
		if (AD_Column_ID < 1)
			 throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
		set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
	}

	/** Get Column.
		@return Column in the table
	  */
	public int getAD_Column_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Find.
		@param AD_Find_ID Find	  */
	public void setAD_Find_ID (int AD_Find_ID)
	{
		if (AD_Find_ID < 1)
			 throw new IllegalArgumentException ("AD_Find_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Find_ID, Integer.valueOf(AD_Find_ID));
	}

	/** Get Find.
		@return Find	  */
	public int getAD_Find_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Find_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_Find_ID()));
    }

	/** AndOr AD_Reference_ID=204 */
	public static final int ANDOR_AD_Reference_ID=204;
	/** And = A */
	public static final String ANDOR_And = "A";
	/** Or = O */
	public static final String ANDOR_Or = "O";
	/** Set And/Or.
		@param AndOr 
		Logical operation: AND or OR
	  */
	public void setAndOr (String AndOr)
	{
		if (AndOr == null) throw new IllegalArgumentException ("AndOr is mandatory");
		if (AndOr.equals("A") || AndOr.equals("O")); else throw new IllegalArgumentException ("AndOr Invalid value - " + AndOr + " - Reference_ID=204 - A - O");		set_Value (COLUMNNAME_AndOr, AndOr);
	}

	/** Get And/Or.
		@return Logical operation: AND or OR
	  */
	public String getAndOr () 
	{
		return (String)get_Value(COLUMNNAME_AndOr);
	}

	/** Set Find.
		@param Find_ID Find	  */
	public void setFind_ID (BigDecimal Find_ID)
	{
		if (Find_ID == null)
			throw new IllegalArgumentException ("Find_ID is mandatory.");
		set_Value (COLUMNNAME_Find_ID, Find_ID);
	}

	/** Get Find.
		@return Find	  */
	public BigDecimal getFind_ID () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Find_ID);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Operation AD_Reference_ID=205 */
	public static final int OPERATION_AD_Reference_ID=205;
	/**  = = == */
	public static final String OPERATION_Eq = "==";
	/** >= = >= */
	public static final String OPERATION_GtEq = ">=";
	/** > = >> */
	public static final String OPERATION_Gt = ">>";
	/** < = << */
	public static final String OPERATION_Le = "<<";
	/**  ~ = ~~ */
	public static final String OPERATION_Like = "~~";
	/** <= = <= */
	public static final String OPERATION_LeEq = "<=";
	/** |<x>| = AB */
	public static final String OPERATION_X = "AB";
	/** sql = SQ */
	public static final String OPERATION_Sql = "SQ";
	/** != = != */
	public static final String OPERATION_NotEq = "!=";
	/** Set Operation.
		@param Operation 
		Compare Operation
	  */
	public void setOperation (String Operation)
	{
		if (Operation == null) throw new IllegalArgumentException ("Operation is mandatory");
		if (Operation.equals("==") || Operation.equals(">=") || Operation.equals(">>") || Operation.equals("<<") || Operation.equals("~~") || Operation.equals("<=") || Operation.equals("AB") || Operation.equals("SQ") || Operation.equals("!=")); else throw new IllegalArgumentException ("Operation Invalid value - " + Operation + " - Reference_ID=205 - == - >= - >> - << - ~~ - <= - AB - SQ - !=");		set_Value (COLUMNNAME_Operation, Operation);
	}

	/** Get Operation.
		@return Compare Operation
	  */
	public String getOperation () 
	{
		return (String)get_Value(COLUMNNAME_Operation);
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		if (Value == null)
			throw new IllegalArgumentException ("Value is mandatory.");
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

	/** Set Value To.
		@param Value2 
		Value To
	  */
	public void setValue2 (String Value2)
	{
		set_Value (COLUMNNAME_Value2, Value2);
	}

	/** Get Value To.
		@return Value To
	  */
	public String getValue2 () 
	{
		return (String)get_Value(COLUMNNAME_Value2);
	}
}