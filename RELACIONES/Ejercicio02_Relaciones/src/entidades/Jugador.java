/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Agus
 */
public class Jugador {

    private Integer idJugador;
    private String nomJugador;
    private Boolean mojado;

    public Jugador() {
    }

    public Jugador(Integer idJugador, String nomJugador, boolean mojado) {
        this.idJugador = idJugador;
        this.nomJugador = nomJugador;
        this.mojado = mojado;
    }

    public Jugador(Integer idJugador, String nomJugador) {
        if (idJugador.equals(null) || idJugador.equals(0) ||idJugador < 7) {
            idJugador = 6;
        }
        this.idJugador = idJugador;
        this.nomJugador = nomJugador + " " + idJugador;
        this.mojado = false;
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNomJugador() {
        return nomJugador;
    }

    public void setNomJugador(String nomJugador) {
        this.nomJugador = nomJugador + " " + this.idJugador;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }
    

    public void disparo(Revolver r) {// Si mojar es igual a true significa que se mojeo
        // tonces pongo mojado en true si no dejo mojado en false y paso al siguiente
        // chorro
        if (r.mojar() == true) {
            this.mojado = r.mojar();
        } else {
            r.siguienteChorro();
        }
    }

}
