/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_ReplicationTable
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_ReplicationTable 
{

    /** TableName=AD_ReplicationTable */
    public static final String Table_Name = "AD_ReplicationTable";

    /** AD_Table_ID=601 */
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

    /** Column name AD_ReplicationStrategy_ID */
    public static final String COLUMNNAME_AD_ReplicationStrategy_ID = "AD_ReplicationStrategy_ID";

	/** Set Replication Strategy.
	  * Data Replication Strategy
	  */
	public void setAD_ReplicationStrategy_ID (int AD_ReplicationStrategy_ID);

	/** Get Replication Strategy.
	  * Data Replication Strategy
	  */
	public int getAD_ReplicationStrategy_ID();

	public I_AD_ReplicationStrategy getAD_ReplicationStrategy() throws RuntimeException;

    /** Column name AD_ReplicationTable_ID */
    public static final String COLUMNNAME_AD_ReplicationTable_ID = "AD_ReplicationTable_ID";

	/** Set Replication Table.
	  * Data Replication Strategy Table Info
	  */
	public void setAD_ReplicationTable_ID (int AD_ReplicationTable_ID);

	/** Get Replication Table.
	  * Data Replication Strategy Table Info
	  */
	public int getAD_ReplicationTable_ID();

    /** Column name AD_Table_ID */
    public static final String COLUMNNAME_AD_Table_ID = "AD_Table_ID";

	/** Set Table.
	  * Database Table information
	  */
	public void setAD_Table_ID (int AD_Table_ID);

	/** Get Table.
	  * Database Table information
	  */
	public int getAD_Table_ID();

	public I_AD_Table getAD_Table() throws RuntimeException;

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

    /** Column name ReplicationType */
    public static final String COLUMNNAME_ReplicationType = "ReplicationType";

	/** Set Replication Type.
	  * Type of Data Replication
	  */
	public void setReplicationType (String ReplicationType);

	/** Get Replication Type.
	  * Type of Data Replication
	  */
	public String getReplicationType();
}