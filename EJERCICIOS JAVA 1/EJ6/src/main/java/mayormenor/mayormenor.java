package mayormenor;

import java.util.Scanner;

public class mayormenor {

    //Implementar un programa que dado dos números enteros determine cuál es el
    //mayor y lo muestre por pantalla.

    public static void main(String[] args) {
       //definimoss
       int num1;
       int num2;
       //nuestro escaner
       Scanner read = new Scanner(System.in);
       //pedimos numeros
        System.out.println("Escriba el primer numero a comparar");
        num1 = read.nextInt();
        System.out.println("Escriba el segundo numero a comparar");
        num2 = read.nextInt();
        
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor");
        
        } 
            else if (num1 < num2) {
            System.out.println("El numero " + num2 + " es mayor");
            }

    }
        
    }
    
