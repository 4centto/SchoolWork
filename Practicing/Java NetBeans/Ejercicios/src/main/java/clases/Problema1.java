
package clases;

import java.util.Scanner;

public class Problema1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int precio = 512, pago = 0, cambio = 0;
        
        System.out.print("¿Cuanto pago el cliente?");
        pago = in.nextInt();
        
        cambio = pago - precio;
        
        System.out.print("El cambio es: " + cambio);
        
    }
    
}
