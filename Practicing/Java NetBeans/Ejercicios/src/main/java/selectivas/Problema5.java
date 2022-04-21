
package selectivas;

import java.util.Scanner;

public class Problema5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float a, b, c;
        
        System.out.println("Dame el primer valor: ");
        a = in.nextFloat();
        
        System.out.println("Dame el segundo valor: ");
        b = in.nextFloat();
        
        System.out.println("Dame el tercer valor: ");
        c = in.nextFloat();
        
        if(a < b && a < c){
            
            if(b > a && b < c){
                
                if(c > a && c > b){
                    
                    System.out.println("Los numeros estan ordenados de manera creciente");
                    
                } else {
                    
                    System.out.println("Los numeros no estan ordenados de forma creciente");
                    
                }
                
            } else {
                
                System.out.println("Los numeros no estan ordenados de forma creciente");
                
            }
            
        } else {
            
            System.out.println("Los numeros no estan ordenados de forma creciente");
            
        }
        
    }
    
}
