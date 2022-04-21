
package clases;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Cual es el nombre del dinosaurio? ");
        String dinosaurio = in.nextLine();
        
        System.out.println("¿Cual es su peso? ");
        float pesoLib = in.nextInt();
        
        System.out.println("¿Cual es el nombre del dinosaurio? ");
        float longPies = in.nextInt();
        
        float pesoKg = pesoLib * 1000;
        
        float longMts = (float)(longPies * 0.3047);
        
        System.err.println("El dinosausio " + dinosaurio + " pesa " + pesoKg + "kg y mide " + longMts + "m ");
        
    }
    
}
