
package com.mycompany.ej23;

import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos). */

public class NewMain_EJ23 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] vector;
        //leemos y dimensionamos el tamano del vector por defecto
        System.out.println("Ingresa el tamano de tu matriz");
        int num = read.nextInt();
        vector = new int[num];
        //aleatorizamos los valores del vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999);
        }
        
        for (int i = 0; i < vector.length; i++){
            //hacemos una variable que convierta los numeros en strings
            System.out.println("");
            System.out.println("["+vector[i]+"]");
            String cantidad = Integer.toString(vector[i]);
            System.out.println("El numero de la posicion ["+(i+1)+"] tiene ["+cantidad.length()+"] Digitos");
            System.out.println("");
        }
    }
    
}
