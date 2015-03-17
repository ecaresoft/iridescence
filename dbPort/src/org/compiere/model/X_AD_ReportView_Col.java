/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_ReportView_Col
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_ReportView_Col extends PO implements I_AD_ReportView_Col, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_ReportView_Col (Properties ctx, int AD_ReportView_Col_ID, String trxName)
    {
      super (ctx, AD_ReportView_Col_ID, trxName);
      /** if (AD_ReportView_Col_ID == 0)
        {
			setAD_ReportView_Col_ID (0);
			setAD_ReportView_ID (0);
			setFunctionColumn (null);
			setIsGroupFunction (false);
        } */
    }

    /** Load Constructor */
    public X_AD_ReportView_Col (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
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
      StringBuffer sb = new StringBuffer ("X_AD_ReportView_Col[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Column getAD_Column() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Column.Table_Name);
        I_AD_Column result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Column)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Column_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Column.
		@param AD_Column_ID 
		Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID)
	{
		if (AD_Column_ID < 1) 
			set_Value (COLUMNNAME_AD_Column_ID, null);
		else 
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

	/** Set Report view Column.
		@param AD_ReportView_Col_ID Report view Column	  */
	public void setAD_ReportView_Col_ID (int AD_ReportView_Col_ID)
	{
		if (AD_ReportView_Col_ID < 1)
			 throw new IllegalArgumentException ("AD_ReportView_Col_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ReportView_Col_ID, Integer.valueOf(AD_ReportView_Col_ID));
	}

	/** Get Report view Column.
		@return Report view Column	  */
	public int getAD_ReportView_Col_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_Col_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_ReportView getAD_ReportView() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_ReportView.Table_Name);
        I_AD_ReportView result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_ReportView)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_ReportView_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Report View.
		@param AD_ReportView_ID 
		View used to generate this report
	  */
	public void setAD_ReportView_ID (int AD_ReportView_ID)
	{
		if (AD_ReportView_ID < 1)
			 throw new IllegalArgumentException ("AD_ReportView_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ReportView_ID, Integer.valueOf(AD_ReportView_ID));
	}

	/** Get Report View.
		@return View used to generate this report
	  */
	public int getAD_ReportView_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReportView_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_ReportView_ID()));
    }

	/** Set Function Column.
		@param FunctionColumn 
		Overwrite Column with Function 
	  */
	public void setFunctionColumn (String FunctionColumn)
	{
		if (FunctionColumn == null)
			throw new IllegalArgumentException ("FunctionColumn is mandatory.");
		set_Value (COLUMNNAME_FunctionColumn, FunctionColumn);
	}

	/** Get Function Column.
		@return Overwrite Column with Function 
	  */
	public String getFunctionColumn () 
	{
		return (String)get_Value(COLUMNNAME_FunctionColumn);
	}

	/** Set SQL Group Function.
		@param IsGroupFunction 
		This function will generate a Group By Clause
	  */
	public void setIsGroupFunction (boolean IsGroupFunction)
	{
		set_Value (COLUMNNAME_IsGroupFunction, Boolean.valueOf(IsGroupFunction));
	}

	/** Get SQL Group Function.
		@return This function will generate a Group By Clause
	  */
	public boolean isGroupFunction () 
	{
		Object oo = get_Value(COLUMNNAME_IsGroupFunction);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}