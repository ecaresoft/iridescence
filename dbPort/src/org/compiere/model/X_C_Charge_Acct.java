/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

/** Generated Model for C_Charge_Acct
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_C_Charge_Acct extends PO implements I_C_Charge_Acct, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_C_Charge_Acct (Properties ctx, int C_Charge_Acct_ID, String trxName)
    {
      super (ctx, C_Charge_Acct_ID, trxName);
      /** if (C_Charge_Acct_ID == 0)
        {
			setC_AcctSchema_ID (0);
			setC_Charge_ID (0);
			setCh_Expense_Acct (0);
			setCh_Revenue_Acct (0);
        } */
    }

    /** Load Constructor */
    public X_C_Charge_Acct (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
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
      StringBuffer sb = new StringBuffer ("X_C_Charge_Acct[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_AcctSchema getC_AcctSchema() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_AcctSchema.Table_Name);
        I_C_AcctSchema result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_AcctSchema)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_AcctSchema_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Accounting Schema.
		@param C_AcctSchema_ID 
		Rules for accounting
	  */
	public void setC_AcctSchema_ID (int C_AcctSchema_ID)
	{
		if (C_AcctSchema_ID < 1)
			 throw new IllegalArgumentException ("C_AcctSchema_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_AcctSchema_ID, Integer.valueOf(C_AcctSchema_ID));
	}

	/** Get Accounting Schema.
		@return Rules for accounting
	  */
	public int getC_AcctSchema_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_AcctSchema_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Charge getC_Charge() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_Charge.Table_Name);
        I_C_Charge result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Charge)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Charge_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Charge.
		@param C_Charge_ID 
		Additional document charges
	  */
	public void setC_Charge_ID (int C_Charge_ID)
	{
		if (C_Charge_ID < 1)
			 throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
	}

	/** Get Charge.
		@return Additional document charges
	  */
	public int getC_Charge_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Charge Expense.
		@param Ch_Expense_Acct 
		Charge Expense Account
	  */
	public void setCh_Expense_Acct (int Ch_Expense_Acct)
	{
		set_Value (COLUMNNAME_Ch_Expense_Acct, Integer.valueOf(Ch_Expense_Acct));
	}

	/** Get Charge Expense.
		@return Charge Expense Account
	  */
	public int getCh_Expense_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Ch_Expense_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Charge Revenue.
		@param Ch_Revenue_Acct 
		Charge Revenue Account
	  */
	public void setCh_Revenue_Acct (int Ch_Revenue_Acct)
	{
		set_Value (COLUMNNAME_Ch_Revenue_Acct, Integer.valueOf(Ch_Revenue_Acct));
	}

	/** Get Charge Revenue.
		@return Charge Revenue Account
	  */
	public int getCh_Revenue_Acct () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Ch_Revenue_Acct);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}