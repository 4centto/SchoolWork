
package complementarios;

import java.util.Scanner;

public class Problema21 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int PRODUCTOS[] = new int[100];
        int CANTIDAD[] = new int[100];
        
        //Llenado de Productos
        for(int i = 0; i < PRODUCTOS.length; i++){
            
            PRODUCTOS[i] = (i + 1);
            CANTIDAD[i] = (int)(Math.random() * 100);
            
        }
        
        System.out.println("*************");
        System.out.println("* PRODUCTOS *");
        System.out.println("*************");
        System.out.println("");
        
        //Impresion de los productos
        for(int i = 0; i < PRODUCTOS.length; i++){
            System.out.print("Producto " + PRODUCTOS[i] + " ");
            System.out.print("[" + CANTIDAD[i] + "]");
            System.out.println("");
        }
        
    }
}
