package temperature;
import java.util.Scanner;
public class temperatureclass {

    /**
    Dada una cantidad de grados centígrados se debe mostrar su equivalente en
    grados Fahrenheit.
     */
    public static void main(String[] args) {
        //jhacemos nuestro escaner
        Scanner read = new Scanner(System.in);
        //definimoss
        int celsius;
        int faren;
    
        System.out.println("Ingresa la temperatura");
        celsius = read.nextInt();
        //hacemos el calculo, la fórmula correspondiente es: F = 32 + (9 * C / 5).
        faren = 32 + (9 * celsius / 5);
        //mostramos el resultado
        System.out.print("La conversion de Celsius: "+celsius+"C° a fahrenheit es "
        +faren+"ºF.");
    }
    
}
