/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 * Programa Nespresso. Desarrolle una clase Cafetera con los atributos
 * capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
 * cantidadActual (la cantidad actual de café que hay en la cafetera).
 * Implemente, al menos, los siguientes métodos: • Constructor predeterminado o
 * vacío • Constructor con la capacidad máxima y la cantidad actual • Métodos
 * getters y setters.
 */
public class Cafetera {
    //atributos
    public int CapacidadMaxima, CapacidadActual;
    
    //constructor vacio
    public Cafetera() {

    }
    //constructor con parametros
    public Cafetera(int CapacidadMaxima, int CapacidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CapacidadActual = CapacidadActual;
    }
    
    //getters y setters
    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public int getCapacidadActual() {
        return CapacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }


}
