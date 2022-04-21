
package com.mycompany.factorialrecursividad;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int x = 0;
        
        System.out.println("¿De que numero deseas saber su factorial?");
        x = in.nextInt();
        
        Recursividad recursividad = new Recursividad();
        
        System.out.println("Resultado: " + recursividad.Imprimir(x));
    }
}
