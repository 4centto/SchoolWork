
package selectivas;

import java.util.Scanner;

public class Problema3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        float PROM, MAT1, MAT2, MAT3, MAT4, MAT5;
        String matricula;
        
        System.out.println("¿Cual es la matricula del alumno?");
        matricula = in.nextLine();
        
        System.out.println("Calificacion 1: ");
        MAT1 = in.nextFloat();
        
        System.out.println("Calificacion 2: ");
        MAT2 = in.nextFloat();
        
        System.out.println("Calificacion 3: ");
        MAT3 = in.nextFloat();
        
        System.out.println("Calificacion 4: ");
        MAT4 = in.nextFloat();
        
        System.out.println("Calificacion 5: ");
        MAT5 = in.nextFloat();
        
        PROM = (MAT1 + MAT2 + MAT3 +MAT4 + MAT5) / 5;
        
        if(PROM >= 6){
            
            System.out.println("El alumno con matricula '" + matricula + "' aprobo el año con: " + PROM);
            
        } else if(PROM < 6){
            
            System.out.println("El alumno con matricula '" + matricula + "' reprobo el año con: " + PROM);
            
        }
        
    }
    
}
