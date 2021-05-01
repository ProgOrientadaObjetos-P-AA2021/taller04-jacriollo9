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
        String nombre = "Rosa";
        String apellido = "Romero";
        double sueldoBasico = 1200.00;
        String cedula = "1104803620";
        
        profesorInstituto ProfesorInstituto = new profesorInstituto(nombre, 
                apellido, sueldoBasico,cedula); 
        
        ProfesorInstituto.establecerNombre(nombre);
        ProfesorInstituto.establecerApellido(apellido);
        ProfesorInstituto.establecerSueldoBasico(sueldoBasico);
        ProfesorInstituto.establecerSueldoTotal();
        ProfesorInstituto.establecerCedula(cedula);
        
        System.out.printf("%s\n",ProfesorInstituto);
        
        String nombre1 = "Mayra";
        String apellido1 = "Jimenez";
        double sueldoBasico1 = 600.00;
        String cedula1 = "1104247778";
        
        profesorInstituto profIns2 = new profesorInstituto(nombre, 
                apellido, sueldoBasico,cedula); 
        
        profIns2.establecerNombre(nombre1);
        profIns2.establecerApellido(apellido1);
        profIns2.establecerSueldoBasico(sueldoBasico1);
        profIns2.establecerSueldoTotal();
        profIns2.establecerCedula(cedula);
        
        System.out.printf("\n%s\n",profIns2);
    }
    
}
