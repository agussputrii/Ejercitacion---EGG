package veterinaria;

import java.util.Scanner;

public class Perro {

    private String nombre; // atributo privado para el encapsulamiento

    private int edad; // atributo privado para el encapsulamiento

    private String raza; // atributo privado para el encapsulamiento

    private String sexo; // atributo privado para el encapsulamiento

    private double peso; // atributo privado para el encapsulamiento

    // Constructor Parametrizado o lleno
    public Perro(String nombre, int edad, String raza, String sexo, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
    }

    // Constructor con algunos parametros
    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    // Constructor Vacio o sin parametros o predeterminado 
    public Perro() {

//        this.edad = 20;
    }



    // Super setter o metodo llenar 
    public void llenarPerro(String nombre, int edad, String raza, String sexo, double peso) {

        // Se usa el this para diferenciar variable de atributo, ya que tienen el mismo nombre
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }

    //Mostrar perros mediante un metodo
    public void mostrarPerro() {

        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad del perro es: " + edad);
        System.out.println("La raza del perro es:" + raza);
        System.out.println("El sexo del perro es: " + sexo);
        System.out.println("El peso del perro es: " + peso);

    }

  
}
