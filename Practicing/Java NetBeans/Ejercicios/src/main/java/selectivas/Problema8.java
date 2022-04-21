
package selectivas;

import java.util.Scanner;

public class Problema8 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int claveTelefonica = 0;
        float minutos = 0, total = 0;
        
        System.out.println("¿Cual es la clave telefonica?");
        claveTelefonica = in.nextInt();
        
        if(claveTelefonica == 12){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = minutos * 2;
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else if(claveTelefonica == 15){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = (float)(minutos * 2.2);
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else if(claveTelefonica == 18){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = (float)(minutos * 4.5);
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else if(claveTelefonica == 19){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = (float)(minutos * 3.5);
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else if(claveTelefonica == 23){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = minutos * 6;
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else if(claveTelefonica == 25){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = minutos * 6;
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else if(claveTelefonica == 29){
            
            System.out.println("¿Cuantos minutos duro la llamada?");
            minutos = in.nextFloat();
            
            total = minutos * 5;
            
            System.out.println("El precio total de la llamada es:  $" + total);
            
        } else {
            
            System.out.println("La clave telefonica ingresada no existe");
            
        }
    }
    
}
