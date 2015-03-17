/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_UserDef_Tab
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_UserDef_Tab 
{

    /** TableName=AD_UserDef_Tab */
    public static final String Table_Name = "AD_UserDef_Tab";

    /** AD_Table_ID=466 */
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

    /** Column name AD_Tab_ID */
    public static final String COLUMNNAME_AD_Tab_ID = "AD_Tab_ID";

	/** Set Tab.
	  * Tab within a Window
	  */
	public void setAD_Tab_ID (int AD_Tab_ID);

	/** Get Tab.
	  * Tab within a Window
	  */
	public int getAD_Tab_ID();

	public I_AD_Tab getAD_Tab() throws RuntimeException;

    /** Column name AD_UserDef_Tab_ID */
    public static final String COLUMNNAME_AD_UserDef_Tab_ID = "AD_UserDef_Tab_ID";

	/** Set User defined Tab	  */
	public void setAD_UserDef_Tab_ID (int AD_UserDef_Tab_ID);

	/** Get User defined Tab	  */
	public int getAD_UserDef_Tab_ID();

    /** Column name AD_UserDef_Win_ID */
    public static final String COLUMNNAME_AD_UserDef_Win_ID = "AD_UserDef_Win_ID";

	/** Set User defined Window	  */
	public void setAD_UserDef_Win_ID (int AD_UserDef_Win_ID);

	/** Get User defined Window	  */
	public int getAD_UserDef_Win_ID();

	public I_AD_UserDef_Win getAD_UserDef_Win() throws RuntimeException;

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

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsMultiRowOnly */
    public static final String COLUMNNAME_IsMultiRowOnly = "IsMultiRowOnly";

	/** Set Multi Row Only.
	  * This applies to Multi-Row view only
	  */
	public void setIsMultiRowOnly (boolean IsMultiRowOnly);

	/** Get Multi Row Only.
	  * This applies to Multi-Row view only
	  */
	public boolean isMultiRowOnly();

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

    /** Column name IsSingleRow */
    public static final String COLUMNNAME_IsSingleRow = "IsSingleRow";

	/** Set Single Row Layout.
	  * Default for toggle between Single- and Multi-Row (Grid) Layout
	  */
	public void setIsSingleRow (boolean IsSingleRow);

	/** Get Single Row Layout.
	  * Default for toggle between Single- and Multi-Row (Grid) Layout
	  */
	public boolean isSingleRow();

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
}