
package arreglos;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Problema5 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int CALIF = 0, ACUMPROM = 0;
        float PROM = 0, VARI = 0, DESVI = 0;
        int Alumnos[] = new int[13];
        
        System.out.println("**************************");
        System.out.println("* ESTADISTICA DEL EXAMEN *");
        System.out.println("**************************");
        System.out.println("");
        System.out.println("* Para finalizar de registrar promedios presione -1 *");
        
        //Ciclo para recuperar calificaciones, y acumularlas
        for(int i = 1; i <= 12; i++){
            
            System.out.println("Calificacion " + i + ": ");
            CALIF = in.nextInt();
            
            Alumnos[i] = CALIF;
            
            ACUMPROM = ACUMPROM + CALIF;
            
        }
        PROM = (float)(ACUMPROM / 12); //Se calcula el promedio
        
        //Ciclo para calcular la varianza
        for(int i = 1; i <= 12; i++){
            
            VARI = VARI + (float)(Math.pow((Alumnos[i] - PROM), 2));
            
        }
        
        //Ciclo para encontrar la moda
        int Calificaciones[] = {0,1,2,3,4,5,6,7,8,9,10};
        int CONTADOR = 1;
        int c = 0;
        int a = 0;
        int contador = 0;
        int MODA = 0;
        int contador2 = 0;
        int CONTADOR2 = 0;
        
        for(int i = 0; i <= 10; i++){
            c = Calificaciones[i];
            contador = 0;
            for(int j = 1; j <= 12; j++){
                a = Alumnos[j];
                if(c == a){
                    contador++;
                }
            }
            if(contador > CONTADOR){
                CONTADOR = contador;
                MODA = Calificaciones[i];
            }
        }
        
        VARI = (VARI / 12); //Se calcula la varianza
        DESVI = (float)(Math.pow(VARI, 0.5)); //Se calcula la desviacion estandar
        
        //Imprimir promedio, varianza, desviacio, y la moda
        System.out.println("Promedio: " + PROM);
        System.out.println("Varianza: " + VARI);
        System.out.println("Desviacion Estandar: " + DESVI);
        System.out.println("La moda es " + MODA + " con " + CONTADOR + " veces repetido");
        
        
    }
    
}
