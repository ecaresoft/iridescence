/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for AD_Package_Imp_Proc
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_Package_Imp_Proc extends PO implements I_AD_Package_Imp_Proc, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_Package_Imp_Proc (Properties ctx, int AD_Package_Imp_Proc_ID, String trxName)
    {
      super (ctx, AD_Package_Imp_Proc_ID, trxName);
      /** if (AD_Package_Imp_Proc_ID == 0)
        {
			setAD_Package_Imp_Proc_ID (0);
			setAD_Package_Source (null);
			setAD_Package_Source_Type (null);
        } */
    }

    /** Load Constructor */
    public X_AD_Package_Imp_Proc (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System 
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
      StringBuffer sb = new StringBuffer ("X_AD_Package_Imp_Proc[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Update System Maintained Application Dictionary.
		@param AD_Override_Dict Update System Maintained Application Dictionary	  */
	public void setAD_Override_Dict (boolean AD_Override_Dict)
	{
		set_Value (COLUMNNAME_AD_Override_Dict, Boolean.valueOf(AD_Override_Dict));
	}

	/** Get Update System Maintained Application Dictionary.
		@return Update System Maintained Application Dictionary	  */
	public boolean isAD_Override_Dict () 
	{
		Object oo = get_Value(COLUMNNAME_AD_Override_Dict);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Package Directory.
		@param AD_Package_Dir 
		Package directory, default to AdempiereHome/packages
	  */
	public void setAD_Package_Dir (String AD_Package_Dir)
	{
		set_Value (COLUMNNAME_AD_Package_Dir, AD_Package_Dir);
	}

	/** Get Package Directory.
		@return Package directory, default to AdempiereHome/packages
	  */
	public String getAD_Package_Dir () 
	{
		return (String)get_Value(COLUMNNAME_AD_Package_Dir);
	}

	/** Set AD_Package_Imp_Proc_ID.
		@param AD_Package_Imp_Proc_ID AD_Package_Imp_Proc_ID	  */
	public void setAD_Package_Imp_Proc_ID (int AD_Package_Imp_Proc_ID)
	{
		if (AD_Package_Imp_Proc_ID < 1)
			 throw new IllegalArgumentException ("AD_Package_Imp_Proc_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Package_Imp_Proc_ID, Integer.valueOf(AD_Package_Imp_Proc_ID));
	}

	/** Get AD_Package_Imp_Proc_ID.
		@return AD_Package_Imp_Proc_ID	  */
	public int getAD_Package_Imp_Proc_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Package_Imp_Proc_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Package Source.
		@param AD_Package_Source 
		Fully qualified package source file name
	  */
	public void setAD_Package_Source (String AD_Package_Source)
	{
		if (AD_Package_Source == null)
			throw new IllegalArgumentException ("AD_Package_Source is mandatory.");
		set_Value (COLUMNNAME_AD_Package_Source, AD_Package_Source);
	}

	/** Get Package Source.
		@return Fully qualified package source file name
	  */
	public String getAD_Package_Source () 
	{
		return (String)get_Value(COLUMNNAME_AD_Package_Source);
	}

	/** AD_Package_Source_Type AD_Reference_ID=1200274 */
	public static final int AD_PACKAGE_SOURCE_TYPE_AD_Reference_ID=1200274;
	/** File = File */
	public static final String AD_PACKAGE_SOURCE_TYPE_File = "File";
	/** WebService = WS */
	public static final String AD_PACKAGE_SOURCE_TYPE_WebService = "WS";
	/** Set Package Source Type.
		@param AD_Package_Source_Type 
		Type of package source - file, ftp, webservice etc
	  */
	public void setAD_Package_Source_Type (String AD_Package_Source_Type)
	{
		if (AD_Package_Source_Type == null) throw new IllegalArgumentException ("AD_Package_Source_Type is mandatory");
		if (AD_Package_Source_Type.equals("File") || AD_Package_Source_Type.equals("WS")); else throw new IllegalArgumentException ("AD_Package_Source_Type Invalid value - " + AD_Package_Source_Type + " - Reference_ID=1200274 - File - WS");		set_Value (COLUMNNAME_AD_Package_Source_Type, AD_Package_Source_Type);
	}

	/** Get Package Source Type.
		@return Type of package source - file, ftp, webservice etc
	  */
	public String getAD_Package_Source_Type () 
	{
		return (String)get_Value(COLUMNNAME_AD_Package_Source_Type);
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