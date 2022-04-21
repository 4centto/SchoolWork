
package arreglos;

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = 0, val = 0;
        int Acumulacion = 0;
        
        System.out.println("************");
        System.out.println("* MATRICES *");
        System.out.println("************");
        System.out.println(""); 
        System.out.println("Ingrese las dimensiones de la matriz: ");
        System.out.println("(Recuerda que es una matriz cuadrada)");
        N = in.nextInt();
        
        
        int Matriz1[][] = new int[N][N];

        //Llenado de matriz 1
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                
                //Matriz1[i][j] = (int)(Math.random() * 5);
                System.out.println("Dame el valor de la posicion en la fila " + j + " de la columa " + i + ": ");
                val = in.nextInt();
                
                Matriz1[i][j] = val;
                
            }
        }
        
        //Imprimir la matriz
        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                System.out.print("[ " + Matriz1[i][j] + " ]");

            }
            
            System.out.println("");

        }
        
        //Ciclo para saber las posiciones de la simetricidad
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                
                if(Matriz1[i][j] == Matriz1[j][i]){
                    
                    Acumulacion = Acumulacion + 1;
                    
                }
                
            }
            
        }
        
        //Imprimir el resultado de si si o no es simetrica
        if(Acumulacion == (N * N)){
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}
