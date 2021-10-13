/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatematicaApp;



public class NewMain {

    public static void main(String[] args) {
        //creamos objeto
        Matematica mat = new Matematica();
        //numeros aleatorios donde 20 es el valor maximo y 5 el minimo, el 2do 5 sirve para que retorne valores de tipo dobule
        mat.setNum1(Math.random()*(20-5)-5);
        mat.setNum2(Math.random()*(20-5)-5);
        
        System.out.println("Los numeros generados son: ");
        System.out.println(mat.getNum1());
        System.out.println(mat.getNum2());
        System.out.println("");
        
        mat.devolverMayor();
        mat.calcularPotencia();
        mat.calcularRaiz();
        
    }
    
}
