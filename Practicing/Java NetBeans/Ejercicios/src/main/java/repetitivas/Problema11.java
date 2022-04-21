
package repetitivas;

import java.util.Scanner;

public class Problema11 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int CAN1 = 0, CAN2 = 0, CAN3 = 0, CAN4 =0, PORC = 0, N = 0;
        
        do{
            
            System.out.println("Voto: " );
            N = in.nextInt();
            
            if(N < 0){
                
                System.out.println("El candidato no esta registrado");
                
            }else if(N > 4){
                
                System.out.println("El candidato no esta registrado");
                
            }else if(N == 1){
                
                CAN1 = CAN1 + 1;
                
            }else if(N == 2){
                
                CAN2 = CAN2 + 1;
                
            }else if(N == 3){
                
                CAN3 = CAN3 + 1;
                
            }else if(N == 4){
                
                CAN4 = CAN4 + 1;
                
            }
            
        } while(N != 0);
        
        PORC = (CAN1 * 100) / (CAN1 + CAN2 + CAN3 + CAN4);
        System.out.println("La cantidad de votos para el candidato 1 son de: " + CAN1);
        System.out.println("El porcentaje obtenido es de: " + PORC);
        System.out.println("");
        
        PORC = (CAN2 * 100) / (CAN1 + CAN2 + CAN3 + CAN4);
        System.out.println("La cantidad de votos para el candidato 2 son de: " + CAN2);
        System.out.println("El porcentaje obtenido es de: " + PORC);
        System.out.println("");
        
        
        PORC = (CAN3 * 100) / (CAN1 + CAN2 + CAN3 + CAN4);
        System.out.println("La cantidad de votos para el candidato 3 son de: " + CAN3);
        System.out.println("El porcentaje obtenido es de: " + PORC);
        System.out.println("");
        
        PORC = (CAN4 * 100) / (CAN1 + CAN2 + CAN3 + CAN4);
        System.out.println("La cantidad de votos para el candidato 4 son de: " + CAN4);
        System.out.println("El porcentaje obtenido es de: " + PORC);
        System.out.println("");
        
        System.out.println("El total de votos obtenidos por la encuesta fueron: " + (CAN1 + CAN2 + CAN3 + CAN4));
        System.out.println("");
        
        if(CAN1 > CAN2 && CAN1 > CAN3 && CAN1 > CAN4){
            
            System.out.println("El ganador con " + CAN1 + " votos es el candidato 1");
            
        } else if(CAN2 > CAN1 && CAN2 > CAN3 && CAN2 > CAN4){
            
            System.out.println("El ganador con " + CAN2 + " votos es el candidato 2");
            
        } else if(CAN3 > CAN1 && CAN3 > CAN2 && CAN3 > CAN4){
            
            System.out.println("El ganador con " + CAN3 + " votos es el candidato 3");
            
        } else if(CAN4 > CAN1 && CAN4 > CAN2 && CAN4 > CAN3){
            
            System.out.println("El ganador con " + CAN4 + " votos es el candidato 4");
            
        }

    }
    
}
