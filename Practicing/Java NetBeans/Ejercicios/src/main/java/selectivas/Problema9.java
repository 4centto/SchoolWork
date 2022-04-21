package selectivas;

import java.util.Scanner;

public class Problema9 {

    public static void main(String[] args) {
        
        int BAND = 0;
                
        do{
        //Matricula, carrera, semestre y promedio
        String matricula = "";

        int CARR = 0, SEM;

        float Promedio = 0;

        Scanner in = new Scanner(System.in);
            
        System.out.println("Matricula del alumno: ");
        matricula = in.nextLine();

        System.out.println("¿Cual es el semestre del alumno?");
        SEM = in.nextInt();

        if (SEM > 0 && SEM < 10) {

            System.out.println("************************");
            System.out.println("*                      *");
            System.out.println("*  1. Economia         *");
            System.out.println("*  2. Computacion      *");
            System.out.println("*  3. Administracion   *");
            System.out.println("*  4. Contabilidad     *");
            System.err.println("*                      *");
            System.out.println("************************");

            System.out.println("¿Que carrera desea el alumno?");
            CARR = in.nextInt();

            if (CARR > 0 && CARR < 5) {

                System.out.println("¿Cual es el promedio del alumno?");
                Promedio = in.nextFloat();

                switch (CARR) {
                    case 1:

                        if (SEM >= 6) {

                            if (Promedio >= 8.8) {
                                System.out.println("El alumno de matricula '" + matricula + "' ha sido aceptado para Economia");
                                BAND = 1;
                            } else {
                                System.out.println("No aceptado para Economia");
                                BAND = 0;
                            }

                        } else {
                            System.out.println("No aceptado para Economia");
                            BAND = 0;
                        }

                        break;

                    case 2:

                        if (SEM > 6) {

                            if (Promedio > 8.5) {
                                System.out.println("El alumno de matricula '" + matricula + "' ha sido aceptado para Computacion");
                                BAND = 1;
                            } else {
                                System.out.println("No aceptado para Computacion");
                                BAND = 0;
                            }

                        } else {
                            System.out.println("No aceptado para Computacion");
                            BAND = 0;
                        }

                        break;

                    case 3:

                        if (SEM > 5) {

                            if (Promedio > 8.5) {
                                System.out.println("El alumno de matricula '" + matricula + "' ha sido aceptado para Administracion");
                                BAND = 1;
                            } else {
                                System.out.println("No aceptado para Administracion");
                                BAND = 0;
                            }

                        } else {
                            System.out.println("No aceptado para Administracion");
                            BAND = 0;
                        }

                        break;

                    case 4:

                        if (SEM > 5) {

                            if (Promedio > 8.5) {
                                System.out.println("El alumno de matricula '" + matricula + "' ha sido aceptado para Contabilidad");
                                BAND = 1;
                            } else {
                                System.out.println("No aceptado para Contabilidad");
                                BAND = 0;
                            }

                        } else {
                            System.out.println("No aceptado para Contabilidad");
                            BAND = 0;
                        }

                        break;
                }

            } else {
                System.out.println("Carrera invalida");
                BAND = 0;
            }

        } else {
            System.out.println("Semestre invalido");
            BAND = 0;
        }
            
        } while(BAND == 0);

    }

}
