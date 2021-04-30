/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import Paquete2.Vehiculo;



/**
 *
 * @author Usuario iTC
 */
public class Ejecutor {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.calcularValorMatricula();
        System.out.println(vehiculo.toString());
    }
}
