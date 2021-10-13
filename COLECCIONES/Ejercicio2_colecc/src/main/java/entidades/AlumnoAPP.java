/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class AlumnoAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicios sv = new Servicios();
        Alumno alu = new Alumno();
        sv.crearAlumno();
        
    }
    
}
