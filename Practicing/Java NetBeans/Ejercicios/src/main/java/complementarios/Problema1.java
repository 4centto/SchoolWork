
package complementarios;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        float num_uno = 0, num_dos = 0;
        
        System.out.println("Numero 1: ");
        num_uno = in.nextFloat();
        System.out.println("Numero 2: ");
        num_dos = in.nextFloat();
        System.out.println("La suma es: " + SUMA(num_uno, num_dos));
        System.out.println("La resta es: " + RESTA(num_uno, num_dos));
        System.out.println("La multiplicacion es: " + MULTIPLICACION(num_uno, num_dos));
        System.out.println("");
        System.out.println(OPERACIONES(num_uno, num_dos));
        
    }
    
    //Metodo para hacer todo en uno
    public static String OPERACIONES(float num_uno, float num_dos){
        
        String resultado = "";
        float suma = 0, resta =0, mult =0;
        
        suma = num_uno + num_dos;
        resta = num_uno - num_dos;
        mult = num_uno * num_dos;
        
        resultado = "La suma es: " + String.valueOf(suma) + "\nLa resta es: " + String.valueOf(resta) + 
                "\nLa multiplicacion es: " + String.valueOf(mult);
        
        return resultado;
    }
    
    //Metodo para la suma
    public static float SUMA(float num_uno, float num_dos){
        
        float resultado = 0;
        resultado = num_uno + num_dos;
        
        return resultado;
    }
    
    //Metodo para la resta
    public static float RESTA(float num_uno, float num_dos){
        
        float resultado = 0;
        resultado = num_uno - num_dos;
        
        return resultado;
    }
    
    //Metodo para la multiplicacion
    public static float MULTIPLICACION(float num_uno, float num_dos){
        
        float resultado = 0;
        resultado = num_uno * num_dos;
        
        return resultado;
    }
}
