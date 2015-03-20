/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.lang.reflect.Constructor;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import org.compiere.util.KeyNamePair;

/** Generated Model for AD_Issue
 *  @author Generated Class 
 *  @version Release 1.2 - $Id$ */
public class X_AD_Issue extends PO implements I_AD_Issue, I_Persistent 
{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

    /** Standard Constructor */
    public X_AD_Issue (Properties ctx, int AD_Issue_ID, String trxName)
    {
      super (ctx, AD_Issue_ID, trxName);
      /** if (AD_Issue_ID == 0)
        {
			setAD_Issue_ID (0);
			setIssueSummary (null);
			setName (null);
// .
			setProcessed (false);
// N
			setReleaseNo (null);
// .
			setSystemStatus (null);
// E
			setUserName (null);
// .
			setVersion (null);
// .
        } */
    }

    /** Load Constructor */
    public X_AD_Issue (Properties ctx, ResultSet rs, String trxName)
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
      StringBuffer sb = new StringBuffer ("X_AD_Issue[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_A_Asset getA_Asset() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_A_Asset.Table_Name);
        I_A_Asset result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_A_Asset)constructor.newInstance(new Object[] {getCtx(), new Integer(getA_Asset_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Asset.
		@param A_Asset_ID 
		Asset used internally or by customers
	  */
	public void setA_Asset_ID (int A_Asset_ID)
	{
		if (A_Asset_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_A_Asset_ID, Integer.valueOf(A_Asset_ID));
	}

	/** Get Asset.
		@return Asset used internally or by customers
	  */
	public int getA_Asset_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_A_Asset_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Form getAD_Form() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Form.Table_Name);
        I_AD_Form result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Form)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Form_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Special Form.
		@param AD_Form_ID 
		Special Form
	  */
	public void setAD_Form_ID (int AD_Form_ID)
	{
		if (AD_Form_ID < 1) 
			set_Value (COLUMNNAME_AD_Form_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Form_ID, Integer.valueOf(AD_Form_ID));
	}

	/** Get Special Form.
		@return Special Form
	  */
	public int getAD_Form_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Form_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set System Issue.
		@param AD_Issue_ID 
		Automatically created or manually entered System Issue
	  */
	public void setAD_Issue_ID (int AD_Issue_ID)
	{
		if (AD_Issue_ID < 1)
			 throw new IllegalArgumentException ("AD_Issue_ID is mandatory.");
		set_ValueNoCheck (COLUMNNAME_AD_Issue_ID, Integer.valueOf(AD_Issue_ID));
	}

	/** Get System Issue.
		@return Automatically created or manually entered System Issue
	  */
	public int getAD_Issue_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Issue_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Process getAD_Process() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Process.Table_Name);
        I_AD_Process result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Process)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Process_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Process.
		@param AD_Process_ID 
		Process or Report
	  */
	public void setAD_Process_ID (int AD_Process_ID)
	{
		if (AD_Process_ID < 1) 
			set_Value (COLUMNNAME_AD_Process_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Process_ID, Integer.valueOf(AD_Process_ID));
	}

	/** Get Process.
		@return Process or Report
	  */
	public int getAD_Process_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Process_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_AD_Window getAD_Window() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_AD_Window.Table_Name);
        I_AD_Window result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_AD_Window)constructor.newInstance(new Object[] {getCtx(), new Integer(getAD_Window_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Window.
		@param AD_Window_ID 
		Data entry or display window
	  */
	public void setAD_Window_ID (int AD_Window_ID)
	{
		if (AD_Window_ID < 1) 
			set_Value (COLUMNNAME_AD_Window_ID, null);
		else 
			set_Value (COLUMNNAME_AD_Window_ID, Integer.valueOf(AD_Window_ID));
	}

	/** Get Window.
		@return Data entry or display window
	  */
	public int getAD_Window_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_Window_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comments.
		@param Comments 
		Comments or additional information
	  */
	public void setComments (String Comments)
	{
		set_Value (COLUMNNAME_Comments, Comments);
	}

	/** Get Comments.
		@return Comments or additional information
	  */
	public String getComments () 
	{
		return (String)get_Value(COLUMNNAME_Comments);
	}

	/** Set DatabaseInfo.
		@param DatabaseInfo 
		Database Information
	  */
	public void setDatabaseInfo (String DatabaseInfo)
	{
		set_ValueNoCheck (COLUMNNAME_DatabaseInfo, DatabaseInfo);
	}

	/** Get DatabaseInfo.
		@return Database Information
	  */
	public String getDatabaseInfo () 
	{
		return (String)get_Value(COLUMNNAME_DatabaseInfo);
	}

	/** Set DB Address.
		@param DBAddress 
		JDBC URL of the database server
	  */
	public void setDBAddress (String DBAddress)
	{
		set_ValueNoCheck (COLUMNNAME_DBAddress, DBAddress);
	}

	/** Get DB Address.
		@return JDBC URL of the database server
	  */
	public String getDBAddress () 
	{
		return (String)get_Value(COLUMNNAME_DBAddress);
	}

	/** Set Error Trace.
		@param ErrorTrace 
		System Error Trace
	  */
	public void setErrorTrace (String ErrorTrace)
	{
		set_Value (COLUMNNAME_ErrorTrace, ErrorTrace);
	}

	/** Get Error Trace.
		@return System Error Trace
	  */
	public String getErrorTrace () 
	{
		return (String)get_Value(COLUMNNAME_ErrorTrace);
	}

	/** IsReproducible AD_Reference_ID=319 */
	public static final int ISREPRODUCIBLE_AD_Reference_ID=319;
	/** Yes = Y */
	public static final String ISREPRODUCIBLE_Yes = "Y";
	/** No = N */
	public static final String ISREPRODUCIBLE_No = "N";
	/** Set Reproducible.
		@param IsReproducible 
		Problem can re reproduced in Gardenworld
	  */
	public void setIsReproducible (String IsReproducible)
	{

		if (IsReproducible == null || IsReproducible.equals("Y") || IsReproducible.equals("N")); else throw new IllegalArgumentException ("IsReproducible Invalid value - " + IsReproducible + " - Reference_ID=319 - Y - N");		set_Value (COLUMNNAME_IsReproducible, IsReproducible);
	}

	/** Get Reproducible.
		@return Problem can re reproduced in Gardenworld
	  */
	public String getIsReproducible () 
	{
		return (String)get_Value(COLUMNNAME_IsReproducible);
	}

	/** IssueSource AD_Reference_ID=104 */
	public static final int ISSUESOURCE_AD_Reference_ID=104;
	/** Window = W */
	public static final String ISSUESOURCE_Window = "W";
	/** Task = T */
	public static final String ISSUESOURCE_Task = "T";
	/** WorkFlow = F */
	public static final String ISSUESOURCE_WorkFlow = "F";
	/** Process = P */
	public static final String ISSUESOURCE_Process = "P";
	/** Report = R */
	public static final String ISSUESOURCE_Report = "R";
	/** Form = X */
	public static final String ISSUESOURCE_Form = "X";
	/** Workbench = B */
	public static final String ISSUESOURCE_Workbench = "B";
	/** Struts = S */
	public static final String ISSUESOURCE_Struts = "S";
	/** Set Source.
		@param IssueSource 
		Issue Source
	  */
	public void setIssueSource (String IssueSource)
	{

		if (IssueSource == null || IssueSource.equals("W") || IssueSource.equals("T") || IssueSource.equals("F") || IssueSource.equals("P") || IssueSource.equals("R") || IssueSource.equals("X") || IssueSource.equals("B") || IssueSource.equals("S")); else throw new IllegalArgumentException ("IssueSource Invalid value - " + IssueSource + " - Reference_ID=104 - W - T - F - P - R - X - B - S");		set_Value (COLUMNNAME_IssueSource, IssueSource);
	}

	/** Get Source.
		@return Issue Source
	  */
	public String getIssueSource () 
	{
		return (String)get_Value(COLUMNNAME_IssueSource);
	}

	/** Set Issue Summary.
		@param IssueSummary 
		Issue Summary
	  */
	public void setIssueSummary (String IssueSummary)
	{
		if (IssueSummary == null)
			throw new IllegalArgumentException ("IssueSummary is mandatory.");
		set_Value (COLUMNNAME_IssueSummary, IssueSummary);
	}

	/** Get Issue Summary.
		@return Issue Summary
	  */
	public String getIssueSummary () 
	{
		return (String)get_Value(COLUMNNAME_IssueSummary);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair() 
    {
        return new KeyNamePair(get_ID(), getIssueSummary());
    }

	/** IsVanillaSystem AD_Reference_ID=319 */
	public static final int ISVANILLASYSTEM_AD_Reference_ID=319;
	/** Yes = Y */
	public static final String ISVANILLASYSTEM_Yes = "Y";
	/** No = N */
	public static final String ISVANILLASYSTEM_No = "N";
	/** Set Vanilla System.
		@param IsVanillaSystem 
		The system was NOT compiled from Source - i.e. standard distribution
	  */
	public void setIsVanillaSystem (String IsVanillaSystem)
	{

		if (IsVanillaSystem == null || IsVanillaSystem.equals("Y") || IsVanillaSystem.equals("N")); else throw new IllegalArgumentException ("IsVanillaSystem Invalid value - " + IsVanillaSystem + " - Reference_ID=319 - Y - N");		set_Value (COLUMNNAME_IsVanillaSystem, IsVanillaSystem);
	}

	/** Get Vanilla System.
		@return The system was NOT compiled from Source - i.e. standard distribution
	  */
	public String getIsVanillaSystem () 
	{
		return (String)get_Value(COLUMNNAME_IsVanillaSystem);
	}

	/** Set Java Info.
		@param JavaInfo 
		Java Version Info
	  */
	public void setJavaInfo (String JavaInfo)
	{
		set_ValueNoCheck (COLUMNNAME_JavaInfo, JavaInfo);
	}

	/** Get Java Info.
		@return Java Version Info
	  */
	public String getJavaInfo () 
	{
		return (String)get_Value(COLUMNNAME_JavaInfo);
	}

	/** Set Line.
		@param LineNo 
		Line No
	  */
	public void setLineNo (int LineNo)
	{
		set_Value (COLUMNNAME_LineNo, Integer.valueOf(LineNo));
	}

	/** Get Line.
		@return Line No
	  */
	public int getLineNo () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LineNo);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Local Host.
		@param Local_Host 
		Local Host Info
	  */
	public void setLocal_Host (String Local_Host)
	{
		set_ValueNoCheck (COLUMNNAME_Local_Host, Local_Host);
	}

	/** Get Local Host.
		@return Local Host Info
	  */
	public String getLocal_Host () 
	{
		return (String)get_Value(COLUMNNAME_Local_Host);
	}

	/** Set Logger.
		@param LoggerName 
		Logger Name
	  */
	public void setLoggerName (String LoggerName)
	{
		set_Value (COLUMNNAME_LoggerName, LoggerName);
	}

	/** Get Logger.
		@return Logger Name
	  */
	public String getLoggerName () 
	{
		return (String)get_Value(COLUMNNAME_LoggerName);
	}

	/** Set Name.
		@param Name 
		Alphanumeric identifier of the entity
	  */
	public void setName (String Name)
	{
		if (Name == null)
			throw new IllegalArgumentException ("Name is mandatory.");
		set_ValueNoCheck (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName () 
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Operating System.
		@param OperatingSystemInfo 
		Operating System Info
	  */
	public void setOperatingSystemInfo (String OperatingSystemInfo)
	{
		set_ValueNoCheck (COLUMNNAME_OperatingSystemInfo, OperatingSystemInfo);
	}

	/** Get Operating System.
		@return Operating System Info
	  */
	public String getOperatingSystemInfo () 
	{
		return (String)get_Value(COLUMNNAME_OperatingSystemInfo);
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_ValueNoCheck (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now	  */
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing () 
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Profile.
		@param ProfileInfo 
		Information to help profiling the system for solving support issues
	  */
	public void setProfileInfo (String ProfileInfo)
	{
		set_ValueNoCheck (COLUMNNAME_ProfileInfo, ProfileInfo);
	}

	/** Get Profile.
		@return Information to help profiling the system for solving support issues
	  */
	public String getProfileInfo () 
	{
		return (String)get_Value(COLUMNNAME_ProfileInfo);
	}

	/** Set Record ID.
		@param Record_ID 
		Direct internal record ID
	  */
	public void setRecord_ID (int Record_ID)
	{
		if (Record_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_Record_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_Record_ID, Integer.valueOf(Record_ID));
	}

	/** Get Record ID.
		@return Direct internal record ID
	  */
	public int getRecord_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Record_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Release No.
		@param ReleaseNo 
		Internal Release Number
	  */
	public void setReleaseNo (String ReleaseNo)
	{
		if (ReleaseNo == null)
			throw new IllegalArgumentException ("ReleaseNo is mandatory.");
		set_ValueNoCheck (COLUMNNAME_ReleaseNo, ReleaseNo);
	}

	/** Get Release No.
		@return Internal Release Number
	  */
	public String getReleaseNo () 
	{
		return (String)get_Value(COLUMNNAME_ReleaseNo);
	}

	/** Set Release Tag.
		@param ReleaseTag 
		Release Tag
	  */
	public void setReleaseTag (String ReleaseTag)
	{
		set_Value (COLUMNNAME_ReleaseTag, ReleaseTag);
	}

	/** Get Release Tag.
		@return Release Tag
	  */
	public String getReleaseTag () 
	{
		return (String)get_Value(COLUMNNAME_ReleaseTag);
	}

	/** Set Remote Addr.
		@param Remote_Addr 
		Remote Address
	  */
	public void setRemote_Addr (String Remote_Addr)
	{
		set_ValueNoCheck (COLUMNNAME_Remote_Addr, Remote_Addr);
	}

	/** Get Remote Addr.
		@return Remote Address
	  */
	public String getRemote_Addr () 
	{
		return (String)get_Value(COLUMNNAME_Remote_Addr);
	}

	/** Set Remote Host.
		@param Remote_Host 
		Remote host Info
	  */
	public void setRemote_Host (String Remote_Host)
	{
		set_ValueNoCheck (COLUMNNAME_Remote_Host, Remote_Host);
	}

	/** Get Remote Host.
		@return Remote host Info
	  */
	public String getRemote_Host () 
	{
		return (String)get_Value(COLUMNNAME_Remote_Host);
	}

	/** Set Request Document No.
		@param RequestDocumentNo 
		Compiere Request Document No
	  */
	public void setRequestDocumentNo (String RequestDocumentNo)
	{
		set_ValueNoCheck (COLUMNNAME_RequestDocumentNo, RequestDocumentNo);
	}

	/** Get Request Document No.
		@return Compiere Request Document No
	  */
	public String getRequestDocumentNo () 
	{
		return (String)get_Value(COLUMNNAME_RequestDocumentNo);
	}

	/** Set Response Text.
		@param ResponseText 
		Request Response Text
	  */
	public void setResponseText (String ResponseText)
	{
		set_ValueNoCheck (COLUMNNAME_ResponseText, ResponseText);
	}

	/** Get Response Text.
		@return Request Response Text
	  */
	public String getResponseText () 
	{
		return (String)get_Value(COLUMNNAME_ResponseText);
	}

	public I_R_IssueKnown getR_IssueKnown() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_R_IssueKnown.Table_Name);
        I_R_IssueKnown result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_R_IssueKnown)constructor.newInstance(new Object[] {getCtx(), new Integer(getR_IssueKnown_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Known Issue.
		@param R_IssueKnown_ID 
		Known Issue
	  */
	public void setR_IssueKnown_ID (int R_IssueKnown_ID)
	{
		if (R_IssueKnown_ID < 1) 
			set_Value (COLUMNNAME_R_IssueKnown_ID, null);
		else 
			set_Value (COLUMNNAME_R_IssueKnown_ID, Integer.valueOf(R_IssueKnown_ID));
	}

	/** Get Known Issue.
		@return Known Issue
	  */
	public int getR_IssueKnown_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueKnown_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_R_IssueProject getR_IssueProject() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_R_IssueProject.Table_Name);
        I_R_IssueProject result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_R_IssueProject)constructor.newInstance(new Object[] {getCtx(), new Integer(getR_IssueProject_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Issue Project.
		@param R_IssueProject_ID 
		Implementation Projects
	  */
	public void setR_IssueProject_ID (int R_IssueProject_ID)
	{
		if (R_IssueProject_ID < 1) 
			set_Value (COLUMNNAME_R_IssueProject_ID, null);
		else 
			set_Value (COLUMNNAME_R_IssueProject_ID, Integer.valueOf(R_IssueProject_ID));
	}

	/** Get Issue Project.
		@return Implementation Projects
	  */
	public int getR_IssueProject_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueProject_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_R_IssueSystem getR_IssueSystem() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_R_IssueSystem.Table_Name);
        I_R_IssueSystem result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_R_IssueSystem)constructor.newInstance(new Object[] {getCtx(), new Integer(getR_IssueSystem_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Issue System.
		@param R_IssueSystem_ID 
		System creating the issue
	  */
	public void setR_IssueSystem_ID (int R_IssueSystem_ID)
	{
		if (R_IssueSystem_ID < 1) 
			set_Value (COLUMNNAME_R_IssueSystem_ID, null);
		else 
			set_Value (COLUMNNAME_R_IssueSystem_ID, Integer.valueOf(R_IssueSystem_ID));
	}

	/** Get Issue System.
		@return System creating the issue
	  */
	public int getR_IssueSystem_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueSystem_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_R_IssueUser getR_IssueUser() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_R_IssueUser.Table_Name);
        I_R_IssueUser result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_R_IssueUser)constructor.newInstance(new Object[] {getCtx(), new Integer(getR_IssueUser_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set IssueUser.
		@param R_IssueUser_ID 
		User who reported issues
	  */
	public void setR_IssueUser_ID (int R_IssueUser_ID)
	{
		if (R_IssueUser_ID < 1) 
			set_Value (COLUMNNAME_R_IssueUser_ID, null);
		else 
			set_Value (COLUMNNAME_R_IssueUser_ID, Integer.valueOf(R_IssueUser_ID));
	}

	/** Get IssueUser.
		@return User who reported issues
	  */
	public int getR_IssueUser_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_IssueUser_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_R_Request getR_Request() throws RuntimeException 
    {
        Class<?> clazz = MTable.getClass(I_R_Request.Table_Name);
        I_R_Request result = null;
        try	{
	        Constructor<?> constructor = null;
	    	constructor = clazz.getDeclaredConstructor(new Class[]{Properties.class, int.class, String.class});
    	    result = (I_R_Request)constructor.newInstance(new Object[] {getCtx(), new Integer(getR_Request_ID()), get_TrxName()});
        } catch (Exception e) {
	        log.log(Level.SEVERE, "(id) - Table=" + Table_Name + ",Class=" + clazz, e);
	        log.saveError("Error", "Table=" + Table_Name + ",Class=" + clazz);
           throw new RuntimeException( e );
        }
        return result;
    }

	/** Set Request.
		@param R_Request_ID 
		Request from a Business Partner or Prospect
	  */
	public void setR_Request_ID (int R_Request_ID)
	{
		if (R_Request_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_R_Request_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_R_Request_ID, Integer.valueOf(R_Request_ID));
	}

	/** Get Request.
		@return Request from a Business Partner or Prospect
	  */
	public int getR_Request_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_R_Request_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Source Class.
		@param SourceClassName 
		Source Class Name
	  */
	public void setSourceClassName (String SourceClassName)
	{
		set_Value (COLUMNNAME_SourceClassName, SourceClassName);
	}

	/** Get Source Class.
		@return Source Class Name
	  */
	public String getSourceClassName () 
	{
		return (String)get_Value(COLUMNNAME_SourceClassName);
	}

	/** Set Source Method.
		@param SourceMethodName 
		Source Method Name
	  */
	public void setSourceMethodName (String SourceMethodName)
	{
		set_Value (COLUMNNAME_SourceMethodName, SourceMethodName);
	}

	/** Get Source Method.
		@return Source Method Name
	  */
	public String getSourceMethodName () 
	{
		return (String)get_Value(COLUMNNAME_SourceMethodName);
	}

	/** Set Stack Trace.
		@param StackTrace 
		System Log Trace
	  */
	public void setStackTrace (String StackTrace)
	{
		set_Value (COLUMNNAME_StackTrace, StackTrace);
	}

	/** Get Stack Trace.
		@return System Log Trace
	  */
	public String getStackTrace () 
	{
		return (String)get_Value(COLUMNNAME_StackTrace);
	}

	/** Set Statistics.
		@param StatisticsInfo 
		Information to help profiling the system for solving support issues
	  */
	public void setStatisticsInfo (String StatisticsInfo)
	{
		set_ValueNoCheck (COLUMNNAME_StatisticsInfo, StatisticsInfo);
	}

	/** Get Statistics.
		@return Information to help profiling the system for solving support issues
	  */
	public String getStatisticsInfo () 
	{
		return (String)get_Value(COLUMNNAME_StatisticsInfo);
	}

	/** Set Support EMail.
		@param SupportEMail 
		EMail address to send support information and updates to
	  */
	public void setSupportEMail (String SupportEMail)
	{
		set_Value (COLUMNNAME_SupportEMail, SupportEMail);
	}

	/** Get Support EMail.
		@return EMail address to send support information and updates to
	  */
	public String getSupportEMail () 
	{
		return (String)get_Value(COLUMNNAME_SupportEMail);
	}

	/** SystemStatus AD_Reference_ID=374 */
	public static final int SYSTEMSTATUS_AD_Reference_ID=374;
	/** Evaluation = E */
	public static final String SYSTEMSTATUS_Evaluation = "E";
	/** Implementation = I */
	public static final String SYSTEMSTATUS_Implementation = "I";
	/** Production = P */
	public static final String SYSTEMSTATUS_Production = "P";
	/** Set System Status.
		@param SystemStatus 
		Status of the system - Support priority depends on system status
	  */
	public void setSystemStatus (String SystemStatus)
	{
		if (SystemStatus == null) throw new IllegalArgumentException ("SystemStatus is mandatory");
		if (SystemStatus.equals("E") || SystemStatus.equals("I") || SystemStatus.equals("P")); else throw new IllegalArgumentException ("SystemStatus Invalid value - " + SystemStatus + " - Reference_ID=374 - E - I - P");		set_Value (COLUMNNAME_SystemStatus, SystemStatus);
	}

	/** Get System Status.
		@return Status of the system - Support priority depends on system status
	  */
	public String getSystemStatus () 
	{
		return (String)get_Value(COLUMNNAME_SystemStatus);
	}

	/** Set Registered EMail.
		@param UserName 
		Email of the responsible for the System
	  */
	public void setUserName (String UserName)
	{
		if (UserName == null)
			throw new IllegalArgumentException ("UserName is mandatory.");
		set_ValueNoCheck (COLUMNNAME_UserName, UserName);
	}

	/** Get Registered EMail.
		@return Email of the responsible for the System
	  */
	public String getUserName () 
	{
		return (String)get_Value(COLUMNNAME_UserName);
	}

	/** Set Version.
		@param Version 
		Version of the table definition
	  */
	public void setVersion (String Version)
	{
		if (Version == null)
			throw new IllegalArgumentException ("Version is mandatory.");
		set_ValueNoCheck (COLUMNNAME_Version, Version);
	}

	/** Get Version.
		@return Version of the table definition
	  */
	public String getVersion () 
	{
		return (String)get_Value(COLUMNNAME_Version);
	}
}