/******************************************************************************
 * (C) eCareSoft, LLC.                                                        *
 ******************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for EXME_Egresos
 *  @author Generated Class 
 *  @version Release 1.2
 */
public interface I_EXME_Egresos 
{

    /** TableName=EXME_Egresos */
    public static final String Table_Name = "EXME_Egresos";

    /** AD_Table_ID=1200007 */
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

    /** Column name Consecutivo */
    public static final String COLUMNNAME_Consecutivo = "Consecutivo";

	/** Set Consecutive.
	  * Consecutive
	  */
	public void setConsecutivo (int Consecutivo);

	/** Get Consecutive.
	  * Consecutive
	  */
	public int getConsecutivo();

    /** Column name CtasCor */
    public static final String COLUMNNAME_CtasCor = "CtasCor";

	/** Set Current Account.
	  * Current Account Responsible of Authorize
	  */
	public void setCtasCor (String CtasCor);

	/** Get Current Account.
	  * Current Account Responsible of Authorize
	  */
	public String getCtasCor();

    /** Column name Diagnostico1 */
    public static final String COLUMNNAME_Diagnostico1 = "Diagnostico1";

	/** Set Diagnostic 1	  */
	public void setDiagnostico1 (String Diagnostico1);

	/** Get Diagnostic 1	  */
	public String getDiagnostico1();

    /** Column name Diagnostico2 */
    public static final String COLUMNNAME_Diagnostico2 = "Diagnostico2";

	/** Set Diagnostic 2	  */
	public void setDiagnostico2 (String Diagnostico2);

	/** Get Diagnostic 2	  */
	public String getDiagnostico2();

    /** Column name Diagnostico3 */
    public static final String COLUMNNAME_Diagnostico3 = "Diagnostico3";

	/** Set Diagnostic 3	  */
	public void setDiagnostico3 (String Diagnostico3);

	/** Get Diagnostic 3	  */
	public String getDiagnostico3();

    /** Column name Diagnostico4 */
    public static final String COLUMNNAME_Diagnostico4 = "Diagnostico4";

	/** Set Diagnostic 4	  */
	public void setDiagnostico4 (String Diagnostico4);

	/** Get Diagnostic 4	  */
	public String getDiagnostico4();

    /** Column name EXME_Cama_ID */
    public static final String COLUMNNAME_EXME_Cama_ID = "EXME_Cama_ID";

	/** Set Bed.
	  * Bed
	  */
	public void setEXME_Cama_ID (int EXME_Cama_ID);

	/** Get Bed.
	  * Bed
	  */
	public int getEXME_Cama_ID();

    /** Column name EXME_CtaPac_ID */
    public static final String COLUMNNAME_EXME_CtaPac_ID = "EXME_CtaPac_ID";

	/** Set Patient Account.
	  * Patient Account
	  */
	public void setEXME_CtaPac_ID (int EXME_CtaPac_ID);

	/** Get Patient Account.
	  * Patient Account
	  */
	public int getEXME_CtaPac_ID();

	public I_EXME_CtaPac getEXME_CtaPac() throws RuntimeException;

    /** Column name EXME_Diagnostico_ID */
    public static final String COLUMNNAME_EXME_Diagnostico_ID = "EXME_Diagnostico_ID";

	/** Set Diagnosis.
	  * Diagnosis
	  */
	public void setEXME_Diagnostico_ID (int EXME_Diagnostico_ID);

	/** Get Diagnosis.
	  * Diagnosis
	  */
	public int getEXME_Diagnostico_ID();

    /** Column name EXME_Egresos_ID */
    public static final String COLUMNNAME_EXME_Egresos_ID = "EXME_Egresos_ID";

	/** Set Discharges.
	  * Discharges
	  */
	public void setEXME_Egresos_ID (int EXME_Egresos_ID);

	/** Get Discharges.
	  * Discharges
	  */
	public int getEXME_Egresos_ID();

    /** Column name EXME_EstServ_ID */
    public static final String COLUMNNAME_EXME_EstServ_ID = "EXME_EstServ_ID";

	/** Set Service Station.
	  * Service Station
	  */
	public void setEXME_EstServ_ID (int EXME_EstServ_ID);

	/** Get Service Station.
	  * Service Station
	  */
	public int getEXME_EstServ_ID();

	public I_EXME_EstServ getEXME_EstServ() throws RuntimeException;

    /** Column name EXME_Hist_Exp_ID */
    public static final String COLUMNNAME_EXME_Hist_Exp_ID = "EXME_Hist_Exp_ID";

	/** Set Medical File.
	  * Medical File
	  */
	public void setEXME_Hist_Exp_ID (int EXME_Hist_Exp_ID);

	/** Get Medical File.
	  * Medical File
	  */
	public int getEXME_Hist_Exp_ID();

    /** Column name EXME_MotivoEgreso_ID */
    public static final String COLUMNNAME_EXME_MotivoEgreso_ID = "EXME_MotivoEgreso_ID";

	/** Set Discharge Reason	  */
	public void setEXME_MotivoEgreso_ID (int EXME_MotivoEgreso_ID);

	/** Get Discharge Reason	  */
	public int getEXME_MotivoEgreso_ID();

    /** Column name EXME_Paciente_ID */
    public static final String COLUMNNAME_EXME_Paciente_ID = "EXME_Paciente_ID";

	/** Set Patient.
	  * Patient
	  */
	public void setEXME_Paciente_ID (int EXME_Paciente_ID);

	/** Get Patient.
	  * Patient
	  */
	public int getEXME_Paciente_ID();

    /** Column name Fecha */
    public static final String COLUMNNAME_Fecha = "Fecha";

	/** Set Date.
	  * Date
	  */
	public void setFecha (Timestamp Fecha);

	/** Get Date.
	  * Date
	  */
	public Timestamp getFecha();

    /** Column name IsPrinted */
    public static final String COLUMNNAME_IsPrinted = "IsPrinted";

	/** Set Printed.
	  * Indicates if this document / line is printed
	  */
	public void setIsPrinted (String IsPrinted);

	/** Get Printed.
	  * Indicates if this document / line is printed
	  */
	public String getIsPrinted();

    /** Column name Motivo */
    public static final String COLUMNNAME_Motivo = "Motivo";

	/** Set Motive.
	  * Motive / Reason
	  */
	public void setMotivo (String Motivo);

	/** Get Motive.
	  * Motive / Reason
	  */
	public String getMotivo();

    /** Column name Nombre_Pac */
    public static final String COLUMNNAME_Nombre_Pac = "Nombre_Pac";

	/** Set Patient Name.
	  * Patient Name
	  */
	public void setNombre_Pac (String Nombre_Pac);

	/** Get Patient Name.
	  * Patient Name
	  */
	public String getNombre_Pac();

    /** Column name ServClin */
    public static final String COLUMNNAME_ServClin = "ServClin";

	/** Set Servicios Clinicos.
	  * Servicios Clinicos
	  */
	public void setServClin (String ServClin);

	/** Get Servicios Clinicos.
	  * Servicios Clinicos
	  */
	public String getServClin();

    /** Column name TipoArea */
    public static final String COLUMNNAME_TipoArea = "TipoArea";

	/** Set Area Type.
	  * Admission Area Type
	  */
	public void setTipoArea (String TipoArea);

	/** Get Area Type.
	  * Admission Area Type
	  */
	public String getTipoArea();

    /** Column name TS */
    public static final String COLUMNNAME_TS = "TS";

	/** Set Social Worker.
	  * Social Worker
	  */
	public void setTS (String TS);

	/** Get Social Worker.
	  * Social Worker
	  */
	public String getTS();

    /** Column name VisBueno */
    public static final String COLUMNNAME_VisBueno = "VisBueno";

	/** Set OK	  */
	public void setVisBueno (String VisBueno);

	/** Get OK	  */
	public String getVisBueno();
}
