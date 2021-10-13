/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion.servicios;

import coleccion.entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
import java.util.Iterator;
/**
 *
 * @author Agus
 */
public class Servicios {
    public void PedirRaza(){
        Perro perrito;
        int desicion = -1;
        ArrayList <Perro> listaRaza = new ArrayList<Perro>();
        Scanner sc = new Scanner (System.in).useDelimiter("\n");
        
        do {            
            System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
            System.out.println(" Ingrese una raza de perro para almacenar");
            
            String raz = sc.next();//se ingresa la raza
            perrito = new Perro();
            perrito.setRaza(raz);//se setea y se guarda la raza
            
            listaRaza.add(perrito);//agrego la raza a mi listaRaza
            
            System.out.println("Desea agregar otra raza o salir del sistema?");
            System.out.println("| [1]- CONTINUAR | [0]- SALIR | ");
            
            //pedimos la decision
            desicion = sc.nextInt();
            
            
        } while (desicion != 0);
        
        //muestro perros
        //listaRaza.forEach(System.out::println);
           for (Perro cadena : listaRaza) {

            System.out.println(cadena);
        }
           
        System.out.println("Tamano de la lista: "+listaRaza.size());
        
        
        System.out.println("Ingrese raza a buscar en la lista para eliminarla si existe");
        String nombre = sc.next();
        
        //eliminamos nombre si existe
        Iterator<Perro> it = listaRaza.iterator();
        
        while (it.hasNext()) {
            Perro aux = it.next();
            if (aux.equals(nombre)) {
                listaRaza.remove(it);
            }
        }

        listaRaza.forEach(System.out::println);
        for (int i = 0; i < listaRaza.size(); i++) {// Elimino el nombre si existe
            if (listaRaza.get(i).getRaza().equalsIgnoreCase(nombre)) {
                listaRaza.remove(i);
                System.out.println(nombre + " REMOVIDO");
                i = listaRaza.size();

            }
        }
        
        listaRaza.forEach(System.out::println);
        System.out.println("Tamano de la lista: "+listaRaza.size()); 
    }
        
    
}
