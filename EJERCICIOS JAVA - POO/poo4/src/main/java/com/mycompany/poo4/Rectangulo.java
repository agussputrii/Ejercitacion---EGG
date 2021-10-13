/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura.
 */
package com.mycompany.poo4;

//Crear una clase Rectángulo
import java.util.Scanner;

public class Rectangulo {

    //parametros
    private int base, altura;

    //constructor vacio
    public Rectangulo() {

    }

    //constructor cargado
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //La clase incluirá un método para crear el rectángulo con
    //los datos del Rectángulo dados por el usuario.
    public void crearRectangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la base de tu rectangulo");
        base = sc.nextInt();

        System.out.println("Ingresa la altura de tu rectangulo");
        altura = sc.nextInt();

    }
///////////////////////////////////////////////////////////////////////
    //Getters y Setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
///////////////////////////////////////////////////////////////////////
    // Calculo el perimetro

    public int calcularPerimetro() {
        int perimetro = ((this.base + this.altura) * 2);
        return perimetro;
    }

    // Calculo la superficie de un rectangulo
    public double calcularSuperficie() {
        int superficie = ((this.base * this.altura) / calcularPerimetro());
        return superficie;
    }
///////////////////////////////////////////////////////////////////////
    //metodo para dibujar el rectangulo

    public void dibujarRectangulo() {
        // i recorre la altura
        for (int i = 1; i <= altura; i++) {
            // j recorre la base
            for (int j = 1; j <= base; j++) {

                if ((i > 1 && i < altura) && (j > 1 && j < base)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
