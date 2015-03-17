/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for K_Source
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_K_Source extends PO implements I_K_Source, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_K_Source (Properties ctx, int K_Source_ID, String trxName)
    {
      super (ctx, K_Source_ID, trxName);
      /** if (K_Source_ID == 0)
        {
			setK_Source_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_K_Source (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_K_Source[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Description URL.
		@param DescriptionURL 
		URL for the description
	  */
	public void setDescriptionURL (String DescriptionURL)
	{
		set_Value (COLUMNNAME_DescriptionURL, DescriptionURL);
	}

	/** Get Description URL.
		@return URL for the description
	  */
	public String getDescriptionURL () 
	{
		return (String)get_Value(COLUMNNAME_DescriptionURL);
	}

	/** Set Knowledge Source.
		@param K_Source_ID 
		Source of a Knowledge Entry
	  */
	public void setK_Source_ID (int K_Source_ID)
	{
		if (K_Source_ID < 1)
			 throw new IllegalArgumentException ("K_Source_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_K_Source_ID, Integer.valueOf(K_Source_ID));
	}

	/** Get Knowledge Source.
		@return Source of a Knowledge Entry
	  */
	public int getK_Source_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_K_Source_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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