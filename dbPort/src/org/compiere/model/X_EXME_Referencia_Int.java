/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for EXME_Referencia_Int
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_EXME_Referencia_Int extends PO implements I_EXME_Referencia_Int, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_EXME_Referencia_Int (Properties ctx, int EXME_Referencia_Int_ID, String trxName)
    {
      super (ctx, EXME_Referencia_Int_ID, trxName);
      /** if (EXME_Referencia_Int_ID == 0)
        {
			setEXME_Referencia_Int_ID (0);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_EXME_Referencia_Int (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EXME_Referencia_Int[")
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

	/** Set Internal Reference.
		@param EXME_Referencia_Int_ID 
		Patient's Internal Reference
	  */
	public void setEXME_Referencia_Int_ID (int EXME_Referencia_Int_ID)
	{
		if (EXME_Referencia_Int_ID < 1)
			 throw new IllegalArgumentException ("EXME_Referencia_Int_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_EXME_Referencia_Int_ID, Integer.valueOf(EXME_Referencia_Int_ID));
	}

	/** Get Internal Reference.
		@return Patient's Internal Reference
	  */
	public int getEXME_Referencia_Int_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_Referencia_Int_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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