
package complementarios.problema14;

public class Problema1414 {
    
    private int A[][];
    private int NUM;
    
    public Problema1414(int A[][], int NUM){
        this.A = A;
        this.NUM = NUM;
    }
    
    public void LlenadoDeMultiplos(){
        
        int ACUM = 1;
        
        //Llenado de multiplos
        for(int i = 0; i < 10; i++){
            A[i][0] = ACUM;
            ACUM ++;
        }
        //Llenado del numero ingresado
        for(int i = 0; i < 10; i++){
            A[i][1] = NUM;
        }
        
        //Operaciones
        for(int i = 0; i < 10; i++){
            A[i][2] = NUM * (i + 1);
        }
        
    }
    
    public void Impresion(){
        System.out.println("");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
