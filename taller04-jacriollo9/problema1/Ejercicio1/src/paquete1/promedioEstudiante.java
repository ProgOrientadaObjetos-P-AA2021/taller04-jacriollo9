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
public class promedioEstudiante {
    private String nombreEstudiante;
    private double califMateria1;
    private double califMateria2;
    private double califMateria3;
    private double promedioCalificacion;

    public promedioEstudiante(String nombre, double materia1, double materia2, double materia3) {
        nombreEstudiante = nombre;
        califMateria1 = materia1;
        califMateria2 = materia2;
        califMateria3 = materia3;
    }

    public void establecerNombreEstudiante(String nom) {
        nombreEstudiante = nom;
    }

    public void establecerCalificacionMateria1(double CalifMateria1) {
        califMateria1 = CalifMateria1;
    }

    public void establecerCalificacionMateria2(double CalifMateria2) {
        califMateria2 = CalifMateria2;
    }

    public void establecerCalificacionMateria3(double CalifMateria3) {
        califMateria3 = CalifMateria3;
    }

    public void establecerPromedioCalificacion() {
        promedioCalificacion = (califMateria1
                + califMateria2 + califMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombreEstudiante;
    }

    public double obtenerCalificacionMateria1() {
        return califMateria1;
    }

    public double obtenerCalificacionMateria2() {
        return califMateria2;
    }

    public double obtenerCalificacionMateria3() {
        return califMateria3;
    }

    public double obtenerPromedioCalificacion() {
        return promedioCalificacion;
    }

    @Override
    public String toString() {
        String cadena = String.format("\tDatos Estudiante\n"
                + "Nombre del estudiante: %s\n"
                + "Calificacion de la materia 1: %.2f\n"
                + "Calificacion de la materia 2: %.2f\n"
                + "Calificacion de la materia 3: %.2f\n"
                + "Promedio de Calificaciones: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalificacionMateria1(),
                obtenerCalificacionMateria2(),
                obtenerCalificacionMateria3(),
                obtenerPromedioCalificacion());
        return cadena;
    }

}
