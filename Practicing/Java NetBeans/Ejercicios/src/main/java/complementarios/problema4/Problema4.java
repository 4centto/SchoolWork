
package complementarios.problema4;

import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float ACRES = 0;
        
        System.out.println("¿Cuantos acres tiene el terreno? ");
        ACRES = in.nextInt();
        
        Problema44 conversion = new Problema44(ACRES);
        conversion.HECTAREAS();
        
    }
}
