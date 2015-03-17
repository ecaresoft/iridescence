/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for PA_SLA_Measure
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_PA_SLA_Measure extends PO implements I_PA_SLA_Measure, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_PA_SLA_Measure (Properties ctx, int PA_SLA_Measure_ID, String trxName)
    {
      super (ctx, PA_SLA_Measure_ID, trxName);
      /** if (PA_SLA_Measure_ID == 0)
        {
			setDateTrx (new Timestamp( System.currentTimeMillis() ));
			setMeasureActual (Env.ZERO);
			setPA_SLA_Goal_ID (0);
			setPA_SLA_Measure_ID (0);
			setProcessed (false);
        } */
    }

    /** Load Constructor */
    public X_PA_SLA_Measure (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PA_SLA_Measure[")
        .append(get_ID()).append("]");
      return sb.toString();
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
			set_Value (COLUMNNAME_AD_Table_ID, null);
		else 
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

	/** Set Transaction Date.
		@param DateTrx 
		Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx)
	{
		if (DateTrx == null)
			throw new IllegalArgumentException ("DateTrx is mandatory.");
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx () 
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getDateTrx()));
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

	/** Set Measure Actual.
		@param MeasureActual 
		Actual value that has been measured.
	  */
	public void setMeasureActual (BigDecimal MeasureActual)
	{
		if (MeasureActual == null)
			throw new IllegalArgumentException ("MeasureActual is mandatory.");
		set_Value (COLUMNNAME_MeasureActual, MeasureActual);
	}

	/** Get Measure Actual.
		@return Actual value that has been measured.
	  */
	public BigDecimal getMeasureActual () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MeasureActual);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_PA_SLA_Goal getPA_SLA_Goal() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_PA_SLA_Goal.Table_Name);
        I_PA_SLA_Goal result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_PA_SLA_Goal)constructor.newInstance(new Object[] {getCtx(), new Integer(getPA_SLA_Goal_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set SLA Goal.
		@param PA_SLA_Goal_ID 
		Service Level Agreement Goal
	  */
	public void setPA_SLA_Goal_ID (int PA_SLA_Goal_ID)
	{
		if (PA_SLA_Goal_ID < 1)
			 throw new IllegalArgumentException ("PA_SLA_Goal_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_PA_SLA_Goal_ID, Integer.valueOf(PA_SLA_Goal_ID));
	}

	/** Get SLA Goal.
		@return Service Level Agreement Goal
	  */
	public int getPA_SLA_Goal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Goal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SLA Measure.
		@param PA_SLA_Measure_ID 
		Service Level Agreement Measure
	  */
	public void setPA_SLA_Measure_ID (int PA_SLA_Measure_ID)
	{
		if (PA_SLA_Measure_ID < 1)
			 throw new IllegalArgumentException ("PA_SLA_Measure_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_PA_SLA_Measure_ID, Integer.valueOf(PA_SLA_Measure_ID));
	}

	/** Get SLA Measure.
		@return Service Level Agreement Measure
	  */
	public int getPA_SLA_Measure_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_SLA_Measure_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 1) 
			set_Value (COLUMNNAME_Record_ID, null);
		else 
			set_Value (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
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
}