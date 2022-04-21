
package complementarios;

public class Problema19 {
    public static void main(String[] args) {
        
        int ARREGLO[][][] = new int[3][12][4];
        
        //Llenado
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 12; j++){
                for(int k = 0; k < 4; k++){
                    
                    ARREGLO[i][j][k] = (int)(Math.random() * 100);
                    
                }
            }
        }
        
        //Impresion
        for(int i = 0; i < 3; i++){
            if(i == 0){
                System.out.println("*   DULCES ");
            } else if(i == 1){
                System.out.println("*  BEBIDAS ");
            } else if(i == 2){
                System.out.println("*CONSERVAS ");
            }
            for(int j = 0; j < 12; j++){
                
                System.out.print("MES " + (j + 1) + ":  ");
                
                for(int k = 0; k < 4; k++){
                    
                    System.out.print("[" + ARREGLO[i][j][k] + "]");
                    
                }
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //La seccion que mas produccion obtuvo en los 4 años
        int ACUM = 0, MAYOR = 1, SECCION = 0;
        
        for(int i = 0; i < 3; i++){
            ACUM = 0;
            for(int j = 0; j < 12; j++){
                for(int k = 0; k < 4; k++){
                    
                    ACUM += ARREGLO[i][j][k];
                    
                }
            }
            if(ACUM > MAYOR){
                MAYOR = ACUM;
                SECCION = (i + 1);
            }
        }
        System.out.println("La seccion " + SECCION + " tuvo mas produccion, con: " + MAYOR);
        System.out.println("");
        
        //En que mes del segundo año, la fabrica alcanzo mayor produccion
        int ACUM2 = 0, MES = 0, MAYOR2 = 1;
        
        for(int i = 0; i < 3; i++){ // SECCION
            for(int j = 0; j < 12; j++){ // MESES
                ACUM = 0;
                for(int k = 1; k == 1; k++){ // AÑOS
                    
                    ACUM2 += ARREGLO[i][j][k];
                    
                }
                if(ACUM2 > MAYOR2){
                    MAYOR2 = ACUM2;
                    MES = (j + 1);
                }
            }
        }
        System.out.println("En el mes " + MES + " se registro la mayor produccion de la fabrica con: " + MAYOR2);
        System.out.println("");
        
        //En que año se produjo mas
        int ACUM3 = 0, MAYOR3 = 1, AÑO = 0;
        
        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 4; k++){
                ACUM3 = 0;
                for(int j = 0; j < 12; j++){
                    
                    ACUM3 += ARREGLO[i][j][k];
                    
                }
                if(ACUM3 > MAYOR3){
                    MAYOR3 = ACUM3;
                    AÑO = (k + 1);
                }
            }
        }
        System.out.println("En el año " + AÑO + " se registro mayor produccion con: " + MAYOR3);
        System.out.println("");
        
        //En que departamento, mes y año se resgistro la mayor produccion
        //Departamento
        int ACUM5 = 0, MAYOR5 = 1;
        int DEP = 0;
        
        for(int i = 0; i < 3; i++){
            ACUM5 = 0;
            for(int j = 0; j < 12; j++){
                for(int k= 0; k < 4; k++){
                    
                    ACUM5 += ARREGLO[i][j][k];
                    
                }
            }
            if(ACUM5 > MAYOR5){
                DEP = i;
            }
        }
        
        //Mes
        ACUM5 = 0;
        MAYOR5 = 1;
        int MES5 = 0;
        
        for(int i = DEP; i == DEP; i++){
            for(int j = 0; j < 12; j++){
                ACUM5 = 0;
                for(int k = 0; k < 4; k++){
                    
                    ACUM5 += ARREGLO[i][j][k];
                    
                }
                if(ACUM5 > MAYOR5){
                    MES5 = j;
                }
            }
        }
        
        //Año
        ACUM5 = 0;
        MAYOR5 = 1;
        int AÑO5 = 0;
        
        for(int i = DEP; i == DEP; i++){
            for(int k = 0; k < 4; k++){
                ACUM5 = 0;
                for(int j = 0; j < 12; j++){
                    
                    ACUM5 += ARREGLO[i][j][k];
                    
                }
                if(ACUM5 > MAYOR5){
                    AÑO5 = k;
                }
            }
        }
        System.out.println("En el departamento " + (DEP + 1) + " en el mes " + (MES5 + 1) + " en el año " + (AÑO5 + 1) + " se registro la mayor cantidad de produccion");
    }
}
