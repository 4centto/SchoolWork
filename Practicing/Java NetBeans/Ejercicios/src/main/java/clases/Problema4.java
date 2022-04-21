
package clases;

import java.util.Scanner;

public class Problema4 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Cuantos litros fueron?");
        float litrosGal = in.nextFloat();
        
        float Total = (float)(litrosGal * 3.785 * 8.2);
        
        System.out.println("TOTAL: " + Total);
        
    }
    
}
