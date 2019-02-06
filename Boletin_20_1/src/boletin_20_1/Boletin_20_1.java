/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_20_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Equipos_liga obx=new Equipos_liga();
       int fila,columna;
        fila=Integer.parseInt(JOptionPane.showInputDialog(null,"Equipos"));
        columna=Integer.parseInt(JOptionPane.showInputDialog(null,"Xornadas"));
        String[]equipo=new String[fila];
        String[]xornada=new String[columna];
        int[][]goles=new int[equipo.length][xornada.length];
        int[]golesTotal=new int[equipo.length];
        
        obx.tablaEquipo(equipo);
        obx.tablaXornada(xornada);
        obx.tablaGoles(goles, equipo, xornada);
        obx.mostraTabla(goles, equipo, xornada);
        obx.ordenarEquipos(goles, equipo, golesTotal);
        obx.totalGolesEquipo(equipo, golesTotal);
        obx.tablaOrdenada(goles, equipo, xornada, golesTotal);
        obx.cantidadGolesEnJornada(equipo, xornada, goles);
        obx.consultar(equipo, xornada, goles);
    }

    
}

