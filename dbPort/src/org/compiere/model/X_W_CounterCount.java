/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for W_CounterCount
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_W_CounterCount extends PO implements I_W_CounterCount, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_W_CounterCount (Properties ctx, int W_CounterCount_ID, String trxName)
    {
      super (ctx, W_CounterCount_ID, trxName);
      /** if (W_CounterCount_ID == 0)
        {
			setName (null);
			setPageURL (null);
			setW_CounterCount_ID (0);
        } */
    }

    /** Load Constructor */
    public X_W_CounterCount (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_W_CounterCount[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Business Partner.
		@param C_BPartner_ID 
		Identifier for a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifier for a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Counter.
		@param Counter 
		Count Value
	  */
	public void setCounter (int Counter)
	{
		throw new IllegalArgumentException ("Counter is virtual column");	}

	/** Get Counter.
		@return Count Value
	  */
	public int getCounter () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Counter);
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

	/** Set Page URL.
		@param PageURL Page URL	  */
	public void setPageURL (String PageURL)
	{
		if (PageURL == null)
			throw new IllegalArgumentException ("PageURL is mandatory.");
		set_Value (COLUMNNAME_PageURL, PageURL);
	}

	/** Get Page URL.
		@return Page URL	  */
	public String getPageURL () 
	{
		return (String)get_Value(COLUMNNAME_PageURL);
	}

	/** Set Counter Count.
		@param W_CounterCount_ID 
		Web Counter Count Management
	  */
	public void setW_CounterCount_ID (int W_CounterCount_ID)
	{
		if (W_CounterCount_ID < 1)
			 throw new IllegalArgumentException ("W_CounterCount_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_W_CounterCount_ID, Integer.valueOf(W_CounterCount_ID));
	}

	/** Get Counter Count.
		@return Web Counter Count Management
	  */
	public int getW_CounterCount_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_W_CounterCount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}