package Date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date.
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nota actualmente se considera la Clase Date como una clase "obsoleta", 
        // por ende he usado la Clase LocalDate del paquete java.time
        int dia, mes, anio;

        System.out.println("Ingrese el dia: ");
        dia = sc.nextInt();

        System.out.println("Ingrese el mes: ");
        mes = sc.nextInt();

        System.out.println("Ingrese el año: ");
        anio = sc.nextInt();

        sc.close();

        //creamos fecha con datos ingresados
        LocalDate fechaInput = LocalDate.of(anio, mes, dia);
        //obtenemos fecha actual
        LocalDate fechaActual = LocalDate.now();

        //mostramos las fechas
        System.out.println("La fecha ingresada es [" + fechaInput + "]");
        System.out.println("La fecha actual es [" + fechaActual + "]");

        /*
	 * Calculamos el periodo de tiempo entre las fechas con el uso de la clase
	 * ChronoUnit de la siguiente manera: ChronoUnit.YEARS.between(fechaNacimiento,
         * fechaActual);
         */
        long aniosEntre = ChronoUnit.YEARS.between(fechaInput, fechaActual);
        System.out.println("Los años entre las fechas anteriores son "+aniosEntre);
    }

}
