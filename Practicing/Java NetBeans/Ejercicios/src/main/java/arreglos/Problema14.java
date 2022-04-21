
package arreglos;

public class Problema14 {
    public static void main(String[] args) {
        
        int Arreglo[][][] = new int[58][12][10];
        
        //Llenado del Arreglo
        for(int i = 0; i < 58; i++){ //Zonas Arquologicas 
            for(int j = 0; j < 12; j++){ //Meses de un año
                for(int k = 0; k < 10; k++){ //10 Años
                    
                    Arreglo[i][j][k] = (int)(Math.random() * 5);
                    
                }
            }
        }
        
        //Impresion de las tablas
        for(int i = 0; i < 58; i++){ //Zonas Arquologicas 
            System.out.println("CENTRO ARQUEOLOGICO " + i + ": ");
            for(int j = 0; j < 12; j++){ //Meses de un año
                for(int k = 0; k < 10; k++){ //10 Años
                    
                    System.out.print("[" + Arreglo[i][j][k] + "]");
                    
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        //En que año el centro arqueologico 43 tuvo la mayor afluencia de visitantes
        int AFLUENCIA = 1, AUX = 0, AÑO = 0, ACUM = 0;
        
        for(int i = 48; i == 48; i++){ //Zonas Arquologicas 
            for(int k = 0; k < 10; k++){ // 10 Años
                ACUM = 0;
                for(int j = 0; j < 12; j++){ //Meses de un año
                    
                    ACUM = ACUM + Arreglo[i][j][k]; 
                    
                }
                if(ACUM > AFLUENCIA){
                    AFLUENCIA = ACUM;
                    AÑO = k;
                }
            }
        }
        
        System.out.println("El museo 48 tuvo mayor afluencia en el año " + AÑO + " con " + AFLUENCIA + " visitantes");
        
        //Centro arqueologico que en 1994 recibió mayor afluencia de visitantes
        int AFLUENCIA2 = 1, ACUM2 = 0, CENTRO = 0;
        
        for(int i = 0; i < 58; i++){ // Zonas Arquologicas
            ACUM = 0;
            for(int j = 0; j < 12; j++){ // Meses de un año
                for(int k = 0; k == 0; k++){ // 10 Años mencionados
                    
                    ACUM = ACUM + Arreglo[i][j][k];
                    
                }
            }
            
            if(ACUM > AFLUENCIA2){
                AFLUENCIA2 = ACUM;
                CENTRO = i;
            }
        }
        
        System.out.println("El centro arqueologico " + CENTRO  + " tuvo mayor afluencia en el año 1994");
        
        //En que mes de 1995 los centros recibieron mayor numero de visitantes
        int MES0 = 0, MES1 = 0, MES2 = 0, MES3 = 0, MES4 = 0, MES5 = 0, MES6 = 0, MES7 = 0, MES8 = 0, MES9 = 0,
                MES10 = 0, MES11 = 0;
        int MESES[] = new int[12];
        
        for(int i = 0; i < 58; i++){
            for(int j = 0; j < 12; j++){
                for(int k = 1; k == 1; k++){
                    if(j == 0){
                        MES0 = MES0 + Arreglo[i][j][k];
                        MESES[j] = MES0;
                        
                    } else if(j == 1){
                        MES1 = MES1 + Arreglo[i][j][k];
                        MESES[j] = MES1;
                        
                    } else if(j == 2){
                        MES2 = MES2 + Arreglo[i][j][k];
                        MESES[j] = MES2;
                        
                    } else if(j == 3){
                        MES3 = MES3 + Arreglo[i][j][k];
                        MESES[j] = MES3;
                        
                    } else if(j == 4){
                        MES4 = MES4 + Arreglo[i][j][k];
                        MESES[j] = MES4;
                        
                    } else if(j == 5){
                        MES5 = MES5 + Arreglo[i][j][k];
                        MESES[j] = MES5;
                        
                    } else if(j == 6){
                        MES6 = MES6 + Arreglo[i][j][k];
                        MESES[j] = MES6;
                        
                    } else if(j == 7){
                        MES7 = MES7 + Arreglo[i][j][k];
                        MESES[j] = MES7;
                        
                    } else if(j == 8){
                        MES8 = MES8 + Arreglo[i][j][k];
                        MESES[j] = MES8;
                        
                    } else if(j == 9){
                        MES9 = MES9 + Arreglo[i][j][k];
                        MESES[j] = MES9;
                        
                    }else if(j == 10){
                        MES10 = MES10 + Arreglo[i][j][k];
                        MESES[j] = MES10;
                        
                    }else if(j == 11){
                        MES11 = MES11 + Arreglo[i][j][k];
                        MESES[j] = MES11;
                        
                    }
                }
            }
        }
        
        //Imprimir la cantidad de visitantes por mes en los ultimos años
        for(int i = 0; i < 12; i++){
            System.out.print("MES " + i + ": ");
            System.out.println("[" + MESES[i] + "]");
        }
        
        //Imprimir cual fue el mes con mayor concurrencia
        int MESMAYOR = 1, MESAFLUENTE = 0;
        for(int i = 0; i < 12; i++){
            if(MESES[i] > MESMAYOR){
                MESMAYOR = MESES[i];
                MESAFLUENTE = i;
            }
        }
        System.out.println("");
        System.out.println("El mes " + MESAFLUENTE + " tuvo mas visitas durante el año 1995 con: " + MESMAYOR + " visitantes");
    }
}
