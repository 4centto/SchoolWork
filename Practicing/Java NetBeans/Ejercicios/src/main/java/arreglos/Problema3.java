
package arreglos;

public class Problema3 {
    
    public static void main(String[] args) {
        
        int Arreglo[] = new int[31];
        int AUX = 0;
        
        for(int i = 1; i <= 30; i++){
            
            Arreglo[i] = i; 
            
        }
        
        for(int i = 1; i <= 30; i++){
            
            AUX = Arreglo[i];
            
            if((AUX % 2) != 0){
                
                System.out.println(AUX);
                
            }
            
        }
        
    }
    
}
