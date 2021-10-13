/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ej24;

/**
 *
 * @author Agus
 */
public class asdasd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    		boolean c;
		String text;
		Integer[][] matriz = new Integer[3][3];
		llenarMatriz(matriz);
		c = matrizAntiSimetrica(matriz, 3);
		mostrarMatrizTrans(matriz, 3);
		text = (c == true) ? "ES ANTISIMETRICA LA MATRIZ" : "NO ES ANTISIMETRICA LA MATRIZ";
		System.out.println(text);
	}

	// Llleno Matriz con numeros random
	public static void llenarMatriz(Integer[][] matriz) {
		matriz[0][0] = 0;
		matriz[0][1] = 3;
		matriz[0][2] = -4;
		matriz[1][0] = -3;
		matriz[1][1] = 0;
		matriz[1][2] = 5;
		matriz[2][0] = 4;
		matriz[2][1] = -5;
		matriz[2][2] = 0;
	}

	// Muestro Matriz
	public static void mostrarMatrizTrans(Integer[][] matriz, int n) {
		System.out.println("Transpuesta");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print("[ " + matriz[j][i] + " ]");
			}
			System.out.println();
		}
	}

	// Muestro Matriz
	public static boolean matrizAntiSimetrica(Integer[][] matriz, int n) {
		System.out.println("Normal");
		int cont = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if ((matriz[i][j]) != -(matriz[j][i])) {
					cont++;
				}
				System.out.print("[ " + matriz[i][j] + " ]");
			}
			System.out.println();
		}
		boolean t = (cont >= 1) ? false : true;
		return t;
	}
}

