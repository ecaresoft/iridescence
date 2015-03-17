/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software;
 you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program;
 if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for PP_Order_NodeNext
 *  @author Adempiere (generated) 
 *  @version Release 3.5.3a
 */
public interface I_PP_Order_NodeNext 
{

    /** TableName=PP_Order_NodeNext */
    public static final String Table_Name = "PP_Order_NodeNext";

    /** AD_Table_ID=53023 */
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

    /** Column name AD_WF_Next_ID */
    public static final String COLUMNNAME_AD_WF_Next_ID = "AD_WF_Next_ID";

	/** Set Next Node.
	  * Next Node in workflow
	  */
	public void setAD_WF_Next_ID (int AD_WF_Next_ID);

	/** Get Next Node.
	  * Next Node in workflow
	  */
	public int getAD_WF_Next_ID();

    /** Column name AD_WF_Node_ID */
    public static final String COLUMNNAME_AD_WF_Node_ID = "AD_WF_Node_ID";

	/** Set Node.
	  * Workflow Node (activity), step or process
	  */
	public void setAD_WF_Node_ID (int AD_WF_Node_ID);

	/** Get Node.
	  * Workflow Node (activity), step or process
	  */
	public int getAD_WF_Node_ID();

	public I_AD_WF_Node getAD_WF_Node() throws RuntimeException;

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

    /** Column name IsStdUserWorkflow */
    public static final String COLUMNNAME_IsStdUserWorkflow = "IsStdUserWorkflow";

	/** Set Std User Workflow.
	  * Standard Manual User Approval Workflow
	  */
	public void setIsStdUserWorkflow (boolean IsStdUserWorkflow);

	/** Get Std User Workflow.
	  * Standard Manual User Approval Workflow
	  */
	public boolean isStdUserWorkflow();

    /** Column name PP_Order_ID */
    public static final String COLUMNNAME_PP_Order_ID = "PP_Order_ID";

	/** Set Manufacturing Order	  */
	public void setPP_Order_ID (int PP_Order_ID);

	/** Get Manufacturing Order	  */
	public int getPP_Order_ID();

	public org.compiere.model.I_PP_Order getPP_Order() throws RuntimeException;

    /** Column name PP_Order_Next_ID */
    public static final String COLUMNNAME_PP_Order_Next_ID = "PP_Order_Next_ID";

	/** Set Manufacturing Order Activity Next	  */
	public void setPP_Order_Next_ID (int PP_Order_Next_ID);

	/** Get Manufacturing Order Activity Next	  */
	public int getPP_Order_Next_ID();

    /** Column name PP_Order_Node_ID */
    public static final String COLUMNNAME_PP_Order_Node_ID = "PP_Order_Node_ID";

	/** Set Manufacturing Order Activity	  */
	public void setPP_Order_Node_ID (int PP_Order_Node_ID);

	/** Get Manufacturing Order Activity	  */
	public int getPP_Order_Node_ID();

	public org.compiere.model.I_PP_Order_Node getPP_Order_Node() throws RuntimeException;

    /** Column name PP_Order_NodeNext_ID */
    public static final String COLUMNNAME_PP_Order_NodeNext_ID = "PP_Order_NodeNext_ID";

	/** Set Manufacturing Order Activity Next	  */
	public void setPP_Order_NodeNext_ID (int PP_Order_NodeNext_ID);

	/** Get Manufacturing Order Activity Next	  */
	public int getPP_Order_NodeNext_ID();

    /** Column name SeqNo */
    public static final String COLUMNNAME_SeqNo = "SeqNo";

	/** Set Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public void setSeqNo (int SeqNo);

	/** Get Sequence.
	  * Method of ordering records;
 lowest number comes first
	  */
	public int getSeqNo();

    /** Column name TransitionCode */
    public static final String COLUMNNAME_TransitionCode = "TransitionCode";

	/** Set Transition Code.
	  * Code resulting in TRUE of FALSE
	  */
	public void setTransitionCode (String TransitionCode);

	/** Get Transition Code.
	  * Code resulting in TRUE of FALSE
	  */
	public String getTransitionCode();
}