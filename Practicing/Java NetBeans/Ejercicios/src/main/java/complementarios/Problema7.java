
package complementarios;

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float radio = 0, generatriz = 0, altura = 0;
        
        System.out.println("********************");
        System.out.println("* SOLCION DE CONOS *");
        System.out.println("********************");
        System.out.println("");
        
        System.out.println("Radio: ");
        radio = in.nextFloat();
        
        System.out.println("Generatriz: ");
        generatriz = in.nextFloat();
        
        System.out.println("Altura: ");
        altura = in.nextFloat();
        
        System.out.println("*******************************************");
        System.out.println("* Area de la Base: " + AreaBase(radio));
        System.out.println("* Area Lateral: " + AreaLateral(radio, generatriz));
        System.out.println("* Area Total: " + AreaTotal(radio, generatriz, altura));
        System.out.println("*******************************************");
        
    }
    
    private static float AreaBase(float radio){
        float base = (float)(Math.PI * (radio * radio));
        return base;
    }
    
    private static float AreaLateral(float radio, float generatriz){
        float lateral = (float)(Math.PI * radio * generatriz);
        return lateral;
    }
    
    private static float AreaTotal(float radio, float generatriz, float altura){
        float base = (float)(Math.PI * (radio * radio));
        float lateral = (float)(Math.PI * radio * generatriz);
        float total = base + lateral;
        return total;
    }
    
    
}
