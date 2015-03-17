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

/** Generated Model for CM_ContainerTTable
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_CM_ContainerTTable extends PO implements I_CM_ContainerTTable, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_CM_ContainerTTable (Properties ctx, int CM_ContainerTTable_ID, String trxName)
    {
      super (ctx, CM_ContainerTTable_ID, trxName);
      /** if (CM_ContainerTTable_ID == 0)
        {
			setCM_Container_ID (0);
			setCM_ContainerTTable_ID (0);
			setCM_TemplateTable_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_CM_ContainerTTable (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_CM_ContainerTTable[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_CM_Container getCM_Container() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_Container.Table_Name);
        I_CM_Container result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_Container)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_Container_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Web Container.
		@param CM_Container_ID 
		Web Container contains content like images, text etc.
	  */
	public void setCM_Container_ID (int CM_Container_ID)
	{
		if (CM_Container_ID < 1)
			 throw new IllegalArgumentException ("CM_Container_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_Container_ID, Integer.valueOf(CM_Container_ID));
	}

	/** Get Web Container.
		@return Web Container contains content like images, text etc.
	  */
	public int getCM_Container_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_Container_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Container T.Table.
		@param CM_ContainerTTable_ID 
		Container Template Table
	  */
	public void setCM_ContainerTTable_ID (int CM_ContainerTTable_ID)
	{
		if (CM_ContainerTTable_ID < 1)
			 throw new IllegalArgumentException ("CM_ContainerTTable_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_ContainerTTable_ID, Integer.valueOf(CM_ContainerTTable_ID));
	}

	/** Get Container T.Table.
		@return Container Template Table
	  */
	public int getCM_ContainerTTable_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_ContainerTTable_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_CM_TemplateTable getCM_TemplateTable() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_TemplateTable.Table_Name);
        I_CM_TemplateTable result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_TemplateTable)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_TemplateTable_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Template Table.
		@param CM_TemplateTable_ID 
		CM Template Table Link
	  */
	public void setCM_TemplateTable_ID (int CM_TemplateTable_ID)
	{
		if (CM_TemplateTable_ID < 1)
			 throw new IllegalArgumentException ("CM_TemplateTable_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_TemplateTable_ID, Integer.valueOf(CM_TemplateTable_ID));
	}

	/** Get Template Table.
		@return CM Template Table Link
	  */
	public int getCM_TemplateTable_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_TemplateTable_ID);
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

	/** Set Other SQL Clause.
		@param OtherClause 
		Other SQL Clause
	  */
	public void setOtherClause (String OtherClause)
	{
		set_Value (COLUMNNAME_OtherClause, OtherClause);
	}

	/** Get Other SQL Clause.
		@return Other SQL Clause
	  */
	public String getOtherClause () 
	{
		return (String)get_Value(COLUMNNAME_OtherClause);
	}

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Record_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Sql WHERE.
		@param WhereClause 
		Fully qualified SQL WHERE clause
	  */
	public void setWhereClause (String WhereClause)
	{
		set_Value (COLUMNNAME_WhereClause, WhereClause);
	}

	/** Get Sql WHERE.
		@return Fully qualified SQL WHERE clause
	  */
	public String getWhereClause () 
	{
		return (String)get_Value(COLUMNNAME_WhereClause);
	}
}