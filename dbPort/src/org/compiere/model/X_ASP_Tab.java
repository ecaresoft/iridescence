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

/** Generated Model for ASP_Tab
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_ASP_Tab extends PO implements I_ASP_Tab, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_ASP_Tab (Properties ctx, int ASP_Tab_ID, String trxName)
    {
      super (ctx, ASP_Tab_ID, trxName);
      /** if (ASP_Tab_ID == 0)
        {
			setAD_Tab_ID (0);
			setASP_Status (null);
// U
        } */
    }

    /** Load Constructor */
    public X_ASP_Tab (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_ASP_Tab[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Tab getAD_Tab() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Tab.Table_Name);
        I_AD_Tab result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Tab)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Tab_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Tab.
		@param AD_Tab_ID 
		Tab within a Window
	  */
	public void setAD_Tab_ID (int AD_Tab_ID)
	{
		if (AD_Tab_ID < 1)
			 throw new IllegalArgumentException ("AD_Tab_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Tab_ID, Integer.valueOf(AD_Tab_ID));
	}

	/** Get Tab.
		@return Tab within a Window
	  */
	public int getAD_Tab_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Tab_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set AllFields.
		@param AllFields AllFields	  */
	public void setAllFields (boolean AllFields)
	{
		set_Value (COLUMNNAME_AllFields, Boolean.valueOf(AllFields));
	}

	/** Get AllFields.
		@return AllFields	  */
	public boolean isAllFields () 
	{
		Object oo = get_Value(COLUMNNAME_AllFields);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** ASP_Status AD_Reference_ID=1200256 */
	public static final int ASP_STATUS_AD_Reference_ID=1200256;
	/** Hide = H */
	public static final String ASP_STATUS_Hide = "H";
	/** Show = S */
	public static final String ASP_STATUS_Show = "S";
	/** Undefined = U */
	public static final String ASP_STATUS_Undefined = "U";
	/** Set ASP Status.
		@param ASP_Status ASP Status	  */
	public void setASP_Status (String ASP_Status)
	{
		if (ASP_Status == null) throw new IllegalArgumentException ("ASP_Status is mandatory");
		if (ASP_Status.equals("H") || ASP_Status.equals("S") || ASP_Status.equals("U")); else throw new IllegalArgumentException ("ASP_Status Invalid value - " + ASP_Status + " - Reference_ID=1200256 - H - S - U");		set_Value (COLUMNNAME_ASP_Status, ASP_Status);
	}

	/** Get ASP Status.
		@return ASP Status	  */
	public String getASP_Status () 
	{
		return (String)get_Value(COLUMNNAME_ASP_Status);
	}

	/** Set ASP Tab.
		@param ASP_Tab_ID ASP Tab	  */
	public void setASP_Tab_ID (int ASP_Tab_ID)
	{
		if (ASP_Tab_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ASP_Tab_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ASP_Tab_ID, Integer.valueOf(ASP_Tab_ID));
	}

	/** Get ASP Tab.
		@return ASP Tab	  */
	public int getASP_Tab_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Tab_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ASP_Window getASP_Window() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_ASP_Window.Table_Name);
        I_ASP_Window result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_ASP_Window)constructor.newInstance(new Object[] {getCtx(), new Integer(getASP_Window_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set ASP Window.
		@param ASP_Window_ID ASP Window	  */
	public void setASP_Window_ID (int ASP_Window_ID)
	{
		if (ASP_Window_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ASP_Window_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ASP_Window_ID, Integer.valueOf(ASP_Window_ID));
	}

	/** Get ASP Window.
		@return ASP Window	  */
	public int getASP_Window_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getASP_Window_ID()));
    }

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}