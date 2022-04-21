
package clases;

import java.util.Random;

public class Clase_2 {
    
    public static void main(String[] args) {
        
        int aleatorio = 0;
        
        Random r = new Random();
        
        aleatorio = (int)(r.nextInt() * 100);
        
        System.out.println("El numero aleatorio es: " + aleatorio);
        
    }
    
}
