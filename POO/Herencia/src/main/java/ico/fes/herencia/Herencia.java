
package ico.fes.herencia;

import ico.fes.clases.Alumno;

public class Herencia {
    public static void main(String[] args) {
        
        //Creando Alumno

        
        Alumno alumno = new Alumno("318146506", "Ing. en Computacion", "Segundo semestre", "Ivan Castro", 18, 1, 1.75f);
        
        //Imprimiendo el alumno creado
        System.out.println(alumno.toString());
        
    }
}
