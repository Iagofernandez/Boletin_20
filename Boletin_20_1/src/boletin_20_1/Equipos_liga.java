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
public class Equipos_liga {
      public void tablaEquipo(String[]equipo){
        for(int i=0;i<equipo.length;i++){
            equipo[i]=JOptionPane.showInputDialog(null,"Nombre del equipo "+(i+1));
        }
    }
    
    public void tablaXornada(String[]xornada){
        for(int i=0;i<xornada.length;i++){
            xornada[i]="numero xornada"+(i+1);
        }
    }
    
    public void tablaGoles(int[][]tabla,String[]equipo,String[]xornada){
        for(int i=0;i<tabla.length;i++){
            for(int j=0;j<tabla[0].length;j++){
                tabla[i][j]=Integer.parseInt(JOptionPane.showInputDialog(null,"Introduzca os goles do "+ equipo[i]+" na xornada"+xornada[j]));
            }
        }
    }
    
    public void mostraTabla(int[][]tabla,String[]equipo,String[]jornada){
        System.out.print("Equipo/Xornada  ");
        for(int k=0;k<tabla.length;k++){
            System.out.print(jornada[k]+" ");
        }
        System.out.println("");
        for(int i=0;i<tabla.length;i++){
            System.out.print(equipo[i]+"  | ");
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("| ");
        }
        System.out.println("");
    }
    
    public void ordenarEquipos(int[][]goles,String[]equipo,int[]total){
        int totalgoles;
        for(int i=0;i<goles.length;i++){
            totalgoles=0;
            for(int j=0;j<goles[0].length;j++){
                totalgoles=goles[i][j]+totalgoles;
            }
            total[i]=totalgoles;
        }
        
        int auxg,auxt;
        String auxe;
        for (int i=0;i<total.length-1;i++){
            
            for(int j=i+1;j<total.length;j++){
                if(total[i]<total[j]){
                    auxt=total[i];
                    total[i]=total[j];
                    total[j]=auxt;
                    auxe=equipo[i];
                    equipo[i]=equipo[j];
                    equipo[j]=auxe;
                    for(int k=0;k<goles[0].length;k++){
                        auxg=goles[i][k];
                        goles[i][k]=goles[j][k];
                        goles[j][k]=auxg;
                    }
                }
            }
        } 
    }
    
    public void totalGolesEquipo(String[]equipo,int[]total){
        for(int i=0;i<equipo.length;i++){
            System.out.println("El "+equipo[i]+" marco un total de "+total[i]);
        }
        System.out.println("");
    }
    
    public void tablaOrdenada(int[][]tabla,String[]equipo,String[]xornada,int[]golesTotal){
        System.out.print("Equipos/Xornada  ");
        for(int k=0;k<tabla.length;k++){
            System.out.print(xornada[k]+" ");
        }
        System.out.println("");
        for(int i=0;i<tabla.length;i++){
            System.out.print(equipo[i]+"  | ");
            for(int j=0;j<tabla[i].length;j++){
                System.out.print(tabla[i][j]+" ");
            }
            System.out.println("| "+golesTotal[i]);
        }
        System.out.println("");
    }
    
    public void cantidadGolesEnJornada(String[]equipo,String[]xornada,int[][]goles){
        int max;
        String equipom[]=new String[equipo.length];
        int i,j;
        
        for(i=0;i<goles[0].length;i++){
            max=0;
            for(j=0;j<goles.length;j++){
                if(max<=goles[j][i]){
                    max=goles[j][i];
                    equipom[j]=equipo[j];
                }
            }
            for(j=0;j<goles.length;j++){
                if(max==goles[j][i]){
                    System.out.println("O equipo "+ equipom[j] +" marcou un total de "+max+" na xornada "+xornada[i]);
                }
            }
        }
        System.out.println("");
    }
    
    public void consultar(String[]equipo,String[]xornada,int[][]goles){
        String xornadas,equipos;
        int posicionE=0,posicionJ=0;
        equipos=JOptionPane.showInputDialog(null, "Introduza o equipo:");
        xornadas=JOptionPane.showInputDialog(null,"Introduza a xornada a buscar\nAs xornadas se almacenan como:\n      numerodejornada");
        for(int i=0;i<equipo.length;i++){
            if(equipos.equals(equipo[i])){
                posicionE=i;
            }
        }
        for(int i=0;i<xornada.length;i++){
            if(xornadas.equals(xornada[i])){
                posicionJ=i;
            }
        }
        System.out.println("O equipo "+equipos+" marcou "+ goles[posicionE][posicionJ]+" na xornada "+xornadas);
    }
}


       
 




