
package repetitivas;

import java.util.Scanner;

public class Problema7 {
    
    public static void main(String[] args) {
        
        int i = 1, N = 0, Chica = 0, Mediana = 0, Grande = 0;
        int V = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Cuantas ventas se realizaron?");
        N = in.nextInt();
        
        System.out.println("");
        
        while(i <= N){
            
            System.out.println("Venta " + i  + ": ");
            V = in.nextInt();
            
            if(V <= 200){
                
                Chica = Chica + 1;
                
            } else if(V > 200 && V < 400){
                
                Mediana = Mediana + 1;
                
            } else if(V >= 400){
                
                Grande = Grande + 1;                
            }
            
            i++;
            
        }
        
        System.out.println("");
        System.out.println("EL numero de ventas menores o iguales a 200 fueron: " + Chica);
        System.out.println("");
        System.out.println("El numero de ventas de entre 200 y 400 fueron: " + Mediana);
        System.out.println("");
        System.out.println("El numero de ventas mayores o iguales a 400 fueron: " + Grande);
        
    }
    
}
