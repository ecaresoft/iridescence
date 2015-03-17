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

/** Generated Model for AD_ChangeLog
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_ChangeLog extends PO implements I_AD_ChangeLog, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_ChangeLog (Properties ctx, int AD_ChangeLog_ID, String trxName)
    {
      super (ctx, AD_ChangeLog_ID, trxName);
      /** if (AD_ChangeLog_ID == 0)
        {
			setAD_ChangeLog_ID (0);
			setAD_Column_ID (0);
			setAD_Session_ID (0);
			setAD_Table_ID (0);
			setIsCustomization (false);
			setRecord_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_ChangeLog (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_ChangeLog[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Change Log.
		@param AD_ChangeLog_ID 
		Log of data changes
	  */
	public void setAD_ChangeLog_ID (int AD_ChangeLog_ID)
	{
		if (AD_ChangeLog_ID < 1)
			 throw new IllegalArgumentException ("AD_ChangeLog_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ChangeLog_ID, Integer.valueOf(AD_ChangeLog_ID));
	}

	/** Get Change Log.
		@return Log of data changes
	  */
	public int getAD_ChangeLog_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ChangeLog_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Column getAD_Column() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Column.Table_Name);
        I_AD_Column result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Column)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Column_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Column.
		@param AD_Column_ID 
		Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID)
	{
		if (AD_Column_ID < 1)
			 throw new IllegalArgumentException ("AD_Column_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
	}

	/** Get Column.
		@return Column in the table
	  */
	public int getAD_Column_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Column_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Session getAD_Session() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Session.Table_Name);
        I_AD_Session result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Session)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Session_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Session.
		@param AD_Session_ID 
		User Session Online or Web
	  */
	public void setAD_Session_ID (int AD_Session_ID)
	{
		if (AD_Session_ID < 1)
			 throw new IllegalArgumentException ("AD_Session_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Session_ID, Integer.valueOf(AD_Session_ID));
	}

	/** Get Session.
		@return User Session Online or Web
	  */
	public int getAD_Session_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Session_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_Session_ID()));
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
		set_ValueNoCheck (COLUMNNAME_AD_Table_ID, Integer.valueOf(AD_Table_ID));
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

	/** EventChangeLog AD_Reference_ID=1200261 */
	public static final int EVENTCHANGELOG_AD_Reference_ID=1200261;
	/** Insert = I */
	public static final String EVENTCHANGELOG_Insert = "I";
	/** Delete = D */
	public static final String EVENTCHANGELOG_Delete = "D";
	/** Update = U */
	public static final String EVENTCHANGELOG_Update = "U";
	/** Set Event Change Log.
		@param EventChangeLog 
		Type of Event in Change Log
	  */
	public void setEventChangeLog (String EventChangeLog)
	{

		if (EventChangeLog == null || EventChangeLog.equals("I") || EventChangeLog.equals("D") || EventChangeLog.equals("U")); else throw new IllegalArgumentException ("EventChangeLog Invalid value - " + EventChangeLog + " - Reference_ID=1200261 - I - D - U");		set_Value (COLUMNNAME_EventChangeLog, EventChangeLog);
	}

	/** Get Event Change Log.
		@return Type of Event in Change Log
	  */
	public String getEventChangeLog () 
	{
		return (String)get_Value(COLUMNNAME_EventChangeLog);
	}

	public I_EXME_Paciente getEXME_Paciente() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_EXME_Paciente.Table_Name);
        I_EXME_Paciente result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_EXME_Paciente)constructor.newInstance(new Object[] {getCtx(), new Integer(getEXME_Paciente_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Patient.
		@param EXME_Paciente_ID 
		Patient
	  */
	public void setEXME_Paciente_ID (int EXME_Paciente_ID)
	{
		if (EXME_Paciente_ID < 1) 
			set_Value (COLUMNNAME_EXME_Paciente_ID, null);
		else 
			set_Value (COLUMNNAME_EXME_Paciente_ID, Integer.valueOf(EXME_Paciente_ID));
	}

	/** Get Patient.
		@return Patient
	  */
	public int getEXME_Paciente_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_Paciente_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Customization.
		@param IsCustomization 
		The change is a customization of the data dictionary and can be applied after Migration
	  */
	public void setIsCustomization (boolean IsCustomization)
	{
		set_Value (COLUMNNAME_IsCustomization, Boolean.valueOf(IsCustomization));
	}

	/** Get Customization.
		@return The change is a customization of the data dictionary and can be applied after Migration
	  */
	public boolean isCustomization () 
	{
		Object oo = get_Value(COLUMNNAME_IsCustomization);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set New Value.
		@param NewValue 
		New field value
	  */
	public void setNewValue (String NewValue)
	{
		set_ValueNoCheck (COLUMNNAME_NewValue, NewValue);
	}

	/** Get New Value.
		@return New field value
	  */
	public String getNewValue () 
	{
		return (String)get_Value(COLUMNNAME_NewValue);
	}

	/** Set Old Value.
		@param OldValue 
		The old file data
	  */
	public void setOldValue (String OldValue)
	{
		set_ValueNoCheck (COLUMNNAME_OldValue, OldValue);
	}

	/** Get Old Value.
		@return The old file data
	  */
	public String getOldValue () 
	{
		return (String)get_Value(COLUMNNAME_OldValue);
	}

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 0)
			 throw new IllegalArgumentException ("Record_ID is mandatory.");
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

	/** Set Redo.
		@param Redo Redo	  */
	public void setRedo (String Redo)
	{
		set_Value (COLUMNNAME_Redo, Redo);
	}

	/** Get Redo.
		@return Redo	  */
	public String getRedo () 
	{
		return (String)get_Value(COLUMNNAME_Redo);
	}

	/** Set Transaction.
		@param TrxName 
		Name of the transaction
	  */
	public void setTrxName (String TrxName)
	{
		set_ValueNoCheck (COLUMNNAME_TrxName, TrxName);
	}

	/** Get Transaction.
		@return Name of the transaction
	  */
	public String getTrxName () 
	{
		return (String)get_Value(COLUMNNAME_TrxName);
	}

	/** Set Undo.
		@param Undo Undo	  */
	public void setUndo (String Undo)
	{
		set_Value (COLUMNNAME_Undo, Undo);
	}

	/** Get Undo.
		@return Undo	  */
	public String getUndo () 
	{
		return (String)get_Value(COLUMNNAME_Undo);
	}
}