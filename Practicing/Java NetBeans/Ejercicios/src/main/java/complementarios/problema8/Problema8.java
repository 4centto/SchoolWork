
package complementarios.problema8;

import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float r = 0;
        
        System.out.println("¿Cual es el radio de la esfera? ");
        r = in.nextFloat();
        
        Problema88 operaciones = new Problema88(r);
        
        System.out.println("***************************");
        operaciones.AREA();
        operaciones.VOLUMEN();
        System.out.println("***************************");
        
    }
}
