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

/** Generated Model for AD_PrintLabelLine
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_PrintLabelLine extends PO implements I_AD_PrintLabelLine, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_PrintLabelLine (Properties ctx, int AD_PrintLabelLine_ID, String trxName)
    {
      super (ctx, AD_PrintLabelLine_ID, trxName);
      /** if (AD_PrintLabelLine_ID == 0)
        {
			setAD_LabelPrinterFunction_ID (0);
			setAD_PrintLabel_ID (0);
			setAD_PrintLabelLine_ID (0);
			setLabelFormatType (null);
// F
			setName (null);
			setSeqNo (0);
			setXPosition (0);
			setYPosition (0);
        } */
    }

    /** Load Constructor */
    public X_AD_PrintLabelLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_PrintLabelLine[")
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
			set_Value (COLUMNNAME_AD_Column_ID, null);
		else 
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

	public I_AD_LabelPrinterFunction getAD_LabelPrinterFunction() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_LabelPrinterFunction.Table_Name);
        I_AD_LabelPrinterFunction result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_LabelPrinterFunction)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_LabelPrinterFunction_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Label printer Function.
		@param AD_LabelPrinterFunction_ID 
		Function of Label Printer
	  */
	public void setAD_LabelPrinterFunction_ID (int AD_LabelPrinterFunction_ID)
	{
		if (AD_LabelPrinterFunction_ID < 1)
			 throw new IllegalArgumentException ("AD_LabelPrinterFunction_ID is mandatory.");
		set_Value (COLUMNNAME_AD_LabelPrinterFunction_ID, Integer.valueOf(AD_LabelPrinterFunction_ID));
	}

	/** Get Label printer Function.
		@return Function of Label Printer
	  */
	public int getAD_LabelPrinterFunction_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_LabelPrinterFunction_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_PrintLabel getAD_PrintLabel() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_PrintLabel.Table_Name);
        I_AD_PrintLabel result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_PrintLabel)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_PrintLabel_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Print Label.
		@param AD_PrintLabel_ID 
		Label Format to print
	  */
	public void setAD_PrintLabel_ID (int AD_PrintLabel_ID)
	{
		if (AD_PrintLabel_ID < 1)
			 throw new IllegalArgumentException ("AD_PrintLabel_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_PrintLabel_ID, Integer.valueOf(AD_PrintLabel_ID));
	}

	/** Get Print Label.
		@return Label Format to print
	  */
	public int getAD_PrintLabel_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintLabel_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Print Label Line.
		@param AD_PrintLabelLine_ID 
		Print Label Line Format
	  */
	public void setAD_PrintLabelLine_ID (int AD_PrintLabelLine_ID)
	{
		if (AD_PrintLabelLine_ID < 1)
			 throw new IllegalArgumentException ("AD_PrintLabelLine_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_PrintLabelLine_ID, Integer.valueOf(AD_PrintLabelLine_ID));
	}

	/** Get Print Label Line.
		@return Print Label Line Format
	  */
	public int getAD_PrintLabelLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PrintLabelLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** LabelFormatType AD_Reference_ID=280 */
	public static final int LABELFORMATTYPE_AD_Reference_ID=280;
	/** Field = F */
	public static final String LABELFORMATTYPE_Field = "F";
	/** Text = T */
	public static final String LABELFORMATTYPE_Text = "T";
	/** Set Label Format Type.
		@param LabelFormatType 
		Label Format Type
	  */
	public void setLabelFormatType (String LabelFormatType)
	{
		if (LabelFormatType == null) throw new IllegalArgumentException ("LabelFormatType is mandatory");
		if (LabelFormatType.equals("F") || LabelFormatType.equals("T")); else throw new IllegalArgumentException ("LabelFormatType Invalid value - " + LabelFormatType + " - Reference_ID=280 - F - T");		set_Value (COLUMNNAME_LabelFormatType, LabelFormatType);
	}

	/** Get Label Format Type.
		@return Label Format Type
	  */
	public String getLabelFormatType () 
	{
		return (String)get_Value(COLUMNNAME_LabelFormatType);
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

	/** Set Print Text.
		@param PrintName 
		The label text to be printed on a document or correspondence.
	  */
	public void setPrintName (String PrintName)
	{
		set_Value (COLUMNNAME_PrintName, PrintName);
	}

	/** Get Print Text.
		@return The label text to be printed on a document or correspondence.
	  */
	public String getPrintName () 
	{
		return (String)get_Value(COLUMNNAME_PrintName);
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getSeqNo()));
    }

	/** Set X Position.
		@param XPosition 
		Absolute X (horizontal) position in 1/72 of an inch
	  */
	public void setXPosition (int XPosition)
	{
		set_Value (COLUMNNAME_XPosition, Integer.valueOf(XPosition));
	}

	/** Get X Position.
		@return Absolute X (horizontal) position in 1/72 of an inch
	  */
	public int getXPosition () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_XPosition);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Y Position.
		@param YPosition 
		Absolute Y (vertical) position in 1/72 of an inch
	  */
	public void setYPosition (int YPosition)
	{
		set_Value (COLUMNNAME_YPosition, Integer.valueOf(YPosition));
	}

	/** Get Y Position.
		@return Absolute Y (vertical) position in 1/72 of an inch
	  */
	public int getYPosition () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_YPosition);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}