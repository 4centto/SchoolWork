
package repetitivas;

import java.util.Scanner;

public class Problema10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = 0, PRI = 0, SEG = 1, SIG = 0;
        
        System.out.println("Valor hasta el que culminara la sucesion: ");
        N = in.nextInt();
        
        for(int i = 3; i <= N; i++){
            
            SIG = PRI + SEG;
            PRI = SEG;
            SEG = SIG;
            
        }
        
        System.out.println("El valor " + N + " de la sucesion FIBONACCI es: " + SIG);
        
    }
    
}
