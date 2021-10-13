/**
@author Agus
 */
package ej1;
import java.util.Scanner;
public class SUMA {

    public static void main(String[] args) {
        //defino variables
        int num_two;
        int num_one;
        int res;
        //asigno mi escaner de datos de entrada
        Scanner leer = new Scanner(System.in);
        //Pedimos el primer numero
        System.out.println("Ingresa el primer numero a sumar");
        num_one = leer.nextInt();
        //Pedimos el segundo numero
        System.out.println("Ingresa el segundo numero a sumar");
        num_two = leer.nextInt();
        //asignamos el resultado
        res = num_one + num_two;
        System.out.println("El resultado es "+res);
    }
    
}
