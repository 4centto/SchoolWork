package Division;

import java.util.Scanner;

public class ClaseDivision {

    public static void main(String[] args) {

        try {
            //Codigo que se ejecutara de manera inicial

            float valor_uno, valor_dos;
            float resultado;
            Scanner in = new Scanner(System.in);

            System.out.println("Dame el primer valor: ");
            valor_uno = in.nextInt();

            System.out.println("Dame el segundo valor: ");
            valor_dos = in.nextInt();

            resultado = valor_uno / valor_dos;

            System.out.print("El resultado de la division es: " + resultado);
            
        } catch (Exception e) {
            
            //Comportamiento del programa cuando se genere un error
            System.out.println("¡¡¡ERROR!!!" + e);
            
        } finally {
            
            System.out.println("Operacion concluida");
            
        }

    }

}
