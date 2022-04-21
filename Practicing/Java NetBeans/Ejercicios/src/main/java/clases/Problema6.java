
package clases;

import java.util.Scanner;

public class Problema6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("¿Cuantos dias son?");
        int dias = in.nextInt();
        
        int seg = dias * 86400;
        
        System.out.println("En " + dias + " hay " + seg + " segundos");
        
    }
    
}
