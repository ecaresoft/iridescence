/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_Package_Imp_Inst
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_Package_Imp_Inst 
{

    /** TableName=AD_Package_Imp_Inst */
    public static final String Table_Name = "AD_Package_Imp_Inst";

    /** AD_Table_ID=1200657 */
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

    /** Column name AD_PACKAGE_IMP_INST_ID */
    public static final String COLUMNNAME_AD_PACKAGE_IMP_INST_ID = "AD_PACKAGE_IMP_INST_ID";

	/** Set Packages Installed.
	  * Packages Installed
	  */
	public void setAD_PACKAGE_IMP_INST_ID (int AD_PACKAGE_IMP_INST_ID);

	/** Get Packages Installed.
	  * Packages Installed
	  */
	public int getAD_PACKAGE_IMP_INST_ID();

    /** Column name Creator */
    public static final String COLUMNNAME_Creator = "Creator";

	/** Set Creator	  */
	public void setCreator (String Creator);

	/** Get Creator	  */
	public String getCreator();

    /** Column name CreatorContact */
    public static final String COLUMNNAME_CreatorContact = "CreatorContact";

	/** Set CreatorContact	  */
	public void setCreatorContact (String CreatorContact);

	/** Get CreatorContact	  */
	public String getCreatorContact();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name PK_Status */
    public static final String COLUMNNAME_PK_Status = "PK_Status";

	/** Set PK_Status	  */
	public void setPK_Status (String PK_Status);

	/** Get PK_Status	  */
	public String getPK_Status();

    /** Column name PK_Version */
    public static final String COLUMNNAME_PK_Version = "PK_Version";

	/** Set Package Version	  */
	public void setPK_Version (String PK_Version);

	/** Get Package Version	  */
	public String getPK_Version();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name ReleaseNo */
    public static final String COLUMNNAME_ReleaseNo = "ReleaseNo";

	/** Set Release No.
	  * Internal Release Number
	  */
	public void setReleaseNo (String ReleaseNo);

	/** Get Release No.
	  * Internal Release Number
	  */
	public String getReleaseNo();

    /** Column name Uninstall */
    public static final String COLUMNNAME_Uninstall = "Uninstall";

	/** Set Uninstall	  */
	public void setUninstall (boolean Uninstall);

	/** Get Uninstall	  */
	public boolean isUninstall();

    /** Column name Version */
    public static final String COLUMNNAME_Version = "Version";

	/** Set Version.
	  * Version of the table definition
	  */
	public void setVersion (String Version);

	/** Get Version.
	  * Version of the table definition
	  */
	public String getVersion();
}
