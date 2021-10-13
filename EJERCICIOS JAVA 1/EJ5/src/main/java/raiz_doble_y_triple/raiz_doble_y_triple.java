/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raiz_doble_y_triple;

import java.util.Scanner;

/**
Escribir un programa que lea un número entero por teclado y
* muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
* Nota: investigar la función Math.sqrt().
 */
public class raiz_doble_y_triple {

    public static void main(String[] args) {
        //creacion del scaner
        Scanner read = new Scanner(System.in);
        //pedimos numero
        System.out.println("Ingresa el numero");
        int num;
        num = read.nextInt();
        //defino los resultados
        double res_raiz = Math.sqrt(num);
        int doble_num = num * 2;
        int triple_num = num *3;
        //muestro los resultados
        System.out.println("La raiz de " + num + " es: [" + res_raiz + "]");
        System.out.println("El doble de " + num + " es: [" + doble_num + "]");
        System.out.println("El Triple de " + num + " es: [" + triple_num + "]");
    }
    
}
