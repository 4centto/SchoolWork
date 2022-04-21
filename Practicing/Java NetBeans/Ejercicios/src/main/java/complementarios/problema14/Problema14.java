
package complementarios.problema14;

import java.util.Scanner;

public class Problema14 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int NUM = 0;
        int A[][] = new int[10][3];
        
        System.out.println("¿De que numero quieres saber la tabla? ");
        NUM = in.nextInt();
        
        Problema1414 operaciones = new Problema1414(A, NUM);
        operaciones.LlenadoDeMultiplos();
        operaciones.Impresion();
        
    }
}
