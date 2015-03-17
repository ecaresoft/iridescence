/*
 * Created on 09-may-2005
 */
package org.compiere.model;

import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 * Modelo de Pregunta
 * <b>Modificado: </b> $Author: gisela $<p>
 * <b>En :</b> $Date: 2005/05/10 16:45:03 $<p>
 *
 * @author Gisela Lee
 * @version $Revision: 1.1 $
 */
public class MPregunta_Lista extends X_EXME_Pregunta_Lista {

    /**
     * @param ctx
     * @param EXME_Pregunta_Lista_ID
     * @param trxName
     */
    public MPregunta_Lista(Properties ctx, int EXME_Pregunta_Lista_ID, String trxName) {
        super(ctx, EXME_Pregunta_Lista_ID, trxName);
    }

    /**
     * @param ctx
     * @param rs
     * @param trxName
     */
    public MPregunta_Lista(Properties ctx, ResultSet rs, String trxName) {
        super(ctx, rs, trxName);
    }
    public static ArrayList<RespuestaList_VO> getListaRespuestas (Integer pregunta) throws Exception{
}