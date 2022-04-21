
package selectivas;

import java.util.Scanner;

public class Problema7 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float a, b, c ;
        
        System.out.println("Dame el valor de a: ");
        a = in.nextFloat();
        
        System.out.println("Dame el valor de b: ");
        b = in.nextFloat();
        
        System.out.println("Dame el valor de c: ");
        c = in.nextFloat();
        
        if(a > b && a > c){
            
            System.out.println("El numero mayor es a: " + a);
            
        } else if(b > a && b > c){
            
            System.out.println("El numero mayor es b: " + b);
            
        } else if(c > a && c > b){
            
            System.out.println("El numero mayor es c: " + c);
            
        } else if(a == b){
            
            if(a > c){
                
                System.out.println("Los numeros a y b son los mayores");
                
            }
            
        } else if(b == c){
            
            if(b > a){
                
                System.out.println("Los numeros b y c son los mayores");
                
            }
            
        } else if(a == c){
            
            if(a > b){
                
                System.out.println("Los numeros a y c son los mayores");
                
            }
            
        } else if(a == b){
            
            if(a == c){
                
                System.out.println("Los tres numeros son iguales");
                
            }
            
        }
        
    }
    
}
