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
        
        String nombreEstudiante = "Andres Celi";
        double calificacionMateria1 = 9.8;
        double calificacionMateria2 = 10;
        double calificacionMateria3 = 9;
        
        
        promedioEstudiante promEst = new promedioEstudiante(nombreEstudiante, 
                calificacionMateria1, calificacionMateria2, calificacionMateria3); 
        
        promEst.establecerNombreEstudiante(nombreEstudiante);
        promEst.establecerCalificacionMateria1(calificacionMateria1);
        promEst.establecerCalificacionMateria2(calificacionMateria2);
        promEst.establecerCalificacionMateria3(calificacionMateria3);
        promEst.establecerPromedioCalificacion();
        
        System.out.println(promEst);
        
        String nombreEstudiante2 = "Jose Criollo";
        double calificacionMat1 = 10;
        double calificacionMat2 = 9.5;
        double calificacionMat3 = 9.75;
        
        
        promedioEstudiante promEst2 = new promedioEstudiante(nombreEstudiante, 
                calificacionMateria1, calificacionMateria2, calificacionMateria3); 
        
        promEst2.establecerNombreEstudiante(nombreEstudiante2);
        promEst2.establecerCalificacionMateria1(calificacionMat1);
        promEst2.establecerCalificacionMateria2(calificacionMat2);
        promEst2.establecerCalificacionMateria3(calificacionMat3);
        promEst2.establecerPromedioCalificacion();
        
        System.out.println(promEst2);
    }
}
