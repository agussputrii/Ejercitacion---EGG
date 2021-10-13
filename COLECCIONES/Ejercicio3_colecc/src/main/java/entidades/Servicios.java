/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Agus
 */
public class Servicios {

    public void mostrarPeliculas(ArrayList<Pelicula> peli) {
        for (int i = 0; i < peli.size(); i++) {
            System.out.println("----------------------------------------------------");
            System.out.println("DATOS PELICULA " + (i + 1) + "°= ");
            System.out.println("Titulo: " + peli.get(i).getTitulo());// Obtengo titulo
            System.out.println("Director " + peli.get(i).getDirector());// Obtengo direccion
            System.out.println("Duracion " + peli.get(i).getDuracion() + " hs");// Obtengo duracion
            System.out.println("----------------------------------------------------");
        }
    }

    public void peliculayMayorA_1H(ArrayList<Pelicula> peli) {// Verifica la duracion peli mayor 1 hora}  
        System.out.println("DATOS PELICULA CON DURACION MAYOR A 1 HS");
        for (int i = 0; i < peli.size(); i++) {
            if (peli.get(i).getDuracion() > 1) {
                
                System.out.println("Titulo: " + peli.get(i).getTitulo());// Obtengo titulo
                System.out.println("Director " + peli.get(i).getDirector());// Obtengo Direccion
                System.out.println("Duracion " + peli.get(i).getDuracion() + " h");// Obtengo duracion peli
                System.out.println();
            }
        }
    }

    public static Comparator<Pelicula> peliMenorToMayor = (Pelicula o1, Pelicula o2) -> {
        // comparo los dos objetos
        Integer hora1 = o1.getDuracion();// Los paso a string para compararlos
        Integer hora2 = o2.getDuracion();
        return hora1.compareTo(hora2);// Si hora 1 mayor que hora 2 retorna 1
    };

    public static Comparator<Pelicula> peliMayorToMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            // comparo los dos objetos
            Integer hora1 = o1.getDuracion();// Los paso a string para compararlos
            Integer hora2 = o2.getDuracion();
            return hora2.compareTo(hora1);// Si hora2 mayor que hora dos retorna 1
        }
    };

    public static Comparator<Pelicula> alfabeticamenteTitulo = new Comparator<Pelicula>() {// Metodo que compara los dos
        // objetos

        @Override
        public int compare(Pelicula o1, Pelicula o2) {// comparo los dos objetos
            String dato1 = o1.getTitulo();
            String dato2 = o2.getTitulo();
            return dato1.compareTo(dato2);// Ordeno alfabeticamente el titulo
        }
    };

    public static Comparator<Pelicula> alfabeticamenteDirector = new Comparator<Pelicula>() {// Metodo que compara los
        // dos objetos

        @Override
        public int compare(Pelicula o1, Pelicula o2) {// comparo los dos objetos
            String dato1 = o1.getDirector();
            String dato2 = o2.getDirector();
            return dato1.compareTo(dato2);// Ordeno alfabeticamente el director
        }
    };

}
