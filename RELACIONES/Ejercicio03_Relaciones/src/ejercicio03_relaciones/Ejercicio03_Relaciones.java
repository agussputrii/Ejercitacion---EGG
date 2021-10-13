/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03_relaciones;

import entidades.Carta;
import servicios.Baraja;

/**
 *
 * @author Agus
 */
public class Ejercicio03_Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b = new Baraja();
        //Mostramos las cartas disponibles (40)
        b.mostrarCartas();
        System.out.println("\nHay " + b.cartasDisponibles() + " cartas disponibles");

        //Saco una carta
        b.siguienteCarta();

        //Saco 5 cartas
        b.darCartas(5);

        //Mostramos las cartas disponibles (34)
        System.out.println("\nHay " + b.cartasDisponibles() + " cartas disponibles");

        System.out.println("\nCartas sacadas de momento");

        b.cartasMonton();

        //Barajamos de nuevo
        b.barajar();

        //Saco 5 cartas
        Carta[] c = b.darCartas(5);

        System.out.println("\nCartas sacadas despues de barajar ");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }
}
