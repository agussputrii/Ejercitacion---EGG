/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaApp;

import java.util.Scanner;
import entidades.Cadena;
import entidades.Servicios;

public class CadenApp {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in).useDelimiter("\n");
       
        // intanciamos las clases Servicio y Cadena
        entidades.Servicios servicio = new Servicios();

        Cadena cadena01 = servicio.CrearCadena();
        
        // PRUEBA METODOS
        //mostrar vocales
	servicio.mostrarVocales(cadena01);
        
        //frase invertida
        System.out.println("");
        System.out.println("La frase invertida es: ["+servicio.invertirFrase(cadena01)+"]");
        
        //veces que se repite una letra
        System.out.println("\nIngresa la letra que deseas buscar: ");
        char letra = sc.next().charAt(0);//se obtiene el primer carácter del String introducido por teclado
        servicio.vecesRepetido(cadena01, letra);
        
        //comparamos longitud
        System.out.println("\nIngresa una frase para comparar longitud: ");
        String nuevaFrase = sc.next();
        servicio.compararLongitud(cadena01, nuevaFrase);
        
        //concatenar frase
        System.out.println("\nIngrese la frase que desea concatenar: ");
        String fraseConcatenada = sc.next();
        servicio.unirFrases(cadena01, nuevaFrase);
        
        //reemplazar por A
        System.out.println("\nIngrese el nuevo caracter con el que desea reemplazar las [a] en la frase: ");
        String nuevaLetra = sc.next();
        servicio.reemplazar(cadena01, nuevaLetra);
        
        System.out.println("\nIngrese el caracter a buscar en la frase:");
        String caracter = sc.next();
        // el emtodo contiene, retorna true o false por lo que devolveremos un msj en base al valor del return
        if (servicio.contiene(cadena01, caracter)) {
            System.out.println("La frase [" + cadena01.getFrase() + "] contiene el caracter [" + caracter + "]");
        } else {
            System.out.println("La frase [" + cadena01.getFrase() + "]  No contiene el caracter ingresado.");
        }

        sc.close();

        
        
    }
    
}
