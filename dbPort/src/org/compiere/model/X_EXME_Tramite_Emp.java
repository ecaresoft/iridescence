/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.KeyNamePair;

/** Generated Model for EXME_Tramite_Emp
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_EXME_Tramite_Emp extends PO implements I_EXME_Tramite_Emp, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_EXME_Tramite_Emp (Properties ctx, int EXME_Tramite_Emp_ID, String trxName)
    {
      super (ctx, EXME_Tramite_Emp_ID, trxName);
      /** if (EXME_Tramite_Emp_ID == 0)
        {
			setEXME_TramiteDet_ID (0);
			setEXME_Tramite_Emp_ID (0);
			setEXME_TramiteHdr_ID (0);
			setName (null);
			setValue (null);
        } */
    }

    /** Load Constructor */
    public X_EXME_Tramite_Emp (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_EXME_Tramite_Emp[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Notes.
		@param Comentarios Notes	  */
	public void setComentarios (String Comentarios)
	{
		set_Value (COLUMNNAME_Comentarios, Comentarios);
	}

	/** Get Notes.
		@return Notes	  */
	public String getComentarios () 
	{
		return (String)get_Value(COLUMNNAME_Comentarios);
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

	/** Estatus AD_Reference_ID=131 */
	public static final int ESTATUS_AD_Reference_ID=131;
	/** Drafted = DR */
	public static final String ESTATUS_Drafted = "DR";
	/** Completed = CO */
	public static final String ESTATUS_Completed = "CO";
	/** Approved = AP */
	public static final String ESTATUS_Approved = "AP";
	/** Not Approved = NA */
	public static final String ESTATUS_NotApproved = "NA";
	/** Voided = VO */
	public static final String ESTATUS_Voided = "VO";
	/** Invalid = IN */
	public static final String ESTATUS_Invalid = "IN";
	/** Reversed = RE */
	public static final String ESTATUS_Reversed = "RE";
	/** Closed = CL */
	public static final String ESTATUS_Closed = "CL";
	/** Unknown = ?? */
	public static final String ESTATUS_Unknown = "??";
	/** In Progress = IP */
	public static final String ESTATUS_InProgress = "IP";
	/** Waiting Payment = WP */
	public static final String ESTATUS_WaitingPayment = "WP";
	/** Waiting Confirmation = WC */
	public static final String ESTATUS_WaitingConfirmation = "WC";
	/** Set Status.
		@param Estatus 
		Status
	  */
	public void setEstatus (String Estatus)
	{

		if (Estatus == null || Estatus.equals("DR") || Estatus.equals("CO") || Estatus.equals("AP") || Estatus.equals("NA") || Estatus.equals("VO") || Estatus.equals("IN") || Estatus.equals("RE") || Estatus.equals("CL") || Estatus.equals("??") || Estatus.equals("IP") || Estatus.equals("WP") || Estatus.equals("WC")); else throw new IllegalArgumentException ("Estatus Invalid value - " + Estatus + " - Reference_ID=131 - DR - CO - AP - NA - VO - IN - RE - CL - ?? - IP - WP - WC");		set_Value (COLUMNNAME_Estatus, Estatus);
	}

	/** Get Status.
		@return Status
	  */
	public String getEstatus () 
	{
		return (String)get_Value(COLUMNNAME_Estatus);
	}

	/** Set Employee.
		@param EXME_Emp_ID 
		Employee
	  */
	public void setEXME_Emp_ID (int EXME_Emp_ID)
	{
		if (EXME_Emp_ID < 1) 
			set_Value (COLUMNNAME_EXME_Emp_ID, null);
		else 
			set_Value (COLUMNNAME_EXME_Emp_ID, Integer.valueOf(EXME_Emp_ID));
	}

	/** Get Employee.
		@return Employee
	  */
	public int getEXME_Emp_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_Emp_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Procedure Detail.
		@param EXME_TramiteDet_ID Procedure Detail	  */
	public void setEXME_TramiteDet_ID (int EXME_TramiteDet_ID)
	{
		if (EXME_TramiteDet_ID < 1)
			 throw new IllegalArgumentException ("EXME_TramiteDet_ID is mandatory.");
		set_Value (COLUMNNAME_EXME_TramiteDet_ID, Integer.valueOf(EXME_TramiteDet_ID));
	}

	/** Get Procedure Detail.
		@return Procedure Detail	  */
	public int getEXME_TramiteDet_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_TramiteDet_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Employee's Procedure.
		@param EXME_Tramite_Emp_ID Employee's Procedure	  */
	public void setEXME_Tramite_Emp_ID (int EXME_Tramite_Emp_ID)
	{
		if (EXME_Tramite_Emp_ID < 1)
			 throw new IllegalArgumentException ("EXME_Tramite_Emp_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_EXME_Tramite_Emp_ID, Integer.valueOf(EXME_Tramite_Emp_ID));
	}

	/** Get Employee's Procedure.
		@return Employee's Procedure	  */
	public int getEXME_Tramite_Emp_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_Tramite_Emp_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_EXME_TramiteHdr getEXME_TramiteHdr() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_EXME_TramiteHdr.Table_Name);
        I_EXME_TramiteHdr result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_EXME_TramiteHdr)constructor.newInstance(new Object[] {getCtx(), new Integer(getEXME_TramiteHdr_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Procedures.
		@param EXME_TramiteHdr_ID Procedures	  */
	public void setEXME_TramiteHdr_ID (int EXME_TramiteHdr_ID)
	{
		if (EXME_TramiteHdr_ID < 1)
			 throw new IllegalArgumentException ("EXME_TramiteHdr_ID is mandatory.");
		set_Value (COLUMNNAME_EXME_TramiteHdr_ID, Integer.valueOf(EXME_TramiteHdr_ID));
	}

	/** Get Procedures.
		@return Procedures	  */
	public int getEXME_TramiteHdr_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_TramiteHdr_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Delivery Date (social work).
		@param Fecha_Entr 
		Delivery Date (social work)
	  */
	public void setFecha_Entr (Timestamp Fecha_Entr)
	{
		set_Value (COLUMNNAME_Fecha_Entr, Fecha_Entr);
	}

	/** Get Delivery Date (social work).
		@return Delivery Date (social work)
	  */
	public Timestamp getFecha_Entr () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Fecha_Entr);
	}

	/** Set Request Date .
		@param Fecha_Sol Request Date 	  */
	public void setFecha_Sol (Timestamp Fecha_Sol)
	{
		set_Value (COLUMNNAME_Fecha_Sol, Fecha_Sol);
	}

	/** Get Request Date .
		@return Request Date 	  */
	public Timestamp getFecha_Sol () 
	{
		return (Timestamp)get_Value(COLUMNNAME_Fecha_Sol);
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

	/** Set Search Key.
		@param Value 
		Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value)
	{
		if (Value == null)
			throw new IllegalArgumentException ("Value is mandatory.");
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue () 
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}