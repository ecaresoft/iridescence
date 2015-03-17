package org.compiere.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;

import org.compiere.model.MEXMEParamMetricas;
import org.compiere.util.DB;
import org.compiere.util.Msg;

/**
 * Genera xml preventive care measures group
 * @author Rosy Velazquez
 */
public class GeneraPreventiveCare extends SvrProcess{

	private int age = 0; //influenza
	private int ageImc = 0;
	private int ageNeumonia = 0;
	private int ageBreastFrom = 0;
	private int ageBreastTo = 0;
	private int ageColorectalFrom = 0;
	private int ageColorectalTo = 0;
	private int ageSmokers = 0;
	
	//Vacunas
	private int vacunaID = 0; //Influenza ??
	private int vacunaNeumoniaID = 0;
	
	//Estudios
	private int breastCancerID = 0; //m_product
	private int colorectalCancerID = 0; //m_product
	
	private Date fechaIni; //para busqueda en querie
	private Date fechaFin; //para busqueda en querie
	private String optionRegistry="";
	private String version = "";
	//private Date fechaMin; //encontrada en querie
	//private Date fechaMax; //encontrada en querie
	
	//private final static String INFLUENZA_ADMINISTRATED = "G8482";
	//private final static String INFLUENZA_NOADMINISTRATED_DOC = "G8483";
	//private final static String INFLUENZA_NOADMINISTRATED_NODOC = "G8484";
	private final static String PQRI_NUMBER_INFLUENZA = "110";
	private final static String PQRI_NUMBER_NEUMONIA = "111";
	private final static String PQRI_NUMBER_MAMMOGRAM = "112";
	private final static String PQRI_NUMBER_COLORECTALCANCER = "113";
	private final static String PQRI_NUMBER_SMOKERS = "115";
	private final static String PQRI_NUMBER_IMC = "128";
		
	private String archivo = "Preventive_Care";
	private String measureGroup = "D"; //(Preventive Care)
	
	Calendar hoy = new GregorianCalendar();
	String hoyStr = "";
	
	SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
	//Envio para armar xml	
		
	protected String doIt() throws Exception {
		String msj = "";
		
		MEXMEParamMetricas param = MEXMEParamMetricas.getParamMetricas(getCtx(), get_TrxName());
		if(param == null){
			msj = Msg.getMsg(this.getCtx(), "NoParam"); 
			return msj;
		}
		
		//Asignar a los campos los valores de parametros.
		age = param.getAge_Immunization();
		ageBreastFrom = param.getAge_BreastFrom();
		ageBreastTo = param.getAge_BreastTo();
		ageColorectalFrom = param.getAge_ColorectalFrom();
		ageColorectalTo = param.getAge_ColorectalTo();
		ageImc = param.getAge_BMI();
		ageNeumonia = param.getAge_Pneumonia();
		ageSmokers = param.getAge_Tobacco();
		
		vacunaID = param.getEXME_VacunaInfluenza_ID();
		vacunaNeumoniaID = param.getEXME_VacunaPneumonia_ID();
		
		breastCancerID = param.getM_Product_BreastCancer_ID();
		colorectalCancerID = param.getM_Product_ColorectalCancer_ID();
		
		hoy = Calendar.getInstance();
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
		hoyStr = f.format(hoy.getTimeInMillis());
		
		asignaPeriodoMedida();					
		
		GeneraXmlMetrica xml = new GeneraXmlMetrica(getCtx());
		List<String[]> pqris = new ArrayList<String[]>();
		pqris.add(pqri110());		
		pqris.add(pqri111());
		pqris.add(pqri112());
		pqris.add(pqri113());
		pqris.add(pqri115());
		pqris.add(pqri128());
		
		//TODO que periodo aplica para un grupo de medidas?	
		boolean generado = xml.armaXml(archivo, measureGroup, fechaIni, fechaFin, pqris, optionRegistry, version);	
		
		if(generado){
			msj = Msg.getMsg(this.getCtx(), "ArchivoGenerado");
			return msj;
		}else		
			msj = Msg.getMsg(this.getCtx(), "ArchivoNoGenerado");
			return msj;
	}
	
	/**
	 * Recibe parametros
	 */
	protected void prepare() {
		//Recibir parametros del proceso
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;							
			else if (name.equals("Date"))
			    para[i].getParameter().toString();	
			else if (name.equals("OptionRegistry"))
				optionRegistry = para[i].getParameter().toString();
			else if (name.equals("Version"))
				version = para[i].getParameter().toString();
			else
				log.log(Level.SEVERE, "prepare - Unknown Parameter: " + name);
		}		
	}

	/**
	 * Valida los peridos a tomar en cuenta para la medida de Influenza
	 * 1 Enero - 31 Agosto ... Sep-dic year before and ene-feb same year
	 * 1 Sept - 31 Dic ... Sept-dic same year
	 */
	protected void asignaPeriodoMedida(){
		Calendar hoy = Calendar.getInstance();
		
		Calendar iniRango1 = new GregorianCalendar();
		iniRango1.set(hoy.get(Calendar.YEAR), Calendar.JANUARY, 1); //January 1, same year
		Calendar finRango1 = new GregorianCalendar();
		finRango1.set(hoy.get(Calendar.YEAR), Calendar.AUGUST, 31); //August 31, same year
		
		Calendar iniRango2 = new GregorianCalendar();
		iniRango2.set(hoy.get(Calendar.YEAR), Calendar.SEPTEMBER, 1); //September 1, same year
		Calendar finRango2 = new GregorianCalendar();
		finRango2.set(hoy.get(Calendar.YEAR), Calendar.DECEMBER, 31); //December 31, same year
		
		Calendar rango1 = new GregorianCalendar();
		Calendar rango2 = new GregorianCalendar();
		
		if(hoy.after(iniRango1) && hoy.before(finRango1)){
			Calendar hoy2 = new GregorianCalendar();
			hoy2.set(hoy.get(Calendar.YEAR), hoy.get(Calendar.MONTH), hoy.get(Calendar.DATE));
			hoy2.add(Calendar.YEAR, -1); //Año anterior
								
			rango1.set(hoy2.get(Calendar.YEAR), Calendar.SEPTEMBER, 1); //September 1, before year
								
			int diasFebrero = isBisiesto(hoy.get(Calendar.YEAR)) ? 29 : 28; 
			rango2.set(hoy.get(Calendar.YEAR), Calendar.FEBRUARY, diasFebrero); //February ?, same year
						 			 
		}else if(hoy.after(iniRango2) && hoy.before(finRango2)){
			rango1.set(hoy.get(Calendar.YEAR), Calendar.SEPTEMBER, 1); //September 1, same year
			rango2.set(hoy.get(Calendar.YEAR), Calendar.DECEMBER, 31); //December 31, same year
		}
		
		fechaIni = new Date(rango1.getTimeInMillis());
		fechaFin = new Date(rango2.getTimeInMillis());
		
	}
	
	/**
	 * Calcula el numerador para la medida 110
	 * @return pacientes
	 */
	protected int executaQueryNumerator110(){
		
		int pacientes=0;
		String ini = format.format(fechaIni);
		String fin = format.format(fechaFin);				
		
		String sql = "SELECT COUNT(DISTINCT hv.exme_paciente_id) " +
						" FROM EXME_Hist_Vacuna hv inner join exme_paciente ep on ep.exme_paciente_id = hv.exme_paciente_id " +
						" WHERE hv.fechaaplica BETWEEN to_date('" + ini + "','MM/dd/yyyy') AND to_date('" + fin + "', 'MM/dd/yyyy') " +
						  "    AND hv.exme_vacuna_id = " + this.vacunaID + 
						  "    AND "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + this.age +
						  "    AND hv.isactive = 'Y' ";
		
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	/**
	 * Calcula el denominador para la medida 110
	 * @return
	 */
	protected int executaQueryDenominator110(){
		
		int pacientes = 0;
		String sql = "SELECT count(exme_paciente_id) " +
					" FROM EXME_Paciente ep " +
					" WHERE "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + this.age + 
					"       AND ep.isactive = 'Y'";
		
		pacientes = executaSql(sql);			
		
		return pacientes;
	}
	
	/**
	 * Calcula el numerador para la medida 111
	 * Percentage of patients aged 65 years and older who have ever received a pneumococcal vaccine
	 * @return pacientes
	 */
	protected int executaQueryNumerator111(){
		
		int pacientes=0;				
		
		String sql = "SELECT COUNT(DISTINCT hv.exme_paciente_id) " +
						" FROM EXME_Hist_Vacuna hv inner join exme_paciente ep on ep.exme_paciente_id = hv.exme_paciente_id " +
						" WHERE hv.exme_vacuna_id = " + this.vacunaNeumoniaID + 
						  "    AND "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + this.ageNeumonia +
						  "    AND hv.isactive = 'Y' ";
		
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	/**
	 * Calcula el denominador para la medida 111
	 * @return
	 */
	protected int executaQueryDenominator111(){
		
		int pacientes = 0;
		String sql = "SELECT count(ep.exme_paciente_id) " +
					" FROM EXME_Paciente ep " +
					" WHERE "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + this.ageNeumonia + 
					"       AND ep.isactive = 'Y'";
		
		pacientes = executaSql(sql);			
		
		return pacientes;
	}
	
	/**
	 * Calcula el numerador de la medida pqri 128
	 * @return pacientes
	 */
	protected int executaQueryNumerator128(){
		//El IMC se calcula de la fecha actual a seis meses atras.
		
		int pacientes=0;
		String ini = format.format(menosSeisMeses());
		String fin = format.format(new Date(hoy.getTimeInMillis()));				
		
		String sql = "SELECT COUNT(DISTINCT hv.exme_paciente_id) " +
						" FROM EXME_METRICAS_IMC hv inner join exme_paciente ep on ep.exme_paciente_id = hv.exme_paciente_id " +
						" WHERE hv.FECHA_IMC BETWEEN to_date('" + ini + "','MM/dd/yyyy') AND to_date('" + fin + "', 'MM/dd/yyyy') " +						
						  "    AND "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + ageImc;
				
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	/**
	 * Calcula el denominador para la medida 110
	 * @return
	 */
	protected int executaQueryDenominator128(){
		
		int pacientes = 0;
		String sql = "SELECT count(exme_paciente_id) " +
					" FROM EXME_Paciente ep " +
					" WHERE "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + this.ageImc +
					"       AND ep.isactive = 'Y'";
				
		pacientes = executaSql(sql);			
		
		return pacientes;
	}
	
	/**
	 * Calcula el numerador para la medida 112 [Breast Cancer]
	 * Percentage of women aged 40 through 69 years who had a mammogram to screen for breast cancer within 24 months.
	 * @return pacientes
	 */
	protected int executaQueryNumerador112(){
		
		int pacientes = 0;		
		
		String ini = format.format(menos24Meses());
		String fin = format.format(new Date(hoy.getTimeInMillis()));
		
		String sql = "SELECT COUNT(DISTINCT ep.exme_paciente_id) " +
				" FROM  EXME_ActPacienteInd AI INNER JOIN EXME_ACTPACIENTEINDH PH INNER JOIN exme_actpaciente AP INNER JOIN EXME_PACIENTE EP  " + 
				                                                                                              " ON EP.EXME_PACIENTE_ID = AP.EXME_PACIENTE_ID " +
				                                                               " ON AP.exme_actpaciente_id = PH.exme_actpaciente_id " +
				                            " ON ph.exme_actpacienteindh_id= AI.exme_actpacienteindh_id " +
				" WHERE ai.m_product_id = " + this.breastCancerID +
				     " AND "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" BETWEEN " + this.ageBreastFrom + " AND " + this.ageBreastTo +
				     " AND ep.sexo = 'F' " +
				     " AND ai.datedelivered BETWEEN to_date('" + ini + "', 'MM/dd/yyyy') AND to_date('" + fin + "', 'MM/dd/yyyy') " +
				     " AND ai.isactive = 'Y'";
				
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	/**
	 * Calcula el denominador para la medida 112 [Breast Cancer]
	 * Pacientes femenimos de un rango de edad y activos.
	 * @return pacientes
	 */
	protected int executaQueryDenominator112(){
		
		int pacientes = 0;
		
		String sql = "SELECT COUNT(EP.EXME_PACIENTE_ID) " +
					" FROM EXME_PACIENTE EP " +
					" WHERE "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" BETWEEN " + this.ageBreastFrom + " AND " + this.ageBreastTo +
					      " AND EP.sexo = 'F' " +
					      " AND EP.isactive = 'Y'";      				
				
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	/**
	 * Calcula el numerador para la medida 113 [Colorectal Cancer]
	 * Percentage of patients aged 50 through 75 years who received the appropriate colorectal cancer screening
	 * @return pacientes
	 */
	protected int executaQueryNumerador113(){
		
		int pacientes = 0;						
		String ini = format.format(menos24Meses());
		String fin = format.format(new Date(hoy.getTimeInMillis()));
		
		String sql = "SELECT COUNT(DISTINCT ep.exme_paciente_id) " +
				" FROM  EXME_ActPacienteInd AI INNER JOIN EXME_ACTPACIENTEINDH PH INNER JOIN exme_actpaciente AP INNER JOIN EXME_PACIENTE EP  " + 
				                                                                                              " ON EP.EXME_PACIENTE_ID = AP.EXME_PACIENTE_ID " +
				                                                               " ON AP.exme_actpaciente_id = PH.exme_actpaciente_id " +
				                            " ON ph.exme_actpacienteindh_id= AI.exme_actpacienteindh_id " +
				" WHERE ai.m_product_id = " + this.colorectalCancerID +
				     " AND "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" BETWEEN " + this.ageColorectalFrom + " AND " + this.ageColorectalTo +				     
				     " AND ai.datedelivered BETWEEN to_date('" + ini + "', 'MM/dd/yyyy') AND to_date('" + fin + "', 'MM/dd/yyyy') " +
				     " AND ai.isactive = 'Y'";
				
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	/**
	 * Calcula el denominador para la medida 113 [Colorectal Cancer]
	 * Patients who had at least one or more screenings for colorectal cancer during or prior to the reporting period
	 * @return pacientes
	 */
	protected int executaQueryDenominator113(){
		
		int pacientes = 0;
		
		String sql = "SELECT COUNT(EP.EXME_PACIENTE_ID) " +
					" FROM EXME_PACIENTE EP " +
					" WHERE "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" BETWEEN " + this.ageColorectalFrom + " AND " + this.ageColorectalTo +					      
					      " AND EP.isactive = 'Y'";      				
				
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	
	protected int executaQueryNumerador115(){
		int pacientes = 0;
		String sql = "SELECT COUNT(DISTINCT MF.exme_paciente_id) " + 
					 " FROM EXME_Metricas_Fumador MF inner join exme_paciente ep on ep.exme_paciente_id = mf.exme_paciente_id " + 
					 " WHERE MF.observaciones IS NOT NULL " + 
						   " AND "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= " + this.ageSmokers;
		
		pacientes = executaSql(sql);
		
		return pacientes;
	}
	
	/**
	 * Calcula el denominador para la medida 115 [Smokers and tobacco users]
	 * 
	 * @return pacientes
	 */
	protected int executaQueryDenominator115(){
		
		int pacientes = 0;
		
		String sql = "SELECT COUNT(EP.EXME_PACIENTE_ID) " +
					" FROM EXME_PACIENTE EP " +
					" WHERE "+DB.truncDate("exme_edad_anomes(to_char(ep.fechanac,'dd/MM/yyyy'), '" + hoyStr + "')")+" >= "  + this.ageSmokers +					      
					      " AND EP.isactive = 'Y'";      				
				
		pacientes = executaSql(sql);			
			
		return pacientes;
	}
	/**
	 * Executa un query
	 * @param sql
	 * @return pacientes
	 */
	protected int executaSql(String sql){
		int pacientes = 0;
		
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			pstmt = DB.prepareStatement(sql, null);				
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				pacientes = rs.getInt(1);			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//if (pstmt != null) pstmt.close();
			} catch (Exception e) {}
			pstmt = null;
		}	
		return pacientes;
	}
	
	/**
	 * Calcular seis meses atras a la fecha actual
	 * @return Date
	 */
	protected Date menosSeisMeses(){
		Calendar today = Calendar.getInstance();
		today.add(Calendar.MONTH, -6);
		
		return new Date(today.getTimeInMillis());
	}
	
	/**
	 * Calcular veinticuatro meses atras a la fecha actual
	 * @return Date
	 */
	protected Date menos24Meses(){
		Calendar today = Calendar.getInstance();
		today.add(Calendar.MONTH, -24);
		
		return new Date(today.getTimeInMillis());
	}
	
	/**
	 * Indica si el anio es bisiesto
	 * @param year
	 * @return boolean
	 */
	protected boolean isBisiesto(int year) {
	    return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
	}

	/**
	 * Arma pqri 128 - IMC
	 * @return pqri
	 */
	protected String[] pqri128(){
		String[] pqri = new String[5];
		pqri[0] = PQRI_NUMBER_IMC; //pqri_number
		int numerador = executaQueryNumerator128();
		pqri[1] = String.valueOf(numerador); //numerador
		
		int denominador = executaQueryDenominator128();
		pqri[2] = String.valueOf(denominador); //denominador
		
		pqri[3] = "0"; // exclusions
		pqri[4] = "0"; //not met
		
		return pqri;		
	}

	/**
	 * Arma el pqri 110 - influenza
	 * @return pqri
	 */
	protected String[] pqri110(){
		String[] pqri = new String[5];
		pqri[0] = PQRI_NUMBER_INFLUENZA; //pqri_number
		int numerador = executaQueryNumerator110();
		pqri[1] = String.valueOf(numerador); //numerador
		
		int denominador = executaQueryDenominator110();
		pqri[2] = String.valueOf(denominador); //denominador
		pqri[3] = "0"; // exclusions
		pqri[4] = "0"; //not met
		
		return pqri;		
	}
	
	/**
	 * Arma el pqri 111 - pneumonia
	 * Percentage of patients aged 65 years and older who have ever received a pneumococcal vaccine
	 * @return pqri
	 */
	protected String[] pqri111(){
		String[] pqri = new String[5];
		pqri[0] = PQRI_NUMBER_NEUMONIA; //pqri_number
		int numerador = executaQueryNumerator111();
		pqri[1] = String.valueOf(numerador); //numerador
		
		int denominador = executaQueryDenominator111();
		pqri[2] = String.valueOf(denominador); //denominador
		pqri[3] = "0"; // exclusions
		pqri[4] = "0"; //not met
		
		return pqri;		
	}
	
	/**
	 * Arma el pqri 112 - mammogram
	 * @return pqri
	 */
	protected String[] pqri112(){
		String[] pqri = new String[5];
		pqri[0] = PQRI_NUMBER_MAMMOGRAM; //pqri_number
		int numerador = executaQueryNumerador112();
		pqri[1] = String.valueOf(numerador); //numerador
		
		int denominador = executaQueryDenominator112();
		pqri[2] = String.valueOf(denominador); //denominador
		pqri[3] = "0"; // exclusions
		pqri[4] = "0"; //not met
		
		return pqri;		
	}
	
	/**
	 * Arma el pqri 113 - COLORECTAL CANCER
	 * @return pqri
	 */
	protected String[] pqri113(){
		String[] pqri = new String[5];
		pqri[0] = PQRI_NUMBER_COLORECTALCANCER; //pqri_number
		int numerador = executaQueryNumerador113();
		pqri[1] = String.valueOf(numerador); //numerador
		
		int denominador = executaQueryDenominator113();
		pqri[2] = String.valueOf(denominador); //denominador
		pqri[3] = "0"; // exclusions
		pqri[4] = "0"; //not met
		
		return pqri;		
	}
	
	/**
	 * Arma el pqri 115 - SMOKERS AND TOBACCO USERS
	 * @return pqri
	 */
	protected String[] pqri115(){
		String[] pqri = new String[5];
		pqri[0] = PQRI_NUMBER_SMOKERS; //pqri_number
		int numerador = executaQueryNumerador115();
		pqri[1] = String.valueOf(numerador); //numerador
		
		int denominador = executaQueryDenominator115();
		pqri[2] = String.valueOf(denominador); //denominador
		pqri[3] = "0"; // exclusions
		pqri[4] = "0"; //not met
		
		return pqri;		
	}
}