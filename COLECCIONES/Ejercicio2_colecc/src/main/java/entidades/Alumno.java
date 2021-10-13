/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Alumno {

    //atributos
    String nombreAlumno;
    private ArrayList<Integer> nota = new ArrayList<Integer>();

    //constructores
    public Alumno() {
    }

    //getters and setters
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public ArrayList<Integer> getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota.add(nota);
    }

    @Override
    public String toString() {
        return "Nombre del Alumno= " + nombreAlumno + "  |  notas= " + nota + '}';
    }

    
    //METODOS
//    public void imprimir() {//mostramos los nombres y las 3 notas
//        System.out.println(this.nombreAlumno);
//        System.out.println("NOTAS:");
//
//        for (int i = 0; i < this.nota.size(); i++) {
//            String c = "Nota " + (i + 1) + " == " + this.nota.get(i);
//            System.out.println(c);
//        }
//
//    }

    public int notaFinal() {
        int suma = 0;
        for (int i = 0; i < this.nota.size(); i++) {
            suma += this.nota.get(i);
        }
        return suma / 3;
    }

}
