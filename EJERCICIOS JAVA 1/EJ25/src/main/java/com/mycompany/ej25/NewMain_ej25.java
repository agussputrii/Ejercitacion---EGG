
package com.mycompany.ej25;
/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice
que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero
cambiada de signo. Es decir, A es anti simétrica si A = -AT
. La matriz traspuesta de
una matriz A se denota por A
T y se obtiene cambiando sus filas por columnas (o
viceversa).*/
public class NewMain_ej25 {

    public static void main(String[] args) {
        // Llleno Matriz con numeros random
        int[][] m = new int [3][3];
        boolean es_asim;
        String text;
        llenarMatriz(m);
        es_asim = matrizAntiSimetrica(m,3);
        MostrarMatrizTrans(m, 3);
        text = (es_asim == true) ? "ES ANTISIMETRICA LA MATRIZ" : "NO ES ANTISIMETRICA LA MATRIZ";
    }
    // Llleno Matriz con numeros random

    public static void llenarMatriz(int[][] m) {
        m[0][0] = 0;
        m[0][1] = -2;
        m[0][2] = 4;
        m[1][0] = 2;
        m[1][1] = 0;
        m[1][2] = 2;
        m[2][0] = -4;
        m[2][1] = -2;
        m[2][2] = 0;
    }


    
    public static void MostrarMatrizTrans(int[][] m,int n) {
        System.out.println("Transpuesta");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("[ " + m[j][i] + " ]");
            }
            System.out.println();
        }
    }
// Muestro Matriz
    public static boolean matrizAntiSimetrica(int[][] m,int n) {
        System.out.println("Normal");
        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((m[i][j]) != -(m[j][i])) {
                    cont++;
                }
                System.out.print("[ " + m[i][j] + " ]");
            }
            System.out.println();
        }
        boolean t = (cont >= 1) ? false : true;
        return t;
    }

}
