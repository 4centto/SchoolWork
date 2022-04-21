
package complementarios.problema12;

public class Problema1212 {
    
    private int A[][], B[][], C[][];
    
    public Problema1212(int A[][], int B[][], int C[][]){
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public void LlenarArreglo(){
        
        //Llenado de las matrices
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
            
                A[i][j] = (int)(Math.random() * 10);
            
            }
        }
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B.length; j++){
            
                B[i][j] = (int)(Math.random() * 10);
            
            }
        }
        
    }
    
    public void ImpresionArreglos(){
        //Impresion de las matrices
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
            
                System.out.print("[" + A[i][j] + "]");
            
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("   +");
        System.out.println("");
        
        for(int i = 0; i < B.length; i++){
            for(int j = 0; j < B.length; j++){
            
                System.out.print("[" + B[i][j] + "]");
            
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void Operaciones(){
        
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                
                C[i][j] = A[i][j] + B[i][j];
                
            }
        }
        
        //Impresion de C
        for(int i = 0; i < C.length; i++){
            for(int j = 0; j < C.length; j++){
                System.out.print("[" + C[i][j] + "]");
            }
            System.out.println("");
        }
        
    }
    
}
