/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import entidades.Pelicula;
import entidades.Servicios;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class PeliculasMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       Servicios sv = new Servicios();
       int decision = -1;
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Pelicula> listaPelicula = new ArrayList<Pelicula>();
        do {
            System.out.println("Ingrese el titulo de la pelicula");
            String nombre = sc.next();//ingresamos nombre de la pelicula
            Pelicula nuevaPelicula = new Pelicula();//creamos nuestro objeto pelicula
            nuevaPelicula.setTitulo(nombre);//seteamos nombre de la pelicula

            System.out.println("Ingrese el nombre de su Director ");
            String director = sc.next(); //ingresamos director de la pelicula
            nuevaPelicula.setDirector(director);//seteamos director de la pelicula

            System.out.println("Ingrese la duracion de la pelicula (Ejemplo: 2.00)");
            Integer duracion = sc.nextInt();//ingresamos duracion de la pelicula
            nuevaPelicula.setDuracion(duracion);//seteamos duracion de la pelicula

            listaPelicula.add(nuevaPelicula);//anadimos la pelicula a nuestra lista

            System.out.println("Desea ingresar otra pelicula a la lista?");
            System.out.println("| [1]- CONTINUAR || [0]- SALIR |");
            decision = sc.nextInt();

        } while (decision != 0);
        
        sv.mostrarPeliculas(listaPelicula);
        System.out.println("---------------------||||---------------------");
        sv.peliculayMayorA_1H(listaPelicula);
        
        System.out.println("---------------------||||---------------------");
        System.out.println("ORDEN DE MENOR A MAYOR DURACION");
        listaPelicula.sort(Servicios.peliMenorToMayor);
        sv.mostrarPeliculas(listaPelicula);
        
        System.out.println("---------------------||||---------------------");
        System.out.println("ORDEN DE MAYOR A MENOR DURACION");
        Collections.sort(listaPelicula, Servicios.peliMayorToMenor);
        //listaPelicula.sort(Servicios.peliMayorToMenor);
        sv.mostrarPeliculas(listaPelicula);
        
        System.out.println("---------------------||||---------------------");
        System.out.println("ORDEN POR TITULO ALFABETICAMENTE");
        
        Collections.sort(listaPelicula, Servicios.alfabeticamenteTitulo);
        sv.mostrarPeliculas(listaPelicula);
        
        System.out.println("---------------------||||---------------------");
        System.out.println("ORDEN POR DIRECTOR ALFABETICAMENTE");
        Collections.sort(listaPelicula, Servicios.alfabeticamenteDirector);
        sv.mostrarPeliculas(listaPelicula);
        System.out.println("---------------------||||---------------------");
    }
    
}
