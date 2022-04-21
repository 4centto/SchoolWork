
package complementarios.probelma10;

import java.util.Scanner;

public class Problema10 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int COORDENADAS[][] = new int[3][2];
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                
                if(j == 0){
                    System.out.println("Valor de x" + (i + 1) + ": ");
                    COORDENADAS[i][j] = in.nextInt();
                } else if(j == 1){
                    System.out.println("Valor de y" + (i + 1) + ": ");
                    COORDENADAS[i][j] = in.nextInt();
                }
                
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                
                System.out.print("[" + COORDENADAS[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        Problema1010 operaciones = new Problema1010(COORDENADAS);
        
        System.out.println("*******************************");
        operaciones.Perimetro();
        operaciones.Area();
        System.out.println("*******************************");
    }
}
