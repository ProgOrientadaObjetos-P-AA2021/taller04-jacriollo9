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
public class Automotor {
    private String Cedula;
    private String Marca;
    private int AnoFabricacion;
    private double ValorVehiculo;
    private double ValorMatricula;

    public Automotor(String cedula, String marca, int anoFabricante, double valorVehiculo) {
        Cedula = cedula;
        Marca = marca;
        AnoFabricacion = anoFabricante;
        ValorVehiculo = valorVehiculo;

    }

    public void establecerCedula(String cedula) {
        Cedula = cedula;
    }

    public void establecerMarca(String marca) {
        Marca = marca;
    }

    public void establecerAnFabricacion(int anoFabricante) {
        AnoFabricacion = anoFabricante;
    }

    public void establecerValorVehiculo(double valorVehiculo) {
        ValorVehiculo = valorVehiculo;
    }

    public void establecerValorMatricula() {
        ValorMatricula = ValorVehiculo * (2021 - AnoFabricacion) * 0.002 ;
    }

    public String obtenerCedula() {
        return Cedula;
    }

    public String obtenerMarca() {
        return Marca;
    }

    public int obtenerAnFabricacion() {
        return AnoFabricacion;
    }

    public double obtenerValorVehiculo() {
        return ValorVehiculo;
    }

    public double obtenerValorMatricula() {
        return ValorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos del Automotor\n"
                + "Cedula del dueño: %s\n"
                + "Marca del vehiculo: %s\n"
                + "Año de fabricación: %d\n"
                + "Valor del vehículo: %.2f\n"
                + "Valor de la matricula: %.2f",
                obtenerCedula(),
                obtenerMarca(),
                obtenerAnFabricacion(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }
}
