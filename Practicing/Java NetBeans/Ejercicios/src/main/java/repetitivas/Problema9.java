
package repetitivas;

import java.util.Scanner;

public class Problema9 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = 0, TOTAL = 0;
        
        System.out.println("Dame un numero: ");
        N = in.nextInt();
        
        for(int i = 1; i <= N; i++){
            
            TOTAL = TOTAL + (int)(Math.pow(i, i));
            
        }
        
        System.out.println("Total: " + TOTAL);
        
    }
    
}
