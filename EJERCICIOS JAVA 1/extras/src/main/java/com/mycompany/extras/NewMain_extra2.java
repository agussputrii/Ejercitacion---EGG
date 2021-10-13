
package com.mycompany.extras;

import java.util.Scanner;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar.
 */
public class NewMain_extra2 {

    public static void main(String[] args) {
        Scanner read = new Scanner (System.in);
        
        System.out.println("Ingresa Los valores de:");
        System.out.println("[A]");
        int varA = read.nextInt();
        System.out.println("[B]");
        int varB = read.nextInt();
        System.out.println("[C]");
        int varC = read.nextInt();
        System.out.println("[D]");
        int varD = read.nextInt();
        BtoC ( varB, varC);
        CtoA (varC,varA);
        AtoD(varA,varD);
        DtoB(varD,varB);
    }
    
    public static void BtoC (int varB, int varC){
        varB = varB + varC;
        varC = varB - varC;
        varB = varB - varC;
        System.out.println("Ahora B vale "+varB);
    }
        public static void CtoA (int varC, int varA){
        varC = varC + varA;
        varA = varC - varA;
        varC = varC - varA;
        System.out.println("Ahora C vale "+varC);
    }
    public static void AtoD (int varA, int varD){
        varA = varA + varD;
        varD = varA - varD;
        varA = varA - varD;
        System.out.println("Ahora A vale "+varA);
    }
    public static void DtoB (int varD, int varB){
        varD = varD + varB;
        varB = varD - varB;
        varD = varD - varB;
        System.out.println("Ahora D vale "+varD);
    }
        
}
