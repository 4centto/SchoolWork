package clases;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        //Variables para el teclado
        Scanner in = new Scanner(System.in);

        //Variables de acumulacion
        int CONT = 0, AC = 0, PROM = 0;
        int N = 0;
        int S = 0;

        //La cantidad de datos que el usuario quiera almacenar
        System.out.println("¿Cuantos suledos son los que se quieren almacenar?");
        N = in.nextInt();

        //Se inicializa el arreglo de N cantidad de datos
        int arreglo[] = new int[N + 1];

        //Se inicializa un metodo try para prevenir errores
        try {

            //Ciclo para poder dar valores a cada uno de los sueldos
            for (int i = 1; i <= N; i++) {

                System.out.println("Sueldo " + i + ": ");

                arreglo[i] = in.nextInt();

            }

            //Ciclo para hacer una suma de todos los sueldos ingresados
            for (int i = 1; i <= N; i++) {

                AC = arreglo[i] + AC;

            }

            //Se saca el promedio de los sueldos totales
            PROM = AC / N;

            System.out.println("El promedio de los sueldos es: " + PROM);

            //Ciclo para poder ver cuantos son los sueldos que son mayores al promedio
            for (int i = 1; i <= N; i++) {

                //Realiza la busqueda en el arreglo y hace la acumulacion de los que si son mayores
                if (arreglo[i] >= PROM) {

                    CONT = CONT + 1;

                }

            }

            //Se imprime en pantalla el resultado de cuantos son los que son mayores al promedio
            System.out.println(CONT + " sueldos mayores al promedio");

        } catch (Exception e) {

            System.out.print("Ocurrio un error" + e);

        }

    }

}
