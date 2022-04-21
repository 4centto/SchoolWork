
package clases;

import java.util.Scanner;

public class SegundaClase {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int Arreglo[] = new int[20];
        int N = 0;
        
        //Llenado e impresion
        for(int i = 0; i < Arreglo.length; i++){
            Arreglo[i] = (int)(Math.random() * 10);
            
            if(i == 0){
                System.out.print("[" + Arreglo[i] + ", ");
            } else if(i == 19){
                System.out.print(Arreglo[i] + "]");
            } else {
                System.out.print(Arreglo[i] + ", ");
            }
        }
        System.out.println("");
        
        //Solicitud del numero a buscar
        System.out.println("¿Cual numero quieres saber?");
        N = in.nextInt();
        
        int contador = 0;
        
        //Busqueda del numero
        for(int i = 0; i < Arreglo.length; i++){
            
            if(Arreglo[i] == N){
                contador += 1;
            }
            
        }
        System.out.println("Se encontraron " + contador + " elementos");
    }
}
