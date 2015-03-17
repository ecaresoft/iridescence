/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;

/** Generated Model for CM_AccessNewsChannel
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_CM_AccessNewsChannel extends PO implements I_CM_AccessNewsChannel, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_CM_AccessNewsChannel (Properties ctx, int CM_AccessNewsChannel_ID, String trxName)
    {
      super (ctx, CM_AccessNewsChannel_ID, trxName);
      /** if (CM_AccessNewsChannel_ID == 0)
        {
			setCM_AccessProfile_ID (0);
			setCM_NewsChannel_ID (0);
        } */
    }

    /** Load Constructor */
    public X_CM_AccessNewsChannel (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client 
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
      StringBuffer sb = new StringBuffer ("X_CM_AccessNewsChannel[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_CM_AccessProfile getCM_AccessProfile() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_AccessProfile.Table_Name);
        I_CM_AccessProfile result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_AccessProfile)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_AccessProfile_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Web Access Profile.
		@param CM_AccessProfile_ID 
		Web Access Profile
	  */
	public void setCM_AccessProfile_ID (int CM_AccessProfile_ID)
	{
		if (CM_AccessProfile_ID < 1)
			 throw new IllegalArgumentException ("CM_AccessProfile_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_AccessProfile_ID, Integer.valueOf(CM_AccessProfile_ID));
	}

	/** Get Web Access Profile.
		@return Web Access Profile
	  */
	public int getCM_AccessProfile_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_AccessProfile_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_CM_NewsChannel getCM_NewsChannel() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_CM_NewsChannel.Table_Name);
        I_CM_NewsChannel result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_CM_NewsChannel)constructor.newInstance(new Object[] {getCtx(), new Integer(getCM_NewsChannel_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set News Channel.
		@param CM_NewsChannel_ID 
		News channel for rss feed
	  */
	public void setCM_NewsChannel_ID (int CM_NewsChannel_ID)
	{
		if (CM_NewsChannel_ID < 1)
			 throw new IllegalArgumentException ("CM_NewsChannel_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_CM_NewsChannel_ID, Integer.valueOf(CM_NewsChannel_ID));
	}

	/** Get News Channel.
		@return News channel for rss feed
	  */
	public int getCM_NewsChannel_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_CM_NewsChannel_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}
}