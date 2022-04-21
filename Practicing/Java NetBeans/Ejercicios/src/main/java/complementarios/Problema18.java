
package complementarios;

public class Problema18 {
    public static void main(String[] args) {
        
        int ARREGLO[][][] = new int[7][8][10];
        
        //Llenado
        for(int i = 0; i < 7; i++){ // Carreras
            for(int j = 0; j < 8; j++){ // Meses Enero/Agosto
                for(int k = 0; k < 10; k++){ // Años
                    
                    ARREGLO[i][j][k] = (int)(Math.random() * 100);
                    
                }
            }
        }
        
        //Impresion
        for(int i = 0; i < 7; i++){
            System.out.print("* CARRERA " + (i + 1) + " *");
            if(i == 0){
                System.out.println("  CONTABILIDAD  *");
            } else if(i == 1){
                System.out.println("  ECONOMIA  *");
            } else if(i == 2){
                System.out.println("  ADMINISTRACION  *");
            } else if(i == 3){
                System.out.println("  ING. COMPUTACION  *");
            } else if(i == 4){
                System.out.println("  ING. TELEMATICA  *");
            } else if(i == 5){
                System.out.println("  RELACIONES INTERNACIONALES  *");
            } else if(i == 6){
                System.out.println("  ACTUARIA  *");
            }
            for(int j = 0; j < 8; j++){
                System.out.print("MES " + (j + 1) + ": ");
                for(int k = 0; k < 10; k++){
                    
                    System.out.print("[" + ARREGLO[i][j][k] + "]");
                    
                }
                System.out.println("");
            }
            System.out.println("");
        }
        
        //El año en el que ingreso mayor cantidad de numeros en la universidad
        int AÑOS[] = new int[10];
        int MAYOR = 1;
        
        for(int i = 0; i < 7; i++){
            for(int k = 0; k < 10; k++){
                for(int j = 0; j < 8; j++){
                    if(k == 0){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 1){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 2){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 3){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 4){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 5){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 6){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 7){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 8){
                        AÑOS[k] += ARREGLO[i][j][k];
                    } else if(k == 9){
                        AÑOS[k] += ARREGLO[i][j][k];
                    }
                }
            }
        }
        
        //Metodo para saber cual fue el mayor año 
        int AÑO = 0;
        
        for(int i = 0; i < AÑOS.length; i++){
            if(AÑOS[i] > MAYOR){
                MAYOR = AÑOS[i];
                AÑO = (i + 1);
            }
        }
        System.out.println("El año " + AÑO + " tuvo mayor ingreso de alumnos con: " + MAYOR + " alumnos");
        System.out.println("");
        
        //Que carrera en el ultimo año recibio mayor cantidad de alumnos
        int ACUM = 0, CARRERA = 0, MAYOR2 = 1;
        
        for(int i = 0; i < 7; i++){
            ACUM = 0;
            for(int k = 9; k == 9; k++){
                for(int j = 0; j < 8; j++){
                    
                    ACUM += ARREGLO[i][j][k];
                    
                }
            }
            if(ACUM > MAYOR2){
                MAYOR2 = ACUM;
                CARRERA = (i + 1);
            }
        }
        System.out.println("En la carrera " + CARRERA +"  se registraron mayor cantidad de alumnos en el ulrimo año: " + MAYOR2 + " alumnos");
        System.out.println("");
        
        //En que año la carrera de econonomia recibio mayor cantidad de alumnos
        int ACUM3 = 0, MAYORAÑO = 1, AÑO2 = 0;
        
        for(int i = 1; i == 1; i++){
            for(int k = 0; k < 10; k++){
                ACUM3 = 0;
                for(int j = 0; j < 8; j++){
                    
                    ACUM3 += ARREGLO[i][j][k];
                    
                }
                if(ACUM3 > MAYORAÑO){
                    MAYORAÑO = ACUM3;
                    AÑO2 = (k + 1);
                }
            }
        }
        System.out.println("En el año " + AÑO2 + " la carrera de economia tuvo mayor afluencia de estudiantes con: " + MAYORAÑO + " alumnos");
        System.out.println("");
        
    }
}
