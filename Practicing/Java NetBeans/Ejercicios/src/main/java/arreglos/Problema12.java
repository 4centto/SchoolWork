
package arreglos;

import java.util.Scanner;

public class Problema12 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int A[][];
        int B[];
        int F = 0, C = 0;
        int AUX = 0;
        
        System.out.println("¿Cuantas filas tendra la tabla?");
        F = in.nextInt();
        System.out.println("");
        
        System.out.println("¿Cuantas columnas tendra la tabla?");
        C = in.nextInt();
        System.out.println("");
        
        A = new int[F][C];
        B = new int[(F * C)];
        
        //Llenado del array
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                A[i][j] = (int)(Math.random() * 5);
            }
        }
        
        //Impresion del array A
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
        
        //Llenado del array B
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                
                AUX = A[i][j];
                
                for(int k = 0; k < B.length; k++){
                    
                    B[k] = AUX;
                    k = B.length;
                }
            }
        }
        
        //Impresion del Arreglo B
        for(int i = 0; i < B.length; i++){
            System.out.print("[" + B[i] +  "]");
        }
        
    }
}
