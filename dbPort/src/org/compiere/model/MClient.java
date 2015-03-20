/******************************************************************************
 * Product: Compiere ERP & CRM Smart Business Solution                        *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;

import org.apache.struts.util.LabelValueBean;
import org.compiere.db.CConnection;
import org.compiere.interfaces.Server;
import org.compiere.util.CCache;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.EMail;
import org.compiere.util.Env;
import org.compiere.util.Ini;
import org.compiere.util.KeyNamePair;
import org.compiere.util.Language;

/**
 *  Client Model
 *
 *  @author Jorg Janke
 *  @version $Id: MClient.java,v 1.2 2006/07/30 00:58:37 jjanke Exp $
 */
public class MClient extends X_AD_Client
{
	/**
	 *
	 */
	private static final long serialVersionUID = -2882084066132787199L;


	/**
	 * 	Get client
	 *	@param ctx context
	 * 	@param AD_Client_ID id
	 *	@return client
	 */
	public static MClient get (Properties ctx, int AD_Client_ID)
	{
		Integer key = new Integer (AD_Client_ID);
		MClient client = (MClient)s_cache.get(key);
		if (client != null
				//Expert : Lama (verificar la sesion, para usar o no el objeto del cache)
				&& (Env.getContextAsInt(ctx, "#AD_Session_ID")==Env.getContextAsInt(client.getCtx(), "#AD_Session_ID"))) //lama
			return client;
		client = new MClient (ctx, AD_Client_ID, null);
		s_cache.put (key, client);
		return client;
	}	//	get

	/**
	 * 	Get all clients
	 *	@param ctx context
	 *	@return clients
	 */
	public static MClient[] getAll (Properties ctx)
	{
		final List<MClient> list = new Query(ctx, Table_Name, "", null).list();
		for (MClient client : list) {
			s_cache.put (new Integer (client.getAD_Client_ID()), client);
		}

		MClient[] retValue = new MClient[list.size ()];
		list.toArray (retValue);
		return retValue;
	}	//	get

	/**
	 * Listado de clientes activos
	 * @param ctx Contexto
	 * @return Listado de clientes activos
	 */
	public static List<LabelValueBean> getAllActive(Properties ctx) {
		List<LabelValueBean> lst = new ArrayList<LabelValueBean>();
		MClient[] arr = getAll(ctx);
		for (MClient client : arr) {
			if (client.isActive()) {
				lst.add(new LabelValueBean(client.getName(), String.valueOf(client.getAD_Client_ID())));
			}
		}
		return lst;
	}

	/**
	 * 	Get optionally cached client
	 *	@param ctx context
	 *	@return client
	 */
	public static MClient get (Properties ctx)
	{
		return get (ctx, Env.getAD_Client_ID(ctx));
	}	//	get

	/**	Static Logger				*/
	private static CLogger	s_log	= CLogger.getCLogger (MClient.class);
	/**	Cache						*/
	private static CCache<Integer,MClient>	s_cache = new CCache<Integer,MClient>("AD_Client", 3);


	/**************************************************************************
	 * 	Standard Constructor
	 * 	@param ctx context
	 * 	@param AD_Client_ID id
	 * 	@param createNew create new
	 *	@param trxName transaction
	 */
	public MClient (Properties ctx, int AD_Client_ID, boolean createNew, String trxName)
	{
		super (ctx, AD_Client_ID, trxName);
		m_createNew = createNew;
		if (AD_Client_ID == 0)
		{
			if (m_createNew)
			{
			//	setValue (null);
			//	setName (null);
				setAD_Org_ID(0);
				setIsMultiLingualDocument (false);
				setIsSmtpAuthorization (false);
				setIsUseBetaFunctions (true);
				setIsServerEMail(false);
				setAD_Language(Language.getBaseAD_Language());
				setAutoArchive(AUTOARCHIVE_None);
				setMMPolicy (MMPOLICY_FiFo);	// F
				setIsPostImmediate(false);
				setIsCostImmediate(false);
			}
			else
				load(get_TrxName());
		}
	}	//	MClient

	/**
	 * 	Standard Constructor
	 * 	@param ctx context
	 * 	@param AD_Client_ID id
	 *	@param trxName transaction
	 */
	public MClient (Properties ctx, int AD_Client_ID, String trxName)
	{
		this (ctx, AD_Client_ID, false, trxName);
	}	//	MClient

	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 *	@param trxName transaction
	 */
	public MClient (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MClient

	/**
	 * 	Simplified Constructor
	 * 	@param ctx context
	 *	@param trxName transaction
	 */
	public MClient (Properties ctx, String trxName)
	{
		this (ctx, Env.getAD_Client_ID(ctx), trxName);
	}	//	MClient

	/**	Client Info					*/
	private MClientInfo 		m_info = null;
	/** Language					*/
	private Language			m_language = null;
	/** New Record					*/
	private boolean				m_createNew = false;
	/** Client Info Setup Tree for Account	*/
	private int					m_AD_Tree_Account_ID;

	/**
	 *	Get SMTP Host
	 *	@return SMTP or loaclhost
	 */
	public String getSMTPHost()
	{
		String s = super.getSMTPHost();
		if (s == null)
			s = "localhost";
		return s;
	}	//	getSMTPHost

	/**
	 *	Get Client Info
	 *	@return Client Info
	 */
	public MClientInfo getInfo()
	{
		if (m_info == null)
			m_info = MClientInfo.get (getCtx(), getAD_Client_ID(), get_TrxName());
		return m_info;
	}	//	getMClientInfo

	/**
	 * 	String Representation
	 *	@return info
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer ("MClient[")
			.append(get_ID()).append("-").append(getValue())
			.append("]");
		return sb.toString();
	}	//	toString

	/**
	 *	Get Default Accounting Currency
	 *	@return currency or 0
	 */
	public int getC_Currency_ID()
	{
		if (m_info == null)
			getInfo();
		if (m_info != null)
			return m_info.getC_Currency_ID();
		return 0;
	}	//	getC_Currency_ID

	/**
	 * 	Get Language
	 *	@return client language
	 */
	public Language getLanguage()
	{
		if (m_language == null)
		{
			m_language = Language.getLanguage(getAD_Language());
			Env.verifyLanguage (getCtx(), m_language);
		}
		return m_language;
	}	//	getLanguage


	/**
	 * 	Set AD_Language
	 *	@param AD_Language new language
	 */
	public void setAD_Language (String AD_Language)
	{
		m_language = null;
		super.setAD_Language (AD_Language);
	}	//	setAD_Language

	/**
	 * 	Get AD_Language
	 *	@return Language
	 */
	public String getAD_Language ()
	{
		String s = super.getAD_Language ();
		if (s == null)
			return Language.getBaseAD_Language();
		return s;
	}	//	getAD_Language

	/**
	 * 	Get Locale
	 *	@return locale
	 */
	public Locale getLocale()
	{
		Language lang = getLanguage();
		if (lang != null)
			return lang.getLocale();
		return Locale.getDefault();
	}	//	getLocale


	/**************************************************************************
	 * 	Create Trees and Setup Client Info
	 * 	@param language language
	 * 	@return true if created
	 */
	public boolean setupClientInfo (String language)
	{
		//	Create Trees
		String sql = null;
		if (Env.isBaseLanguage (language, "AD_Ref_List"))	//	Get TreeTypes & Name
			sql = "SELECT Value, Name FROM AD_Ref_List WHERE AD_Reference_ID=120 AND IsActive='Y'";
		else
			sql = "SELECT l.Value, t.Name, t.ad_language FROM AD_Ref_List l, AD_Ref_List_Trl t "
				+ "WHERE l.AD_Reference_ID=120 AND l.AD_Ref_List_ID=t.AD_Ref_List_ID AND l.IsActive='Y'";

		//  Tree IDs
		int AD_Tree_Org_ID=0, AD_Tree_BPartner_ID=0, AD_Tree_Project_ID=0,
			AD_Tree_SalesRegion_ID=0, AD_Tree_Product_ID=0,
			AD_Tree_Campaign_ID=0, AD_Tree_Activity_ID=0;

		PreparedStatement stmt = null;
		ResultSet rs = null;
		boolean success = false;
		try
		{
			stmt = DB.prepareStatement(sql, get_TrxName());
			rs = stmt.executeQuery();
			MTree_Base tree = null;
			while (rs.next())
			{
				String value = rs.getString(1);
				String name = getName() + " " + rs.getString(2);

				if (!Env.isBaseLanguage (language, "AD_Ref_List")){ // EXPERT:LAMA.-Identificador de idioma, para evitar duplicidad
					name = name + " (" + rs.getString(3) + ")";
				}
				//
				if (value.equals(MTree_Base.TREETYPE_Organization))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_Org_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_BPartner))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_BPartner_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_Project))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_Project_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_SalesRegion))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_SalesRegion_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_Product))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_Product_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_ElementValue))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					m_AD_Tree_Account_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_Campaign))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_Campaign_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_Activity))
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
					AD_Tree_Activity_ID = tree.getAD_Tree_ID();
				}
				else if (value.equals(MTree_Base.TREETYPE_Menu))	//	No Menu
					success = true;
				else	//	PC (Product Category), BB (BOM)
				{
					tree = new MTree_Base (this, name, value);
					success = tree.save();
				}
				if (!success)
				{
					log.log(Level.SEVERE, "Tree NOT created: " + name);
					break;
				}
			}
		}
		catch (SQLException e1)
		{
			log.log(Level.SEVERE, "Trees", e1);
			success = false;
		} finally {
			DB.close(rs,stmt);
		}

		if (!success)
			return false;

		//	Create ClientInfo
		MClientInfo clientInfo = new MClientInfo (this,
			AD_Tree_Org_ID, AD_Tree_BPartner_ID, AD_Tree_Project_ID,
			AD_Tree_SalesRegion_ID, AD_Tree_Product_ID,
			AD_Tree_Campaign_ID, AD_Tree_Activity_ID, get_TrxName());
		success = clientInfo.save();
		return success;
	}	//	createTrees

	/**
	 * 	Get AD_Tree_Account_ID created in setup client info
	 *	@return Account Tree ID
	 */
	public int getSetup_AD_Tree_Account_ID()
	{
		return m_AD_Tree_Account_ID;
	}	//	getSetup_AD_Tree_Account_ID

	/**
	 * 	Is Auto Archive on
	 *	@return true if auto archive
	 */
	public boolean isAutoArchive()
	{
		String aa = getAutoArchive();
		return aa != null && !aa.equals(AUTOARCHIVE_None);
	}	//	isAutoArchive


	/**
	 * 	Update Trl Tables automatically?
	 * 	@param TableName table name
	 *	@return true if automatically translated
	 */
	public boolean isAutoUpdateTrl (String TableName)
	{
		if (super.isMultiLingualDocument())
			return false;
		if (TableName == null)
			return false;
		//	Not Multi-Lingual Documents - only Doc Related
		if (TableName.startsWith("AD") && getAD_Client_ID() == 0)
			return false;
		return true;
	}	//	isMultiLingualDocument

	/**
	 *	Get Primary Accounting Schema
	 *	@return Acct Schema or null
	 */
	public MAcctSchema getAcctSchema()
	{
		if (m_info == null)
			m_info = MClientInfo.get (getCtx(), getAD_Client_ID(), get_TrxName());
		if (m_info != null)
		{
			int C_AcctSchema_ID = m_info.getC_AcctSchema1_ID();
			if (C_AcctSchema_ID != 0)
				return MAcctSchema.get(getCtx(), C_AcctSchema_ID);
		}
		return null;
	}	//	getMClientInfo

	/**
	 * 	Save
	 *	@return true if saved
	 */
	public boolean save ()
	{
		if (get_ID() == 0 && !m_createNew)
			return saveUpdate();
		return super.save ();
	}	//	save


	/**************************************************************************
	 * 	Test EMail
	 *	@return OK or error
	 */
	public String testEMail()
	{
		if (getRequestEMail() == null || getRequestEMail().length() == 0)
			return "No Request EMail for " + getName();
		//
		EMail email = createEMail (getRequestEMail(),
			"Ecaresoft EMail Test",
			"Ecaresoft EMail Test: " + toString());
		if (email == null)
			return "Could not create EMail: " + getName();
		try
		{
			String msg = email.send();
			if (EMail.SENT_OK.equals (msg))
			{
				log.info("Sent Test EMail to " + getRequestEMail());
				return "OK";
			}
			else
			{
				log.warning("Could NOT send Test EMail from "
					+ getSMTPHost() + ": " + getRequestEMail()
					+ " (" + getRequestUser()
					+ ") to " + getRequestEMail() + ": " + msg);
				return msg;
			}
		}
		catch (Exception ex)
		{
			log.severe(getName() + " - " + ex.getLocalizedMessage());
			return ex.getLocalizedMessage();
		}
	}	//	testEMail

	/**
	 * 	Send EMail from Request User - with trace
	 *	@param AD_User_ID recipient
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional attachment
	 *	@return true if sent
	 */
	public boolean sendEMail (int AD_User_ID,
		String subject, String message, File attachment)
	{
		Collection<File> attachments = new ArrayList<File>();
		if (attachment != null)
			attachments.add(attachment);
		return sendEMailAttachments(AD_User_ID, subject, message, attachments);
	}

	/**
	 * 	Send EMail from Request User - with trace
	 *	@param AD_User_ID recipient
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional collection of attachments
	 *	@return true if sent
	 */
	public boolean sendEMailAttachments (int AD_User_ID,
		String subject, String message, Collection<File> attachments)
	{
		return sendEMailAttachments(AD_User_ID, subject, message, attachments, false);
	}

	/**
	 * 	Send EMail from Request User - with trace
	 *	@param AD_User_ID recipient
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional collection of attachments
	 *  @param html
	 *	@return true if sent
	 */
	public boolean sendEMailAttachments (int AD_User_ID,
		String subject, String message, Collection<File> attachments, boolean html)
	{
		MUser to = MUser.get(getCtx(), AD_User_ID);
		String toEMail = to.getEMail();
		if (toEMail == null || toEMail.length() == 0)
		{
			log.warning("No EMail for recipient: " + to);
			return false;
		}
		EMail email = createEMail(null, to, subject, message, html);
		if (email == null)
			return false;
		email.addAttachments(attachments);
		try
		{
			return sendEmailNow(null, to, email);
		}
		catch (Exception ex)
		{
			log.severe(getName() + " - " + ex.getLocalizedMessage());
			return false;
		}
	}	//	sendEMail

	/**
	 * 	Send EMail from Request User - no trace
	 *	@param to recipient email address
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional attachment
	 *	@return true if sent
	 */
	public boolean sendEMail (String to,
		String subject, String message, File attachment)
	{
		return sendEMail(to, subject, message, attachment, false);
	}

	/**
	 * 	Send EMail from Request User - no trace
	 *	@param to recipient email address
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional attachment
	 *  @param html
	 *	@return true if sent
	 */
	public boolean sendEMail (String to,
		String subject, String message, File attachment, boolean html)
	{
		EMail email = createEMail(to, subject, message, html);
		if (email == null)
			return false;
		if (attachment != null)
			email.addAttachment(attachment);
		try
		{
			String msg = email.send();
			if (EMail.SENT_OK.equals (msg))
			{
				log.info("Sent EMail " + subject + " to " + to);
				return true;
			}
			else
			{
				log.warning("Could NOT Send Email: " + subject
					+ " to " + to + ": " + msg
					+ " (" + getName() + ")");
				return false;
			}
		}
		catch (Exception ex)
		{
			log.severe(getName() + " - " + ex.getLocalizedMessage());
			return false;
		}
	}	//	sendEMail

	/**
	 * 	Send EMail from User
	 * 	@param from sender
	 *	@param to recipient
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional attachment
	 *	@return true if sent
	 */
	public boolean sendEMail (MUser from, MUser to,
		String subject, String message, File attachment)
	{
		return sendEMail(from, to, subject, message, attachment, false);
	}

	/**
	 * 	Send EMail from User
	 * 	@param from sender
	 *	@param to recipient
	 *	@param subject subject
	 *	@param message message
	 *	@param attachment optional attachment
	 *  @param isHtml
	 *	@return true if sent
	 */
	public boolean sendEMail (MUser from, MUser to,
		String subject, String message, File attachment, boolean isHtml)
	{
		EMail email = createEMail(from, to, subject, message, isHtml);
		if (email == null)
			return false;
		if (attachment != null)
			email.addAttachment(attachment);
		String emailFrom = email.getFrom();
		try
		{
			return sendEmailNow(from, to, email);
		}
		catch (Exception ex)
		{
			log.severe(getName() + " - from " + emailFrom
				+ " to " + to + ": " + ex.getLocalizedMessage());
			return false;
		}
	}	//	sendEMail

	/**
	 * 	Send Email Now
	 *	@param from optional from user
	 *	@param to to user
	 *	@param email email
	 *	@return true if sent
	 */
	public boolean sendEmailNow(MUser from, MUser to, EMail email)
	{
		String msg = email.send();
		//
		X_AD_UserMail um = new X_AD_UserMail(getCtx(), 0, null);
		um.setClientOrg(this);
		um.setAD_User_ID(to.getAD_User_ID());
		um.setSubject(email.getSubject());
		um.setMailText(email.getMessageCRLF());
		if (email.isSentOK())
			um.setMessageID(email.getMessageID());
		else
		{
			um.setMessageID(email.getSentMsg());
			um.setIsDelivered(X_AD_UserMail.ISDELIVERED_No);
		}
		um.save();

		//
		if (email.isSentOK())
		{
			if (from != null)
				log.info("Sent Email: " + email.getSubject()
					+ " from " + from.getEMail()
					+ " to " + to.getEMail());
			else
				log.info("Sent Email: " + email.getSubject()
					+ " to " + to.getEMail());
			return true;
		}
		else
		{
			if (from != null)
				log.warning("Could NOT Send Email: " + email.getSubject()
					+ " from " + from.getEMail()
					+ " to " + to.getEMail() + ": " + msg
					+ " (" + getName() + ")");
			else
				log.warning("Could NOT Send Email: " + email.getSubject()
					+ " to " + to.getEMail() + ": " + msg
					+ " (" + getName() + ")");
			return false;
		}
	}	//	sendEmailNow

	/************
	 * 	Create EMail from Request User
	 *	@param to recipient
	 *	@param subject sunject
	 *	@param message nessage
	 *	@return EMail
	 */
	public EMail createEMail (String to,
		String subject, String message)
	{
		return createEMail(to, subject, message, false);
	}

	/************
	 * 	Create EMail from Request User
	 *	@param to recipient
	 *	@param subject sunject
	 *	@param message nessage
	 *  @param html
	 *	@return EMail
	 */
	public EMail createEMail (String to,
		String subject, String message, boolean html)
	{
		if (to == null || to.length() == 0)
		{
			log.warning("No To");
			return null;
		}
		//
		EMail email = null;
		if (isServerEMail() && Ini.isClient())
		{
			Server server = CConnection.get().getServer();
			try
			{
				if (server != null)
				{	//	See ServerBean
					if (html && message != null)
						message = EMail.HTML_MAIL_MARKER + message;
					email = server.createEMail(Env.getRemoteCallCtx(getCtx()), getAD_Client_ID(),
						to, subject, message);
				}
				else
					log.log(Level.WARNING, "No AppsServer");
			}
			catch (Exception ex)
			{
				log.log(Level.SEVERE, getName() + " - AppsServer error", ex);
			}
		}
		
		if (email == null) {
			email = new EMail(this, getRequestEMail(), to, subject, message, html);
		}
		
		email.setSSLConnection(isSSLConnection());
		email.setSSLPort(getSSLPort());
		email.setSMTPPort(getSMTPPort());
		
		if (isSmtpAuthorization()) {
			email.createAuthenticator(getRequestUser(), getRequestUserPW());
		}
		return email;
	}	//	createEMail

	/**
	 * 	Create EMail from User
	 * 	@param from optional sender
	 *	@param to recipient
	 *	@param subject sunject
	 *	@param message nessage
	 *	@return EMail
	 */
	public EMail createEMail (MUser from, MUser to,
		String subject, String message)
	{
		return createEMail(from, to, subject, message, false);
	}

	/**
	 * 	Create EMail from User
	 * 	@param from optional sender
	 *	@param to recipient
	 *	@param subject sunject
	 *	@param message nessage
	 *  @param html
	 *	@return EMail
	 */
	public EMail createEMail (MUser from, MUser to,
		String subject, String message, boolean html)
	{
		if (to == null)
		{
			log.warning("No To user");
			return null;
		}
		if (to.getEMail() == null || to.getEMail().length() == 0)
		{
			log.warning("No To address: " + to);
			return null;
		}
		return createEMail (from, to.getEMail(), subject, message, html);
	}	//	createEMail

	/**
	 * 	Create EMail from User
	 * 	@param from optional sender
	 *	@param to recipient
	 *	@param subject sunject
	 *	@param message nessage
	 *	@return EMail
	 */
	public EMail createEMail (MUser from, String to,
		String subject, String message)
	{
		return createEMail(from, to, subject, message, false);
	}

	/**
	 * 	Create EMail from User
	 * 	@param from optional sender
	 *	@param to recipient
	 *	@param subject sunject
	 *	@param message nessage
	 *  @param html
	 *	@return EMail
	 */
	public EMail createEMail (MUser from, String to,
		String subject, String message, boolean html)
	{
		if (to == null || to.length() == 0)
		{
			log.warning("No To address");
			return null;
		}
		//	No From - send from Request
		if (from == null)
			return createEMail (to, subject, message, html);
		//	No From details - Error
		if (from.getEMail() == null
			|| from.getEMailUser() == null
			|| (isSmtpAuthorization() && from.getEMailUserPW() == null) ) // is SMTP authorization and password is null - teo_sarca [ 1723309 ]
		{
			log.warning("From EMail incomplete: " + from + " (" + getName() + ")");
			return null;
		}
		//
		EMail email = null;
		if (isServerEMail() && Ini.isClient())
		{
			Server server = CConnection.get().getServer();
			try
			{
				if (server != null)
				{	//	See ServerBean
					if (html && message != null)
						message = EMail.HTML_MAIL_MARKER + message;
					email = server.createEMail(Env.getRemoteCallCtx(getCtx()), getAD_Client_ID(),
						from.getAD_User_ID(),
						to, subject, message);
				}
				else
					log.log(Level.WARNING, "No AppsServer");
			}
			catch (Exception ex)
			{
				log.log(Level.SEVERE, getName() + " - AppsServer error", ex);
			}
		}
		if (email == null) {
			email = new EMail(this, from.getEMail(), to, subject, message, html);
		}
		if (isSmtpAuthorization()){
			email.createAuthenticator (from.getEMailUser(), from.getEMailUserPW());
		}

		if (email != null) {
			if (getSMTPPort() > 0) {
				email.setSMTPPort(getSMTPPort());
			}

			if (getSSLPort() > 0) {
				email.setSSLPort(getSSLPort());
			}

			email.setSSLConnection(isSSLConnection());
		}
		return email;
	}	//	createEMail

	/**
	 * Verifica si el sistema tiene cargado solo al cliente de System
	 * @return
	 */
	public static boolean isOnlySystem() {
		return DB.getSQLValue(null, "SELECT COUNT(*) FROM ad_client WHERE ad_client_id<>0 AND isactive='Y'") <= 0;
//		boolean retValue = true;
//		StringBuilder st = new StringBuilder("SELECT COUNT(*) FROM ad_client WHERE ad_client_id <> 0 AND isactive = 'Y'");
//		PreparedStatement pstmt = null;
//		ResultSet rs = null;
//		try {
//			pstmt = DB.prepareStatement(st.toString(), null);
//			rs = pstmt.executeQuery();
//			if (rs.next()) {
//				if (rs.getInt(1) > 0) {
//					retValue = false;
//				}
//			}
//		} catch (Exception e) {
//			s_log.log(Level.SEVERE, st.toString(), e);
//		} finally {
//			DB.close(rs,pstmt);
//		}
//		return retValue;
	}

	/**
	 * Cliente por nombre/value y cliente
	 * @param ctx
	 * @param clientName
	 * @return
	 */
	public static MClient getFromValueName(Properties ctx, String clientName) {
		StringBuilder st = new StringBuilder("select * from AD_Client ");
		st.append("where upper(name) = ? OR upper(value) = ? ");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MClient client = null;
		try {
			pstmt = DB.prepareStatement(st.toString(), null);
			pstmt.setString(1, clientName.toUpperCase());
			pstmt.setString(2, clientName.toUpperCase());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				client = new MClient(Env.getCtx(), rs, null);
			}
		} catch (Exception e) {
			s_log.log(Level.SEVERE, st.toString(), e);
		} finally {
			DB.close(rs,pstmt);
		}
		return client;
	}

	/**
	 * Devuelve el nombre del cliente
	 *
	 * @param ctx
	 *            - Contexto de la aplicacion
	 * @param AD_Client_ID
	 *            - ID del cliente
	 * @return Un valor String con el nombre del cliente
	 * @author Lorena Lama
	 */
	public static String getName(Properties ctx, int AD_Client_ID) {
		if (Env.getAD_Client_ID(ctx) == AD_Client_ID) {
			return Env.getAD_Client_Name(ctx);
		} else {
			return DB.getSQLValueString(null, "SELECT Name From AD_Client WHERE AD_Client_ID=?", AD_Client_ID);
		}
	}



	public static List<KeyNamePair> getList(Properties ctx, String accessLevel, String trxName) {
		int clientID = Env.getAD_Client_ID(ctx);
		final StringBuilder sql = new StringBuilder();
		sql.append("SELECT AD_Client_ID, Name ");
		sql.append("FROM AD_Client ");
		sql.append("WHERE IsActive='Y' AND ");

		if (MTable.ACCESSLEVEL_SystemPlusClient.equals(accessLevel) || MTable.ACCESSLEVEL_All.equals(accessLevel)) {
			sql.append("AD_Client_ID IN (0,?)");
		} else {
			sql.append("AD_Client_ID=?");
			// Default ACCESSLEVEL_ClientOnly, ACCESSLEVEL_ClientPlusOrganization,
			// ACCESSLEVEL_Organization (other)
			if (MTable.ACCESSLEVEL_SystemOnly.equals(accessLevel)
					|| MTable.ACCESSLEVEL_ClientToSystem.equals(accessLevel)) {
				clientID = 0;
			}
		}

		final List<KeyNamePair> lst = new ArrayList<KeyNamePair>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = DB.prepareStatement(sql.toString(), trxName);
			pstmt.setInt(1, clientID);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				lst.add(new KeyNamePair(rs.getInt(1),rs.getString(2)));
			}
		} catch (Exception e) {
			s_log.log(Level.SEVERE, sql.toString(), e);
		} finally {
			DB.close(rs, pstmt);
		}
		return lst;
	}


	public static String getClientType(int adClientId) {
		String clientType =
				DB.getSQLValueString(
						null,
						"SELECT tipocliente FROM AD_Client WHERE AD_Client_ID = ?",
						adClientId
				);
		return clientType;
	}
}	//	MClient
