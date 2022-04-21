
package complementarios.problema2;

import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float r = 0;
        
        System.out.println("¿Cual es el radio del circulo?");
        r = in.nextFloat();
        
        Problema22 operaciones = new Problema22(r);
        
        operaciones.AREA();
        operaciones.CIRCUNFERENCIA();
                
    }
}
