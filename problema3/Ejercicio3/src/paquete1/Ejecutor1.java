/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.Vehiculo1;



/**
 *
 * @author Usuario iTC
 */
public class Ejecutor1 {
     public static void main(String[] args) {
        Vehiculo1 vehiculo = new Vehiculo1();
        vehiculo.calcularValorMatricula();
        System.out.println(vehiculo.toString());
    }
}
