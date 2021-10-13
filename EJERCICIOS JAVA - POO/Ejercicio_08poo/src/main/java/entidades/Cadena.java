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
public class Cadena {

    //parametros
    public String frase;
    public int longitudfrase;

    //constructor vacio
    public Cadena() {
    }

    //constructor lleno
    public Cadena(String frase, int longitudfrase) {
        this.frase = frase;
        this.longitudfrase = longitudfrase;
    }

    //getters y setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitudfrase() {
        return longitudfrase;
    }

    public void setLongitudfrase(int longitudfrase) {
        this.longitudfrase = longitudfrase;
    }



    
}
