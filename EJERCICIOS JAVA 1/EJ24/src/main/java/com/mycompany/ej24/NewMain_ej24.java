
package com.mycompany.ej24;

public class NewMain_ej24 {
/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta. ¿Que es una matriz traspuesta?
*/
    public static void main(String[] args) {
        int[][] matriz;
        matriz = new int[4][4];
        //aleatorizamos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
            }
        }
        //mostramos matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        //matriz transpuesta
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }

    }

}
