/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.apexcorp.openerp.utils;

import com.apexcorp.openerp.models.Periodo;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author xkira24
 */
public class NuevoPeriodoUtils {
    
    public void anadirATabla(Periodo nP, TableModel tM) {
        DefaultTableModel dTabla = (DefaultTableModel) tM;
        Periodo pNuevo = nP;
        
        Object[] fila = new Object[]{
            pNuevo.getAnio(),
            pNuevo.getMes(),
            pNuevo.getePeriodo(),};
        dTabla.addRow(fila);
    }
    
}
