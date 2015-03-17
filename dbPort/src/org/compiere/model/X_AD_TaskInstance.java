/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_TaskInstance
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_TaskInstance extends PO implements I_AD_TaskInstance, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_TaskInstance (Properties ctx, int AD_TaskInstance_ID, String trxName)
    {
      super (ctx, AD_TaskInstance_ID, trxName);
      /** if (AD_TaskInstance_ID == 0)
        {
			setAD_Task_ID (0);
			setAD_TaskInstance_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_TaskInstance (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_TaskInstance[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set OS Task.
		@param AD_Task_ID 
		Operation System Task
	  */
	public void setAD_Task_ID (int AD_Task_ID)
	{
		if (AD_Task_ID < 1)
			 throw new IllegalArgumentException ("AD_Task_ID is mandatory.");
		set_Value (COLUMNNAME_AD_Task_ID, Integer.valueOf(AD_Task_ID));
	}

	/** Get OS Task.
		@return Operation System Task
	  */
	public int getAD_Task_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Task_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Task Instance.
		@param AD_TaskInstance_ID Task Instance	  */
	public void setAD_TaskInstance_ID (int AD_TaskInstance_ID)
	{
		if (AD_TaskInstance_ID < 1)
			 throw new IllegalArgumentException ("AD_TaskInstance_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_TaskInstance_ID, Integer.valueOf(AD_TaskInstance_ID));
	}

	/** Get Task Instance.
		@return Task Instance	  */
	public int getAD_TaskInstance_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_TaskInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_TaskInstance_ID()));
    }
}