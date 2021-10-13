
package ejercicio02_relaciones;

import entidades.Juego;
import entidades.MenuRuso;
import java.util.Scanner;


public class Ejercicio02_Relaciones {

    public static void main(String[] args) {
       Juego game = new Juego();
       MenuRuso.menuRusso();
      Scanner sc = new Scanner (System.in);
      sc.nextLine();
       game.ronda();
    }
    
}
