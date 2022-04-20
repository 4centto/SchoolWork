
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.Color;

public class ConceptosBasicos {
    public static void main(String[] args) {
        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("Vlokswagen");
        miBocho.setSub_marca("Sedan");
        miBocho.setModelo(1980);
        //miBocho.modelo = 1980; // En peligro la integridad de la logica
        miBocho.setColor(Color.BLUE);
        System.out.println(miBocho);
        
        //Tarea... Programas los objetos miAcura y miMustang
        Automovil miAcura = new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSub_marca("");
        miAcura.setModelo(2020);
        miAcura.setColor(Color.BLACK);
        System.out.println(miAcura);
        
        Automovil miMustang = new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSub_marca("Mustang");
        miMustang.setModelo(1990);
        miMustang.setColor(Color.YELLOW);
        System.out.println(miMustang);
        
        // int, double, char, float, byte
        // Todas las clases del lenguaje: String, float, Color, Security
        
        
    }
}
