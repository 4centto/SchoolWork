
package complementarios;

public class Problema13 {
    public static void main(String[] args) {
        
        int A[][] = new int[3][3];
        int C[] = new int[3];
        
        System.out.println(Operaciones(A, C));
        
    }
    
    private static String Operaciones(int[][] A, int[] C){
        String cadena = "";
        
        //Llenado
        for(int i = 0; i < A.length;i++){
            for(int j = 0; j < A.length; j++){
                
                A[i][j] = (int)(Math.random() * 10);
                
            }
        }
        
        //Impresion de A
        for(int i = 0; i < A.length;i++){
            for(int j = 0; j < A.length; j++){
                
                System.out.print("[" + A[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Resultado de la diagonal
        System.out.println("DIAGONAL: ");
        C[0] = A[0][0];
        C[1] = A[1][1];
        C[2] = A[2][2];
        
        cadena = "[" + C[0] + "][" + C[1] + "][" + C[2] + "]";
        
        return cadena;
        
    }
}
