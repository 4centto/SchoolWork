package arreglos;

public class Problema15 {

    public static void main(String[] args) {

        int Matriculas[] = new int[10];
        int Alumnos[] = new int[10];

        //Llenado de matriculas
        for (int i = 0; i < 10; i++) {
            Matriculas[i] = (int) (Math.random() * 10000);
        }

        //Llenado de promedios
        for (int i = 0; i < 10; i++) {
            Alumnos[i] = (int) (Math.random() * 10);
        }

        //Impresion de los arreglos
        System.out.println("MATRICULAS: ");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + Matriculas[i] + "] ");
        }
        System.out.println("");
        System.out.println("PROMEDIOS");
        for (int i = 0; i < 10; i++) {
            System.out.print("[" + Alumnos[i] + "] ");
        }
        System.out.println("");

        //Matricula del alumno con el mayor promedio
        int PROM = 1, MATRICULA = 0, AUX = 0;

        for (int i = 0; i < Matriculas.length; i++) { //Lectura de la matricula
            AUX = 0;
            for (int j = 0; j < Alumnos.length; j++) { // Lectura del promedio
                AUX = Alumnos[j];
                if (AUX > PROM) {
                    PROM = AUX;
                    MATRICULA = Matriculas[j];
                }
            }
        }

        System.out.println("El alumno con matricula '" + MATRICULA + "' tuvo el mayor promedio del grupo");

        //Matricula del alumno co el menor promedio
        int PROM2 = 100, MATRICULA2 = 0, AUX2 = 0;
        
        for(int i = 0; i < Alumnos.length; i++){
            if(Alumnos[i] < PROM2){
                PROM2 = Alumnos[i];
                MATRICULA2 = Matriculas[i];
            }
        }
        
        System.out.println("El alumno con matricula '" + MATRICULA2 + "' tuvo el menor promedio del grupo");
        
        //Promedio general de los Alumnos
        int PROMGEN = 0, ACUM = 0;
        
        for(int i = 0; i < Alumnos.length; i++){
            ACUM = ACUM + Alumnos[i];
        }
        PROMGEN = ACUM / 10;
        System.out.println("El promedio general del grupo es de: " + PROMGEN);
        
    }
}
