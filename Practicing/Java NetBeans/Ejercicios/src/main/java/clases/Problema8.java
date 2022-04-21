
package clases;

import java.util.Scanner;

public class Problema8 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame los valores de la primer cordenada (x, y)");
        float x1 = in.nextFloat();
        float y1 = in.nextFloat();
        
        System.out.println("Dame los valores de la segunda cordenada (x, y)");
        float x2 = in.nextFloat();
        float y2 = in.nextFloat();
        
        float D = (float)(Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2)));
        
        System.out.println("La distancia entre el punto (" + x1 + ", " + y1 + ") y el punto (" + x2 + ", " + y2 + ") es: " + D);
    }
    
}
