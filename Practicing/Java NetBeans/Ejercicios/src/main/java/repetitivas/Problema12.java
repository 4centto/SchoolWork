
package repetitivas;

import java.util.Scanner;

public class Problema12 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int N = 0, ID = 0, SUE = 0, SUEMA = 0, IDMA = 0;
        
        System.out.println("¿Cuantos empleados son?");
        N = in.nextInt();
        
        for(int i = 1; i <= N; i++){
            
            System.out.println("Cual es el ID del empleado " + i + ": ");
            ID = in.nextInt();
            
            System.out.println("Cual es el sueldo del empleado " + i +": ");
            SUE = in.nextInt();
            
            if(SUE > SUEMA){
                
                SUEMA = SUE;
                IDMA = ID;
                
            }
            
        }
        
        System.out.println("");
        System.out.println("El empleado con ID '" + IDMA + "' tiene el mayor sueldo con:  $" + SUEMA);
        
    }
    
}
