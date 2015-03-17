/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_UserBPAccess
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_UserBPAccess 
{

    /** TableName=AD_UserBPAccess */
    public static final String Table_Name = "AD_UserBPAccess";

    /** AD_Table_ID=813 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 2 - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(2);

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

    /** Column name AD_UserBPAccess_ID */
    public static final String COLUMNNAME_AD_UserBPAccess_ID = "AD_UserBPAccess_ID";

	/** Set User BP Access.
	  * User/contact access to Business Partner information and resources
	  */
	public void setAD_UserBPAccess_ID (int AD_UserBPAccess_ID);

	/** Get User BP Access.
	  * User/contact access to Business Partner information and resources
	  */
	public int getAD_UserBPAccess_ID();

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public I_AD_User getAD_User() throws RuntimeException;

    /** Column name BPAccessType */
    public static final String COLUMNNAME_BPAccessType = "BPAccessType";

	/** Set Access Type.
	  * Type of Access of the user/contact to Business Partner information and resources
	  */
	public void setBPAccessType (String BPAccessType);

	/** Get Access Type.
	  * Type of Access of the user/contact to Business Partner information and resources
	  */
	public String getBPAccessType();

    /** Column name DocBaseType */
    public static final String COLUMNNAME_DocBaseType = "DocBaseType";

	/** Set Document BaseType.
	  * Logical type of document
	  */
	public void setDocBaseType (String DocBaseType);

	/** Get Document BaseType.
	  * Logical type of document
	  */
	public String getDocBaseType();

    /** Column name R_RequestType_ID */
    public static final String COLUMNNAME_R_RequestType_ID = "R_RequestType_ID";

	/** Set Request Type.
	  * Type of request (e.g. Inquiry, Complaint, ..)
	  */
	public void setR_RequestType_ID (int R_RequestType_ID);

	/** Get Request Type.
	  * Type of request (e.g. Inquiry, Complaint, ..)
	  */
	public int getR_RequestType_ID();

	public I_R_RequestType getR_RequestType() throws RuntimeException;
}