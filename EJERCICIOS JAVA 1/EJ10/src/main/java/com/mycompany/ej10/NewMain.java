package com.mycompany.ej10;

import java.util.Scanner;


public class NewMain {
    /*
    Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
    frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
    “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
     */

    public static void main(String[] args) {
        //el maldito escaner
        Scanner read = new Scanner (System.in);
        //definimos y pedimos frase
        System.out.println("Escribime una frase o palabra que empiece con A");
        String sentence;
        prompt("Decime tu nombre"); 
        sentence = read.nextLine();
        //validamos A
        String char_val = "A";
        sentence = sentence.toUpperCase();
        //hacemos los malabares en el if
        if (char_val.equals(sentence.substring(0,1))) {
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
       
    }   

    private static void prompt(String decime_tu_nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
