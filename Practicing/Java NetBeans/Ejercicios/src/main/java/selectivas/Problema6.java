
package selectivas;

import java.util.Scanner;

public class Problema6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float DESC = 0;
        
        System.out.println("¿Cuanto compro el cliente?");
        float pago = in.nextFloat();
        
        if(pago < 500){
            
            System.out.println("No hay descuento, el total es:  $" + pago);
            
        } else if(pago >= 500 && pago < 1000){
            
            DESC = (float)(pago - (pago * 0.05));
            System.out.println("Se hizo un descuento del 5%. El total es: " + DESC);
            
        } else if(pago >= 1000 && pago < 7000){
            
            DESC = (float)(pago - (pago * 0.11));
            System.out.println("Se hizo un descuento del 11%. El total es: " + DESC);
            
        } else if(pago >= 7000 && pago < 15000){
            
            DESC = (float)(pago - (pago * 0.18));
            System.out.println("Se hizo un descuento del 18%. El total es: " + DESC);
            
        } else if(pago > 15000){
            
            DESC = (float)(pago - (pago * 0.25));
            System.out.println("Se hizo un descuento del 25%. El total es: " + DESC);
            
        }
        
    }
    
}
