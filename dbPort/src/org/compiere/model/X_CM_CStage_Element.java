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

/** Generated Model for CM_CStage_Element
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_CM_CStage_Element extends PO implements I_CM_CStage_Element, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_CM_CStage_Element (Properties ctx, int CM_CStage_Element_ID, String trxName)
    {
      super (ctx, CM_CStage_Element_ID, trxName);
      /** if (CM_CStage_Element_ID == 0)
        {
			setCM_CStage_Element_ID (0);
			setCM_CStage_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_CM_CStage_Element (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_CM_CStage_Element[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Container Stage Element.
		@param CM_CStage_Element_ID 
		Container element i.e. Headline, Content, Footer etc.
	  */
	public void setCM_CStage_Element_ID (int CM_CStage_Element_ID)
	{
		if (CM_CStage_Element_ID < 1)
			 throw new IllegalArgumentException ("CM_CStage_Element_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_CStage_Element_ID, Integer.valueOf(CM_CStage_Element_ID));
	}

	/** Get Container Stage Element.
		@return Container element i.e. Headline, Content, Footer etc.
	  */
	public int getCM_CStage_Element_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_CStage_Element_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_CM_CStage getCM_CStage() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_CStage.Table_Name);
        I_CM_CStage result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_CStage)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_CStage_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Web Container Stage.
		@param CM_CStage_ID 
		Web Container Stage contains the staging content like images, text etc.
	  */
	public void setCM_CStage_ID (int CM_CStage_ID)
	{
		if (CM_CStage_ID < 1)
			 throw new IllegalArgumentException ("CM_CStage_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_CStage_ID, Integer.valueOf(CM_CStage_ID));
	}

	/** Get Web Container Stage.
		@return Web Container Stage contains the staging content like images, text etc.
	  */
	public int getCM_CStage_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_CStage_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Content HTML.
		@param ContentHTML 
		Contains the content itself
	  */
	public void setContentHTML (String ContentHTML)
	{
		set_Value (COLUMNNAME_ContentHTML, ContentHTML);
	}

	/** Get Content HTML.
		@return Contains the content itself
	  */
	public String getContentHTML () 
	{
		return (String)get_Value(COLUMNNAME_ContentHTML);
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