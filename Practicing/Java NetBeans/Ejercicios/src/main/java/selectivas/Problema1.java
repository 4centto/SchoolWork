
package selectivas;

import java.util.Scanner;

public class Problema1 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int temperatura = 0;
        
        System.out.println("¿Cuantos sonidos emitio el grillo en un minuto?");
        int sonidos = in.nextInt();
        
        if(sonidos > 0){
            
            temperatura = (sonidos / 4) + 40;
            
            System.out.println("La temperatura es de: " + temperatura + "°");
            
        } else {
            
            System.out.println("No se registraron sonidos");
            
        }
        
    }
    
}
