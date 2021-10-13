package eureka;

import java.util.Scanner;

/**
 @author Agus
 */
public class eureka {
    /*
    
    */
    public static void main(String[] args) {
    //hacemos el pinche escaner
    Scanner read = new Scanner (System.in);
    //definimos y pedimos la palabra   s e c r e t a
        String secret_word;
        secret_word = "eureka";
        
        String sentence;
        System.out.println("Escribi la palabra secreta");
        sentence = read.next();
        
        //hacemos nuestra condicion para verificar
        
        if (sentence.equals(secret_word)) {
          System.out.println("HAS INGRESADO A LA BASE DE DATOS"); 
            
        }
        else {
            System.out.println("PALABRA SECRETA INCORRECTA, EN 10 MINUTOS CAE EL MOVIL A TU CASA");
        }
    }
    
}
