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

/** Generated Model for CM_WebProject_Domain
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_CM_WebProject_Domain extends PO implements I_CM_WebProject_Domain, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_CM_WebProject_Domain (Properties ctx, int CM_WebProject_Domain_ID, String trxName)
    {
      super (ctx, CM_WebProject_Domain_ID, trxName);
      /** if (CM_WebProject_Domain_ID == 0)
        {
			setCM_WebProject_Domain_ID (0);
			setCM_WebProject_ID (0);
			setFQDN (null);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_CM_WebProject_Domain (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_CM_WebProject_Domain[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_CM_Container getCM_Container() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_Container.Table_Name);
        I_CM_Container result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_Container)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_Container_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Web Container.
		@param CM_Container_ID 
		Web Container contains content like images, text etc.
	  */
	public void setCM_Container_ID (int CM_Container_ID)
	{
		if (CM_Container_ID < 1) 
			set_Value (COLUMNNAME_CM_Container_ID, null);
		else 
			set_Value (COLUMNNAME_CM_Container_ID, Integer.valueOf(CM_Container_ID));
	}

	/** Get Web Container.
		@return Web Container contains content like images, text etc.
	  */
	public int getCM_Container_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_Container_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set WebProject Domain.
		@param CM_WebProject_Domain_ID 
		Definition of Domainhandling
	  */
	public void setCM_WebProject_Domain_ID (int CM_WebProject_Domain_ID)
	{
		if (CM_WebProject_Domain_ID < 1)
			 throw new IllegalArgumentException ("CM_WebProject_Domain_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_WebProject_Domain_ID, Integer.valueOf(CM_WebProject_Domain_ID));
	}

	/** Get WebProject Domain.
		@return Definition of Domainhandling
	  */
	public int getCM_WebProject_Domain_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_WebProject_Domain_ID);
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
			 throw new IllegalArgumentException ("CM_WebProject_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_WebProject_ID, Integer.valueOf(CM_WebProject_ID));
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

	/** Set Fully Qualified Domain Name.
		@param FQDN 
		Fully Qualified Domain Name i.e. www.comdivision.com
	  */
	public void setFQDN (String FQDN)
	{
		if (FQDN == null)
			throw new IllegalArgumentException ("FQDN is mandatory.");
		set_Value (COLUMNNAME_FQDN, FQDN);
	}

	/** Get Fully Qualified Domain Name.
		@return Fully Qualified Domain Name i.e. www.comdivision.com
	  */
	public String getFQDN () 
	{
		return (String)get_Value(COLUMNNAME_FQDN);
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