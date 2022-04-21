
package complementarios;

public class Problema15 {
    public static void main(String[] args) {
        
        int A[][] = new int[4][4];
        
        //Llenado
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                
                if(i == 0 && j == 0){
                    A[i][j] = 1;
                } else if(i == 1 && j == 1){
                    A[i][j] = 1;
                } else if(i == 2 && j == 2){
                    A[i][j] = 1;
                } else if(i == 3 && j == 3){
                    A[i][j] = 1;
                } else {
                    A[i][j] = 0;
                }
                
            }
        }
        
        //Impresion
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A.length; j++){
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
    }
}
