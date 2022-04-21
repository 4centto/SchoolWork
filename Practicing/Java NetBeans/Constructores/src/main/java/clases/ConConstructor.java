
package clases;
import java.util.Scanner;

public class ConConstructor {
    
    public ConConstructor(){
        Scanner in = new Scanner(System.in);
        String nombre = "";
        
        System.err.print("¿Cual es tu nombre?   ");
        nombre = in.nextLine();
        
        System.out.println("Tu nombre es: " + nombre);
    }
    
}
