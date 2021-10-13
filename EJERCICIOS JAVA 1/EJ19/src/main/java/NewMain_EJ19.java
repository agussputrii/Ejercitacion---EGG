import java.util.Scanner;
/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor.*/
public class NewMain_EJ19 {


    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        //leemos los 4 numeros
        int nums;
        System.out.println("Ingresa 4 numeros");
        nums = read.nextInt();
        int num1 = nums;
        nums = read.nextInt();
        int num2 = nums;
        nums = read.nextInt();
        int num3 = nums;
        nums = read.nextInt();
        int num4 = nums;
//hacemos que si el numero es 0  se imprima el numero original, sino que se imprima asteriscos y sumamos 1
            for (int i = 0; i < num1+1; i++) {
            System.out.print(i==0?"["+num1+"] ":"*");
            }System.out.println("");
            
            for (int i = 0; i < num2+1; i++) {
            System.out.print(i==0?"["+num2+"] ":"*");
            }System.out.println("");
            
            for (int i = 0; i < num3+1; i++) {
            System.out.print(i==0?"["+num3+"] ":"*");
            }System.out.println("");
            
            for (int i = 0; i < num4+1; i++) {
            System.out.print(i==0?"["+num4+"] ":"*");
            }System.out.println("");
    }   
}
