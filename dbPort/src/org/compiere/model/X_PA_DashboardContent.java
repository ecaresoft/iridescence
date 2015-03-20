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

/** Generated Model for PA_DashboardContent
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_PA_DashboardContent extends PO implements I_PA_DashboardContent, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_PA_DashboardContent (Properties ctx, int PA_DashboardContent_ID, String trxName)
    {
      super (ctx, PA_DashboardContent_ID, trxName);
      /** if (PA_DashboardContent_ID == 0)
        {
			setIsCollapsible (true);
// Y
			setName (null);
			setPA_DashboardContent_ID (0);
        } */
    }

    /** Load Constructor */
    public X_PA_DashboardContent (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_PA_DashboardContent[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_AD_Window getAD_Window() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Window.Table_Name);
        I_AD_Window result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Window)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Window_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Window.
		@param AD_Window_ID 
		Data entry or display window
	  */
	public void setAD_Window_ID (int AD_Window_ID)
	{
		if (AD_Window_ID < 1) 
			set_Value (COLUMNNAME_AD_Window_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
	}

	/** Get Window.
		@return Data entry or display window
	  */
	public int getAD_Window_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Column No.
		@param ColumnNo 
		Dashboard content column number
	  */
	public void setColumnNo (int ColumnNo)
	{
		set_Value (COLUMNNAME_ColumnNo, Integer.valueOf(ColumnNo));
	}

	/** Get Column No.
		@return Dashboard content column number
	  */
	public int getColumnNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ColumnNo);
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

	/** GoalDisplay AD_Reference_ID=1200345 */
	public static final int GOALDISPLAY_AD_Reference_ID=1200345;
	/** HTML Table = T */
	public static final String GOALDISPLAY_HTMLTable = "T";
	/** Chart = C */
	public static final String GOALDISPLAY_Chart = "C";
	/** Set Goal Display.
		@param GoalDisplay 
		Type of goal display on dashboard
	  */
	public void setGoalDisplay (String GoalDisplay)
	{

		if (GoalDisplay == null || GoalDisplay.equals("T") || GoalDisplay.equals("C")); else throw new IllegalArgumentException ("GoalDisplay Invalid value - " + GoalDisplay + " - Reference_ID=1200345 - T - C");		set_Value (COLUMNNAME_GoalDisplay, GoalDisplay);
	}

	/** Get Goal Display.
		@return Type of goal display on dashboard
	  */
	public String getGoalDisplay () 
	{
		return (String)get_Value(COLUMNNAME_GoalDisplay);
	}

	/** Set HTML.
		@param HTML HTML	  */
	public void setHTML (String HTML)
	{
		set_Value (COLUMNNAME_HTML, HTML);
	}

	/** Get HTML.
		@return HTML	  */
	public String getHTML () 
	{
		return (String)get_Value(COLUMNNAME_HTML);
	}

	/** Set Collapsible.
		@param IsCollapsible 
		Flag to indicate the state of the dashboard panel
	  */
	public void setIsCollapsible (boolean IsCollapsible)
	{
		set_Value (COLUMNNAME_IsCollapsible, Boolean.valueOf(IsCollapsible));
	}

	/** Get Collapsible.
		@return Flag to indicate the state of the dashboard panel
	  */
	public boolean isCollapsible () 
	{
		Object oo = get_Value(COLUMNNAME_IsCollapsible);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Line No.
		@param Line 
		Unique line for this document
	  */
	public void setLine (BigDecimal Line)
	{
		set_Value (COLUMNNAME_Line, Line);
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public BigDecimal getLine () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Line);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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

	/** Set PA_DashboardContent_ID.
		@param PA_DashboardContent_ID PA_DashboardContent_ID	  */
	public void setPA_DashboardContent_ID (int PA_DashboardContent_ID)
	{
		if (PA_DashboardContent_ID < 1)
			 throw new IllegalArgumentException ("PA_DashboardContent_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_PA_DashboardContent_ID, Integer.valueOf(PA_DashboardContent_ID));
	}

	/** Get PA_DashboardContent_ID.
		@return PA_DashboardContent_ID	  */
	public int getPA_DashboardContent_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_DashboardContent_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_PA_Goal getPA_Goal() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_PA_Goal.Table_Name);
        I_PA_Goal result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_PA_Goal)constructor.newInstance(new Object[] {getCtx(), new Integer(getPA_Goal_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Goal.
		@param PA_Goal_ID 
		Performance Goal
	  */
	public void setPA_Goal_ID (int PA_Goal_ID)
	{
		if (PA_Goal_ID < 1) 
			set_Value (COLUMNNAME_PA_Goal_ID, null);
		else 
			set_Value (COLUMNNAME_PA_Goal_ID, Integer.valueOf(PA_Goal_ID));
	}

	/** Get Goal.
		@return Performance Goal
	  */
	public int getPA_Goal_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_PA_Goal_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set ZUL File Path.
		@param ZulFilePath 
		Absolute path to zul file
	  */
	public void setZulFilePath (String ZulFilePath)
	{
		set_Value (COLUMNNAME_ZulFilePath, ZulFilePath);
	}

	/** Get ZUL File Path.
		@return Absolute path to zul file
	  */
	public String getZulFilePath () 
	{
		return (String)get_Value(COLUMNNAME_ZulFilePath);
	}
}