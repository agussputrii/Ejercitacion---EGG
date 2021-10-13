/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.text.DecimalFormat;
import java.util.Arrays;

/**
 * El primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
 */
public class procesosArrays {

    public static double[] arregloA = new double[50];

    public double[] arregloB = new double[20];

    //////////////////////////////////////////////////////////////////////////////
    public procesosArrays() {
    }
    DecimalFormat formato = new DecimalFormat("#.00");
    DecimalFormat formatob = new DecimalFormat("#.##");

    public void llenarArrayA() {
        System.out.println("===============================");
        System.out.println("[ ARREGLO A ]");
        System.out.println("===============================");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < this.arregloA.length; i++) {
            this.arregloA[i] = Math.random() * (100) + 1;
            System.out.print(formato.format(this.arregloA[i]));
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

    }

    public void ordenarArrayA() {
        Arrays.sort(arregloA);
        System.out.println("===============================");
        System.out.println("[ ARREGLO ORDENADO ]");
        System.out.println("===============================");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print(formato.format(arregloA[i]));
            System.out.print(" | ");
        }
        System.out.println("");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
    }

//    copiar los primeros 10 números ordenados al arreglo B de 20 elementos , y
//    rellenar los 10 últimos elementos con el valor 0.5.
    public void llenarArrayB() {

        arregloB = Arrays.copyOf(arregloA, 20);
        Arrays.fill(arregloB, 10, 20, 0.5);

        System.out.println("===============================");
        System.out.println("[ ARREGLO B ]");
        System.out.println("===============================");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print(formatob.format(arregloB[i]));
            System.out.print(" | ");
        }
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
    }

}
