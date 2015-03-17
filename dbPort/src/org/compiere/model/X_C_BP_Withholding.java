/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

/** Generated Model for C_BP_Withholding
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_C_BP_Withholding extends PO implements I_C_BP_Withholding, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_C_BP_Withholding (Properties ctx, int C_BP_Withholding_ID, String trxName)
    {
      super (ctx, C_BP_Withholding_ID, trxName);
      /** if (C_BP_Withholding_ID == 0)
        {
			setC_BPartner_ID (0);
			setC_Withholding_ID (0);
			setIsMandatoryWithholding (false);
			setIsTemporaryExempt (false);
        } */
    }

    /** Load Constructor */
    public X_C_BP_Withholding (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 7 - System - Client - Org 
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
      StringBuffer sb = new StringBuffer ("X_C_BP_Withholding[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_C_BPartner getC_BPartner() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_BPartner.Table_Name);
        I_C_BPartner result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_BPartner)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_BPartner_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Business Partner.
		@param C_BPartner_ID 
		Identifier for a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			 throw new IllegalArgumentException ("C_BPartner_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifier for a Business Partner
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Withholding getC_Withholding() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_Withholding.Table_Name);
        I_C_Withholding result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Withholding)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Withholding_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Withholding.
		@param C_Withholding_ID 
		Withholding type defined
	  */
	public void setC_Withholding_ID (int C_Withholding_ID)
	{
		if (C_Withholding_ID < 1)
			 throw new IllegalArgumentException ("C_Withholding_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_C_Withholding_ID, Integer.valueOf(C_Withholding_ID));
	}

	/** Get Withholding.
		@return Withholding type defined
	  */
	public int getC_Withholding_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Withholding_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Exempt reason.
		@param ExemptReason 
		Reason for not withholding
	  */
	public void setExemptReason (String ExemptReason)
	{
		set_Value (COLUMNNAME_ExemptReason, ExemptReason);
	}

	/** Get Exempt reason.
		@return Reason for not withholding
	  */
	public String getExemptReason () 
	{
		return (String)get_Value(COLUMNNAME_ExemptReason);
	}

	/** Set Mandatory Withholding.
		@param IsMandatoryWithholding 
		Monies must be withheld
	  */
	public void setIsMandatoryWithholding (boolean IsMandatoryWithholding)
	{
		set_Value (COLUMNNAME_IsMandatoryWithholding, Boolean.valueOf(IsMandatoryWithholding));
	}

	/** Get Mandatory Withholding.
		@return Monies must be withheld
	  */
	public boolean isMandatoryWithholding () 
	{
		Object oo = get_Value(COLUMNNAME_IsMandatoryWithholding);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Temporary exempt.
		@param IsTemporaryExempt 
		Temporarily do not withhold taxes
	  */
	public void setIsTemporaryExempt (boolean IsTemporaryExempt)
	{
		set_Value (COLUMNNAME_IsTemporaryExempt, Boolean.valueOf(IsTemporaryExempt));
	}

	/** Get Temporary exempt.
		@return Temporarily do not withhold taxes
	  */
	public boolean isTemporaryExempt () 
	{
		Object oo = get_Value(COLUMNNAME_IsTemporaryExempt);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}