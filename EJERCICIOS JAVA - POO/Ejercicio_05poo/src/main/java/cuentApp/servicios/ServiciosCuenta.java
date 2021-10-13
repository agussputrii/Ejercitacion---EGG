/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentApp.servicios;

import entidades.Cuenta;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class ServiciosCuenta {

    private Scanner sc = new Scanner(System.in);

    Cuenta nuevaCuenta = new Cuenta();

    /**
     * Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
     *
     * @return objeto tipo Cuenta
     */
    public Cuenta crearCuenta() {
        System.out.println("Ingresa el numero de la cuenta: ");
        int numCuenta = sc.nextInt();

        System.out.println("Ingresa el numero de dni: ");
        int dni = sc.nextInt();

        System.out.println("Ingresa el saldo actual: ");
        int saldo = sc.nextInt();
        //al objeto nueva cuenta le seteamos los datos ingresados
        nuevaCuenta.setNumeroCuenta(numCuenta);
        nuevaCuenta.setDni(dni);
        nuevaCuenta.setSaldoActual(saldo);

        return nuevaCuenta;
    }

    /**
     * Método ingresar(double ingreso): el método recibe una cantidad de dinero
     * a ingresar y se la sumara a saldo actual.
     */
    public void ingresarDinero(double ingreso) {
        System.out.println("Cuanto dinero desea ingresar: ");
        int saldo = nuevaCuenta.getSaldoActual(); //obtenemos el saldo de la cuenta
        ingreso = sc.nextDouble();
        saldo += ingreso;
        nuevaCuenta.setSaldoActual(saldo); //reasignamos el saldo
        
    }

    /**
     * El método recibe una cantidad de dinero a retirar y se la restará al
     * saldo actual.
     */
    public void retirarDinero(double retiro) {
        int saldo = nuevaCuenta.getSaldoActual(); //obtenemos el saldo de la cuenta
        System.out.println("Seleccione la cantidad de dinero a retirar");
        retiro = sc.nextDouble();
        if (retiro<saldo) { //validamos que el retiro no supere el saldo total
            saldo-= retiro; //restamos el retiro
            nuevaCuenta.setSaldoActual(saldo);//set del nuevo saldo
            System.out.println("Se han retirado $"+retiro+" de la cuenta, saldo actual: $"+nuevaCuenta.getSaldoActual());
        }
    }

    public void retiroRapido() {
        int saldo = nuevaCuenta.getSaldoActual(); //obtenemos el saldo de la cuenta
        double extraccion = saldo * 0.2;//20% de extraccion rapida
        if (extraccion > saldo && saldo < 0) {
            System.out.println("No se pudo realizar la extraccion, dinero insuficiente");
        } else {
            saldo -= extraccion;
            nuevaCuenta.setSaldoActual(saldo);
            System.out.println("Se ha relizado la extraccion rapida [$"+extraccion+"], saldo actual: $"+nuevaCuenta.getSaldoActual());
        }
    }
    
    public void menu() {
        System.out.println("///////////////////////////////////////////");
        System.out.println("CUENTA BANCARIA");
        System.out.println("MENU");
        System.out.println("1- Consultar datos cuenta bancaria");
        System.out.println("2- Consultar saldo cuenta bancaria");
        System.out.println("3- Sumar saldo a cuenta bancaria");
        System.out.println("4- Retirar saldo cuenta bancaria");
        System.out.println("5- Extraccion rapida de cuenta bancaria maximo un 20% de su saldo");
        System.out.println("0- Para salir");
        System.out.println("///////////////////////////////////////////");
    }
    
}
