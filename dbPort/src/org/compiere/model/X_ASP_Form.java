/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

/** Generated Model for ASP_Form
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_ASP_Form extends PO implements I_ASP_Form, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_ASP_Form (Properties ctx, int ASP_Form_ID, String trxName)
    {
      super (ctx, ASP_Form_ID, trxName);
      /** if (ASP_Form_ID == 0)
        {
			setAD_Form_ID (0);
			setASP_Level_ID (0);
			setASP_Status (null);
// U
        } */
    }

    /** Load Constructor */
    public X_ASP_Form (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_ASP_Form[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Form getAD_Form() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Form.Table_Name);
        I_AD_Form result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Form)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Form_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Special Form.
		@param AD_Form_ID 
		Special Form
	  */
	public void setAD_Form_ID (int AD_Form_ID)
	{
		if (AD_Form_ID < 1)
			 throw new IllegalArgumentException ("AD_Form_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
	}

	/** Get Special Form.
		@return Special Form
	  */
	public int getAD_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ASP Form.
		@param ASP_Form_ID ASP Form	  */
	public void setASP_Form_ID (int ASP_Form_ID)
	{
		if (ASP_Form_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_ASP_Form_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_ASP_Form_ID, Integer.valueOf(ASP_Form_ID));
	}

	/** Get ASP Form.
		@return ASP Form	  */
	public int getASP_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_ASP_Level getASP_Level() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_ASP_Level.Table_Name);
        I_ASP_Level result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_ASP_Level)constructor.newInstance(new Object[] {getCtx(), new Integer(getASP_Level_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set ASP Level.
		@param ASP_Level_ID ASP Level	  */
	public void setASP_Level_ID (int ASP_Level_ID)
	{
		if (ASP_Level_ID < 1)
			 throw new IllegalArgumentException ("ASP_Level_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_ASP_Level_ID, Integer.valueOf(ASP_Level_ID));
	}

	/** Get ASP Level.
		@return ASP Level	  */
	public int getASP_Level_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ASP_Level_ID);
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
}