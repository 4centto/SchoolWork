
package operaciones;
import java.util.Scanner;

public class ClasePadre {
    
    //Se declaran las variables
    protected  int valor1, valor2, resultado;
    
    Scanner in = new Scanner(System.in);
    
    //Metodo para solicitar datos desde teclado
    public void PedirDatos(){
        
        System.out.print("Dame el primer valor: ");
        valor1 = in.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = in.nextInt();
        
    }
    
    //Metodo que muestra el resultado
    public void MostrarResultado(){
    
        System.out.println(resultado);
    
    }
    
}
