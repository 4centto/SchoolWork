
package repetitivas;

import java.util.Scanner;

public class Problema1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Suma_Impares = 0, Suma_Pares = 0;
        float Promedio_Pares = 0;
        int Aux2 = 0;
        
        int arreglo[] = new int[271];
        
        for(int i = 1; i <= 270; i++){
            
            arreglo[i] = i;
            
        }
        
        for(int i = 1; i <= 270; i++){
            
            int aux1 = arreglo[i] % 2;
            
            if(aux1 != 0){
                
                Suma_Impares = Suma_Impares + arreglo[i];
                
            }
            
            if(aux1 == 0){
                
                Suma_Pares = Suma_Pares + arreglo[i];
                Aux2 = Aux2 + 1;
            }
            
        }
        
        Promedio_Pares = (float)(Suma_Pares / Aux2);
        
        System.out.println("El valor de la suma de todos los numeros impares es: " + Suma_Impares);
        System.out.println("");
        System.out.println("El valor de la suma de todos los numeros pares es: " + Suma_Pares);
        System.out.println("Y su promedio es: " + Promedio_Pares);
        
    }
    
}
