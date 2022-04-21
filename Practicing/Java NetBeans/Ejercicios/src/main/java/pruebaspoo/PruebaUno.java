
package pruebaspoo;

public class PruebaUno {
    
    private int N = 0;
    private int ARREGLO[][];
    
    public PruebaUno(int N, int[][] ARREGLO){
        this.N = N;
        this.ARREGLO = ARREGLO;
    }
    
    public void Llenado(){
        
        for(int i = 0; i < ARREGLO.length; i++){
            for(int j = 0; j < ARREGLO.length; j++){
                
                ARREGLO[i][j] = (int)(Math.random() * 10);
                
            }
        }
        
    }
    
    public void Impresion(){
        
        for(int i = 0; i < ARREGLO.length; i++){
            for(int j = 0; j < ARREGLO.length; j++){
                
                System.out.print("[" + ARREGLO[i][j] + "]");
                
            }
            System.out.println("");
        }
        
    }
}
