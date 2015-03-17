/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

/** Generated Model for AD_ReplicationDocument
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_ReplicationDocument extends PO implements I_AD_ReplicationDocument, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_ReplicationDocument (Properties ctx, int AD_ReplicationDocument_ID, String trxName)
    {
      super (ctx, AD_ReplicationDocument_ID, trxName);
      /** if (AD_ReplicationDocument_ID == 0)
        {
			setAD_ReplicationDocument_ID (0);
			setAD_ReplicationStrategy_ID (0);
			setAD_Table_ID (0);
			setC_DocType_ID (0);
			setReplicationType (null);
        } */
    }

    /** Load Constructor */
    public X_AD_ReplicationDocument (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_ReplicationDocument[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Replication Document.
		@param AD_ReplicationDocument_ID Replication Document	  */
	public void setAD_ReplicationDocument_ID (int AD_ReplicationDocument_ID)
	{
		if (AD_ReplicationDocument_ID < 1)
			 throw new IllegalArgumentException ("AD_ReplicationDocument_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ReplicationDocument_ID, Integer.valueOf(AD_ReplicationDocument_ID));
	}

	/** Get Replication Document.
		@return Replication Document	  */
	public int getAD_ReplicationDocument_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationDocument_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Replication Strategy.
		@param AD_ReplicationStrategy_ID 
		Data Replication Strategy
	  */
	public void setAD_ReplicationStrategy_ID (int AD_ReplicationStrategy_ID)
	{
		if (AD_ReplicationStrategy_ID < 1)
			 throw new IllegalArgumentException ("AD_ReplicationStrategy_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ReplicationStrategy_ID, Integer.valueOf(AD_ReplicationStrategy_ID));
	}

	/** Get Replication Strategy.
		@return Data Replication Strategy
	  */
	public int getAD_ReplicationStrategy_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ReplicationStrategy_ID);
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

	public I_C_DocType getC_DocType() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_DocType.Table_Name);
        I_C_DocType result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_DocType)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_DocType_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Document Type.
		@param C_DocType_ID 
		Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0)
			 throw new IllegalArgumentException ("C_DocType_ID is mandatory.");
		set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
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

	/** ReplicationType AD_Reference_ID=126 */
	public static final int REPLICATIONTYPE_AD_Reference_ID=126;
	/** Local = L */
	public static final String REPLICATIONTYPE_Local = "L";
	/** Merge = M */
	public static final String REPLICATIONTYPE_Merge = "M";
	/** Reference = R */
	public static final String REPLICATIONTYPE_Reference = "R";
	/** Set Replication Type.
		@param ReplicationType 
		Type of Data Replication
	  */
	public void setReplicationType (String ReplicationType)
	{
		if (ReplicationType == null) throw new IllegalArgumentException ("ReplicationType is mandatory");
		if (ReplicationType.equals("L") || ReplicationType.equals("M") || ReplicationType.equals("R")); else throw new IllegalArgumentException ("ReplicationType Invalid value - " + ReplicationType + " - Reference_ID=126 - L - M - R");		set_Value (COLUMNNAME_ReplicationType, ReplicationType);
	}

	/** Get Replication Type.
		@return Type of Data Replication
	  */
	public String getReplicationType () 
	{
		return (String)get_Value(COLUMNNAME_ReplicationType);
	}
}