
package com.mycompany.rectangulo;

import java.util.Scanner;

public class RectanguloMain {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Escribe el valor de la base: ");
        int base = in.nextInt();
        
        System.out.println("Escribe el valor de la altura: ");
        int altura = in.nextInt();
        
        Rectangulo valores = new Rectangulo(base, altura);
        
        valores.Imprimir();
    }
    
}
