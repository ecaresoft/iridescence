/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for EXME_Material_Const
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_EXME_Material_Const 
{

    /** TableName=EXME_Material_Const */
    public static final String Table_Name = "EXME_Material_Const";

    /** AD_Table_ID=1000211 */
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

    /** Column name EXME_Material_Const_ID */
    public static final String COLUMNNAME_EXME_Material_Const_ID = "EXME_Material_Const_ID";

	/** Set Construction Material.
	  * Construction Material
	  */
	public void setEXME_Material_Const_ID (int EXME_Material_Const_ID);

	/** Get Construction Material.
	  * Construction Material
	  */
	public int getEXME_Material_Const_ID();

    /** Column name Puntaje */
    public static final String COLUMNNAME_Puntaje = "Puntaje";

	/** Set Score.
	  * Score
	  */
	public void setPuntaje (BigDecimal Puntaje);

	/** Get Score.
	  * Score
	  */
	public BigDecimal getPuntaje();

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
}