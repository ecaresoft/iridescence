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

/** Generated Model for B_TopicCategory
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_B_TopicCategory extends PO implements I_B_TopicCategory, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_B_TopicCategory (Properties ctx, int B_TopicCategory_ID, String trxName)
    {
      super (ctx, B_TopicCategory_ID, trxName);
      /** if (B_TopicCategory_ID == 0)
        {
			setB_TopicCategory_ID (0);
			setB_TopicType_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_B_TopicCategory (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client 
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
      StringBuffer sb = new StringBuffer ("X_B_TopicCategory[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Topic Category.
		@param B_TopicCategory_ID 
		Auction Topic Category
	  */
	public void setB_TopicCategory_ID (int B_TopicCategory_ID)
	{
		if (B_TopicCategory_ID < 1)
			 throw new IllegalArgumentException ("B_TopicCategory_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_B_TopicCategory_ID, Integer.valueOf(B_TopicCategory_ID));
	}

	/** Get Topic Category.
		@return Auction Topic Category
	  */
	public int getB_TopicCategory_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicCategory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_B_TopicType getB_TopicType() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_B_TopicType.Table_Name);
        I_B_TopicType result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_B_TopicType)constructor.newInstance(new Object[] {getCtx(), new Integer(getB_TopicType_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Topic Type.
		@param B_TopicType_ID 
		Auction Topic Type
	  */
	public void setB_TopicType_ID (int B_TopicType_ID)
	{
		if (B_TopicType_ID < 1)
			 throw new IllegalArgumentException ("B_TopicType_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_B_TopicType_ID, Integer.valueOf(B_TopicType_ID));
	}

	/** Get Topic Type.
		@return Auction Topic Type
	  */
	public int getB_TopicType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_B_TopicType_ID);
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
}