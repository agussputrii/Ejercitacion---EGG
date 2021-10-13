package servicios;

import entidades.Persona;
import java.util.Scanner;

public class ServiciosPersona {
//Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
//al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
//O. Si no es correcto se deberá mostrar un mensaje

    //String nombre, int edad, String sexo, int peso, double altura
    public void crearPersona(Persona p) {
        boolean prueba=false;
        Scanner sc = new Scanner(System.in); //scanner
        //pido nombre
        System.out.println("Ingresa el nombre de la persona");
        String nombre = sc.nextLine();
        p.setNombre(nombre);//seteo nombre
        //pido edad
        System.out.println("Ingresa la edad");
        int edad = sc.nextInt();
        p.setEdad(edad);//seteo edad
        //pido sexo

        do {
            
            System.out.println("Ingresa el sexo ( H = hombre | M = mujer | O = otro )");
            String sexo = sc.next();
            sexo = sexo.toUpperCase();
            
            prueba = ((sexo.equals("M")) || (sexo.equals("H")) || (sexo.equals("O"))) ? true : false;
            if (prueba == false) {
                System.out.println("Dato sexo incorrecto");
            }else{
                prueba = true;
                p.setSexo(sexo);
                
            }
        } while (prueba==false);

        //pido peso
        System.out.println("Ingresa el peso");
        int peso = sc.nextInt();
        p.setPeso(peso);//seteo peso

        //pido altura
        System.out.println("Ingresa estatura (formato de ejemplo | [173cm] = [1,73] )");
        double altura = sc.nextDouble();
        p.setAltura(altura);//seteo altura
        
        System.out.println();
        System.out.println("=================================");
        System.out.println(" [ Persona Creada correctamente! ]");
        System.out.println();
    }

//Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
//función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
//(incluidos), significa que el peso está por debajo de su peso ideal y la función
//devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
//significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
//hacer uso de constantes para devolver estos valores.
    public Integer calcularIMC(Persona p){
        //pedimos valores
        int peso = p.getPeso();
        double altura = p.getAltura();
        
        System.out.println("| PESO POR DEBAJO = -1 | PESO NORMAL = 0 | SOBREPESO = 1 |");
        
        
        final int PESO_DEBAJO = -1;
        final int PESO_NORMAL = 0;
        final int PESO_SOBRE = 1;
        //calculamos IMC
        double calculo =  peso / (altura * altura);
        if (calculo < 20) {
            System.out.println(p.getNombre()+" [ -1 ] Su indice de masa corporal es "+calculo+" y se encuentra debajo del normal.");
            return PESO_DEBAJO;
        } else if ((calculo > 20) && (calculo < 25)){
            System.out.println(p.getNombre()+" [ 0 ] Su indice de masa corporal es "+calculo+" y se encuentra en el peso ideal.");
            return PESO_NORMAL;
        }else
            System.out.println(p.getNombre()+" [ 1 ] Su indice de masa corporal es "+calculo+" y posee sobrepeso.");
            return PESO_SOBRE;
    }

//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano
    public boolean esMayorDeEdad(Persona p){
        boolean mayor;
        if (p.getEdad() >= 18) {
            mayor = true;
            System.out.println(p.getNombre()+" Es mayor de edad.");
        } else {
            mayor = false;
            System.out.println(p.getNombre()+" Es menor de edad.");
        }
        return mayor;
    }
    
}


