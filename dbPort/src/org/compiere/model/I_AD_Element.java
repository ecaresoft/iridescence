/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for AD_Element
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_AD_Element 
{

    /** TableName=AD_Element */
    public static final String Table_Name = "AD_Element";

    /** AD_Table_ID=276 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name AD_Element_ID */
    public static final String COLUMNNAME_AD_Element_ID = "AD_Element_ID";

	/** Set System Element.
	  * System Element enables the central maintenance of column description and help.
	  */
	public void setAD_Element_ID (int AD_Element_ID);

	/** Get System Element.
	  * System Element enables the central maintenance of column description and help.
	  */
	public int getAD_Element_ID();

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

    /** Column name ColumnName */
    public static final String COLUMNNAME_ColumnName = "ColumnName";

	/** Set DB Column Name.
	  * Name of the column in the database
	  */
	public void setColumnName (String ColumnName);

	/** Get DB Column Name.
	  * Name of the column in the database
	  */
	public String getColumnName();

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

    /** Column name PO_Description */
    public static final String COLUMNNAME_PO_Description = "PO_Description";

	/** Set PO Description.
	  * Description in PO Screens
	  */
	public void setPO_Description (String PO_Description);

	/** Get PO Description.
	  * Description in PO Screens
	  */
	public String getPO_Description();

    /** Column name PO_Help */
    public static final String COLUMNNAME_PO_Help = "PO_Help";

	/** Set PO Help.
	  * Help for PO Screens
	  */
	public void setPO_Help (String PO_Help);

	/** Get PO Help.
	  * Help for PO Screens
	  */
	public String getPO_Help();

    /** Column name PO_Name */
    public static final String COLUMNNAME_PO_Name = "PO_Name";

	/** Set PO Name.
	  * Name on PO Screens
	  */
	public void setPO_Name (String PO_Name);

	/** Get PO Name.
	  * Name on PO Screens
	  */
	public String getPO_Name();

    /** Column name PO_PrintName */
    public static final String COLUMNNAME_PO_PrintName = "PO_PrintName";

	/** Set PO Print name.
	  * Print name on PO Screens/Reports
	  */
	public void setPO_PrintName (String PO_PrintName);

	/** Get PO Print name.
	  * Print name on PO Screens/Reports
	  */
	public String getPO_PrintName();

    /** Column name PrintName */
    public static final String COLUMNNAME_PrintName = "PrintName";

	/** Set Print Text.
	  * The label text to be printed on a document or correspondence.
	  */
	public void setPrintName (String PrintName);

	/** Get Print Text.
	  * The label text to be printed on a document or correspondence.
	  */
	public String getPrintName();
}