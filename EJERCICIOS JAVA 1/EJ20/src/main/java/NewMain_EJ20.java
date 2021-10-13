
import java.util.Scanner;

public class NewMain_EJ20 {

    
    public static void main(String[] args) {
    Scanner read = new Scanner (System.in);

        System.out.println("Ingresa la cantidad de euros");
        double eur = read.nextInt();
        
        System.out.println("A que moneda queres convertirlo?");
        System.out.println("[1] LIBRAS");
        System.out.println("[2] DOLARES");
        System.out.println("[3] YEN JAPONES");

        int choose = read.nextInt();
 
        exchange(eur,choose);
    }

    public static void exchange(double eur, int choose) {

        switch (choose){
            case 1:
                System.out.println("El valor de €" + eur + " a libras es £" + (eur * 0.86));
                break;
            case 2:
                System.out.println("El valor de €" + eur + " a dolares es $" + (eur * 1.28611));
                break;
            case 3:
                System.out.println("El valor de €" + eur + " a yen japones es ¥" + (eur * 129.852));
                break;
            default:
                System.out.println("Datos ingresados incorrectos");
        }
    }

}
