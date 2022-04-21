
package complementarios;

import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float AUTO = 0;
        
        System.out.println("Monto del automovil: ");
        AUTO = in.nextFloat();
        
        System.out.println("**********************");
        System.out.println("* ENGANCHE: " + ENGANCHE(AUTO));
        System.out.println("* 18 MESES: " + MESES(AUTO));
        
    }
    
    private static float ENGANCHE(float AUTO){
        
        float enganche = (float)(AUTO * 0.35);
        return enganche;
        
    }
    
    private static float MESES(float AUTO){
        
        float meses = (float)((AUTO - (AUTO * 0.35)) / 18);
        return meses;
        
    }
}
