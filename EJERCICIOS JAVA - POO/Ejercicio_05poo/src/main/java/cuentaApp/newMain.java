
package cuentaApp;

import cuentApp.servicios.ServiciosCuenta;
import entidades.Cuenta;
import java.util.Scanner;

public class newMain {

    public static void main(String[] args) {
        ServiciosCuenta servicio = new ServiciosCuenta();
        Scanner sc = new Scanner(System.in);
        int eleccion = 8;
        Cuenta cuenta1 = servicio.crearCuenta();
        

        do {
            servicio.menu();
            eleccion = sc.nextInt();
                switch (eleccion) {
            case 1:
                cuenta1.consultarDatos();
                break;
            case 2:
                cuenta1.consultarSaldo();
                break;
            case 3:
                servicio.ingresarDinero(0);
                break;
            case 4:
                servicio.retirarDinero(0);
                break;
            case 5:
                servicio.retiroRapido();
                break;
            case 0:
                System.out.println("Saliendo del programa");
                break;
            default:
                System.out.println("La opcion selecionada no es valida, reintentar");
                break;
        }    
        } while (eleccion != 0);
        
        


    }

}
/*
        System.out.println("1- Consultar datos cuenta bancaria");
        System.out.println("2- Consultar saldo cuenta bancaria");
        System.out.println("3- Sumar saldo a cuenta bancaria");
        System.out.println("4- Retirar saldo cuenta bancaria");
        System.out.println("5- Extraccion rapida de cuenta bancaria maximo un 20% de su saldo");
        System.out.println("0- Para salir");
   }
*/