
package pruebaspoo;

import java.util.Scanner;

public class Prueba1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = 0;
        int ARREGLO[][];
        
        System.out.println("¿Cual es la dimension de la matriz?");
        N = in.nextInt();
        
        ARREGLO = new int[N][N];
        
        PruebaUno metodos = new PruebaUno(N, ARREGLO);
        
        metodos.Llenado();
        metodos.Impresion();
        
    }
}
