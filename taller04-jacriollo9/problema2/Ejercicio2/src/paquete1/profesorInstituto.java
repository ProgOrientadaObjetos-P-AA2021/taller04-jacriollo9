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
public class profesorInstituto {
    private String Nombre;
    private String Apellido;
    private double SueldoBasico;
    private double SueldoTotal;
    private String Cedula;
    
    public profesorInstituto(String nombre, String apellido, double sueldobasico, 
        String cedula){
        Nombre = nombre;
        Apellido = apellido;
        SueldoBasico = sueldobasico;
        Cedula = cedula; 
    }
    
    public void establecerNombre(String nombre) {
        Nombre = nombre;
    }

    public void establecerApellido(String apellido ) {
        Apellido = apellido;
    }

    public void establecerSueldoBasico(double sueldobasico) {
        SueldoBasico = sueldobasico;
    }
    
    public void establecerSueldoTotal(){
        SueldoTotal = (SueldoBasico * 20)/100 + SueldoBasico;
    }
    
    public void establecerCedula(String cedula){
        Cedula = cedula;
    }

   
    public String obtenerNombre() {
        return Nombre;
    }

    public String obtenerApellido() {
        return Apellido;
    }

    public double obtenerSueldoBasico() {
        return SueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return SueldoTotal;
    }
    
    public String obtenerCedula(){
        return Cedula;
    }
    @Override
    public String toString() {
        String cadena = String.format("\tProfesores del Instituto\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo Basico: %.2f\n"
                + "Sueldo Total: %.2f\n"
                + "Cedula: %s",
                obtenerNombre(),
                obtenerApellido(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal(),
                obtenerCedula());
        return cadena;
    }
}
