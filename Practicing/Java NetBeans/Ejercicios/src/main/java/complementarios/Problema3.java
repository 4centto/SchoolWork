
package complementarios;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int DOLARES = 0;
        
        System.out.println("Cantidad de dolares: ");
        DOLARES = in.nextInt();
        
        System.out.println("Pesos: " + CAMBIO(DOLARES));
        
    }
    
    private static float CAMBIO(int DOLARES){
        
        float PESOS = 0;
        
        PESOS = (float)(20.04 * DOLARES);
        
        return PESOS;
        
    }
}
