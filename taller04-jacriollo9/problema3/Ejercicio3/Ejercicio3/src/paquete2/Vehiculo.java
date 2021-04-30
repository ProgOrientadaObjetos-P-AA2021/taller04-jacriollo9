/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete2;

/**
 *
 * @author Usuario iTC
 */
public class Vehiculo {

    /**
     * @param args the command line arguments
     */
    
    private String cedulaDueno;
    private String marcaVehiculo;
    private int anoFabricante;
    private double valorVehiculo;
    private double valorMatricula;
    
    public Vehiculo (){
        this.cedulaDueno = "1104803620";
        this.marcaVehiculo = "Toyota";
        this.anoFabricante = 2006;
        this.valorVehiculo = 20000.00;
        this.valorMatricula = 0;
    }
    
    public void establecerCedulaDueno(String CD) {
       cedulaDueno = CD;
    }

    public void establecerMarcaVehiculo(String MV) {
        marcaVehiculo = MV;
    }

    public void establecerAnoFabricante(int AF) {
        anoFabricante = AF;
    }

    public void establecerValorVehiculo(double VH) {
        valorVehiculo = VH;
    }

    public void calcularValorMatricula() {
        valorMatricula =  anoFabricante * valorVehiculo * 0.002 ;
    }

    public String obtenerCedulaDueno() {
        return cedulaDueno;
    }

    public String obtenererMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int obtenerAnoFabricante() {
        return anoFabricante;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString(){
        return "Cedula Dueño:  " + this.cedulaDueno + "\nMarca Vehiculo: " + this.marcaVehiculo + "\n Año Fabricante: " + this.anoFabricante + "\nValor Vehiculo: " + this.valorVehiculo+ "\nValor Matricula: " + this.valorMatricula; 
    }
}
