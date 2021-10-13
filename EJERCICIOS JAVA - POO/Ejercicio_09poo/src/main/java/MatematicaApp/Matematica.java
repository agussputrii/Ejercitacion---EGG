package MatematicaApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Agus
 */
public class Matematica {
    //atributos
    private double num1,num2;

    public Matematica() {
    }

    public Matematica(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void devolverMayor() {
        //redondeamos valores con round
        this.num1 = Math.round(num1);
        this.num2 = Math.round(num2);

        if (num1 > num2) {
            System.out.println("El numero "+num1+" Es mayor que el numero "+num2);
        } else if (num1 < num2) {
            System.out.println("El numero "+num2+" Es mayor que el numero "+num1);
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
//para calcular la potencia del mayor valor de la clase
//elevado al menor número. Previamente se deben redondear ambos valores
    
    public void calcularPotencia(){
        //redondeamos valores con round
        this.num1 = Math.round(num1);
        this.num2 = Math.round(num2);
        
        if (num1 > num2) {
            double potencia = Math.pow(num1, num2);
            System.out.println("El numero ["+num1+"] elevado a ["+num2+"] da como resultado: ["+potencia+"]"); 
        }
        else if (num2 > num1) {
            double potencia = Math.pow(num2, num1);
            System.out.println("El numero ["+num2+"] elevado a ["+num1+"] da como resultado: ["+potencia+"]");
        }
        else{
            System.out.println("[Error] No se pudo calcular la potencia. Los numeros son iguales"); 
        }
    }
    
//Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
//Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calcularRaiz(){
        //obtenemos el valor absoluto con abs
        this.num1 = Math.abs(num1);
        this.num2 = Math.abs(num2);
        
        //validacion de que numero es menor
        if (num1<num2) {
            double raiz = Math.sqrt(num1);
            System.out.println("La raiz cuadrada de [" + num1 + "] es [" + raiz + "]");
        }else if (num1>num2){
            double raiz = Math.sqrt(num2);
            System.out.println("La raiz cuadrada de [" + num2 + "] es [" + raiz + "]");
        }
        
    }
    
}
