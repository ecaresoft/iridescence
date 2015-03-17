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

/** Generated Model for AD_ImpFormat_Row
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_ImpFormat_Row extends PO implements I_AD_ImpFormat_Row, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_ImpFormat_Row (Properties ctx, int AD_ImpFormat_Row_ID, String trxName)
    {
      super (ctx, AD_ImpFormat_Row_ID, trxName);
      /** if (AD_ImpFormat_Row_ID == 0)
        {
			setAD_Column_ID (0);
			setAD_ImpFormat_ID (0);
			setAD_ImpFormat_Row_ID (0);
			setDataType (null);
			setDecimalPoint (null);
// .
			setDivideBy100 (false);
			setName (null);
			setSeqNo (0);
// @SQL=SELECT NVL(MAX(SeqNo),0)+10 AS DefaultValue FROM AD_ImpFormat_Row WHERE AD_ImpFormat_ID=@AD_ImpFormat_ID@
        } */
    }

    /** Load Constructor */
    public X_AD_ImpFormat_Row (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_ImpFormat_Row[")
        .append(get_ID()).append("]");
      return sb.toString();
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
		set_Value (COLUMNNAME_AD_Column_ID, Integer.valueOf(AD_Column_ID));
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

	public I_AD_ImpFormat getAD_ImpFormat() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_ImpFormat.Table_Name);
        I_AD_ImpFormat result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_ImpFormat)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_ImpFormat_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
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

	/** Set Format Field.
		@param AD_ImpFormat_Row_ID Format Field	  */
	public void setAD_ImpFormat_Row_ID (int AD_ImpFormat_Row_ID)
	{
		if (AD_ImpFormat_Row_ID < 1)
			 throw new IllegalArgumentException ("AD_ImpFormat_Row_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_ImpFormat_Row_ID, Integer.valueOf(AD_ImpFormat_Row_ID));
	}

	/** Get Format Field.
		@return Format Field	  */
	public int getAD_ImpFormat_Row_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_ImpFormat_Row_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Callout.
		@param Callout 
		Fully qualified class names and method - separated by semicolons
	  */
	public void setCallout (String Callout)
	{
		set_Value (COLUMNNAME_Callout, Callout);
	}

	/** Get Callout.
		@return Fully qualified class names and method - separated by semicolons
	  */
	public String getCallout () 
	{
		return (String)get_Value(COLUMNNAME_Callout);
	}

	/** Set Constant Value.
		@param ConstantValue 
		Constant value
	  */
	public void setConstantValue (String ConstantValue)
	{
		set_Value (COLUMNNAME_ConstantValue, ConstantValue);
	}

	/** Get Constant Value.
		@return Constant value
	  */
	public String getConstantValue () 
	{
		return (String)get_Value(COLUMNNAME_ConstantValue);
	}

	/** Set Data Format.
		@param DataFormat 
		Format String in Java Notation, e.g. ddMMyy
	  */
	public void setDataFormat (String DataFormat)
	{
		set_Value (COLUMNNAME_DataFormat, DataFormat);
	}

	/** Get Data Format.
		@return Format String in Java Notation, e.g. ddMMyy
	  */
	public String getDataFormat () 
	{
		return (String)get_Value(COLUMNNAME_DataFormat);
	}

	/** DataType AD_Reference_ID=210 */
	public static final int DATATYPE_AD_Reference_ID=210;
	/** String = S */
	public static final String DATATYPE_String = "S";
	/** Number = N */
	public static final String DATATYPE_Number = "N";
	/** Date = D */
	public static final String DATATYPE_Date = "D";
	/** Constant = C */
	public static final String DATATYPE_Constant = "C";
	/** Set Data Type.
		@param DataType 
		Type of data
	  */
	public void setDataType (String DataType)
	{
		if (DataType == null) throw new IllegalArgumentException ("DataType is mandatory");
		if (DataType.equals("S") || DataType.equals("N") || DataType.equals("D") || DataType.equals("C")); else throw new IllegalArgumentException ("DataType Invalid value - " + DataType + " - Reference_ID=210 - S - N - D - C");		set_Value (COLUMNNAME_DataType, DataType);
	}

	/** Get Data Type.
		@return Type of data
	  */
	public String getDataType () 
	{
		return (String)get_Value(COLUMNNAME_DataType);
	}

	/** Set Decimal Point.
		@param DecimalPoint 
		Decimal Point in the data file - if any
	  */
	public void setDecimalPoint (String DecimalPoint)
	{
		if (DecimalPoint == null)
			throw new IllegalArgumentException ("DecimalPoint is mandatory.");
		set_Value (COLUMNNAME_DecimalPoint, DecimalPoint);
	}

	/** Get Decimal Point.
		@return Decimal Point in the data file - if any
	  */
	public String getDecimalPoint () 
	{
		return (String)get_Value(COLUMNNAME_DecimalPoint);
	}

	/** Set Divide by 100.
		@param DivideBy100 
		Divide number by 100 to get correct amount
	  */
	public void setDivideBy100 (boolean DivideBy100)
	{
		set_Value (COLUMNNAME_DivideBy100, Boolean.valueOf(DivideBy100));
	}

	/** Get Divide by 100.
		@return Divide number by 100 to get correct amount
	  */
	public boolean isDivideBy100 () 
	{
		Object oo = get_Value(COLUMNNAME_DivideBy100);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set End No.
		@param EndNo End No	  */
	public void setEndNo (int EndNo)
	{
		set_Value (COLUMNNAME_EndNo, Integer.valueOf(EndNo));
	}

	/** Get End No.
		@return End No	  */
	public int getEndNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EndNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Script.
		@param Script 
		Dynamic Java Language Script to calculate result
	  */
	public void setScript (String Script)
	{
		set_Value (COLUMNNAME_Script, Script);
	}

	/** Get Script.
		@return Dynamic Java Language Script to calculate result
	  */
	public String getScript () 
	{
		return (String)get_Value(COLUMNNAME_Script);
	}

	/** Set Sequence Number.
		@param SeqNo 
		Method of ordering records; lowest number comes first
	  */
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence Number.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Start No.
		@param StartNo 
		Starting number/position
	  */
	public void setStartNo (int StartNo)
	{
		set_Value (COLUMNNAME_StartNo, Integer.valueOf(StartNo));
	}

	/** Get Start No.
		@return Starting number/position
	  */
	public int getStartNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_StartNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}