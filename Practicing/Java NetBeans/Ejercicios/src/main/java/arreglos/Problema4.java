
package arreglos;

import java.util.Scanner;

public class Problema4 {
    
    public static void main(String[] args) {
        
        //Declaracion de variables
        Scanner in = new Scanner(System.in);
        
        float Alumnos[] = new float[11];
        float PROMGEN = 0, CALIF = 0, AUX1 = 0, PORCENAP = 0, PORCENRE = 0;
        int ALAP = 0, ALRE = 0, MAYOOCHO = 0;
        
        //Titulo
        System.err.println("********************************");
        System.out.println("* SISTEMA DE CONTEO DE ALUMNOS *");
        System.err.println("********************************");
        
        //Llenar el arreglo con los promedios de los alumnos
        for(int i = 1; i <= 10; i++){
            
            System.out.println("Calificacion del alumno " + i + ": ");
            CALIF = in.nextFloat();
            
            Alumnos[i] = CALIF;
            
            AUX1 = (float)(AUX1 + CALIF);            
        }
        
        //Saber que alumnos reprobaron y que otros aprobaron
        for(int i = 1; i <= 10; i++){
            
            if(Alumnos[i] >= 6){
                ALAP = ALAP + 1; 
            } else if(Alumnos[i] < 6){
                ALRE =ALRE + 1;
            }
            
        }
        
        //Para saber que alumnoss obtuvieron una calificacion mayor a 8
        for(int i = 1; i <= 10; i++){
            
            float AUX = Alumnos[i];
            
            if(AUX > 8){
                
                MAYOOCHO = MAYOOCHO + 1;
                
            }
            
        }
        
        System.out.println("");
        
        //Promedio
        PROMGEN = (float)(AUX1 / 10);
        
        //Porcentaje alumnos aprobados
        PORCENAP = (float)((ALAP * 100) / 10);
        
        //Porcentaje alumnos reprobados
        PORCENRE = (float)((ALRE * 100) / 10);
        
        //Imprimir los resultados de los calculos, promedios, porcentajes, etc.
        System.out.println("El promedio general de la clase es: " + PROMGEN);
        System.out.println("");
        System.out.println("Alumnos aprobados: " + ALAP + "  (%" + PORCENAP + ")");
        System.out.println("Alumnos reprobados: " + ALRE+ "  (%" + PORCENRE + ")");
        System.out.println("");
        System.out.println("El numero de alumnos con calificacion mayor a 8 son: " + MAYOOCHO);
        
    }
    
}
