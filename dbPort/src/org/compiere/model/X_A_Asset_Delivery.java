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

/** Generated Model for A_Asset_Delivery
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_A_Asset_Delivery extends PO implements I_A_Asset_Delivery, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_A_Asset_Delivery (Properties ctx, int A_Asset_Delivery_ID, String trxName)
    {
      super (ctx, A_Asset_Delivery_ID, trxName);
      /** if (A_Asset_Delivery_ID == 0)
        {
			setA_Asset_Delivery_ID (0);
			setMovementDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_A_Asset_Delivery (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_A_Asset_Delivery[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Asset Delivery.
		@param A_Asset_Delivery_ID 
		Delivery of Asset
	  */
	public void setA_Asset_Delivery_ID (int A_Asset_Delivery_ID)
	{
		if (A_Asset_Delivery_ID < 1)
			 throw new IllegalArgumentException ("A_Asset_Delivery_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_A_Asset_Delivery_ID, Integer.valueOf(A_Asset_Delivery_ID));
	}

	/** Get Asset Delivery.
		@return Delivery of Asset
	  */
	public int getA_Asset_Delivery_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_Delivery_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_A_Asset getA_Asset() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_A_Asset.Table_Name);
        I_A_Asset result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_A_Asset)constructor.newInstance(new Object[] {getCtx(), new Integer(getA_Asset_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_User getAD_User() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_User.Table_Name);
        I_AD_User result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_User)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_User_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set User/Contact.
		@param AD_User_ID 
		User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Delivery Confirmation.
		@param DeliveryConfirmation 
		EMail Delivery confirmation
	  */
	public void setDeliveryConfirmation (String DeliveryConfirmation)
	{
		set_Value (COLUMNNAME_DeliveryConfirmation, DeliveryConfirmation);
	}

	/** Get Delivery Confirmation.
		@return EMail Delivery confirmation
	  */
	public String getDeliveryConfirmation () 
	{
		return (String)get_Value(COLUMNNAME_DeliveryConfirmation);
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

	/** Set Document No.
		@param DocumentNo 
		Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set EMail Address.
		@param EMail 
		Electronic Mail Address
	  */
	public void setEMail (String EMail)
	{
		set_ValueNoCheck (COLUMNNAME_EMail, EMail);
	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail () 
	{
		return (String)get_Value(COLUMNNAME_EMail);
	}

	public I_EXME_EstServ getEXME_EstServ() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_EXME_EstServ.Table_Name);
        I_EXME_EstServ result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_EXME_EstServ)constructor.newInstance(new Object[] {getCtx(), new Integer(getEXME_EstServ_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Service Station.
		@param EXME_EstServ_ID 
		Service Station
	  */
	public void setEXME_EstServ_ID (int EXME_EstServ_ID)
	{
		if (EXME_EstServ_ID < 1) 
			set_Value (COLUMNNAME_EXME_EstServ_ID, null);
		else 
			set_Value (COLUMNNAME_EXME_EstServ_ID, Integer.valueOf(EXME_EstServ_ID));
	}

	/** Get Service Station.
		@return Service Station
	  */
	public int getEXME_EstServ_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_EstServ_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Reference Service Station.
		@param EXME_EstServRef_ID 
		It establishes a relationship to the service station.
	  */
	public void setEXME_EstServRef_ID (int EXME_EstServRef_ID)
	{
		if (EXME_EstServRef_ID < 1) 
			set_Value (COLUMNNAME_EXME_EstServRef_ID, null);
		else 
			set_Value (COLUMNNAME_EXME_EstServRef_ID, Integer.valueOf(EXME_EstServRef_ID));
	}

	/** Get Reference Service Station.
		@return It establishes a relationship to the service station.
	  */
	public int getEXME_EstServRef_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_EXME_EstServRef_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** IsPrinted AD_Reference_ID=1200187 */
	public static final int ISPRINTED_AD_Reference_ID=1200187;
	/** Print = N */
	public static final String ISPRINTED_Print = "N";
	/** Printed = Y */
	public static final String ISPRINTED_Printed = "Y";
	/** Set Printed.
		@param IsPrinted 
		Indicates if this document / line is printed
	  */
	public void setIsPrinted (String IsPrinted)
	{

		if (IsPrinted == null || IsPrinted.equals("N") || IsPrinted.equals("Y")); else throw new IllegalArgumentException ("IsPrinted Invalid value - " + IsPrinted + " - Reference_ID=1200187 - N - Y");		set_Value (COLUMNNAME_IsPrinted, IsPrinted);
	}

	/** Get Printed.
		@return Indicates if this document / line is printed
	  */
	public String getIsPrinted () 
	{
		return (String)get_Value(COLUMNNAME_IsPrinted);
	}

	/** IsTransfered AD_Reference_ID=1200173 */
	public static final int ISTRANSFERED_AD_Reference_ID=1200173;
	/** Trasfer = N */
	public static final String ISTRANSFERED_Trasfer = "N";
	/** Moved = Y */
	public static final String ISTRANSFERED_Moved = "Y";
	/** Set Is Transfered.
		@param IsTransfered 
		Sets whether this transfer registration 
	  */
	public void setIsTransfered (String IsTransfered)
	{

		if (IsTransfered == null || IsTransfered.equals("N") || IsTransfered.equals("Y")); else throw new IllegalArgumentException ("IsTransfered Invalid value - " + IsTransfered + " - Reference_ID=1200173 - N - Y");		set_Value (COLUMNNAME_IsTransfered, IsTransfered);
	}

	/** Get Is Transfered.
		@return Sets whether this transfer registration 
	  */
	public String getIsTransfered () 
	{
		return (String)get_Value(COLUMNNAME_IsTransfered);
	}

	/** Set Lot No.
		@param Lot 
		Lot number (alphanumeric)
	  */
	public void setLot (String Lot)
	{
		set_ValueNoCheck (COLUMNNAME_Lot, Lot);
	}

	/** Get Lot No.
		@return Lot number (alphanumeric)
	  */
	public String getLot () 
	{
		return (String)get_Value(COLUMNNAME_Lot);
	}

	/** Set Message ID.
		@param MessageID 
		EMail Message ID
	  */
	public void setMessageID (String MessageID)
	{
		set_ValueNoCheck (COLUMNNAME_MessageID, MessageID);
	}

	/** Get Message ID.
		@return EMail Message ID
	  */
	public String getMessageID () 
	{
		return (String)get_Value(COLUMNNAME_MessageID);
	}

	public I_M_InOutLine getM_InOutLine() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_M_InOutLine.Table_Name);
        I_M_InOutLine result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_M_InOutLine)constructor.newInstance(new Object[] {getCtx(), new Integer(getM_InOutLine_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Shipment/Receipt Line.
		@param M_InOutLine_ID 
		Line on Shipment or Receipt document
	  */
	public void setM_InOutLine_ID (int M_InOutLine_ID)
	{
		if (M_InOutLine_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_M_InOutLine_ID, Integer.valueOf(M_InOutLine_ID));
	}

	/** Get Shipment/Receipt Line.
		@return Line on Shipment or Receipt document
	  */
	public int getM_InOutLine_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_InOutLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Movement Date.
		@param MovementDate 
		Date a product was moved in or out of inventory
	  */
	public void setMovementDate (Timestamp MovementDate)
	{
		if (MovementDate == null)
			throw new IllegalArgumentException ("MovementDate is mandatory.");
		set_ValueNoCheck (COLUMNNAME_MovementDate, MovementDate);
	}

	/** Get Movement Date.
		@return Date a product was moved in or out of inventory
	  */
	public Timestamp getMovementDate () 
	{
		return (Timestamp)get_Value(COLUMNNAME_MovementDate);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getMovementDate()));
    }

	public I_M_ProductDownload getM_ProductDownload() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_M_ProductDownload.Table_Name);
        I_M_ProductDownload result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_M_ProductDownload)constructor.newInstance(new Object[] {getCtx(), new Integer(getM_ProductDownload_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Product Download.
		@param M_ProductDownload_ID 
		Product downloads
	  */
	public void setM_ProductDownload_ID (int M_ProductDownload_ID)
	{
		if (M_ProductDownload_ID < 1) 
			set_Value (COLUMNNAME_M_ProductDownload_ID, null);
		else 
			set_Value (COLUMNNAME_M_ProductDownload_ID, Integer.valueOf(M_ProductDownload_ID));
	}

	/** Get Product Download.
		@return Product downloads
	  */
	public int getM_ProductDownload_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_ProductDownload_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Referrer.
		@param Referrer 
		Referring web address
	  */
	public void setReferrer (String Referrer)
	{
		set_ValueNoCheck (COLUMNNAME_Referrer, Referrer);
	}

	/** Get Referrer.
		@return Referring web address
	  */
	public String getReferrer () 
	{
		return (String)get_Value(COLUMNNAME_Referrer);
	}

	/** Set Remote Addr.
		@param Remote_Addr 
		Remote Address
	  */
	public void setRemote_Addr (String Remote_Addr)
	{
		set_ValueNoCheck (COLUMNNAME_Remote_Addr, Remote_Addr);
	}

	/** Get Remote Addr.
		@return Remote Address
	  */
	public String getRemote_Addr () 
	{
		return (String)get_Value(COLUMNNAME_Remote_Addr);
	}

	/** Set Remote Host.
		@param Remote_Host 
		Remote host Info
	  */
	public void setRemote_Host (String Remote_Host)
	{
		set_ValueNoCheck (COLUMNNAME_Remote_Host, Remote_Host);
	}

	/** Get Remote Host.
		@return Remote host Info
	  */
	public String getRemote_Host () 
	{
		return (String)get_Value(COLUMNNAME_Remote_Host);
	}

	/** Set Serial No.
		@param SerNo 
		Product Serial Number 
	  */
	public void setSerNo (String SerNo)
	{
		set_ValueNoCheck (COLUMNNAME_SerNo, SerNo);
	}

	/** Get Serial No.
		@return Product Serial Number 
	  */
	public String getSerNo () 
	{
		return (String)get_Value(COLUMNNAME_SerNo);
	}

	/** Set URL.
		@param URL 
		Full URL address - e.g. http://www.compiere.org
	  */
	public void setURL (String URL)
	{
		set_ValueNoCheck (COLUMNNAME_URL, URL);
	}

	/** Get URL.
		@return Full URL address - e.g. http://www.compiere.org
	  */
	public String getURL () 
	{
		return (String)get_Value(COLUMNNAME_URL);
	}

	/** Set Version No.
		@param VersionNo 
		Version Number
	  */
	public void setVersionNo (String VersionNo)
	{
		set_ValueNoCheck (COLUMNNAME_VersionNo, VersionNo);
	}

	/** Get Version No.
		@return Version Number
	  */
	public String getVersionNo () 
	{
		return (String)get_Value(COLUMNNAME_VersionNo);
	}
}