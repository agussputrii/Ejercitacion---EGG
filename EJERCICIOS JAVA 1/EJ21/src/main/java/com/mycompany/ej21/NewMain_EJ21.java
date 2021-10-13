

package com.mycompany.ej21;


/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.*/
public class NewMain_EJ21 {

    public static void main(String[] args) {
        //declaramos el arreglo de 1 dimension
        int [] vector;
        //dimensionamos el tamano del vector por defecto
        vector = new int[100];
        int num = 1;
        //asignamos valores para ocupar el vector
        for (int i = 0; i < vector.length; i++) {
        vector[i] = num;
        num++;
        }
        //mostramos los numeros de manera descendiente
        for (int i = 99; i >= 0; i--) {
            System.out.print("["+vector[i]+"]-");
        }
    }
    
}
