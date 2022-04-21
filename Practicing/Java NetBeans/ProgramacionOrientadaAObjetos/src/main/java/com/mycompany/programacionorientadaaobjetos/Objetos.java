package com.mycompany.programacionorientadaaobjetos;

import java.util.Scanner;

public class Objetos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Se piden valores al usuario
        System.out.println("Dame el primer valor: ");
        int valor_uno = entrada.nextInt();

        System.out.println("Dame el segundo valor: ");
        int valor_dos = entrada.nextInt();
        
        //Pasar datos a traves de argumentos
        Objetos2 valores = new Objetos2(valor_uno, valor_dos);
        
        //Con el objeto Valores que se creo, se recupera el metodo 
        //Imprimir para que el resultado se imprima en pantalla
        valores.Imprimir();
    }

}
