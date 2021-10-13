package com.mycompany.ej18_cuadrado;
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”

import java.util.Scanner;


public class main_ej18 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int sq_size;
        
        System.out.println("Ingresa la longitud de su cuadrado");
        sq_size = read.nextInt();
        
        for (int i = 1; i <= sq_size; i++) {
            for (int j = 1; j <= sq_size; j++) {
                if(i==1 || i==sq_size || j==1 || j==sq_size)
                    System.out.print("* ");
                else 
                    System.out.print("  ");
                };
        System.out.println("");    
        }
    }
}   
    
