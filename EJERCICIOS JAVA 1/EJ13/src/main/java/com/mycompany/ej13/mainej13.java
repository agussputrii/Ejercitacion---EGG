package com.mycompany.ej13;

import java.util.Scanner;

public class mainej13 {
   /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
    solicite números al usuario hasta que la suma de los números introducidos supere
    el límite inicial. */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        //definimos
        int var_num;
        int final_num;
        int adder;
        adder = 0;
        //pedimos el numero final
        System.out.println("Ingrese el numero limite");
        final_num = read.nextInt();
        //empezamos a sumar
        System.out.println("Ingresa numeros hasta que se supere el limite anterior");
        
        do {
        var_num = read.nextInt();
        adder = adder + var_num;
            System.out.println("Numero actual: [" + adder + "] Numero al que se espera superar: [" +final_num+ "]");
        } while (adder <= final_num);
        
        System.out.println("Numero final [" + final_num + "] superado con exito [" + adder + "]");
    }
    
}
