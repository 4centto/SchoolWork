
package repetitivas;

import java.util.Scanner;

public class Problema8 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int NUM = 0;
        
        System.out.println("Dame el valor entero: ");
        NUM = in.nextInt();
        
        while(NUM != 1){
            
            System.out.println(NUM);
            
            if((NUM % 2) == 0){
                
                NUM = NUM / 2;
                
            } else if((NUM % 2) != 0){
                
                NUM = (NUM * 3) + 1;
                
            }
            
        }
        
        System.out.println("Susecion Finalizada");
        
    }
    
}
