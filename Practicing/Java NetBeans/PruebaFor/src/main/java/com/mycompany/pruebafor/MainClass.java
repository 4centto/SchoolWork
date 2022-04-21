
package com.mycompany.pruebafor;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
    
        int NumeroDeRepeticiones = 0, NumeroInicial = 0, Aumento = 0;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Ingresa el numero de repticiones que quieres hacer: ");
        NumeroDeRepeticiones = in.nextInt();
        
        System.out.println("Ingresa el aumento entre los numeros: ");
        Aumento = in.nextInt();
        
        Logica logica = new Logica(NumeroDeRepeticiones, NumeroInicial, Aumento);
        
        logica.Formula();
    
    }
}
