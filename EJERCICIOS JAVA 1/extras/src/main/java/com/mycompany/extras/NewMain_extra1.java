
package com.mycompany.extras;
import java.text.DecimalFormat;
import java.util.Scanner;
public class NewMain_extra1 {
/*
    Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si
    el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2
    horas.
    */
    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        System.out.println("Ingrese el tiempo en minutos");
        double minutos = read.nextInt();
        conversion(minutos);
    }
    public static void conversion(double minutos){
        DecimalFormat df = new DecimalFormat("#.00");
        double horas;
        horas = minutos/60;
        double dias;
        dias = minutos/1440;
        System.out.println("Los minutos ingresados equivalen a:");
        System.out.println("["+df.format(horas)+"] Horas");
        System.out.println("["+df.format(dias)+"] Dias");
    }
}
