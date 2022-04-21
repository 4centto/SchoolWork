package arreglos;

import java.util.Scanner;

public class Problema11 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int Arreglo[][];
        int Arreglo2[][];
        int F = 0, C = 0;
        int AUX = 0;
        
        System.out.println("¿Cuantas filas tendra el arreglo?");
        F = in.nextInt();
        System.out.println("");
        
        System.out.println("¿Cuantas columnas tendra la fila?");
        C = in.nextInt();
        System.out.println("");
        
        Arreglo = new int[F][C];
        Arreglo2 = new int[C][F];

        //Llenado del arreglo
        for(int i = 0; i < Arreglo.length; i++){
            for(int j = 0; j < Arreglo.length; j++){
                
                Arreglo[i][j] = (int)(Math.random() * 5);
                
            }
        }
        
        //Impresion del arreglo
        for(int i = 0; i < Arreglo.length; i++){
            for(int j = 0; j < Arreglo.length; j++){
                
                System.out.print("[" + Arreglo[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Inversion de los datos del array
        for(int i = 0; i < Arreglo.length; i++){
            for(int j = 0; j < Arreglo.length; j++){
                AUX = Arreglo[i][j];
                Arreglo2[j][i] = AUX;
            }
        }
        
        //Impresion del 2do arreglo
        for(int i = 0; i < Arreglo2.length; i++){
            for(int j = 0; j < Arreglo2.length; j++){
                System.out.print("[" + Arreglo2[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
