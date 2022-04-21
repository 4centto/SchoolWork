
package arreglos;

import java.util.Scanner;

public class Problema13 {
    public static void main(String[] args) {
        
        int TEMP[][][] = new int[32][12][50];
        int PROM = 1, ACUM = 0, AUX = 0, ESTADO = 0;
        //Menor promedioen el ultimo año
        int PROM2 = 100000, ACUM2 = 0, AUX2 = 0, ESTADO2 = 0;
        
        //Llenado
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < 12; j++){
                for(int k = 0; k < 50; k++){
                    
                    TEMP[i][j][k] = (int)(Math.random() * 10000);
                    
                }
            }
        }
        
        //Impresion de los Datos
        for(int i = 0; i < 32; i++){
            System.out.println("ESTADO " + i);
            for(int j = 0; j < 12; j++){
                for(int k = 0; k < 50; k++){
                    
                    System.out.print("[" + TEMP[i][j][k] + "]" );
                    
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        //Cual fue el estado que mas promedio tuvo en los ultimos 5 años
        for(int i = 0; i < 32; i++){
            ACUM = 0;
            AUX =0;
            for(int j = 0; j < 12; j++){
                for(int k = 0; k < 50; k++){
                    
                    ACUM = ACUM + TEMP[i][j][k];
                    
                }
            }
            
            AUX = ACUM / 50;
            
            if(AUX > PROM){
                PROM = AUX;
                ESTADO = i;
            }
        }
        
        System.out.println("El estado fue el " + ESTADO + " con un promedio de: " + PROM + " de lluvias en los ultimos 5 años");
        
        //Cual fue el estado que menor promedio tuvo en el ultimo año
        for(int i = 0; i < 32; i++){
            ACUM2 = 0;
            AUX2 =0;
            for(int j = 0; j < 12; j++){
                for(int k = 49;k == 49; k++){
                    
                    ACUM2 = ACUM2 + TEMP[i][j][k];
                    
                }
            }
            
            AUX2 = ACUM2 / 12;
            
            if(AUX2 < PROM2){
                PROM2 = AUX2;
                ESTADO2 = i;
            }
        }
        
        System.out.println("El estado con menor promedio en el ultimo año fue el " + ESTADO2 + " con un promedio de " + PROM2);
        
        //En que mes se registro el mayor promedio de temperaturas en el estado 1 en el año 3
        int PROM3 = 1, AUX3 = 0, ACUM3 = 0, MES = 0;
        
        for(int i = 1; i == 1; i++){
            PROM3 = 0;
            ACUM = 0;
            for(int j = 0; j < 12; j++){
                for(int k = 3; k == 3; k++){
                    
                    ACUM = TEMP[i][j][k];
                    
                }
                if(ACUM > PROM3){
                    PROM3 = ACUM;
                    MES = j;
                }
            }
        }
        
        System.out.println("En el mes " + MES + " se registro el menor promedio de lluvias del estado 1 en el año 3");
        
        //En que mes y estado se registro el menor promedio de temperaturas en el año 2
        int MENOR = 100000, MES2 = 0, ESTADO3 = 0;
        
        for(int i = 0; i < 32; i++){
            for(int j = 0; j < 12; j++){
                for(int k = 2;k == 2; k++){
                    
                    if(TEMP[i][j][k] < MENOR){
                        MENOR = TEMP[i][j][k];
                        MES2 = j;
                        ESTADO3 = i;
                    }
                    
                }
            }
        }
        
        System.out.println("En el mes " + MES2 + " del estado " + ESTADO3 + " se registro el menor promedio de temperatura en el año 2");
    }
}
