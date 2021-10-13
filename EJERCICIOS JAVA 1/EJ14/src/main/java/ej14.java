import java.util.Scanner;

public class ej14 {


    public static void main(String[] args) {
       //hacemos el scanner
        Scanner read = new Scanner(System.in);
        double res;
        String answer = "n";
        //Pedimos numeros
        System.out.println("Ingrese dos numeros");
        double num1;
        num1 = read.nextInt();
        double num2;
        num2 = read.nextInt();
        do{ 
            System.out.println("Que desea hacer?");
            System.out.println("[1] SUMAR");
            System.out.println("[2] RESTAR");
            System.out.println("[3] MULTIPLICAR");
            System.out.println("[4] DIVIDIR");
            System.out.println("[5] SALIR");
            int choose;
            choose = read.nextInt();
            switch (choose) {
                case 1:
                    res = num1 + num2;
                    System.out.println("El resultado es [" + res + "]");
                    break;
                case 2:
                    res = num1 - num2;
                    System.out.println("El resultado es [" + res + "]");
                    break;
                case 3:
                    res = num1 * num2;
                    System.out.println("El resultado es [" + res + "]");
                    break;
                case 4:
                    res = num1 / num2;
                    System.out.println("El resultado es [" + res + "]");
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir del programa?(S/N)");
                    answer = read.next();
                    if (answer.equals("n")) {
                    break;
                    }
            }
                        
            
        } while(!"s".equals(answer));
    }
    
}
