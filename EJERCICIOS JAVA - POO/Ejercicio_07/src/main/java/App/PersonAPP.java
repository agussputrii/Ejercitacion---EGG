package App;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidades.Persona;
import servicios.ServiciosPersona;

public class PersonAPP {


    public static void main(String[] args) {
        // intanciamos la clase ServiciosPersona para hacer uso de los metodos
        ServiciosPersona serv = new ServiciosPersona();
        Persona toString = new Persona();
        
        // instanciamos 4 Objetos de tipo persona
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        // Damos valores a los objetos de tipo persona y los mostramos
        serv.crearPersona(p1);
        serv.crearPersona(p2);
        serv.crearPersona(p3);
        serv.crearPersona(p4);
        
        // validamos la edad de las 4 personas
       serv.esMayorDeEdad(p1);
       serv.esMayorDeEdad(p2);
       serv.esMayorDeEdad(p3);
       serv.esMayorDeEdad(p4);
        
        //calculamos el IMC de las 4 personas
        System.out.println(p1.toString());
        serv.calcularIMC(p1);
        System.out.println("");
        
        System.out.println(p2.toString());
        serv.calcularIMC(p2);
        System.out.println("");
        
        System.out.println(p3.toString());
        serv.calcularIMC(p3);
        System.out.println(""); 
        
        System.out.println(p4.toString());
        serv.calcularIMC(p4);
        System.out.println("");        
    }
    
}
