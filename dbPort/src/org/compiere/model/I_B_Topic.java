/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for B_Topic
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_B_Topic 
{

    /** TableName=B_Topic */
    public static final String Table_Name = "B_Topic";

    /** AD_Table_ID=679 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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

    /** Column name B_TopicCategory_ID */
    public static final String COLUMNNAME_B_TopicCategory_ID = "B_TopicCategory_ID";

	/** Set Topic Category.
	  * Auction Topic Category
	  */
	public void setB_TopicCategory_ID (int B_TopicCategory_ID);

	/** Get Topic Category.
	  * Auction Topic Category
	  */
	public int getB_TopicCategory_ID();

	public I_B_TopicCategory getB_TopicCategory() throws RuntimeException;

    /** Column name B_Topic_ID */
    public static final String COLUMNNAME_B_Topic_ID = "B_Topic_ID";

	/** Set Topic.
	  * Auction Topic
	  */
	public void setB_Topic_ID (int B_Topic_ID);

	/** Get Topic.
	  * Auction Topic
	  */
	public int getB_Topic_ID();

    /** Column name B_TopicType_ID */
    public static final String COLUMNNAME_B_TopicType_ID = "B_TopicType_ID";

	/** Set Topic Type.
	  * Auction Topic Type
	  */
	public void setB_TopicType_ID (int B_TopicType_ID);

	/** Get Topic Type.
	  * Auction Topic Type
	  */
	public int getB_TopicType_ID();

	public I_B_TopicType getB_TopicType() throws RuntimeException;

    /** Column name DecisionDate */
    public static final String COLUMNNAME_DecisionDate = "DecisionDate";

	/** Set Decision date	  */
	public void setDecisionDate (Timestamp DecisionDate);

	/** Get Decision date	  */
	public Timestamp getDecisionDate();

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

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name IsPublished */
    public static final String COLUMNNAME_IsPublished = "IsPublished";

	/** Set Published.
	  * The Topic is published and can be viewed
	  */
	public void setIsPublished (boolean IsPublished);

	/** Get Published.
	  * The Topic is published and can be viewed
	  */
	public boolean isPublished();

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

    /** Column name TextDetails */
    public static final String COLUMNNAME_TextDetails = "TextDetails";

	/** Set Details	  */
	public void setTextDetails (String TextDetails);

	/** Get Details	  */
	public String getTextDetails();

    /** Column name TextMsg */
    public static final String COLUMNNAME_TextMsg = "TextMsg";

	/** Set Text Message.
	  * Text Message
	  */
	public void setTextMsg (String TextMsg);

	/** Get Text Message.
	  * Text Message
	  */
	public String getTextMsg();

    /** Column name TopicAction */
    public static final String COLUMNNAME_TopicAction = "TopicAction";

	/** Set Topic Action	  */
	public void setTopicAction (String TopicAction);

	/** Get Topic Action	  */
	public String getTopicAction();

    /** Column name TopicStatus */
    public static final String COLUMNNAME_TopicStatus = "TopicStatus";

	/** Set Topic Status	  */
	public void setTopicStatus (String TopicStatus);

	/** Get Topic Status	  */
	public String getTopicStatus();
}