
package com.mycompany.poo3;

//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.

import java.util.Scanner;


public class Operacion {
    private double numero1,numero2;
    
//a) Método constructor con todos los atributos pasados por parámetro.
    public Operacion(double numero1,double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
    }
    
//b) Metodo constructor sin los atributos pasados por parámetro.
    public Operacion(){
        
    }
    
//c) Métodos get y set.
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
//Método para crearOperacion(): que le pide al usuario los dos números y los
//guarda en los atributos del objeto
    public void crearOperacion(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingresa el primer numero");
        this.numero1 = sc.nextDouble();
        System.out.println("Ingresa el segundo numero");
        this.numero2 = sc.nextDouble();
    }
//Método sumar(): calcular la suma de los números y devolver el resultado al main
    public double sumar(){
        return (this.numero1 + this.numero2);
    }
    
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public double restar(){
        return (this.numero1 - this.numero2);
    }
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero,
//si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el
//error. Si no, se hace la multiplicación y se devuelve el resultado al main
    public double multiplicar() {
        double multi = 0;
        if (this.numero1 == 0 || this.numero2 == 0) {
            return multi = 0;
        } else {
            return (numero1 * numero2);
        }
    }

//Método dividir(): primero valida que no se haga una división por cero, si fuera a
//pasar una división por cero, el método devuelve 0 y se le informa al usuario el
//error se le informa al usuario. Si no, se hace la división y se devuelve el resultado
//al main.
    public double dividir(){
        double div = 0;
        if (this.numero1 == 0 || this.numero2 == 0) {
        return div = 0;
        }else{
            return (numero1 / numero2);
        }
    }
    
}
