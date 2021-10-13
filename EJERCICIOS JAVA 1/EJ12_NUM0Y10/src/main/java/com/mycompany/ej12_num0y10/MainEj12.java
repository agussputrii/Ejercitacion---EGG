package com.mycompany.ej12_num0y10;

/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. */

import java.util.Scanner;

public class MainEj12 {

    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    //pedimos la nota
        System.out.println("Ingrese la nota");
    int var_note;
        var_note = read.nextInt();
    //bucle hasta que la nota sea correcta
        do {         
        System.out.println("Ingrese una nota VALIDA (entre 0 y 10)");
        var_note = read.nextInt();
        } while (var_note > 11 || var_note < (-1));
        
        System.out.println("La nota es correta y se encuentra entre 0 y 10");
    }
    
}
