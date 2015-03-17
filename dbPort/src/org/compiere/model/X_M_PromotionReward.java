/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.Env;

/** Generated Model for M_PromotionReward
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_M_PromotionReward extends PO implements I_M_PromotionReward, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_M_PromotionReward (Properties ctx, int M_PromotionReward_ID, String trxName)
    {
      super (ctx, M_PromotionReward_ID, trxName);
      /** if (M_PromotionReward_ID == 0)
        {
			setC_Charge_ID (0);
			setIsForAllDistribution (false);
// N
			setM_Promotion_ID (0);
			setM_PromotionReward_ID (0);
			setRewardType (null);
			setSeqNo (0);
// @SQL=SELECT COALESCE(MAX(SeqNo),0)+10 AS DefaultValue FROM M_PromotionReward WHERE M_Promotion_ID=@M_Promotion_ID@
        } */
    }

    /** Load Constructor */
    public X_M_PromotionReward (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_M_PromotionReward[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Amount.
		@param Amount 
		Amount in a defined currency
	  */
	public void setAmount (BigDecimal Amount)
	{
		set_Value (COLUMNNAME_Amount, Amount);
	}

	/** Get Amount.
		@return Amount in a defined currency
	  */
	public BigDecimal getAmount () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_C_Charge getC_Charge() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_C_Charge.Table_Name);
        I_C_Charge result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_C_Charge)constructor.newInstance(new Object[] {getCtx(), new Integer(getC_Charge_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Charge.
		@param C_Charge_ID 
		Additional document charges
	  */
	public void setC_Charge_ID (int C_Charge_ID)
	{
		if (C_Charge_ID < 1)
			 throw new IllegalArgumentException ("C_Charge_ID is mandatory.");
		set_Value (COLUMNNAME_C_Charge_ID, Integer.valueOf(C_Charge_ID));
	}

	/** Get Charge.
		@return Additional document charges
	  */
	public int getC_Charge_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Charge_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** DistributionSorting AD_Reference_ID=1200341 */
	public static final int DISTRIBUTIONSORTING_AD_Reference_ID=1200341;
	/** Ascending = A */
	public static final String DISTRIBUTIONSORTING_Ascending = "A";
	/** Descending = D */
	public static final String DISTRIBUTIONSORTING_Descending = "D";
	/** Set Distribution Sorting.
		@param DistributionSorting 
		Quantity distribution sorting by unit price
	  */
	public void setDistributionSorting (String DistributionSorting)
	{

		if (DistributionSorting == null || DistributionSorting.equals("A") || DistributionSorting.equals("D")); else throw new IllegalArgumentException ("DistributionSorting Invalid value - " + DistributionSorting + " - Reference_ID=1200341 - A - D");		set_Value (COLUMNNAME_DistributionSorting, DistributionSorting);
	}

	/** Get Distribution Sorting.
		@return Quantity distribution sorting by unit price
	  */
	public String getDistributionSorting () 
	{
		return (String)get_Value(COLUMNNAME_DistributionSorting);
	}

	/** Set For all distribution.
		@param IsForAllDistribution 
		This reward is for all distribution
	  */
	public void setIsForAllDistribution (boolean IsForAllDistribution)
	{
		set_Value (COLUMNNAME_IsForAllDistribution, Boolean.valueOf(IsForAllDistribution));
	}

	/** Get For all distribution.
		@return This reward is for all distribution
	  */
	public boolean isForAllDistribution () 
	{
		Object oo = get_Value(COLUMNNAME_IsForAllDistribution);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Same distribution for source and target.
		@param IsSameDistribution 
		Use the same distribution for source and target
	  */
	public void setIsSameDistribution (boolean IsSameDistribution)
	{
		set_Value (COLUMNNAME_IsSameDistribution, Boolean.valueOf(IsSameDistribution));
	}

	/** Get Same distribution for source and target.
		@return Use the same distribution for source and target
	  */
	public boolean isSameDistribution () 
	{
		Object oo = get_Value(COLUMNNAME_IsSameDistribution);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_M_PromotionDistribution getM_PromotionDistribution() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_M_PromotionDistribution.Table_Name);
        I_M_PromotionDistribution result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_M_PromotionDistribution)constructor.newInstance(new Object[] {getCtx(), new Integer(getM_PromotionDistribution_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Promotion Distribution.
		@param M_PromotionDistribution_ID Promotion Distribution	  */
	public void setM_PromotionDistribution_ID (int M_PromotionDistribution_ID)
	{
		if (M_PromotionDistribution_ID < 1) 
			set_Value (COLUMNNAME_M_PromotionDistribution_ID, null);
		else 
			set_Value (COLUMNNAME_M_PromotionDistribution_ID, Integer.valueOf(M_PromotionDistribution_ID));
	}

	/** Get Promotion Distribution.
		@return Promotion Distribution	  */
	public int getM_PromotionDistribution_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PromotionDistribution_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_Promotion getM_Promotion() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_M_Promotion.Table_Name);
        I_M_Promotion result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_M_Promotion)constructor.newInstance(new Object[] {getCtx(), new Integer(getM_Promotion_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Promotion.
		@param M_Promotion_ID Promotion	  */
	public void setM_Promotion_ID (int M_Promotion_ID)
	{
		if (M_Promotion_ID < 1)
			 throw new IllegalArgumentException ("M_Promotion_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_M_Promotion_ID, Integer.valueOf(M_Promotion_ID));
	}

	/** Get Promotion.
		@return Promotion	  */
	public int getM_Promotion_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Promotion_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Promotion Reward.
		@param M_PromotionReward_ID Promotion Reward	  */
	public void setM_PromotionReward_ID (int M_PromotionReward_ID)
	{
		if (M_PromotionReward_ID < 1)
			 throw new IllegalArgumentException ("M_PromotionReward_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_M_PromotionReward_ID, Integer.valueOf(M_PromotionReward_ID));
	}

	/** Get Promotion Reward.
		@return Promotion Reward	  */
	public int getM_PromotionReward_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PromotionReward_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Target distribution.
		@param M_TargetDistribution_ID 
		Get product from target distribution to apply the promotion reward
	  */
	public void setM_TargetDistribution_ID (int M_TargetDistribution_ID)
	{
		if (M_TargetDistribution_ID < 1) 
			set_Value (COLUMNNAME_M_TargetDistribution_ID, null);
		else 
			set_Value (COLUMNNAME_M_TargetDistribution_ID, Integer.valueOf(M_TargetDistribution_ID));
	}

	/** Get Target distribution.
		@return Get product from target distribution to apply the promotion reward
	  */
	public int getM_TargetDistribution_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_TargetDistribution_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Quantity.
		@param Qty 
		Quantity
	  */
	public void setQty (BigDecimal Qty)
	{
		set_Value (COLUMNNAME_Qty, Qty);
	}

	/** Get Quantity.
		@return Quantity
	  */
	public BigDecimal getQty () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Qty);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** RewardType AD_Reference_ID=1200343 */
	public static final int REWARDTYPE_AD_Reference_ID=1200343;
	/** Percentage = P */
	public static final String REWARDTYPE_Percentage = "P";
	/** Flat Discount = F */
	public static final String REWARDTYPE_FlatDiscount = "F";
	/** Absolute Amount = A */
	public static final String REWARDTYPE_AbsoluteAmount = "A";
	/** Set Reward Type.
		@param RewardType 
		Type of reward which consists of percentage discount, flat discount or absolute amount
	  */
	public void setRewardType (String RewardType)
	{
		if (RewardType == null) throw new IllegalArgumentException ("RewardType is mandatory");
		if (RewardType.equals("P") || RewardType.equals("F") || RewardType.equals("A")); else throw new IllegalArgumentException ("RewardType Invalid value - " + RewardType + " - Reference_ID=1200343 - P - F - A");		set_Value (COLUMNNAME_RewardType, RewardType);
	}

	/** Get Reward Type.
		@return Type of reward which consists of percentage discount, flat discount or absolute amount
	  */
	public String getRewardType () 
	{
		return (String)get_Value(COLUMNNAME_RewardType);
	}

	/** Set Sequence Number.
		@param SeqNo 
		Method of ordering records; lowest number comes first
	  */
	public void setSeqNo (int SeqNo)
	{
		set_Value (COLUMNNAME_SeqNo, Integer.valueOf(SeqNo));
	}

	/** Get Sequence Number.
		@return Method of ordering records; lowest number comes first
	  */
	public int getSeqNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SeqNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}