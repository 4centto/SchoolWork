package clases;

import java.util.Scanner;

public class Acumulacion {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int total = 0, v_uno = 0;
        String validacion = "";

        System.out.println("*******************************************************************************");
        System.out.println("* Para finalizar el proceso y mostrar el resultado final, escriba el numero 0 *");
        System.out.println("*******************************************************************************");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        try {

            do {

                System.out.print("Cantidad en pesos:   ");
                v_uno = in.nextInt();

                validacion = String.valueOf(v_uno);

                if (validacion.isEmpty()) {

                    v_uno = 0;

                    total = v_uno + total;

                } else {

                    total = v_uno + total;

                    System.out.println("Llevamos:  $ " + total);

                }

            } while (v_uno != 0);

            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Los gastos finales fueron: " + total);

        } catch (Exception e) {
            System.out.println("Ocurrio un error, lo siento" + e);
        }

    }

}
