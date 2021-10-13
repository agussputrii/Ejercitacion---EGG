
package com.mycompany.extras;

import java.util.Scanner;

public class NewMain_extra4 {

/*
    Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
    equivalente en romano.
    */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int num;
        System.out.println("Ingresa un numero del 1 al 10 que quieras convertir a numero ROMANO");
        num = read.nextInt();
        
        switch (num){
            case 1:
                System.out.println("El numero "+num+" En romano es [I]");
                break;
            case 2:
                System.out.println("El numero "+num+" En romano es [II]");
                break;
            case 3:
                System.out.println("El numero "+num+" En romano es [III]");
                break;
            case 4:
                System.out.println("El numero "+num+" En romano es [IV]");
                break;
            case 5:
                System.out.println("El numero "+num+" En romano es [V]");
                break;
            case 6:
                System.out.println("El numero "+num+" En romano es [VI]");
                break;
            case 7:
                System.out.println("El numero "+num+" En romano es [VII]");
                break;
            case 8:
                System.out.println("El numero "+num+" En romano es [VIII]");
                break;
            case 9:
                System.out.println("El numero "+num+" En romano es [IX]");
                break;
            case 10:
                System.out.println("El numero "+num+" En romano es [X]");
                break;
            default:
                System.out.println("El numero ingresado esta fuera de rango");
        }
            
    }
    
}
