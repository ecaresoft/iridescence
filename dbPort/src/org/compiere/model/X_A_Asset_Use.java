/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for A_Asset_Use
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_A_Asset_Use extends PO implements I_A_Asset_Use, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_A_Asset_Use (Properties ctx, int A_Asset_Use_ID, String trxName)
    {
      super (ctx, A_Asset_Use_ID, trxName);
      /** if (A_Asset_Use_ID == 0)
        {
			setA_Asset_ID (0);
			setA_Asset_Use_ID (0);
			setUseDate (new Timestamp( System.currentTimeMillis() ));
			setUseUnits (0);
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Use (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_A_Asset_Use[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set A_Asset_Use_ID.
		@param A_Asset_Use_ID A_Asset_Use_ID	  */
	public void setA_Asset_Use_ID (int A_Asset_Use_ID)
	{
		if (A_Asset_Use_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Use_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_Use_ID, Integer.valueOf(A_Asset_Use_ID));
	}

	/** Get A_Asset_Use_ID.
		@return A_Asset_Use_ID	  */
	public int getA_Asset_Use_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Use_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getA_Asset_Use_ID()));
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

	/** Set UseDate.
		@param UseDate UseDate	  */
	public void setUseDate (Timestamp UseDate)
	{
		if (UseDate == null)
			throw new IllegalArgumentException ("UseDate is mandatory.");
		set_Value (COLUMNNAME_UseDate, UseDate);
	}

	/** Get UseDate.
		@return UseDate	  */
	public Timestamp getUseDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_UseDate);
	}

	/** Set Use units.
		@param UseUnits 
		Currently used units of the assets
	  */
	public void setUseUnits (int UseUnits)
	{
		set_Value (COLUMNNAME_UseUnits, Integer.valueOf(UseUnits));
	}

	/** Get Use units.
		@return Currently used units of the assets
	  */
	public int getUseUnits () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UseUnits);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}