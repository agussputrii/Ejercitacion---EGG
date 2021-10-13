/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaAPP;

import PersonaAPP.Persona;
import PersonaAPP.ServicioPersona;

public class PersonaMain {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        ServicioPersona serv = new ServicioPersona();

        serv.crearPersona(p1);
        serv.mostrarPersona(p1);
        System.out.println("El tiempo transcurrido desde la fecha de nacimiento hasta hoy es de [ " + serv.calcularEdad(p1) + " ] años");
        if (serv.esMayor(p1)==true) {
            System.out.println("El usuario es mayor");
        }
        else{
            System.out.println("El usuario es menor");
        }
    }

}
