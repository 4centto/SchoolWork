
package complementarios;

import java.util.Scanner;

public class Problema9 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float lado = 0;
        
        System.out.println("¿Cuanto mide un lado del hexaedro? ");
        lado = in.nextFloat();
        
        System.out.println("********************************");
        System.out.println("* Area de la Base: " + AreaBase(lado));
        System.out.println("* Area Lateral: " + AreaLateral(lado));
        System.out.println("* Area Total: " + AreaTotal(lado));
        System.out.println("* Volumen: " + Volumen(lado));
        System.out.println("********************************");
        
    }
    
    private static float AreaBase(float lado){
        float base = (float)(Math.pow(lado, 2));
        return base;
    }
    
    private static float AreaLateral(float lado){
        float lateral = (float)(Math.pow(lado, 2) * 4);
        return lateral;
    }
    
    private static float AreaTotal(float lado){
        float total = (float)(Math.pow(lado, 2) * 6);
        return total;
    }
    
    private static float Volumen(float lado){
        float volumen = (float)(Math.pow(lado, 3));
        return volumen;
    }
}
