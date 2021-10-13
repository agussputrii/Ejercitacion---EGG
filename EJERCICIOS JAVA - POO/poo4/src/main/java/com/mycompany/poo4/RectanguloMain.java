
package com.mycompany.poo4;

public class RectanguloMain {

    public static void main(String[] args) {
        
        Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        System.out.println("Superficie del rectangulo: [" + r1.calcularSuperficie()+"]");
        System.out.println("Perimetro del rectangulo: [" + r1.calcularPerimetro()+"]");
        
        // llamada al metodo que dibujara el rectangulo
        r1.dibujarRectangulo();
    }
    
}
