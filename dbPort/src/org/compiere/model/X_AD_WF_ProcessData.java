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

/** Generated Model for AD_WF_ProcessData
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_WF_ProcessData extends PO implements I_AD_WF_ProcessData, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_WF_ProcessData (Properties ctx, int AD_WF_ProcessData_ID, String trxName)
    {
      super (ctx, AD_WF_ProcessData_ID, trxName);
      /** if (AD_WF_ProcessData_ID == 0)
        {
			setAD_WF_ProcessData_ID (0);
			setAD_WF_Process_ID (0);
			setAttributeName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_WF_ProcessData (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_WF_ProcessData[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Workflow Process Data.
		@param AD_WF_ProcessData_ID 
		Workflow Process Context
	  */
	public void setAD_WF_ProcessData_ID (int AD_WF_ProcessData_ID)
	{
		if (AD_WF_ProcessData_ID < 1)
			 throw new IllegalArgumentException ("AD_WF_ProcessData_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_WF_ProcessData_ID, Integer.valueOf(AD_WF_ProcessData_ID));
	}

	/** Get Workflow Process Data.
		@return Workflow Process Context
	  */
	public int getAD_WF_ProcessData_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_ProcessData_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_WF_Process getAD_WF_Process() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_WF_Process.Table_Name);
        I_AD_WF_Process result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_WF_Process)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_WF_Process_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Workflow Process.
		@param AD_WF_Process_ID 
		Actual Workflow Process Instance
	  */
	public void setAD_WF_Process_ID (int AD_WF_Process_ID)
	{
		if (AD_WF_Process_ID < 1)
			 throw new IllegalArgumentException ("AD_WF_Process_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_WF_Process_ID, Integer.valueOf(AD_WF_Process_ID));
	}

	/** Get Workflow Process.
		@return Actual Workflow Process Instance
	  */
	public int getAD_WF_Process_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_WF_Process_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_WF_Process_ID()));
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
}