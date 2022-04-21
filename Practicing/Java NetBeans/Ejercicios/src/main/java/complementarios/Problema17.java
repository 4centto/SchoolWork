
package complementarios;

public class Problema17 {
    public static void main(String[] args) {
        
        int FAB[][] = new int[30][12];
        
        //Llenado
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 12; j++){
                
                FAB[i][j] = (int)(Math.random() * 1000);
                
            }
        }
        
        //Impresion de la tabla
        for(int i = 0; i < 30; i++){
            System.out.print("Fabrica " + (i  + 1) + ": ");
            for(int j = 0; j < 12; j++){
                
                System.out.print("[" + FAB[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        //La clave y produccion de la fabrica que mas produjo
        int ACUM = 0, MAYOR = 1, FABRICA = 0;
        
        for(int i = 0; i < 30; i++){
            ACUM = 0;
            for(int j = 0; j < 12; j++){
                
                ACUM += FAB[i][j];                
            }
            if(ACUM > MAYOR){
                MAYOR = ACUM;
                FABRICA = (i + 1);
            }
        }
        System.out.println("La fabrica " + FABRICA + " fue la que mayor produjo, con: " + MAYOR);
        System.out.println("");
        
        //
        
    }
}
