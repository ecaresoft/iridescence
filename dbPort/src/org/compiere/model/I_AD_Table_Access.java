/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_Table_Access
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_Table_Access 
{

    /** TableName=AD_Table_Access */
    public static final String Table_Name = "AD_Table_Access";

    /** AD_Table_ID=565 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AccessTypeRule */
    public static final String COLUMNNAME_AccessTypeRule = "AccessTypeRule";

	/** Set Access Type.
	  * The type of access for this rule
	  */
	public void setAccessTypeRule (String AccessTypeRule);

	/** Get Access Type.
	  * The type of access for this rule
	  */
	public String getAccessTypeRule();

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

    /** Column name AD_Role_ID */
    public static final String COLUMNNAME_AD_Role_ID = "AD_Role_ID";

	/** Set Role.
	  * Responsibility Role
	  */
	public void setAD_Role_ID (int AD_Role_ID);

	/** Get Role.
	  * Responsibility Role
	  */
	public int getAD_Role_ID();

	public I_AD_Role getAD_Role() throws RuntimeException;

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

    /** Column name IsCanExport */
    public static final String COLUMNNAME_IsCanExport = "IsCanExport";

	/** Set Can Export.
	  * Users with this role can export data
	  */
	public void setIsCanExport (boolean IsCanExport);

	/** Get Can Export.
	  * Users with this role can export data
	  */
	public boolean isCanExport();

    /** Column name IsCanReport */
    public static final String COLUMNNAME_IsCanReport = "IsCanReport";

	/** Set Can Report.
	  * Users with this role can create reports
	  */
	public void setIsCanReport (boolean IsCanReport);

	/** Get Can Report.
	  * Users with this role can create reports
	  */
	public boolean isCanReport();

    /** Column name IsExclude */
    public static final String COLUMNNAME_IsExclude = "IsExclude";

	/** Set Exclude.
	  * Exclude access to the data - if not selected Include access to the data
	  */
	public void setIsExclude (boolean IsExclude);

	/** Get Exclude.
	  * Exclude access to the data - if not selected Include access to the data
	  */
	public boolean isExclude();

    /** Column name IsReadOnly */
    public static final String COLUMNNAME_IsReadOnly = "IsReadOnly";

	/** Set Read Only.
	  * Field is read only
	  */
	public void setIsReadOnly (boolean IsReadOnly);

	/** Get Read Only.
	  * Field is read only
	  */
	public boolean isReadOnly();
}
