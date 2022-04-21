
package selectivas;

import java.util.Scanner;

public class Problema2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int P, Q, RES;
        
        System.out.println("Cual es el valor P: ");
        P = in.nextInt();
        
        System.out.println("Cual es el valor Q: ");
        Q = in.nextInt();
        
        RES = (P * P * P) + (Q * Q * Q* Q) - 2 * (P * P);
        
        if(RES < 680){
            
            System.out.println("Los numeros P = " + P + " y Q = " + Q + ", cumplen con la condicion con un resultado de: " + RES);
            
        } else {
            
            System.out.println("Los numeros no cumplen con la condicion");
            
        }
        
    }
    
}
