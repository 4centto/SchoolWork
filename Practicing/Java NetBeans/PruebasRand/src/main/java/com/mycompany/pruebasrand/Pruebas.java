
package com.mycompany.pruebasrand;

import java.util.Scanner;

public class Pruebas {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame los valores del rectangulo:");
        int ancho = scanner.nextInt();
        int largo = scanner.nextInt();
        
        Prueba2 p = new Prueba2(ancho, largo);
        
        System.out.println("El area del rectangulo es: " + p.Area());
        
    }
    
}
