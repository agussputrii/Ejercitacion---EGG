/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Alumno;

/**
 *
 * @author Agus
 */
public class Servicios {

    public void crearAlumno() {
        int decision = -1;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        Alumno nuevoAlumno;
        ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
        do {
            System.out.println("Ingrese el nombre del alumno");

            String nombre = sc.next();//pedimos nombre
            nuevoAlumno = new Alumno();
            nuevoAlumno.setNombreAlumno(nombre);//seteamos nombre

            int nota;

            //pedimos nota
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota N°" + (i + 1) + " Del alumno");
                nota = sc.nextInt();
                nuevoAlumno.setNota(nota);//seteamos nota
            }
            //anadimos el alumno a nuestra lista
            listaAlumno.add(nuevoAlumno);

            //preguntamos si deseamos ingresar otro alumno para romper o no el bucle
            System.out.println("Desea ingresar otro alumno?");
            System.out.println("|  [1]- SI  ||  [0]- NO  |");
            decision = sc.nextInt();

        } while (decision != 0);

        //mostramos alumnos
        for (Alumno aux : listaAlumno) {
            System.out.println(aux);
        }

        //pedimos el nombre del alumno que deseamos saber la nota
        System.out.println("Ingrese el nombre del alumno a promediar");
            String name = sc.next();

            boolean found = false;
            int notaF = 0;
        for (int i = 0; i < listaAlumno.size(); i++) {
            
            if (listaAlumno.get(i).getNombreAlumno().equalsIgnoreCase(name)) {
                notaF = listaAlumno.get(i).notaFinal();
                found = true;
                i = listaAlumno.size();
            }
            
        }
        if (found == false) {
            System.out.println("No se encontro el nombre del alumno");
        }
        else{
            System.out.println("El promedio final del alumno "+name.toUpperCase()+" es de "+notaF);
        }
    }

}
