package maymin;

import java.util.Scanner;

/**
@author Agus
 */
public class mayusminus {

    /**
     Escribir un programa que pida una frase y la muestre toda en mayúsculas y
    después toda en minúsculas. Nota: investigar la función toUpperCase() y
    toLowerCase() en Java.
     */
    public static void main(String[] args) {
    //hago mi escaner
        Scanner read = new Scanner(System.in);
    //defino frase como cadena
        String sentence;
        System.out.println("Ingresa la frase");
    //Ingreso la frase
        sentence = read.nextLine();
    //convertir toUpperCase()
        System.out.println(" ");
        System.out.println("Frase en MAYUSCULAS:");
        System.out.println(sentence.toUpperCase());
    //convertir toLowerCase()
        System.out.println(" ");
        System.out.println("Frase en minusculas:");
        System.out.println(sentence.toLowerCase());
    }
    
}
