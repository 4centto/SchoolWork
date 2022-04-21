
package arreglos;

import java.util.Scanner;

public class Problema1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = 0;
        int Arreglo[];
        int NUM = 0;
        int AUX = 0;
        int AUX2 = 0;
        int CONT = 1;
        
        System.out.println("¿Cuantos valores seran ingresados?");
        N = in.nextInt();
        
        Arreglo = new int[N + 1];
        
        for(int i = 1; i <= N; i++){
            
            System.out.println("Valor " + i + ": ");
            NUM = in.nextInt();
            
            Arreglo[i] = NUM;
            
        }
        
        for (int i = 1; i <= N; i++) {
            
            for(int j = 1; j <= N; j++){
                
                if(i != j && Arreglo[j] == Arreglo[i]){
                    
                    j = N;
                    
                } else {
                    
                    System.out.println("Valor " + CONT + ": " + Arreglo[i]);
                    
                    j = N;
                    
                    CONT = CONT + 1;
                    
                }
                
            }
            
        }
        
    }
    
}
