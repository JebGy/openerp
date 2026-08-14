/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apexcorp.openerp.models;

import com.apexcorp.openerp.enums.TipoCategoria;
import com.apexcorp.openerp.enums.TipoTransaccion;
import java.util.Date;

/**
 *
 * @author xkira24
 */
public class Transaccion {
    private Long id;
    private Long cId; //Id de cuenta bancaria
    private Long pId; //Id de periodo
    private Date fTransaccion; //fecha de transacción
    private TipoTransaccion tTransaccion;
    private Double tMonto;
    private TipoCategoria tCategoria;
    private Long nOperacion;
    
}
