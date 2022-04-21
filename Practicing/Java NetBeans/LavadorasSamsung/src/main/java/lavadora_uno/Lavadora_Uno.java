//Simulacion de programadores de Samsung
package lavadora_uno;

//Se importa la libreria donde esta la clase que se habia demandado
import Libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("¿La ropa es balnca o de color?");
        System.out.println("Presiona 1 - Ropa blanca / 2 - Ropa color");
        int TipoDeRopa = in.nextInt();

        System.out.println("¿Cuantos kilos de ropa?");
        int Kilos = in.nextInt();

        LLFunciones datos = new LLFunciones(Kilos, TipoDeRopa);
        
        datos.setTipoDeRopa(2);
        
        System.out.println("El tipo de ropa es: " + datos.getTipoDeRopa());

        datos.CicloCompletado();

    }

}
