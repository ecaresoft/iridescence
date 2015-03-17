/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.KeyNamePair;

/** Generated Model for EXME_Articulo_Ley
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_EXME_Articulo_Ley extends PO implements I_EXME_Articulo_Ley, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_EXME_Articulo_Ley (Properties ctx, int EXME_Articulo_Ley_ID, String trxName)
    {
      super (ctx, EXME_Articulo_Ley_ID, trxName);
      /** if (EXME_Articulo_Ley_ID == 0)
        {
			setEXME_Articulo_Ley_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_EXME_Articulo_Ley (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EXME_Articulo_Ley[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Rule Article.
		@param EXME_Articulo_Ley_ID Rule Article	  */
	public void setEXME_Articulo_Ley_ID (int EXME_Articulo_Ley_ID)
	{
		if (EXME_Articulo_Ley_ID < 1)
			 throw new IllegalArgumentException ("EXME_Articulo_Ley_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_EXME_Articulo_Ley_ID, Integer.valueOf(EXME_Articulo_Ley_ID));
	}

	/** Get Rule Article.
		@return Rule Article	  */
	public int getEXME_Articulo_Ley_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_Articulo_Ley_ID);
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		if (Value == null)
			throw new IllegalArgumentException ("Value is mandatory.");
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}