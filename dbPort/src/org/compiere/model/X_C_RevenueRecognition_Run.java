/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;

/** Generated Model for C_RevenueRecognition_Run
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_C_RevenueRecognition_Run extends PO implements I_C_RevenueRecognition_Run, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, int C_RevenueRecognition_Run_ID, String trxName)
    {
      super (ctx, C_RevenueRecognition_Run_ID, trxName);
      /** if (C_RevenueRecognition_Run_ID == 0)
        {
			setC_RevenueRecognition_Plan_ID (0);
			setC_RevenueRecognition_Run_ID (0);
			setGL_Journal_ID (0);
			setRecognizedAmt (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_C_RevenueRecognition_Run (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 1 - Org 
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
      StringBuffer sb = new StringBuffer ("X_C_RevenueRecognition_Run[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_RevenueRecognition_Plan getC_RevenueRecognition_Plan() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_RevenueRecognition_Plan.Table_Name);
        I_C_RevenueRecognition_Plan result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_RevenueRecognition_Plan)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_RevenueRecognition_Plan_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Revenue Recognition Plan.
		@param C_RevenueRecognition_Plan_ID 
		Plan for recognizing or recording revenue
	  */
	public void setC_RevenueRecognition_Plan_ID (int C_RevenueRecognition_Plan_ID)
	{
		if (C_RevenueRecognition_Plan_ID < 1)
			 throw new IllegalArgumentException ("C_RevenueRecognition_Plan_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Plan_ID, Integer.valueOf(C_RevenueRecognition_Plan_ID));
	}

	/** Get Revenue Recognition Plan.
		@return Plan for recognizing or recording revenue
	  */
	public int getC_RevenueRecognition_Plan_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Plan_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_RevenueRecognition_Plan_ID()));
    }

	/** Set Revenue Recognition Run.
		@param C_RevenueRecognition_Run_ID 
		Revenue Recognition Run or Process
	  */
	public void setC_RevenueRecognition_Run_ID (int C_RevenueRecognition_Run_ID)
	{
		if (C_RevenueRecognition_Run_ID < 1)
			 throw new IllegalArgumentException ("C_RevenueRecognition_Run_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_RevenueRecognition_Run_ID, Integer.valueOf(C_RevenueRecognition_Run_ID));
	}

	/** Get Revenue Recognition Run.
		@return Revenue Recognition Run or Process
	  */
	public int getC_RevenueRecognition_Run_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_Run_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_GL_Journal getGL_Journal() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_GL_Journal.Table_Name);
        I_GL_Journal result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_GL_Journal)constructor.newInstance(new Object[] {getCtx(), new Integer(getGL_Journal_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Journal.
		@param GL_Journal_ID 
		General Ledger Journal
	  */
	public void setGL_Journal_ID (int GL_Journal_ID)
	{
		if (GL_Journal_ID < 1)
			 throw new IllegalArgumentException ("GL_Journal_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_GL_Journal_ID, Integer.valueOf(GL_Journal_ID));
	}

	/** Get Journal.
		@return General Ledger Journal
	  */
	public int getGL_Journal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GL_Journal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Recognized Amount.
		@param RecognizedAmt Recognized Amount	  */
	public void setRecognizedAmt (BigDecimal RecognizedAmt)
	{
		if (RecognizedAmt == null)
			throw new IllegalArgumentException ("RecognizedAmt is mandatory.");
		set_ValueNoCheck (COLUMNNAME_RecognizedAmt, RecognizedAmt);
	}

	/** Get Recognized Amount.
		@return Recognized Amount	  */
	public BigDecimal getRecognizedAmt () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RecognizedAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}
}