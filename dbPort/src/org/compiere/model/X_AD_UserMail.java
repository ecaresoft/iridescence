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

/** Generated Model for AD_UserMail
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_UserMail extends PO implements I_AD_UserMail, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_UserMail (Properties ctx, int AD_UserMail_ID, String trxName)
    {
      super (ctx, AD_UserMail_ID, trxName);
      /** if (AD_UserMail_ID == 0)
        {
			setAD_User_ID (0);
			setAD_UserMail_ID (0);
        } */
    }

    /** Load Constructor */
    public X_AD_UserMail (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_UserMail[")
        .append(get_ID()).append("]");
      return sb.toString();
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
			 throw new IllegalArgumentException ("AD_User_ID is mandatory.");
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

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), String.valueOf(getAD_User_ID()));
    }

	/** Set User Mail.
		@param AD_UserMail_ID 
		Mail sent to the user
	  */
	public void setAD_UserMail_ID (int AD_UserMail_ID)
	{
		if (AD_UserMail_ID < 1)
			 throw new IllegalArgumentException ("AD_UserMail_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_UserMail_ID, Integer.valueOf(AD_UserMail_ID));
	}

	/** Get User Mail.
		@return Mail sent to the user
	  */
	public int getAD_UserMail_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_UserMail_ID);
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
		set_ValueNoCheck (COLUMNNAME_DeliveryConfirmation, DeliveryConfirmation);
	}

	/** Get Delivery Confirmation.
		@return EMail Delivery confirmation
	  */
	public String getDeliveryConfirmation () 
	{
		return (String)get_Value(COLUMNNAME_DeliveryConfirmation);
	}

	/** IsDelivered AD_Reference_ID=319 */
	public static final int ISDELIVERED_AD_Reference_ID=319;
	/** Yes = Y */
	public static final String ISDELIVERED_Yes = "Y";
	/** No = N */
	public static final String ISDELIVERED_No = "N";
	/** Set Delivered.
		@param IsDelivered Delivered	  */
	public void setIsDelivered (String IsDelivered)
	{

		if (IsDelivered == null || IsDelivered.equals("Y") || IsDelivered.equals("N")); else throw new IllegalArgumentException ("IsDelivered Invalid value - " + IsDelivered + " - Reference_ID=319 - Y - N");		set_ValueNoCheck (COLUMNNAME_IsDelivered, IsDelivered);
	}

	/** Get Delivered.
		@return Delivered	  */
	public String getIsDelivered () 
	{
		return (String)get_Value(COLUMNNAME_IsDelivered);
	}

	/** Set Mail Text.
		@param MailText 
		Text used for Mail message
	  */
	public void setMailText (String MailText)
	{
		set_Value (COLUMNNAME_MailText, MailText);
	}

	/** Get Mail Text.
		@return Text used for Mail message
	  */
	public String getMailText () 
	{
		return (String)get_Value(COLUMNNAME_MailText);
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

	public I_R_MailText getR_MailText() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_R_MailText.Table_Name);
        I_R_MailText result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_R_MailText)constructor.newInstance(new Object[] {getCtx(), new Integer(getR_MailText_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Mail Template.
		@param R_MailText_ID 
		Text templates for mailings
	  */
	public void setR_MailText_ID (int R_MailText_ID)
	{
		if (R_MailText_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_R_MailText_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_R_MailText_ID, Integer.valueOf(R_MailText_ID));
	}

	/** Get Mail Template.
		@return Text templates for mailings
	  */
	public int getR_MailText_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_MailText_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Subject.
		@param Subject 
		Email Message Subject
	  */
	public void setSubject (String Subject)
	{
		set_Value (COLUMNNAME_Subject, Subject);
	}

	/** Get Subject.
		@return Email Message Subject
	  */
	public String getSubject () 
	{
		return (String)get_Value(COLUMNNAME_Subject);
	}

	public I_W_MailMsg getW_MailMsg() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_W_MailMsg.Table_Name);
        I_W_MailMsg result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_W_MailMsg)constructor.newInstance(new Object[] {getCtx(), new Integer(getW_MailMsg_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Mail Message.
		@param W_MailMsg_ID 
		Web Store Mail Message Template
	  */
	public void setW_MailMsg_ID (int W_MailMsg_ID)
	{
		if (W_MailMsg_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_W_MailMsg_ID, null);
		else 
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
}