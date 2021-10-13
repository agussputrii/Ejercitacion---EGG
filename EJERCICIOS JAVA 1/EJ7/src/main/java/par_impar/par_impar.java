package par_impar;

import java.util.Scanner;

/**
 * @author Agus
 */
public class par_impar {

    public static void main(String[] args) {
        //definimoss
       int num;
       //nuestro escaner
       Scanner read = new Scanner(System.in);
       //pedimos numeros
        System.out.println("Escriba el numero que desea saber si es par o impar");
        num = read.nextInt();
        
        if (num % 2==0) {
            System.out.println("El numero " + num + " es PAR");
        } 
        else {
            System.out.println("El numero " + num + " es IMPAR");
        }

    }
    
}
