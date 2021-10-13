/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaAPP;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Agus
 */
public class ServicioPersona {

    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona(Persona p) {

        System.out.println("\nIngrese nombre: ");
        String nombre = input.nextLine();

        System.out.println("\nIngrese la fecha de nacimiento.");
        System.out.println("Año: ");
        int anio = input.nextInt();

        System.out.println("Mes: ");
        int mes = input.nextInt();

        System.out.println("Dia: ");
        int dia = input.nextInt();

        // Se crea la fecha para pasarla al Objeto Persona
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);

        p.setNombre(nombre);
        p.setFechaNacimiento(fechaNacimiento);

        // Creamos el objeto directamente en el return
        // es igual a decir Persona p = new Persona(nombre, apellido, fechaNaciemiento);
        return new Persona(nombre, fechaNacimiento);
    }

    public void mostrarPersona(Persona p) {
        System.out.println("\n=======================");
        System.out.println(p.toString());
        System.out.println("\n=======================");
    }

    public int calcularEdad(Persona p) {
        //traemos edad
        LocalDate fechaNacimiento = p.getFechaNacimiento();

        //fecha actual
        LocalDate fechaHoy = LocalDate.now();

        //calculamos la edad con el tiempo transcurrido entre fechas
        int calcularEdad = (int) ChronoUnit.YEARS.between(fechaNacimiento, fechaHoy);
        return calcularEdad;
    }
    
    public boolean esMayor (Persona p){
        boolean esMayor = false;
        int edad = calcularEdad(p);
        
        if (edad < 18) {
            esMayor = false;
        }
        else {
            esMayor = true;
        }
        
        return esMayor;
    }
    
}
