/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real.
 */
package newpackage;

import java.util.Scanner;


public class Circunferencia {
   private double radio; // atributo privado
   private double area = 0.0;
   private double perimetro = 0.0;
   
   //Método constructor que inicialice el radio pasado como parámetro.
   public Circunferencia(double radio){
       this.radio = radio;
   }
   
   //Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    //Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
    //del objeto
    public void crearCircunferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el radio de la circunferencia");
        //guardo en variable y despues guardo en el atributo del objeto
        double radioaux = sc.nextDouble();
        this.radio = radioaux;
    }
    //Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    public void area(){
    //Guardo en area el area de la circunferencia
    //Math.PI me da el numero pi
    //Math.pow me calcula un numero en el primer parametro y la potencia de ese
    //numero |||||| Math.pow (7, 2)=49
    this.area = (Math.PI* (Math.pow(radio, 2)));
    
    }
    
    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public void perimetro(){
        double perimetroaux = 2 * Math.PI * radio;
        this.perimetro = perimetroaux;
    }
    
}
