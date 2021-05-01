/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "Jose Criollo";
        String nombreBanco = "Banco del Pacifico";
        double valorCheque = 70000;
        
        
        chequeFinanciero cheq1 = new chequeFinanciero (nombre, nombreBanco, valorCheque);
        cheq1.establecerNombreCliente(nombre);
        cheq1.establecerNombreBanco(nombreBanco);
        cheq1.establecerValorCheque(valorCheque);
        cheq1.establecerComisionCobrar();
        System.out.printf("%s\n",cheq1);
        
        
        String nombre2 = "Santiago Chiriboga";
        String nombreBanco2 = "Banco del Austro";
        double valorCheque2 = 90000;

        
        chequeFinanciero cheq2 = new chequeFinanciero(nombre, nombreBanco2, valorCheque2);
        cheq2.establecerNombreCliente(nombre2);
        cheq2.establecerNombreBanco(nombreBanco2);
        cheq2.establecerValorCheque(valorCheque2);
        cheq2.establecerComisionCobrar();
        System.out.printf("\n%s\n",cheq2);
    } 
}
