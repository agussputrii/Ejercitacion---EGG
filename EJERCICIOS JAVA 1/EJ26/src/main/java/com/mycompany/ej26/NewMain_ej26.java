package com.mycompany.ej26;
import java.util.Scanner;
public class NewMain_ej26 {
/*
    Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
donde la suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un
programa que permita introducir un cuadrado por teclado y determine si este
cuadrado es mágico o no. El programa deberá comprobar que los números
introducidos son correctos, es decir, están entre el 1 y el 9.
    */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        int n;

        //leemos
        do{
            System.out.println("Ingresa la dimension de la matriz");
            n = read.nextInt();
        }while (n!=3);
        
        //matriz
        int [] [] matriz;
        matriz = new int [n][n];
        
        //analizador
        int [] analyzer;
        analyzer = new int [n*2+2];
        
        //ingresamos valores en la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Ingrese celda [" + i + "," + j + "]");
                matriz[i][j] = read.nextInt();
            }
        }
        //Mostramos matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //rellenamos el analizador
        for (int i = 0; i < n; i++) {
            analyzer[i] = 0;
        }
        esmagica(matriz,n);
           
}

    public static boolean esmagica(int[][] matriz, int n) {
        Integer[] filas = new Integer[n], columnas = new Integer[n];
        int sumaP = 0, sumaS = 0, contador = 0, a = 0, b = 0;
        boolean com = false, com2 = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // sumo diagonal principal y secundaria
                if (i == j) {
                    sumaP = sumaP + matriz[i][j];
                }
                if (i + j == n - 1) {
                    sumaS = sumaS + matriz[i][j];
                }
                // sumo filas y columnas
                a += matriz[i][j];
                filas[contador] = a;
                b += matriz[j][i];
                columnas[contador] = b;
            }
            a = 0;
            b = 0;
            contador++;
        }
        // comparo que las filas sean igual a las columnas
        // Si no lo son salta un true diciendo que hay una distinta
        for (int i = 0; i < n; i++) {
            if (filas[i] != columnas[i]) {
                com = true;
            }
        }
        // Verifico diagonales principales
        com2 = ((sumaP == sumaS)) ? true : false;
        // Verifico los dos booleanos y retorno una respuesta
        // respuesta true son magicas respuesta false no lo son
        com = (com != true && com2 == true) ? true : false;
        if (com==true) {
            System.out.println("La matriz es magica");
        }else {
            System.out.println("La matriz NO es magica");
        }
        return com;
    }
}
