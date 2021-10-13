/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nespresso;

import servicios.ServiciosCafetera;
import entidades.Cafetera;
import java.util.Scanner;

public class NewMainCAFE {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        // intancia del servicio para acceder a los metodos
        ServiciosCafetera servicio = new ServiciosCafetera();
        //Instancia para crear nuestro objeto <Cafetera>
        Cafetera cafecin1 = servicio.crearCafetera();
        //Accedemos a los metodos por <servicio> mendiante el paquete <servicios.ServiciosCafetera>

        do {
            servicio.menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    servicio.llenarCafetera(cafecin1);
                    break;
                case 2:
                    servicio.servirTaza(cafecin1);
                    break;
                case 3:
                    servicio.vaciarCafetera(cafecin1);
                    break;
                case 4:
                    servicio.agregarCafe(cafecin1);
                    break;
                case 5:
                    System.out.println("SALIENDO DEL PROGRAMA");
                    break;
                default:
                    System.out.println("La opcion seleccionada no es valida");
            }
        } while (choose != 5);

    }
    //HAY PROBLEMAS CON EL MENU DEBIDO A EL DO - WHILE QUE HACE UN BUCLE, PARA QUITAR EL <ERROR>
    //QUITAR EL DO - WHILE

    }
