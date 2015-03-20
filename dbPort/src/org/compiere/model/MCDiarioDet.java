/* * Created on 16/06/2005 * * TODO To change the template for this generated file go to * Window - Preferences - Java - Code Style - Code Templates */package org.compiere.model;import java.sql.PreparedStatement;import java.sql.ResultSet;import java.util.Properties;import java.util.logging.Level;import org.compiere.util.CLogger;import org.compiere.util.DB;import org.compiere.util.Env;/** * @author YWRY * Cargos diarios Detalle */public class MCDiarioDet extends X_EXME_CDiarioDet {	/** serialVersionUID */	private static final long serialVersionUID = -6846369888680101040L;	/** Log */	private static CLogger s_log = CLogger.getCLogger(MCDiarioDet.class);	/**	 * Costructor	 * 	 * @param ctx	 * @param EXME_CDiarioDet_ID	 * @param trxName	 */	public MCDiarioDet(Properties ctx, int EXME_CDiarioDet_ID, String trxName) {		super(ctx, EXME_CDiarioDet_ID, trxName);	}	/**	 * Constructor Resultset	 * 	 * @param ctx	 * @param rs	 * @param trxName	 */	public MCDiarioDet(Properties ctx, ResultSet rs, String trxName) {		super(ctx, rs, trxName);	}	/**	 * Detalle	 * 	 * @param ctx	 * @param name	 * @param trxName	 * @return	 */	public static MCDiarioDet getCDiarioDet(Properties ctx, String name,			String trxName) {				StringBuilder st = new StringBuilder("SELECT * FROM EXME_CDiarioDet  ");		st.append(" INNER JOIN EXME_CDiario cDiario ");		st.append(" ON (EXME_CDiarioDet.EXME_CDiario_ID = cDiario.EXME_CDiario_ID) ");		st.append(" WHERE UPPER(EXME_CDiarioDet.NAME)  = ? ");		st.append(" AND UPPER(cDiario.Name) = ? ");				PreparedStatement pstmt = null;		ResultSet rs = null;		MCDiarioDet cDiarioDet = null;		try {			st = new StringBuilder(MEXMELookupInfo.addAccessLevelSQL(ctx, st					.toString(), "EXME_CDiarioDet"));			pstmt = DB.prepareStatement(st.toString(), trxName);			pstmt.setString(1, name);			pstmt.setString(2, name);			rs = pstmt.executeQuery();			if (rs.next()) {				cDiarioDet = new MCDiarioDet(Env.getCtx(), rs, trxName);			}		} catch (Exception e) {			s_log.log(Level.SEVERE, st.toString(), e);		} finally {			DB.close(rs, pstmt);		}		return cDiarioDet;	}	/**	 * Precio del producto	 * 	 * @param ctx	 * @param name	 * @param trxName	 * @return	 */	public static MProductPrice getMProductPrice(Properties ctx, String name,			String trxName) {		MCDiarioDet cDiariodet = MCDiarioDet.getCDiarioDet(ctx, name				.toUpperCase(), trxName);		if (cDiariodet != null) {			return cDiariodet.getProductPrice(ctx);		} else {			return null;		}	}	/**	 * Producto	 */	private MProduct product;	/**	 * Productos	 * 	 * @param ctx	 * @return	 */	public MProduct getProduct(Properties ctx) {		if (product == null) {			product = new MProduct(ctx, getM_Product_ID(), null);		}		return product;	}	/**	 * Objeto del precio del producto	 */	private MProductPrice productPrice;	/**	 * Busqueda del objeto del producto	 * 	 * @param ctx	 * @return	 */	public MProductPrice getProductPrice(Properties ctx) {		// Expert: Proyecto #102 Posteo, Costos y Precios        // Depreciada la tabla EXME_ProductoPrecio		if (productPrice == null) {			productPrice = MProductPrice.get(ctx, 					MEXMEPriceListVersion.getIdPriceListVersionLast(ctx),					getM_Product_ID(),					null);		}		return productPrice;	}	/**	 * Secuencia de la linea	 * 	 * @param ctx	 * @param trxName	 * @return	 */	public static int getMaxSecuen(Properties ctx, String trxName) {		StringBuilder st = new StringBuilder(				"SELECT NVL(MAX(Secuencia),0) AS Secuencia FROM EXME_CDiarioDet ");		PreparedStatement pstmt = null;		ResultSet rs = null;		int secuen = 0;		try {			pstmt = DB.prepareStatement(st.toString(), trxName);						// Se elimina parametro en executeQuery por error de postgresql			//org.postgresql.util.PSQLException: Can't use query methods that take a query string on a PreparedStatement.			//Jesus Cantu						rs = pstmt.executeQuery(); 			if (rs.next()) {				secuen = rs.getInt("Secuencia");			}		} catch (Exception e) {			s_log.log(Level.SEVERE, st.toString(), e);		} finally {			DB.close(rs, pstmt);		}		return secuen;	}}