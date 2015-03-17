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

/** Generated Model for W_MailMsg
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_W_MailMsg extends PO implements I_W_MailMsg, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_W_MailMsg (Properties ctx, int W_MailMsg_ID, String trxName)
    {
      super (ctx, W_MailMsg_ID, trxName);
      /** if (W_MailMsg_ID == 0)
        {
			setMailMsgType (null);
			setMessage (null);
			setName (null);
			setSubject (null);
			setW_MailMsg_ID (0);
			setW_Store_ID (0);
        } */
    }

    /** Load Constructor */
    public X_W_MailMsg (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client 
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
      StringBuffer sb = new StringBuffer ("X_W_MailMsg[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** MailMsgType AD_Reference_ID=342 */
	public static final int MAILMSGTYPE_AD_Reference_ID=342;
	/** Order Acknowledgement = OA */
	public static final String MAILMSGTYPE_OrderAcknowledgement = "OA";
	/** Payment Acknowledgement = PA */
	public static final String MAILMSGTYPE_PaymentAcknowledgement = "PA";
	/** Payment Error = PE */
	public static final String MAILMSGTYPE_PaymentError = "PE";
	/** User Verification = UV */
	public static final String MAILMSGTYPE_UserVerification = "UV";
	/** User Password = UP */
	public static final String MAILMSGTYPE_UserPassword = "UP";
	/** Subscribe = LS */
	public static final String MAILMSGTYPE_Subscribe = "LS";
	/** UnSubscribe = LU */
	public static final String MAILMSGTYPE_UnSubscribe = "LU";
	/** User Account = UA */
	public static final String MAILMSGTYPE_UserAccount = "UA";
	/** Request = WR */
	public static final String MAILMSGTYPE_Request = "WR";
	/** Set Message Type.
		@param MailMsgType 
		Mail Message Type
	  */
	public void setMailMsgType (String MailMsgType)
	{
		if (MailMsgType == null) throw new IllegalArgumentException ("MailMsgType is mandatory");
		if (MailMsgType.equals("OA") || MailMsgType.equals("PA") || MailMsgType.equals("PE") || MailMsgType.equals("UV") || MailMsgType.equals("UP") || MailMsgType.equals("LS") || MailMsgType.equals("LU") || MailMsgType.equals("UA") || MailMsgType.equals("WR")); else throw new IllegalArgumentException ("MailMsgType Invalid value - " + MailMsgType + " - Reference_ID=342 - OA - PA - PE - UV - UP - LS - LU - UA - WR");		set_Value (COLUMNNAME_MailMsgType, MailMsgType);
	}

	/** Get Message Type.
		@return Mail Message Type
	  */
	public String getMailMsgType () 
	{
		return (String)get_Value(COLUMNNAME_MailMsgType);
	}

	/** Set Message.
		@param Message 
		EMail Message
	  */
	public void setMessage (String Message)
	{
		if (Message == null)
			throw new IllegalArgumentException ("Message is mandatory.");
		set_Value (COLUMNNAME_Message, Message);
	}

	/** Get Message.
		@return EMail Message
	  */
	public String getMessage () 
	{
		return (String)get_Value(COLUMNNAME_Message);
	}

	/** Set Message 2.
		@param Message2 
		Optional second part of the EMail Message
	  */
	public void setMessage2 (String Message2)
	{
		set_Value (COLUMNNAME_Message2, Message2);
	}

	/** Get Message 2.
		@return Optional second part of the EMail Message
	  */
	public String getMessage2 () 
	{
		return (String)get_Value(COLUMNNAME_Message2);
	}

	/** Set Message 3.
		@param Message3 
		Optional third part of the EMail Message
	  */
	public void setMessage3 (String Message3)
	{
		set_Value (COLUMNNAME_Message3, Message3);
	}

	/** Get Message 3.
		@return Optional third part of the EMail Message
	  */
	public String getMessage3 () 
	{
		return (String)get_Value(COLUMNNAME_Message3);
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

	/** Set Subject.
		@param Subject 
		Email Message Subject
	  */
	public void setSubject (String Subject)
	{
		if (Subject == null)
			throw new IllegalArgumentException ("Subject is mandatory.");
		set_Value (COLUMNNAME_Subject, Subject);
	}

	/** Get Subject.
		@return Email Message Subject
	  */
	public String getSubject () 
	{
		return (String)get_Value(COLUMNNAME_Subject);
	}

	/** Set Mail Message.
		@param W_MailMsg_ID 
		Web Store Mail Message Template
	  */
	public void setW_MailMsg_ID (int W_MailMsg_ID)
	{
		if (W_MailMsg_ID < 1)
			 throw new IllegalArgumentException ("W_MailMsg_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_W_MailMsg_ID, Integer.valueOf(W_MailMsg_ID));
	}

	/** Get Mail Message.
		@return Web Store Mail Message Template
	  */
	public int getW_MailMsg_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_W_MailMsg_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_W_Store getW_Store() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_W_Store.Table_Name);
        I_W_Store result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_W_Store)constructor.newInstance(new Object[] {getCtx(), new Integer(getW_Store_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Web Store.
		@param W_Store_ID 
		A Web Store of the Client
	  */
	public void setW_Store_ID (int W_Store_ID)
	{
		if (W_Store_ID < 1)
			 throw new IllegalArgumentException ("W_Store_ID is mandatory.");
		set_Value (COLUMNNAME_W_Store_ID, Integer.valueOf(W_Store_ID));
	}

	/** Get Web Store.
		@return A Web Store of the Client
	  */
	public int getW_Store_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_W_Store_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}