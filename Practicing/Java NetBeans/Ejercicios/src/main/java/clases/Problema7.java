
package clases;

import java.util.Scanner;

public class Problema7 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Dame los tres lados del triangulo");
        System.out.println("");
        System.out.println("1.- " );
        float a = in.nextFloat();
        System.out.println("2.- " );
        float b = in.nextFloat();
        System.out.println("3.- " );
        float c = in.nextFloat();
        
        float S = (a + b + c) / 2;
        
        float area = (float)Math.sqrt((S * (S - a) * (S - b) * (S - c)));
        
        System.out.print("El area del triangulo es: " + area);
    }
    
}
