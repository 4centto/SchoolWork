
package selectivas;

import java.util.Scanner;

public class Problema4 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float a, res;
        
        System.out.println("Dame el valor: ");
        a = in.nextFloat();
        
        res = a % 2;
        
        if(res == 0){
            
            System.out.println(a + " es un numero par");
            
        } else if(a != 0){
            
            System.out.println(a + " no es un numero par");
            
        }
        
    }
    
}
