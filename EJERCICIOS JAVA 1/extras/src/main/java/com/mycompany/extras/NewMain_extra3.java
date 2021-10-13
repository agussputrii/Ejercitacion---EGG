
package com.mycompany.extras;

import java.util.Scanner;


public class NewMain_extra3 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingresa una letra, si es VOCAL sera detectada como tal");
        
        String letra = read.next(); 
        do {
            System.out.println("Ingresa UNA SOLA LETRA");
        letra = read.next();  
        } while (letra.length()!=1);
        
        letra = letra.toUpperCase();
        //si la letra es vocal
        if ("A".equals(letra) || "E".equals(letra) || "I".equals(letra) || "O".equals(letra) || "U".equals(letra)) {
            System.out.println("la letra ingresada es una vocal");
        } else {//pero si no es vocal
            System.out.println("Muchas gracias :D");
        }
        
        
    }
    
}
