package com.mycompany.ej22;

import java.util.Scanner;

/**
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
public class NewMain_ej22 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        //asignamos
        int[] vector;
        int num;
        int random_num;
        int user_num;
        int counter=0;
        //leemos y dimensionamos el tamano del vector por defecto
        System.out.println("Ingresa el tamano de tu matriz");
        num = read.nextInt();
        vector = new int[num];
        //aleatorizamos los valores del vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
        //pedimos el numero a buscar en el vector
        System.out.println("Ingresa un numero que quieras buscar en el vector");
        user_num = read.nextInt();
        for (int i = 0; i < vector.length; i++) {
            System.out.print("["+vector[i]+"]-");
        }System.out.println("");
        //hacemos la revision
        for (int i = 0; i < vector.length; i++) {
            if (user_num == vector[i]) {
                counter = counter + 1;
                System.out.println("El numero se encuentra en la posicion [" + i + "]");
            }
        }System.out.println("");
        System.out.print("El numeros se encontro ["+counter+"] veces");
    }
}
