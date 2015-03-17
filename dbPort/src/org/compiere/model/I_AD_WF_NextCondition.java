/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_WF_NextCondition
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_WF_NextCondition 
{

    /** TableName=AD_WF_NextCondition */
    public static final String Table_Name = "AD_WF_NextCondition";

    /** AD_Table_ID=706 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Column_ID */
    public static final String COLUMNNAME_AD_Column_ID = "AD_Column_ID";

	/** Set Column.
	  * Column in the table
	  */
	public void setAD_Column_ID (int AD_Column_ID);

	/** Get Column.
	  * Column in the table
	  */
	public int getAD_Column_ID();

	public I_AD_Column getAD_Column() throws RuntimeException;

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

    /** Column name AD_WF_NextCondition_ID */
    public static final String COLUMNNAME_AD_WF_NextCondition_ID = "AD_WF_NextCondition_ID";

	/** Set Transition Condition.
	  * Workflow Node Transition Condition
	  */
	public void setAD_WF_NextCondition_ID (int AD_WF_NextCondition_ID);

	/** Get Transition Condition.
	  * Workflow Node Transition Condition
	  */
	public int getAD_WF_NextCondition_ID();

    /** Column name AD_WF_NodeNext_ID */
    public static final String COLUMNNAME_AD_WF_NodeNext_ID = "AD_WF_NodeNext_ID";

	/** Set Node Transition.
	  * Workflow Node Transition
	  */
	public void setAD_WF_NodeNext_ID (int AD_WF_NodeNext_ID);

	/** Get Node Transition.
	  * Workflow Node Transition
	  */
	public int getAD_WF_NodeNext_ID();

	public I_AD_WF_NodeNext getAD_WF_NodeNext() throws RuntimeException;

    /** Column name AndOr */
    public static final String COLUMNNAME_AndOr = "AndOr";

	/** Set And/Or.
	  * Logical operation: AND or OR
	  */
	public void setAndOr (String AndOr);

	/** Get And/Or.
	  * Logical operation: AND or OR
	  */
	public String getAndOr();

    /** Column name EntityType */
    public static final String COLUMNNAME_EntityType = "EntityType";

	/** Set Entity Type.
	  * Dictionary Entity Type;
 Determines ownership and synchronization
	  */
	public void setEntityType (String EntityType);

	/** Get Entity Type.
	  * Dictionary Entity Type;
 Determines ownership and synchronization
	  */
	public String getEntityType();

    /** Column name Operation */
    public static final String COLUMNNAME_Operation = "Operation";

	/** Set Operation.
	  * Compare Operation
	  */
	public void setOperation (String Operation);

	/** Get Operation.
	  * Compare Operation
	  */
	public String getOperation();

    /** Column name SeqNo */
    public static final String COLUMNNAME_SeqNo = "SeqNo";

	/** Set Sequence Number.
	  * Method of ordering records;
 lowest number comes first
	  */
	public void setSeqNo (int SeqNo);

	/** Get Sequence Number.
	  * Method of ordering records;
 lowest number comes first
	  */
	public int getSeqNo();

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();

    /** Column name Value2 */
    public static final String COLUMNNAME_Value2 = "Value2";

	/** Set Value To.
	  * Value To
	  */
	public void setValue2 (String Value2);

	/** Get Value To.
	  * Value To
	  */
	public String getValue2();
}