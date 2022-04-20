package herenciamultiple;

import ico.fes.programacion.ProfesorDeProgramacion;
import ico.fes.iu.MiVentana;

public class HerenciaMultiple {
    public static void main(String[] args) {
        
        ProfesorDeProgramacion profesor = new ProfesorDeProgramacion(20, "Java");
        profesor.comer();
        profesor.asister();
        profesor.dictarClase();
        profesor.programar();
        profesor.probarCodigo();
        profesor.dormir();
        
        System.out.println(profesor);
        
        MiVentana v = new MiVentana();
        
    }
}
