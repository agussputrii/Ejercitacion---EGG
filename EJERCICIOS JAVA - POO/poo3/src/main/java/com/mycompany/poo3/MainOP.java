
package com.mycompany.poo3;


public class MainOP {

    public static void main(String[] args) {
        Operacion op1 = new Operacion();
        op1.crearOperacion();
        System.out.println("El resultado de las operaciones seria:");
        System.out.println("SUMA ["+op1.sumar()+"]");
        System.out.println("RESTA ["+op1.restar()+"]");
        System.out.println("MULTIPLICACION ["+op1.multiplicar()+"]");
        System.out.println("DIVISION ["+op1.dividir()+"]");
    }
    
}
