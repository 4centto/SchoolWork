
package arreglos;

public class Problema8 {
    
    public static void main(String[] args) {
        
        int Arreglo[][] = new int[4][4];
        int Arreglo2[][] = new int[4][4];
        int N = 4;
        
        //Llenado de la matriz
        for(int i = 0; i < Arreglo.length; i++){
            
            for(int j = 0; j < Arreglo.length; j++){
                
                Arreglo[i][j] = (int)(Math.random() * 100);
                
            }
            
        }
        
        //Impresion de la Matriz original
        for(int i = 0; i < Arreglo.length; i++){
            
            for(int j = 0; j < Arreglo.length; j++){
                
                System.out.print("[" + Arreglo[i][j] + "]");
                
            }
            
            System.out.println("");
            
        }
        
        System.out.println("");
        System.out.println("MATRIZ INVERTIDA");
        System.out.println("");
        
        //Inversion de la matriz
        for(int i = 0; i < Arreglo.length; i++){
            
            for(int j = 0; j < Arreglo.length; j++){
                
                N = 4;
                
                if(i == 0){
                    
                    Arreglo2[N-1][j] = Arreglo[i][j];
                    Arreglo2[i][j] = Arreglo[N-1][j];
                    
                }
                if(i == 1){
                    
                    Arreglo2[N-2][j] = Arreglo[i][j];
                    Arreglo2[i][j] = Arreglo[N-2][j];
                    
                }
                
            }
            
        }
        
        //Impresion de la Matriz Invertida
        for(int i = 0; i < Arreglo.length; i++){
            for(int j = 0; j < Arreglo.length; j++){
                
                System.out.print("[" + Arreglo2[i][j] + "]");
                
            }
            
            System.out.println("");
            
        }
        
    }
    
}
