package com.mycompany.ej15;

import java.util.Scanner;

public class mainej15 {

    /*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int counter = 0;
        //pedimos los numeros
        int num = 0;
        int suma = 0;
        System.out.println("Ingresa 20 numeros");
        for (int i = 0; //índice de control
                i < 20; // condición booleana
                i++) {  // modificación del índice tras cada bucle
            num = read.nextInt();
            counter = counter + 1;
            if (num == 0) {
                System.out.println("SE CAPTURO EL NUMERO CERO");
                System.out.println("Numeros registrados antes de encontrar el 0: ["+(counter-1)+"]");
                break;
            }
            if (num > 0) {
               suma = suma + num;    
            }
        }
        System.out.println("Suma de los numeros ingresados: ["+suma+"]");
    }   
}
