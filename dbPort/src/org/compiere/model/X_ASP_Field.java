/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

/** Generated Model for ASP_Field
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_ASP_Field extends PO implements I_ASP_Field, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_ASP_Field (Properties ctx, int ASP_Field_ID, String trxName)
    {
      super (ctx, ASP_Field_ID, trxName);
      /** if (ASP_Field_ID == 0)
        {
			setASP_Status (null);
// U
        } */
    }

    /** Load Constructor */
    public X_ASP_Field (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_ASP_Field[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Field getAD_Field() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Field.Table_Name);
        I_AD_Field result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Field)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Field_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Field.
		@param AD_Field_ID 
		Field on a database table
	  */
	public void setAD_Field_ID (int AD_Field_ID)
	{
		if (AD_Field_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_Field_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_Field_ID, Integer.valueOf(AD_Field_ID));
	}

	/** Get Field.
		@return Field on a database table
	  */
	public int getAD_Field_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Field_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ASP Field.
		@param ASP_Field_ID ASP Field	  */
	public void setASP_Field_ID (int ASP_Field_ID)
	{
		if (ASP_Field_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ASP_Field_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ASP_Field_ID, Integer.valueOf(ASP_Field_ID));
	}

	/** Get ASP Field.
		@return ASP Field	  */
	public int getASP_Field_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Field_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	public I_ASP_Tab getASP_Tab() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_ASP_Tab.Table_Name);
        I_ASP_Tab result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_ASP_Tab)constructor.newInstance(new Object[] {getCtx(), new Integer(getASP_Tab_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
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
}