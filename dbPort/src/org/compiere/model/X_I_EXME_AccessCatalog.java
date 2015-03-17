/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for I_EXME_AccessCatalog
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_I_EXME_AccessCatalog extends PO implements I_I_EXME_AccessCatalog, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_I_EXME_AccessCatalog (Properties ctx, int I_EXME_AccessCatalog_ID, String trxName)
    {
      super (ctx, I_EXME_AccessCatalog_ID, trxName);
      /** if (I_EXME_AccessCatalog_ID == 0)
        {
			setI_EXME_AccessCatalog_ID (0);
        } */
    }

    /** Load Constructor */
    public X_I_EXME_AccessCatalog (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_I_EXME_AccessCatalog[")
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

	/** Set Import Error Message.
		@param I_ErrorMsg 
		Messages generated from import process
	  */
	public void setI_ErrorMsg (String I_ErrorMsg)
	{
		set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
	}

	/** Get Import Error Message.
		@return Messages generated from import process
	  */
	public String getI_ErrorMsg () 
	{
		return (String)get_Value(COLUMNNAME_I_ErrorMsg);
	}

	/** Set I_EXME_AccessCatalog_ID.
		@param I_EXME_AccessCatalog_ID I_EXME_AccessCatalog_ID	  */
	public void setI_EXME_AccessCatalog_ID (int I_EXME_AccessCatalog_ID)
	{
		if (I_EXME_AccessCatalog_ID < 1)
			 throw new IllegalArgumentException ("I_EXME_AccessCatalog_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_I_EXME_AccessCatalog_ID, Integer.valueOf(I_EXME_AccessCatalog_ID));
	}

	/** Get I_EXME_AccessCatalog_ID.
		@return I_EXME_AccessCatalog_ID	  */
	public int getI_EXME_AccessCatalog_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_EXME_AccessCatalog_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Imported.
		@param I_IsImported 
		Has this import been processed
	  */
	public void setI_IsImported (boolean I_IsImported)
	{
		set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
	}

	/** Get Imported.
		@return Has this import been processed
	  */
	public boolean isI_IsImported () 
	{
		Object oo = get_Value(COLUMNNAME_I_IsImported);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Multi Access.
		@param MultiAccess 
		Multi Access
	  */
	public void setMultiAccess (BigDecimal MultiAccess)
	{
		set_Value (COLUMNNAME_MultiAccess, MultiAccess);
	}

	/** Get Multi Access.
		@return Multi Access
	  */
	public BigDecimal getMultiAccess () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MultiAccess);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
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

	/** Set OriginalAccess.
		@param OriginalAccess OriginalAccess	  */
	public void setOriginalAccess (BigDecimal OriginalAccess)
	{
		set_Value (COLUMNNAME_OriginalAccess, OriginalAccess);
	}

	/** Get OriginalAccess.
		@return OriginalAccess	  */
	public BigDecimal getOriginalAccess () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OriginalAccess);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set UniqueAccess.
		@param UniqueAccess 
		UniqueAccess
	  */
	public void setUniqueAccess (BigDecimal UniqueAccess)
	{
		set_Value (COLUMNNAME_UniqueAccess, UniqueAccess);
	}

	/** Get UniqueAccess.
		@return UniqueAccess
	  */
	public BigDecimal getUniqueAccess () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_UniqueAccess);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
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