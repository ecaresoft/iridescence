/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for C_DocTypeCounter
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_C_DocTypeCounter 
{

    /** TableName=C_DocTypeCounter */
    public static final String Table_Name = "C_DocTypeCounter";

    /** AD_Table_ID=718 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

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

    /** Column name C_DocTypeCounter_ID */
    public static final String COLUMNNAME_C_DocTypeCounter_ID = "C_DocTypeCounter_ID";

	/** Set Counter Document.
	  * Counter Document Relationship
	  */
	public void setC_DocTypeCounter_ID (int C_DocTypeCounter_ID);

	/** Get Counter Document.
	  * Counter Document Relationship
	  */
	public int getC_DocTypeCounter_ID();

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name Counter_C_DocType_ID */
    public static final String COLUMNNAME_Counter_C_DocType_ID = "Counter_C_DocType_ID";

	/** Set Counter Document Type.
	  * Generated Counter Document Type (To)
	  */
	public void setCounter_C_DocType_ID (int Counter_C_DocType_ID);

	/** Get Counter Document Type.
	  * Generated Counter Document Type (To)
	  */
	public int getCounter_C_DocType_ID();

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

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

    /** Column name IsCreateCounter */
    public static final String COLUMNNAME_IsCreateCounter = "IsCreateCounter";

	/** Set Create Counter Document.
	  * Create Counter Document
	  */
	public void setIsCreateCounter (boolean IsCreateCounter);

	/** Get Create Counter Document.
	  * Create Counter Document
	  */
	public boolean isCreateCounter();

    /** Column name IsValid */
    public static final String COLUMNNAME_IsValid = "IsValid";

	/** Set Valid.
	  * Element is valid
	  */
	public void setIsValid (boolean IsValid);

	/** Get Valid.
	  * Element is valid
	  */
	public boolean isValid();

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

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();
}
