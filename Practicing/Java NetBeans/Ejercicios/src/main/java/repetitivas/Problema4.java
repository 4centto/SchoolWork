
package repetitivas;

public class Problema4 {
    
    public static void main(String[] args) {
        
        int R1 = 0, R2 = 0;
        R1 = (int)(Math.random() * 50);
        
        int arreglo1[] = new int[R1 + 1];
        
        System.out.println("En total seran " + R1 + " sueldos");
        
        for(int i = 1; i <= R1; i++){
            
            R2 = (int)(Math.random() * 5000);
            
            arreglo1[i] = R2;
            
            System.out.println("Sueldo " + i + ": " + " $" + arreglo1[i]);
            
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("**************************");
        System.out.println("*  SUELDOS CON AUMENTOS  *");
        System.out.println("**************************");
        System.out.println("");

        for(int i = 1; i <= R1; i++){
            
            if(arreglo1[i] < 1000){
                
                arreglo1[i] = (int)(arreglo1[i] * 1.15);
                
                System.out.println("Sueldo " + i + ":  $" + arreglo1[i]);
                
            } else if(arreglo1[i] >= 1000){
                
                arreglo1[i] = (int)(arreglo1[i] * 1.12);
                
                System.out.println("Sueldo " + i + ":  $" + arreglo1[i]);
                
            }
            
        }
        
    }
    
}
