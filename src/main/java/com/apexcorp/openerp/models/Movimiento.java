package com.apexcorp.openerp.models;

import com.apexcorp.openerp.enums.EstadoSunat;
import com.apexcorp.openerp.enums.Moneda;
import com.apexcorp.openerp.enums.TipoDoc;
import com.apexcorp.openerp.enums.TipoEntidad;
import java.util.Date;

/**
 *
 * @author xkira24
 */
public class Movimiento {

    private Long id;
    private Long pId; // Periodo
    private Long eId; //Entidad
    private TipoDoc tDocumento;
    private String serie;
    private Long number;
    private Date fEmision;
    private Moneda moneda;
    private Double tCambio;
    private Double mBaseGravada;
    private Double mExonerado;
    private Double mInafecto;
    private Double mIGV;
    private Double mTotal;
    private EstadoSunat eSunat;
    private TipoEntidad eMovimiento;
}
