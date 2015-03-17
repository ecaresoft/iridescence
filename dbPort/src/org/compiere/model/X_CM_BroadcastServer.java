/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.KeyNamePair;

/** Generated Model for CM_BroadcastServer
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_CM_BroadcastServer extends PO implements I_CM_BroadcastServer, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_CM_BroadcastServer (Properties ctx, int CM_BroadcastServer_ID, String trxName)
    {
      super (ctx, CM_BroadcastServer_ID, trxName);
      /** if (CM_BroadcastServer_ID == 0)
        {
			setCM_BroadcastServer_ID (0);
			setIP_Address (null);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_CM_BroadcastServer (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_CM_BroadcastServer[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Broadcast Server.
		@param CM_BroadcastServer_ID 
		Web Broadcast Server
	  */
	public void setCM_BroadcastServer_ID (int CM_BroadcastServer_ID)
	{
		if (CM_BroadcastServer_ID < 1)
			 throw new IllegalArgumentException ("CM_BroadcastServer_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_BroadcastServer_ID, Integer.valueOf(CM_BroadcastServer_ID));
	}

	/** Get Broadcast Server.
		@return Web Broadcast Server
	  */
	public int getCM_BroadcastServer_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_BroadcastServer_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_CM_WebProject getCM_WebProject() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_WebProject.Table_Name);
        I_CM_WebProject result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_WebProject)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_WebProject_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Web Project.
		@param CM_WebProject_ID 
		A web project is the main data container for Containers, URLs, Ads, Media etc.
	  */
	public void setCM_WebProject_ID (int CM_WebProject_ID)
	{
		if (CM_WebProject_ID < 1) 
			set_Value (COLUMNNAME_CM_WebProject_ID, null);
		else 
			set_Value (COLUMNNAME_CM_WebProject_ID, Integer.valueOf(CM_WebProject_ID));
	}

	/** Get Web Project.
		@return A web project is the main data container for Containers, URLs, Ads, Media etc.
	  */
	public int getCM_WebProject_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_WebProject_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set IP Address.
		@param IP_Address 
		Defines the IP address to transfer data to
	  */
	public void setIP_Address (String IP_Address)
	{
		if (IP_Address == null)
			throw new IllegalArgumentException ("IP_Address is mandatory.");
		set_Value (COLUMNNAME_IP_Address, IP_Address);
	}

	/** Get IP Address.
		@return Defines the IP address to transfer data to
	  */
	public String getIP_Address () 
	{
		return (String)get_Value(COLUMNNAME_IP_Address);
	}

	/** Set Last Synchronized.
		@param LastSynchronized 
		Date when last synchronized
	  */
	public void setLastSynchronized (Timestamp LastSynchronized)
	{
		set_Value (COLUMNNAME_LastSynchronized, LastSynchronized);
	}

	/** Get Last Synchronized.
		@return Date when last synchronized
	  */
	public Timestamp getLastSynchronized () 
	{
		return (Timestamp)get_Value(COLUMNNAME_LastSynchronized);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		if (Name == null)
			throw new IllegalArgumentException ("Name is mandatory.");
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getName());
    }
}