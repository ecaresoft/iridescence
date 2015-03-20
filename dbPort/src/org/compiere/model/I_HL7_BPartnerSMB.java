/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HL7_BPartnerSMB
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_HL7_BPartnerSMB 
{

    /** TableName=HL7_BPartnerSMB */
    public static final String Table_Name = "HL7_BPartnerSMB";

    /** AD_Table_ID=1200644 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name AppendToFile */
    public static final String COLUMNNAME_AppendToFile = "AppendToFile";

	/** Set Append To File	  */
	public void setAppendToFile (String AppendToFile);

	/** Get Append To File	  */
	public String getAppendToFile();

    /** Column name Directory */
    public static final String COLUMNNAME_Directory = "Directory";

	/** Set Directory	  */
	public void setDirectory (String Directory);

	/** Get Directory	  */
	public String getDirectory();

    /** Column name Encoding */
    public static final String COLUMNNAME_Encoding = "Encoding";

	/** Set Encoding.
	  * Messaage encoding
	  */
	public void setEncoding (String Encoding);

	/** Get Encoding.
	  * Messaage encoding
	  */
	public String getEncoding();

    /** Column name FileName */
    public static final String COLUMNNAME_FileName = "FileName";

	/** Set File Name.
	  * Name of the local file or URL
	  */
	public void setFileName (String FileName);

	/** Get File Name.
	  * Name of the local file or URL
	  */
	public String getFileName();

    /** Column name FileType */
    public static final String COLUMNNAME_FileType = "FileType";

	/** Set File Type	  */
	public void setFileType (String FileType);

	/** Get File Type	  */
	public String getFileType();

    /** Column name HL7_BPartner_ID */
    public static final String COLUMNNAME_HL7_BPartner_ID = "HL7_BPartner_ID";

	/** Set HL7 Business Partner.
	  * Identifies a Business Partner
	  */
	public void setHL7_BPartner_ID (int HL7_BPartner_ID);

	/** Get HL7 Business Partner.
	  * Identifies a Business Partner
	  */
	public int getHL7_BPartner_ID();

	public I_HL7_BPartner getHL7_BPartner() throws RuntimeException;

    /** Column name HL7_BPartnerSMB_ID */
    public static final String COLUMNNAME_HL7_BPartnerSMB_ID = "HL7_BPartnerSMB_ID";

	/** Set HL7 Busniess Partner SMB	  */
	public void setHL7_BPartnerSMB_ID (int HL7_BPartnerSMB_ID);

	/** Get HL7 Busniess Partner SMB	  */
	public int getHL7_BPartnerSMB_ID();

    /** Column name IsInbound */
    public static final String COLUMNNAME_IsInbound = "IsInbound";

	/** Set Is Inbound	  */
	public void setIsInbound (boolean IsInbound);

	/** Get Is Inbound	  */
	public boolean isInbound();

    /** Column name Password */
    public static final String COLUMNNAME_Password = "Password";

	/** Set Password.
	  * Password of any length (case sensitive)
	  */
	public void setPassword (String Password);

	/** Get Password.
	  * Password of any length (case sensitive)
	  */
	public String getPassword();

    /** Column name SMBHost */
    public static final String COLUMNNAME_SMBHost = "SMBHost";

	/** Set SMB Host	  */
	public void setSMBHost (String SMBHost);

	/** Get SMB Host	  */
	public String getSMBHost();

    /** Column name Template */
    public static final String COLUMNNAME_Template = "Template";

	/** Set Template.
	  * Message Template
	  */
	public void setTemplate (String Template);

	/** Get Template.
	  * Message Template
	  */
	public String getTemplate();

    /** Column name TestWrite */
    public static final String COLUMNNAME_TestWrite = "TestWrite";

	/** Set Test Write.
	  * Test the configuration
	  */
	public void setTestWrite (String TestWrite);

	/** Get Test Write.
	  * Test the configuration
	  */
	public String getTestWrite();

    /** Column name UserName */
    public static final String COLUMNNAME_UserName = "UserName";

	/** Set Registered EMail.
	  * Email of the responsible for the System
	  */
	public void setUserName (String UserName);

	/** Get Registered EMail.
	  * Email of the responsible for the System
	  */
	public String getUserName();
}
