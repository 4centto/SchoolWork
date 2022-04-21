
package arreglos;

import java.util.Scanner;

public class Problema6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float Toneladas[] = new float[13];
        float Cantidad = 0, ACUM = 0, PROM = 0, MAYOR = 0, MENOR = 0, MAYPRO = 1, MES = 0;
        
        System.out.println("*********************************");
        System.out.println("* REGISTRO DE TONELADAS POR MES *");
        System.out.println("*********************************");
        System.out.println("");
        
        //Ciclo para ingresar las toneladas por mes y para acumularlas
        for(int i = 1; i <= 12; i++){
            
            System.out.println("¿Cuantas toneladas se obtuvieron en el mes " + i + ": ");
            Cantidad = in.nextFloat();
            
            Toneladas[i] = Cantidad;
            ACUM = ACUM + Cantidad;
            
        }
        
        PROM = ACUM / 12;
        
        //Ciclo para saber que cosechas obtuvieron una mayor cantidad que el promedio
        for(int i = 1; i <= 12; i++){
            
            if(Toneladas[i] > PROM){
                
                MAYOR = MAYOR + 1;
                
            }
            
        }
        
        //Ciclo para saber cuantas cosechas obtuvieron una menor cantidad que el promedio
        for(int i = 1; i <= 12; i++){
            
            if(Toneladas[i] < PROM){
                
                MENOR = MENOR + 1;
                
            }
            
        }
        
        //Ciclo para saber cual mes es el que tuvo una mayor cantidad de produccion
        for(int i = 1; i <= 12; i++){
            
            if(Toneladas[i] > MAYPRO){
                
                MAYPRO = Toneladas[i];
                MES = i;
                
            }
            
        }
        
        //Impresion de los resultados de los calculos
        System.out.println("PROMEDIO ANUAL: " + PROM);
        System.out.println("");
        System.out.println("MESES MAYORES AL PROMEDIO: " + MAYOR);
        System.out.println("MESES MENORES AL PROMEDIO: " + MENOR);
        System.out.println("");
        System.out.println("EL MES " + MES + " TUVO MAYOR PRODUCCION CON: " + MAYPRO + " TONELADAS");
    }
    
}
