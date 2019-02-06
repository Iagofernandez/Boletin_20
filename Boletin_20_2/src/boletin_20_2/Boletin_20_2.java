/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_20_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ifernandezblanco
 */
public class Boletin_20_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TrainguloTartaglia obx=new TrainguloTartaglia();
       int filas=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduza o numero de filas do triangulo"));
obx.triangulo(filas);
    }
    
}
