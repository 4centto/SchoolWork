
package complementarios.problema12;

import java.util.Scanner;

public class Problema12 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        
        Problema1212 mensajero = new Problema1212(A, B, C);
        mensajero.LlenarArreglo();
        mensajero.ImpresionArreglos();
        mensajero.Operaciones();
    }
    
}
