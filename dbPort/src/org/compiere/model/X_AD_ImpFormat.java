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

/** Generated Model for AD_ImpFormat
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_ImpFormat extends PO implements I_AD_ImpFormat, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_ImpFormat (Properties ctx, int AD_ImpFormat_ID, String trxName)
    {
      super (ctx, AD_ImpFormat_ID, trxName);
      /** if (AD_ImpFormat_ID == 0)
        {
			setAD_ImpFormat_ID (0);
			setAD_Table_ID (0);
			setFormatType (null);
			setName (null);
			setProcessing (false);
        } */
    }

    /** Load Constructor */
    public X_AD_ImpFormat (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_ImpFormat[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Import Format.
		@param AD_ImpFormat_ID Import Format	  */
	public void setAD_ImpFormat_ID (int AD_ImpFormat_ID)
	{
		if (AD_ImpFormat_ID < 1)
			 throw new IllegalArgumentException ("AD_ImpFormat_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ImpFormat_ID, Integer.valueOf(AD_ImpFormat_ID));
	}

	/** Get Import Format.
		@return Import Format	  */
	public int getAD_ImpFormat_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ImpFormat_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Table getAD_Table() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Table.Table_Name);
        I_AD_Table result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Table)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Table_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Table.
		@param AD_Table_ID 
		Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID)
	{
		if (AD_Table_ID < 1)
			 throw new IllegalArgumentException ("AD_Table_ID is mandatory.");
		set_Value (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
	}

	/** Get Table.
		@return Database Table information
	  */
	public int getAD_Table_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Table_ID);
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

	/** FormatType AD_Reference_ID=209 */
	public static final int FORMATTYPE_AD_Reference_ID=209;
	/** Fixed Position = F */
	public static final String FORMATTYPE_FixedPosition = "F";
	/** Comma Separated = C */
	public static final String FORMATTYPE_CommaSeparated = "C";
	/** Tab Separated = T */
	public static final String FORMATTYPE_TabSeparated = "T";
	/** XML = X */
	public static final String FORMATTYPE_XML = "X";
	/** Pipe Separated = P */
	public static final String FORMATTYPE_PipeSeparated = "P";
	/** Set Format.
		@param FormatType 
		Format of the data
	  */
	public void setFormatType (String FormatType)
	{
		if (FormatType == null) throw new IllegalArgumentException ("FormatType is mandatory");
		if (FormatType.equals("F") || FormatType.equals("C") || FormatType.equals("T") || FormatType.equals("X") || FormatType.equals("P")); else throw new IllegalArgumentException ("FormatType Invalid value - " + FormatType + " - Reference_ID=209 - F - C - T - X - P");		set_Value (COLUMNNAME_FormatType, FormatType);
	}

	/** Get Format.
		@return Format of the data
	  */
	public String getFormatType () 
	{
		return (String)get_Value(COLUMNNAME_FormatType);
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
}