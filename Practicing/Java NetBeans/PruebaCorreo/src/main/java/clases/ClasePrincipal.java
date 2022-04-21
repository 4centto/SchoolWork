
package clases;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        String cadena = "ivangarcia080902@gmail.com";
        String cadena2 = "";
        int count = 0;
        String Arreglo[] = new String[30];
        
        //Solicitud de la palabra a buscar dentro de la cadena
        System.out.println("¿Que palabra quieres buscar dentro de " + cadena + "?");
        cadena2 = in.next();
        System.out.println(cadena);
        
        //Metodo para buscar la palabra dentro de la cadena
        for(int i = 0; i < cadena.length(); i++){
            
            String value1 = String.valueOf(cadena.charAt(i));
            Arreglo[i] = value1;
            
            if(cadena2.equalsIgnoreCase(value1)){
                
                count = count + 1;
                
            }
            
        }
        
        //Impresion de las veces que se repite la palabra
        System.out.println("");
        System.out.println(count);

    }
}
