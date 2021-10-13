/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Cafetera;
import java.util.Scanner;
import java.util.Set;

public class ServiciosCafetera {

    private Scanner sc = new Scanner(System.in);

    /**
     * permite instanciar un objeto de tipo Cafetera
     *
     * @return objeto del tipo Cafetera
     */
    public Cafetera crearCafetera() {

        System.out.println("Ingresa la capacidad maxima de su cafetera");
        int CapacidadMaxima = sc.nextInt();

        System.out.println("Ingresa la capacidad actual de su cafetera");
        int CapacidadActual = sc.nextInt();

        return new Cafetera(CapacidadMaxima, CapacidadActual);
    }

    /**
     * Método llenarCafetera(): hace que la cantidad actual sea igual a la
     * capacidad máxima.
     *
     * @param fill
     */
    public void llenarCafetera(Cafetera fill) {
        fill.setCapacidadActual(fill.getCapacidadMaxima());

        System.out.println("Se lleno la cafetera con exito");
    }

    /**
     * Método vaciarCafetera(): pone la cantidad de café actual en cero.
     *
     * @param empty
     */
    public void vaciarCafetera(Cafetera empty) {
        empty.setCapacidadActual(0);
        System.out.println("La cafetera se ha vaciado con exito");
    }

    /**
     * • Método servirTaza(int): se pide el tamaño de una taza vacía, el método
     * recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada. Si la cantidad actual de café “no alcanza” para
     * llenar la taza, se sirve lo que quede. El método le informará al usuario
     * si se llenó o no la taza, y de no haberse llenado en cuanto quedó la
     * taza.
     */
    public void servirTaza(Cafetera cafetera) {
        System.out.println("Ingrese el tamaño de la taza:");
        int tamanoTaza = sc.nextInt();

        int canActual = cafetera.getCapacidadActual();
        int calculo = canActual - tamanoTaza;

        // validamos la cantidad a servir
        if (canActual < tamanoTaza) {
            System.out.println("No se pudo llenar la taza de cafe, ya que la cantidad de cafe que quedaba era: " + canActual);
            System.out.println("Faltaron " + Math.abs(calculo) + " mililitros para llenar la taza");
            // seteamos la cantidad en 0
            cafetera.setCapacidadActual(0);

        } else if (canActual == tamanoTaza) {
            System.out.println("La taza se lleno completamente");
            System.out.println("La cafetera se vacio por completo");
            cafetera.setCapacidadActual(0);

        } else {
            System.out.println("La taza se lleno completamente");
            System.out.println("La cafetera quedo con una cantidad actual de " + calculo);
            // seteamos la cantidad restando la taza servida
            cafetera.setCapacidadActual(calculo);
        }

    }

    /**
     * Método agregarCafe(int): se le pide al usuario una cantidad de café, el
     * método lo recibe y se añade a la cafetera la cantidad de café indicada.
     */
    public void agregarCafe(Cafetera cafetera) {
        System.out.println("Ingrese el tamano de la taza");
        int cantidad = sc.nextInt(); //definimos el tamano de la taza
        int cantActual = cafetera.getCapacidadActual(); //traemos la cantidad actual de la cafetera

        int carga = cantActual + cantidad;
        // validamos que la carga no supere la cantidad maxima
        if (carga < cafetera.getCapacidadMaxima()) {
            // seteamos la carga a la cantidad a la cantidad actual
            cafetera.setCapacidadActual(carga);
            System.out.println("Se han cargado " + cantidad + " mililitros a la cafetera.");
            System.out.println("La cantidad actual es: " + cafetera.getCapacidadActual());
        } else {
            System.out.println("[ERROR] La cantidad que desea cargar supera la cantidad maxima.");
            System.out.println("La cantidad actual es: " + cafetera.getCapacidadActual());
            System.out.println("La cantidad maxima es: " + cafetera.getCapacidadMaxima());
        }
    }
    
    public void menu(){
        System.out.println("------------------------------------------------");
        System.out.println("--------------SELECCIONE QUE DESEA--------------");
        System.out.println("--------------[1] llenar cafetera --------------");
        System.out.println("--------------[2] servir taza ------------------");
        System.out.println("--------------[3] vaciar cafetera --------------");
        System.out.println("--------------[4] agregar cafe -----------------");
        System.out.println("--------------[5] Salir ------------------------");
        System.out.println("------------------------------------------------");
    }
}
