/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.util.KeyNamePair;

/** Generated Interface for M_AttributeSet
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_M_AttributeSet 
{

    /** TableName=M_AttributeSet */
    public static final String Table_Name = "M_AttributeSet";

    /** AD_Table_ID=560 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 7 - System - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(7);

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

    /** Column name GuaranteeDays */
    public static final String COLUMNNAME_GuaranteeDays = "GuaranteeDays";

	/** Set Guarantee Days.
	  * Number of days the product is guaranteed or available
	  */
	public void setGuaranteeDays (int GuaranteeDays);

	/** Get Guarantee Days.
	  * Number of days the product is guaranteed or available
	  */
	public int getGuaranteeDays();

    /** Column name IsGuaranteeDate */
    public static final String COLUMNNAME_IsGuaranteeDate = "IsGuaranteeDate";

	/** Set Guarantee Date.
	  * Product has Guarantee or Expiry Date
	  */
	public void setIsGuaranteeDate (boolean IsGuaranteeDate);

	/** Get Guarantee Date.
	  * Product has Guarantee or Expiry Date
	  */
	public boolean isGuaranteeDate();

    /** Column name IsGuaranteeDateMandatory */
    public static final String COLUMNNAME_IsGuaranteeDateMandatory = "IsGuaranteeDateMandatory";

	/** Set Mandatory Guarantee Date.
	  * The entry of a Guarantee Date is mandatory when creating a Product Instance
	  */
	public void setIsGuaranteeDateMandatory (boolean IsGuaranteeDateMandatory);

	/** Get Mandatory Guarantee Date.
	  * The entry of a Guarantee Date is mandatory when creating a Product Instance
	  */
	public boolean isGuaranteeDateMandatory();

    /** Column name IsInstanceAttribute */
    public static final String COLUMNNAME_IsInstanceAttribute = "IsInstanceAttribute";

	/** Set Instance Attribute.
	  * The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date)
	  */
	public void setIsInstanceAttribute (boolean IsInstanceAttribute);

	/** Get Instance Attribute.
	  * The product attribute is specific to the instance (like Serial No, Lot or Guarantee Date)
	  */
	public boolean isInstanceAttribute();

    /** Column name IsLot */
    public static final String COLUMNNAME_IsLot = "IsLot";

	/** Set Lot.
	  * The product instances have a Lot Number
	  */
	public void setIsLot (boolean IsLot);

	/** Get Lot.
	  * The product instances have a Lot Number
	  */
	public boolean isLot();

    /** Column name IsLotMandatory */
    public static final String COLUMNNAME_IsLotMandatory = "IsLotMandatory";

	/** Set Mandatory Lot.
	  * The entry of Lot info is mandatory when creating a Product Instance
	  */
	public void setIsLotMandatory (boolean IsLotMandatory);

	/** Get Mandatory Lot.
	  * The entry of Lot info is mandatory when creating a Product Instance
	  */
	public boolean isLotMandatory();

    /** Column name IsSerNo */
    public static final String COLUMNNAME_IsSerNo = "IsSerNo";

	/** Set Serial No.
	  * The product instances have Serial Numbers
	  */
	public void setIsSerNo (boolean IsSerNo);

	/** Get Serial No.
	  * The product instances have Serial Numbers
	  */
	public boolean isSerNo();

    /** Column name IsSerNoMandatory */
    public static final String COLUMNNAME_IsSerNoMandatory = "IsSerNoMandatory";

	/** Set Mandatory Serial No.
	  * The entry of a Serial No is mandatory when creating a Product Instance
	  */
	public void setIsSerNoMandatory (boolean IsSerNoMandatory);

	/** Get Mandatory Serial No.
	  * The entry of a Serial No is mandatory when creating a Product Instance
	  */
	public boolean isSerNoMandatory();

    /** Column name LotCharEOverwrite */
    public static final String COLUMNNAME_LotCharEOverwrite = "LotCharEOverwrite";

	/** Set Lot Char End Overwrite.
	  * Lot/Batch End Indicator overwrite - default »
	  */
	public void setLotCharEOverwrite (String LotCharEOverwrite);

	/** Get Lot Char End Overwrite.
	  * Lot/Batch End Indicator overwrite - default »
	  */
	public String getLotCharEOverwrite();

    /** Column name LotCharSOverwrite */
    public static final String COLUMNNAME_LotCharSOverwrite = "LotCharSOverwrite";

	/** Set Lot Char Start Overwrite.
	  * Lot/Batch Start Indicator overwrite - default «
	  */
	public void setLotCharSOverwrite (String LotCharSOverwrite);

	/** Get Lot Char Start Overwrite.
	  * Lot/Batch Start Indicator overwrite - default «
	  */
	public String getLotCharSOverwrite();

    /** Column name MandatoryType */
    public static final String COLUMNNAME_MandatoryType = "MandatoryType";

	/** Set Mandatory Type.
	  * The specification of a Product Attribute Instance is mandatory
	  */
	public void setMandatoryType (String MandatoryType);

	/** Get Mandatory Type.
	  * The specification of a Product Attribute Instance is mandatory
	  */
	public String getMandatoryType();

    /** Column name M_AttributeSet_ID */
    public static final String COLUMNNAME_M_AttributeSet_ID = "M_AttributeSet_ID";

	/** Set Attribute Set.
	  * Product Attribute Set
	  */
	public void setM_AttributeSet_ID (int M_AttributeSet_ID);

	/** Get Attribute Set.
	  * Product Attribute Set
	  */
	public int getM_AttributeSet_ID();

    /** Column name M_LotCtl_ID */
    public static final String COLUMNNAME_M_LotCtl_ID = "M_LotCtl_ID";

	/** Set Lot Control.
	  * Product Lot Control
	  */
	public void setM_LotCtl_ID (int M_LotCtl_ID);

	/** Get Lot Control.
	  * Product Lot Control
	  */
	public int getM_LotCtl_ID();

	public I_M_LotCtl getM_LotCtl() throws RuntimeException;

    /** Column name M_SerNoCtl_ID */
    public static final String COLUMNNAME_M_SerNoCtl_ID = "M_SerNoCtl_ID";

	/** Set Serial No Control.
	  * Product Serial Number Control
	  */
	public void setM_SerNoCtl_ID (int M_SerNoCtl_ID);

	/** Get Serial No Control.
	  * Product Serial Number Control
	  */
	public int getM_SerNoCtl_ID();

	public I_M_SerNoCtl getM_SerNoCtl() throws RuntimeException;

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

    /** Column name SerNoCharEOverwrite */
    public static final String COLUMNNAME_SerNoCharEOverwrite = "SerNoCharEOverwrite";

	/** Set SerNo Char End Overwrite.
	  * Serial Number End Indicator overwrite - default empty
	  */
	public void setSerNoCharEOverwrite (String SerNoCharEOverwrite);

	/** Get SerNo Char End Overwrite.
	  * Serial Number End Indicator overwrite - default empty
	  */
	public String getSerNoCharEOverwrite();

    /** Column name SerNoCharSOverwrite */
    public static final String COLUMNNAME_SerNoCharSOverwrite = "SerNoCharSOverwrite";

	/** Set SerNo Char Start Overwrite.
	  * Serial Number Start Indicator overwrite - default #
	  */
	public void setSerNoCharSOverwrite (String SerNoCharSOverwrite);

	/** Get SerNo Char Start Overwrite.
	  * Serial Number Start Indicator overwrite - default #
	  */
	public String getSerNoCharSOverwrite();
}