
package repetitivas;

import java.util.Scanner;

public class Problema13 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float P1, P2, P3, P4, P5, PrecioTotal = 0, ACTOT = 0;
        int AC1 = 0, AC2 = 0, AC3 = 0, AC4 = 0, AC5 = 0, Clave = 0, Cantidad = 0;
        int FLAG = 1;
        
        System.out.println("Precios de la localidad 1: ");
        P1 = in.nextFloat();
        System.out.println("");
        
        System.out.println("Precios de la localidad 2: ");
        P2 = in.nextFloat();
        System.out.println("");
        
        System.out.println("Precios de la localidad 3: ");
        P3 = in.nextFloat();
        System.out.println("");
        
        System.out.println("Precios de la localidad 4: ");
        P4 = in.nextFloat();
        System.out.println("");
        
        System.out.println("Precios de la localidad 5: ");
        P5 = in.nextFloat();
        System.out.println("");
        
        do{
            System.out.println("*****************************************");
            System.out.println("Para cancelar las operaciones, presiona 0");
            System.out.println("*****************************************");
            System.out.println("");
            
            System.out.println("Clave del boleto vendido");
            Clave = in.nextInt();
            
            System.out.println("Cuantos boletos de la clave " + Clave + " se vendieron: ");
            Cantidad = in.nextInt();
            
            System.out.println("");
            
            if(Clave == 1){
                
                AC1 = AC1 + Cantidad;
                PrecioTotal = Cantidad * P1;
                System.out.println("Se compraron " + Cantidad + " boletos en la localidad " + Clave);
                System.out.println("Total:  $" + PrecioTotal);
                System.out.println("");
                
                ACTOT = ACTOT + PrecioTotal;
                
            }else if(Clave == 2){
                
                AC2 = AC2 + Cantidad;
                PrecioTotal = Cantidad * P2;
                System.out.println("Se compraron " + Cantidad + " boletos en la localidad " + Clave);
                System.out.println("Total:  $" + PrecioTotal);
                System.out.println("");
                
                ACTOT = ACTOT + PrecioTotal;
                
            }else if(Clave == 3){
                
                AC3 = AC3 + Cantidad;
                PrecioTotal = Cantidad * P3;
                System.out.println("Se compraron " + Cantidad + " boletos en la localidad " + Clave);
                System.out.println("Total:  $" + PrecioTotal);
                System.out.println("");
                
                ACTOT = ACTOT + PrecioTotal;
                
            }else if(Clave == 4){
                
                AC4 = AC4 + Cantidad;
                PrecioTotal = Cantidad * P4;
                System.out.println("Se compraron " + Cantidad + " boletos en la localidad " + Clave);
                System.out.println("Total:  $" + PrecioTotal);
                System.out.println("");
                
                ACTOT = ACTOT + PrecioTotal;
                
            }else if(Clave == 5){
                
                AC5 = AC5 + Cantidad;
                PrecioTotal = Cantidad * P5;
                System.out.println("Se compraron " + Cantidad + " boletos en la localidad " + Clave);
                System.out.println("Total:  $" + PrecioTotal);
                System.out.println("");
                
                ACTOT = ACTOT + PrecioTotal;
                
            }else if(Clave == 0 || Cantidad == 0){
                
                System.out.println("* Operacion Terminada *");
                
                FLAG = 0;
                
            }
            
            
        } while(FLAG != 0);
        
        System.out.println("*******************");
        System.out.println("Localidad 1: " + AC1);
        System.out.println("Localidad 2: " + AC2);
        System.out.println("Localidad 3: " + AC3);
        System.out.println("Localidad 4: " + AC4);
        System.out.println("Localidad 5: " + AC5);
        System.out.println("*******************");
        System.out.println("");
        System.err.println("*********************");
        System.out.println("* RECAUDACION TOTAL *");
        System.err.println("*********************");
        System.out.println("");
        System.out.println("Total:  $" + ACTOT);
        
        
    }
    
}
