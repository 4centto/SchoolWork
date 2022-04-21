
package repetitivas;

import java.util.Scanner;

public class Problema6 {
    
    public static void main(String[] args) {
        
        int i = 1, N = 0, Mayor = 0, Menor = 100000, Aux1 = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Cuantos datos se igresaran? ");
        N = in.nextInt();
        
        while(i <= N){
            
            System.out.println("Numero " + i + ": ");
            Aux1 = in.nextInt();
            
            if(Aux1 > Mayor){
                
                Mayor = Aux1;
                
            } else if(Aux1 < Menor){
                
                Menor = Aux1;
                
            }
            
            i++;
            
        }
        
        System.out.println("El numero mayor es: " + Mayor);
        System.out.println("");
        System.out.println("El numero emnor es: " + Menor);
        
    }
    
}
