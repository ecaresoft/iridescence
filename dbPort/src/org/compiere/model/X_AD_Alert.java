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

/** Generated Model for AD_Alert
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_Alert extends PO implements I_AD_Alert, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_Alert (Properties ctx, int AD_Alert_ID, String trxName)
    {
      super (ctx, AD_Alert_ID, trxName);
      /** if (AD_Alert_ID == 0)
        {
			setAD_Alert_ID (0);
			setAD_AlertProcessor_ID (0);
			setAlertMessage (null);
			setAlertSubject (null);
			setEnforceClientSecurity (true);
// Y
			setEnforceRoleSecurity (true);
// Y
			setIsValid (true);
// Y
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Alert (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_Alert[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Alert.
		@param AD_Alert_ID 
		Compiere Alert
	  */
	public void setAD_Alert_ID (int AD_Alert_ID)
	{
		if (AD_Alert_ID < 1)
			 throw new IllegalArgumentException ("AD_Alert_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Alert_ID, Integer.valueOf(AD_Alert_ID));
	}

	/** Get Alert.
		@return Compiere Alert
	  */
	public int getAD_Alert_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Alert_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_AlertProcessor getAD_AlertProcessor() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_AlertProcessor.Table_Name);
        I_AD_AlertProcessor result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_AlertProcessor)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_AlertProcessor_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Alert Processor.
		@param AD_AlertProcessor_ID 
		Alert Processor/Server Parameter
	  */
	public void setAD_AlertProcessor_ID (int AD_AlertProcessor_ID)
	{
		if (AD_AlertProcessor_ID < 1)
			 throw new IllegalArgumentException ("AD_AlertProcessor_ID is mandatory.");
		set_Value (COLUMNNAME_AD_AlertProcessor_ID, Integer.valueOf(AD_AlertProcessor_ID));
	}

	/** Get Alert Processor.
		@return Alert Processor/Server Parameter
	  */
	public int getAD_AlertProcessor_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_AlertProcessor_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Alert Message.
		@param AlertMessage 
		Alert Message
	  */
	public void setAlertMessage (String AlertMessage)
	{
		if (AlertMessage == null)
			throw new IllegalArgumentException ("AlertMessage is mandatory.");
		set_Value (COLUMNNAME_AlertMessage, AlertMessage);
	}

	/** Get Alert Message.
		@return Alert Message
	  */
	public String getAlertMessage () 
	{
		return (String)get_Value(COLUMNNAME_AlertMessage);
	}

	/** Set Alert Subject.
		@param AlertSubject 
		Subject of the Alert email message.
	  */
	public void setAlertSubject (String AlertSubject)
	{
		if (AlertSubject == null)
			throw new IllegalArgumentException ("AlertSubject is mandatory.");
		set_Value (COLUMNNAME_AlertSubject, AlertSubject);
	}

	/** Get Alert Subject.
		@return Subject of the Alert email message.
	  */
	public String getAlertSubject () 
	{
		return (String)get_Value(COLUMNNAME_AlertSubject);
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

	/** Set Enforce Client Security.
		@param EnforceClientSecurity 
		Send alerts to recipient only if the client security rules of the role allows
	  */
	public void setEnforceClientSecurity (boolean EnforceClientSecurity)
	{
		set_Value (COLUMNNAME_EnforceClientSecurity, Boolean.valueOf(EnforceClientSecurity));
	}

	/** Get Enforce Client Security.
		@return Send alerts to recipient only if the client security rules of the role allows
	  */
	public boolean isEnforceClientSecurity () 
	{
		Object oo = get_Value(COLUMNNAME_EnforceClientSecurity);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Enforce Role Security.
		@param EnforceRoleSecurity 
		Send alerts to recipient only if the data security rules of the role allows
	  */
	public void setEnforceRoleSecurity (boolean EnforceRoleSecurity)
	{
		set_Value (COLUMNNAME_EnforceRoleSecurity, Boolean.valueOf(EnforceRoleSecurity));
	}

	/** Get Enforce Role Security.
		@return Send alerts to recipient only if the data security rules of the role allows
	  */
	public boolean isEnforceRoleSecurity () 
	{
		Object oo = get_Value(COLUMNNAME_EnforceRoleSecurity);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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

	/** Set Valid.
		@param IsValid 
		Element is valid
	  */
	public void setIsValid (boolean IsValid)
	{
		set_Value (COLUMNNAME_IsValid, Boolean.valueOf(IsValid));
	}

	/** Get Valid.
		@return Element is valid
	  */
	public boolean isValid () 
	{
		Object oo = get_Value(COLUMNNAME_IsValid);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
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