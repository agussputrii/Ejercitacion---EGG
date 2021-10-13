package fraseocho;

import java.util.Scanner;

public class frase8char {


/** Realizar un programa que solo permita introducir solo frases o palabras de 8 de
    largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
    un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
    imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java. */
    
    public static void main(String[] args) {
        //hacemos el scanner
        Scanner read = new Scanner(System.in);
        //definimos y pedimos frase
        String word = null;
        System.out.println("Ingresa una palabra de 8 caracteres");
        word = read.next();
        //hacemos el IF con funcion lenght()
        int word_long = word.length();
        
        if (word_long == 8) {
            System.out.println("CORRECTO"); 
        }
        else {
           System.out.println("INCORRECTO");
        }
    }
    
}
