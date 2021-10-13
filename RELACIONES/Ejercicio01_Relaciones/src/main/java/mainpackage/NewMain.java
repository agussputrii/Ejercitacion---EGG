/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import Adopcion.Perro;
import Adopcion.Persona;


public class NewMain {

    public static void main(String[] args) {
       Perro perro1 = new Perro("Ema","Bulldog Frances",4,30.5);
       Perro perro2 = new Perro("Fernando Chiquito","Beagle",6,43.4);
       
       Persona persona1 = new Persona("Agustin","Putrino",18,45139283,perro1);
       Persona persona2 = new Persona ("Crotolamo","Padalustro",500,00000001,perro2);
        System.out.println(persona1);
        System.out.println();
        System.out.println(persona2);
        
    }
    
}
