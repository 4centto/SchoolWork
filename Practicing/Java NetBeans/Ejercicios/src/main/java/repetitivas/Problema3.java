
package repetitivas;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = 0;
        float SUMA = 0;
        int i = 1;
        boolean FLAG = true;
        
        System.out.println("Dame el valor maximo de la sucesion: ");
        N = in.nextInt();
        
        while(i <= N){
            
            if(FLAG == true){
                SUMA = (float)(SUMA + (1/i));
                FLAG = false;
            } else if(FLAG == false){
                SUMA = (float)(SUMA - (1/i));
                FLAG = true;
            }
            
            System.out.println(SUMA);
            
            i++;
            
        }
        
        System.out.println("El resultado es: " + SUMA);
        
    }
    
}
