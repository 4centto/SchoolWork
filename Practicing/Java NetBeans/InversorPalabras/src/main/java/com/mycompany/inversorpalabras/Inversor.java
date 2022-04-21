package com.mycompany.inversorpalabras;

import java.util.Scanner;

public class Inversor {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palabra = "";
        int longitudPalabra = 0;
        String palabraInvertida = "";

        System.out.println("Ingresa la palabra que quieres invertir: ");
        palabra = entrada.nextLine();

        longitudPalabra = palabra.length();

        while (longitudPalabra != 0) {
            
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra --;
            
        }
        
        System.out.print(palabraInvertida);

    }

}
