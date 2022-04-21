
package clases;

import java.util.Scanner;

public class Problema2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float base = 0, altura = 0, area = 0;
        
        System.out.println("*****************");
        
        System.out.print("Cual es la base: ");
        base = in.nextFloat();
        
        System.out.print("Cual es la altura: ");
        altura = in.nextFloat();
        
        area = (base * altura) / 2;
        
        System.out.print("El area del triangulo es: " + area);
    }
    
}
