package entidades;

import java.util.ArrayList;
//Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de

//Jugadores) y Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
//jugadores y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
//sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
//tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
public class Juego {

    private ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
    private Revolver revolver;
    private int cantidadjugadores;
    
    public Juego() {
    }

    public Juego(ArrayList<Jugador> listaJugadores, Revolver revolver) {
        this.revolver = revolver;
        this.listaJugadores = listaJugadores;
    }

    
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

        this.listaJugadores = jugadores;
        this.revolver = r;
        for (int i = 0; i < cantidadjugadores; i++) {
            Jugador j = new Jugador();
            j.setIdJugador(i+1);
            
        }

    }

    public void ronda() {
        this.revolver.llenarRevolver();//llenamos el revolver

        this.listaJugadores.forEach((p) -> {

            p.disparo(this.revolver);
            if (p.getMojado().equals(true)) {
                System.out.println(p.getNomJugador() + " Recibio el disparo");
                System.out.println("------- JUEGO FINALIZADO -------");
            }
            return;
        });

    }

    public String toString() {
        return "Juego [jugadores=" + listaJugadores + ", revolver=" + revolver + "]";
    }

}
