/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.entidades;

/**
 *
 * @author Agus
 */
public class Perro {
    
    //atributo
    private String raza;

    //constructores
    public Perro() {
    }
    
    

    public Perro(String raza) {
        this.raza = raza;
    }
    
    //getters & setters
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    //toString

    @Override
    public String toString() {
        return "Perro{" + "raza= " + raza + '}';
    }
    
    
    
}
