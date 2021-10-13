package name;

import java.util.Scanner;
public class name {


    /**
     Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
     por pantalla.
     */
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Ingresa el nombre");
    //asigno name y despues hago que me lo pida
    String name;
        name = read.nextLine();
    //hago que se imprima el nombre en pantalla
    System.out.println("Nombre: "+name);
    }
}
