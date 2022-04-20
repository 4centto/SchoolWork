package ico.fes.programacion;

public class Profesor extends Persona{
    
    private String carrera;
    private int antiguedad;

    public Profesor() {
    }

    public Profesor(String carrera, int antiguedad) {
        this.carrera = carrera;
        this.antiguedad = antiguedad;
    }

    public Profesor(String carrera, int antiguedad, int edad, String nombre) {
        super(edad, nombre);
        this.carrera = carrera;
        this.antiguedad = antiguedad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesor{" + "carrera=" + carrera + ", antiguedad=" + antiguedad + '}';
    }
    
    public void asister(){
        System.out.println("Checando entrada en sala de firmas...");
    }
    
    public void dictarClase(){
        System.out.println("Enseñando programacion en la sala de cómputo");
    }
    
}
