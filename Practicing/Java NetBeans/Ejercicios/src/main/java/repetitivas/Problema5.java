
package repetitivas;

import java.util.Scanner;



public class Problema5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int PROM = 0, CONT = 0, NUM = 0, AUX = 0, AUX2 = 0, SUM = 0, PROM2 = 0;
        int i = 1;
        
        System.out.println("¿Cuantos numeros se ingresaran?");
        NUM = in.nextInt();
        
        while(i <= NUM){
            
            System.out.println("Numero " + i + ": ");
            AUX = in.nextInt();
            
            SUM = SUM + AUX;     
            
            if(AUX > 0){
                
                CONT = CONT + 1;
                
                AUX2 = AUX2 + AUX;
                   
            }
            
            i++;
            
        }
        
        System.out.println("Los numeros positivos son: " + CONT);
        
        PROM = AUX2 / CONT;
        System.out.println("El promedio de los numeros positivos es: " + PROM);
        
        PROM2 = SUM / NUM;
        System.out.println("El promedio de todos los numeros es: " + PROM2);
        
    }
    
}
