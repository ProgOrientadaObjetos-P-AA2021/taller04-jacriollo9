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
         

        String cedula = "1104803620";
        String marca = "Toyota";
        int anoFabricante = 2019; 
        double valorVehiculo = 40000;
        
        Automotor automotor = new Automotor(cedula, marca, anoFabricante, valorVehiculo);
        
        automotor.establecerValorMatricula();
        
        System.out.println("");
        System.out.printf("%s\n",automotor);
        
        String cedula1 = "1102560354";
        String marca1 = "Ford Ranger";
        int anoFabricante1 = 2020; 
        double valorVehiculo1 = 100000;
        
        Automotor automotor2 = new Automotor(cedula1, marca1, anoFabricante1, valorVehiculo1);
        
        automotor2.establecerValorMatricula();
        
        System.out.println("");
        System.out.printf("%s\n",automotor2);
    }
}
