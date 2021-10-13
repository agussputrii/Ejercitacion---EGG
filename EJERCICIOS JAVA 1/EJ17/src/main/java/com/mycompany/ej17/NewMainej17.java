/**
 * 18. Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
 * del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya
 * por una E.
 * 	0-0-0
 *	0-0-1
 *	0-0-2
 *	0-0-E
 *	0-0-4
 */
package com.mycompany.ej17;

public class NewMainej17 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    System.out.print(i != 3 ? i : "E");//si i es diferente de 3 se imprime i, si es igual se imprime "E"
                    System.out.print("-");
                    System.out.print(j != 3 ? j : "E");
                    System.out.print("-");
                    System.out.println(k != 3? k : "E");
                    
                }
            
            }
        }
    }
    
}
