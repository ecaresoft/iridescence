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

/** Generated Model for AD_WF_ActivityResult
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_WF_ActivityResult extends PO implements I_AD_WF_ActivityResult, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_WF_ActivityResult (Properties ctx, int AD_WF_ActivityResult_ID, String trxName)
    {
      super (ctx, AD_WF_ActivityResult_ID, trxName);
      /** if (AD_WF_ActivityResult_ID == 0)
        {
			setAD_WF_Activity_ID (0);
			setAD_WF_ActivityResult_ID (0);
			setAttributeName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_WF_ActivityResult (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_WF_ActivityResult[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_WF_Activity getAD_WF_Activity() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_WF_Activity.Table_Name);
        I_AD_WF_Activity result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_WF_Activity)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_WF_Activity_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Workflow Activity.
		@param AD_WF_Activity_ID 
		Workflow Activity
	  */
	public void setAD_WF_Activity_ID (int AD_WF_Activity_ID)
	{
		if (AD_WF_Activity_ID < 1)
			 throw new IllegalArgumentException ("AD_WF_Activity_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_WF_Activity_ID, Integer.valueOf(AD_WF_Activity_ID));
	}

	/** Get Workflow Activity.
		@return Workflow Activity
	  */
	public int getAD_WF_Activity_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Activity_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_Activity_ID()));
    }

	/** Set Workflow Activity Result.
		@param AD_WF_ActivityResult_ID 
		Result of the Workflow Process Activity
	  */
	public void setAD_WF_ActivityResult_ID (int AD_WF_ActivityResult_ID)
	{
		if (AD_WF_ActivityResult_ID < 1)
			 throw new IllegalArgumentException ("AD_WF_ActivityResult_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_WF_ActivityResult_ID, Integer.valueOf(AD_WF_ActivityResult_ID));
	}

	/** Get Workflow Activity Result.
		@return Result of the Workflow Process Activity
	  */
	public int getAD_WF_ActivityResult_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_ActivityResult_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Attribute Name.
		@param AttributeName 
		Name of the Attribute
	  */
	public void setAttributeName (String AttributeName)
	{
		if (AttributeName == null)
			throw new IllegalArgumentException ("AttributeName is mandatory.");
		set_Value (COLUMNNAME_AttributeName, AttributeName);
	}

	/** Get Attribute Name.
		@return Name of the Attribute
	  */
	public String getAttributeName () 
	{
		return (String)get_Value(COLUMNNAME_AttributeName);
	}

	/** Set Attribute Value.
		@param AttributeValue 
		Value of the Attribute
	  */
	public void setAttributeValue (String AttributeValue)
	{
		set_Value (COLUMNNAME_AttributeValue, AttributeValue);
	}

	/** Get Attribute Value.
		@return Value of the Attribute
	  */
	public String getAttributeValue () 
	{
		return (String)get_Value(COLUMNNAME_AttributeValue);
	}

	/** Set Description.
		@param Description 
		Optional short description of the record
	  */
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription () 
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Comment/Help.
		@param Help 
		Comment or Hint
	  */
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp () 
	{
		return (String)get_Value(COLUMNNAME_Help);
	}
}