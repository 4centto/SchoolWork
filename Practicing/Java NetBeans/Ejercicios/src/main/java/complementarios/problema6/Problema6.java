
package complementarios.problema6;

import java.util.Scanner;

public class Problema6 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int PRECIO = 0;
        
        System.out.println("Auto: ");
        PRECIO = in.nextInt();
        
        Problema66 Operaciones = new Problema66(PRECIO);   
        
        System.out.println("**********************");
        Operaciones.ENGANCHE();
        Operaciones.MESES();
        System.out.println("**********************");
    }
}
