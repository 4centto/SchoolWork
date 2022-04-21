
package complementarios;

public class Problema16 {
    public static void main(String[] args) {
        
        int A[][] = new int[30][6];
        
        //Llenado
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 6; j++){
                A[i][j] = (int)(Math.random() * 10);
            }
        }
        
        //Impresion
        for(int i = 0; i < 30; i++){
            for(int j = 0; j < 6; j++){
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //El promedio de calificaciones de cada uno de los 6 examenes
        int ACUM = 0, PROM = 0;
        
        for(int i = 0; i < 6; i++){
            ACUM = 0;
            PROM = 0;
            for(int j = 0; j < 30; j++){
                
                ACUM += A[j][i];
                
            }
            PROM = ACUM / 30;
            System.out.println("Examen " + (i + 1) + ": " + PROM);
        }
        System.out.println("");
        
        //El promedio de cada alumno
        int ACUM2 = 0, PROM2 = 0;
        
        for(int i = 0; i < 30; i++){
            ACUM2 = 0;
            PROM2 = 0;
            for(int j = 0; j < 6; j++){
                ACUM2 += A[i][j];
            }
            PROM2 = ACUM2 / 6;
            System.out.println("Alumno " + (i + 1) + ": " + PROM2);
        }
        System.out.println("");
        
        //El numero del examen que tuvo el mayor promedio de calificacion y cuanto es
        int ACUM3 = 0, PROM3 = 0, MAYOR = 1, EXAMEN = 0;
        
        for(int i = 0; i < 6; i++){
            ACUM3 = 0;
            PROM3 = 0;
            for(int j = 0; j < 30; j++){
                
                ACUM3 += A[j][i];
                
            }
            PROM3 = ACUM3 / 30;
            if(PROM3 > MAYOR){
                MAYOR = PROM3;
                EXAMEN = i + 1;
            }
        }
        System.out.println("El examen " + EXAMEN + " tuvo mayor promedio con: " + MAYOR);
    }
}
