
package clases;
import java.util.Scanner;

public class SinConstructor {
    
    private Scanner mensajero = new Scanner(System.in);
    String nombre = "";
    
    public void PedirDatos(){
        
        System.out.print("Cual es tu nombre: ");
        nombre = mensajero.nextLine();
        
    }
    
    public void Imprimir(){
        
        System.out.println("Tu nombre es " + nombre);
        
    }
}
