
package ico.fes.partes;

import ico.fes.objetos.Puerta;
import java.awt.Color;

public class PuertaDeSeguridad extends Puerta{
    private String contrasenia;
    private String mecanismo;

    public PuertaDeSeguridad() {
    }

    public PuertaDeSeguridad(String contrasenia, String mecanismo) {
        this.contrasenia = contrasenia;
        this.mecanismo = mecanismo;
    }

    public PuertaDeSeguridad(String contrasenia, String mecanismo, String material, Color color, boolean conVidrio) {
        super(material, color, conVidrio);
        this.contrasenia = contrasenia;
        this.mecanismo = mecanismo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPuertaDeSeguridad{" + "contrasenia=" + contrasenia + ", mecanismo=" + mecanismo + '}';
    }
    
    public boolean verificar(String contrasenia){
        if(this.contrasenia != null){
            if(contrasenia.equals(this.contrasenia)){
                super.abrir();
                return true;
            } else {
                System.out.println("Contraseña incorrecta");
                return false;
            }
        } else {
            System.out.println("No hay contraseña");
            return false;
        }
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo puerta... (Herencia)");
    }
    
    
    
}
