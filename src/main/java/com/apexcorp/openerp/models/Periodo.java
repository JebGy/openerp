package com.apexcorp.openerp.models;

import com.apexcorp.openerp.enums.EstadoPeriodo;

/**
 *
 * @author xkira24
 */
public class Periodo {
    private Long id;
    private String anio;
    private String mes;
    private EstadoPeriodo ePeriodo;

    public Periodo() {
    }
    

    public Periodo(Long id, String anio, String mes, EstadoPeriodo ePeriodo) {
        this.id = id;
        this.anio = anio;
        this.mes = mes;
        this.ePeriodo = ePeriodo;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public EstadoPeriodo getePeriodo() {
        return ePeriodo;
    }

    public void setePeriodo(EstadoPeriodo ePeriodo) {
        this.ePeriodo = ePeriodo;
    }
    
    
}
