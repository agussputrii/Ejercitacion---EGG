package com.mycompany.ej16;
//importamos the pinchi scanner
import java.util.Scanner;

public class mainej16 {
    
    public static void main(String[] args) {
        //the pinchi scanner
        Scanner read = new Scanner (System.in);
        //defino parametros
        String chain;
        int correctos = 0;
        int incorrectos = 0;
        String cut = "&&&&&";
        System.out.println("Ingresa la cadena de caracteres");
        //ingresamos al bucle
        do {           
        chain = read.next();
        chain = chain.toUpperCase();
            if (chain.length() == 5) {//si long = 5 inicia la segunda verificacion
                if (chain.substring(0,1).equals("X") && chain.substring(4,5).equals("O")){
                correctos = correctos + 1;
                }
            }
            else {
                incorrectos = incorrectos + 1;
            } 
        }while (!chain.equals(cut));//si "chain" == "&&&&&" se corta
        System.out.println("Numero de cadenas CORRECTAS:["+correctos+"]");
        System.out.println("Numero de cadenas INCORRECTAS: ["+incorrectos+"]");
    } 
}
