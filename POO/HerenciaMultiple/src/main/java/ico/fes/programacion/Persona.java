
package ico.fes.programacion;

public class Persona {
    private int edad;
    private String nombre;

    public Persona() {
    }

    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + '}';
    }
    
    public void dormir(){
        System.out.println(this.nombre + " esta durmiendo...");
    }
    
    public void comer(){
        System.out.println(this.nombre + " esta comiendo...");
    }
    
}
