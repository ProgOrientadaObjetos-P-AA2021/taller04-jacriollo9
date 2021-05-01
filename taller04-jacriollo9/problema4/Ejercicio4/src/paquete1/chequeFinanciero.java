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
public class chequeFinanciero {

    private String NombreCliente;
    private String NombreBanco;
    private double ValorCheque;
    private double ComisionCobrar;

    public chequeFinanciero (String nombre, String nombreBanco, double valorCheque) {
        NombreCliente = nombre;
        NombreBanco = nombreBanco;
        ValorCheque = valorCheque;
    }

    public void establecerNombreCliente(String nombre) {
        NombreCliente = nombre;
    }

    public void establecerNombreBanco(String nombreBanco) {
        NombreBanco = nombreBanco;
    }

    public void establecerValorCheque(double valorCheque) {
        ValorCheque = valorCheque;
    }

    public void establecerComisionCobrar() {
        ComisionCobrar = (ValorCheque * 0.003);
    }

    public String obtenerNombreCliente() {
        return NombreCliente;
    }

    public String obtenerNombreBanco() {
        return NombreBanco;
    }

    public double obtenerValorCheque() {
        return ValorCheque;
    }

    public double obtenerComisionCobrar() {
        return ComisionCobrar;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos del Cheque\n"
                + "Nombre del cliente %s\n"
                + "Nombre del banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comisión que cobra el banco: %.2f",
                obtenerNombreCliente(),
                obtenerNombreBanco(),
                obtenerValorCheque(),
                obtenerComisionCobrar());
        return cadena;
    }
}
