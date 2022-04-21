
package clases;

import java.util.Scanner;

public class Problema5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Cual es el radio: ");
        float r = in.nextFloat();
        
        System.out.println("Cual es la altura: ");
        float h = in.nextFloat();
        
        float vol = (float)(Math.PI * (r * r) * h);
        
        float are = (float)(2 * Math.PI * r * h);
        
        System.out.println("El volumen delcilindro es: " + vol);
        System.out.println("El area del cilindro es: " + are);
        
    }
    
}
