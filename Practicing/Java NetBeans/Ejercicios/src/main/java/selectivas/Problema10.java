
package selectivas;

import java.util.Scanner;

public class Problema10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Tipo, Edad, Dias;
        float COST;
        
        System.out.println("Cual es el tipo de enfermedad: ");
        Tipo = in.nextInt();
        
        if(Tipo > 0 && Tipo < 5){
            
            System.out.println("¿Cual es la edad del paciente?");
            Edad = in.nextInt();
            
            System.out.println("¿Cuantos dias estuvo el paciente?");
            Dias = in.nextInt();
            
            switch(Tipo){
                case 1:
                    
                    COST = Dias * 25;
                    
                    if(Edad >= 14 && Edad <= 22){
                        COST = (float)(COST * 1.10);
                    } else {
                        System.out.println("El costo total es: $" + COST);
                    }
                    
                    break;
                    
                case 2:
                    
                    COST = Dias * 16;
                    
                    if(Edad >= 14 && Edad <= 22){
                        COST = (float)(COST * 1.10);
                    } else {
                        System.out.println("El costo total es: $" + COST);
                    }
                    
                    break;
                    
                case 3:
                    
                    COST = Dias * 20;
                    
                    if(Edad >= 14 && Edad <= 22){
                        COST = (float)(COST * 1.10);
                    } else {
                        System.out.println("El costo total es: $" + COST);
                    }
                    
                    break;
                    
                case 4:
                    
                    COST = Dias * 32;
                    
                    if(Edad >= 14 && Edad <= 22){
                        COST = (float)(COST * 1.10);
                    } else {
                        System.out.println("El costo total es: $" + COST);
                    }
                    
                    break;
            }
            
        } else {
            System.out.println("Enfermedad no registrada");
        }
        
    }
    
}
