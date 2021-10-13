package com.mycompany.ej11;
import java.util.Scanner;
public class mainej11 {

    public static void main(String[] args) {
    //vamo con el escaner
    Scanner read = new Scanner (System.in);
    //pedimos el tipo de motor
        System.out.println("Ingrese el tipo de motor");
    int type_engine;
    type_engine = read.nextInt();
    //Hacemos el segun
            switch (type_engine){
                case 1: 
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe un valor valido para el tipo de bomba");
            }
    
    }
}
