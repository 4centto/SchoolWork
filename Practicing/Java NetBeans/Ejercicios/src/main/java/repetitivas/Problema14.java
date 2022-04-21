
package repetitivas;

import java.util.Scanner;

public class Problema14 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int TIPO = 0, MIN = 0, AUX = 0, ACUML = 0, Marcador = 50;
        int FLAG = 1;
        float total = 0, COSTTOT = 0;
        
        System.out.println("* Para terminar las operaciones presione 0 *");
        System.out.println("********************************************");
        
        do{
           
            System.out.println("***************************");
            System.out.println("*   1. Internacional      *");
            System.out.println("    2. Nacional           *");
            System.out.println("*   3. Local              *");
            System.out.println("***************************");
            System.out.println("");
            System.out.println("¿Que tipo de llamada se realizo? ");
            TIPO = in.nextInt();
            
            if(TIPO == 1){
                
                System.out.println("¿Cuantos minutos duro la llamada?");
                MIN = in.nextInt();
                
                if(MIN <= 3){

                    total = (float)(7.59);
                    System.out.println("Total de llamadas:  $" + total);
                    
                    COSTTOT = COSTTOT + total;
                    
                } else if(MIN > 3){
                    
                    AUX = MIN - 3;
                    total = (float)(7.59 + (AUX * 3.03));
                    System.out.println("Total de llamadas:  $" + total);
                    
                    COSTTOT = COSTTOT + total;
                    
                }
                
            } else if(TIPO == 2){
                
                System.out.println("¿Cuantos minutos duro la llamada?");
                MIN = in.nextInt();
                
                if(MIN <= 3){

                    total = (float)(1.20);
                    System.out.println("Total de llamadas:  $" + total);
                    
                    COSTTOT = COSTTOT + total;
                    
                } else if(MIN > 3){
                    
                    AUX = MIN - 3;
                    total = (float)(1.20 + (AUX * 0.48));
                    System.out.println("Total de llamadas:  $" + total);
                    
                    COSTTOT = COSTTOT + total;
                    
                }
                
            } else if(TIPO == 3){
                
                System.out.println("¿Cuantos minutos duro la llamada?");
                MIN = in.nextInt();
                
                ACUML = ACUML + 1;
                
                if(ACUML < 50){
                    
                    total = 0;
                    System.out.println("Total de llamadas:  $" + total);
                    
                    COSTTOT = COSTTOT + total;
                    
                    Marcador = Marcador - 1;
                    
                    if(Marcador != 0){
                        System.out.println("Quedan " + Marcador + " llamadas 'gratis' ");
                    }
                    
                } else if(ACUML >= 50){
                    
                    total = (float)(0.60);
                    System.out.println("Total de llamadas:  $" + total);
                    
                    COSTTOT = COSTTOT + total;
                    
                }
                
            } else if(TIPO == 0){
            
                FLAG = 0;
                
            } else {
                
                System.out.println("El tipo de llamada no esta registrada");
                
            }
            
        } while(FLAG != 0);
        
        System.out.println("**************************");
        System.out.println("CUENTA TOTAL:  $" + COSTTOT);
        System.out.println("**************************");
        System.out.println("");
        System.out.println("Llamadas locales realizadas: " + ACUML);
        
    }
    
}
