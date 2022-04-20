
package ico.fes.programacion;

public class ProfesorDeProgramacion extends Profesor implements Programador{
    
    private int aniosExperiencia;
    private String lenguajeProgramacion;

    public ProfesorDeProgramacion() {
    }

    public ProfesorDeProgramacion(int aniosExperiencia, String lenguajeProgramacion) {
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosExperiencia, String lenguajeProgramacion, String carrera, int antiguedad) {
        super(carrera, antiguedad);
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosExperiencia, String lenguajeProgramacion, String carrera, int antiguedad, int edad, String nombre) {
        super(carrera, antiguedad, edad, nombre);
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesorDeProgramacion{" + "aniosExperiencia=" + aniosExperiencia + ", lenguajeProgramacion=" + lenguajeProgramacion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en " + this.lenguajeProgramacion + "...");
        return 2;
    }

    @Override
    public void probarCodigo() {
        System.out.println("Probando programas en " + this.lenguajeProgramacion + "...");
    }
    
}
