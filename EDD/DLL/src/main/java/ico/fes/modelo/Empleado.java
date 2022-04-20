
package ico.fes.modelo;

public class Empleado {
    
    private int id;
    private String nombre;
    private String paterno;
    private String materno;
    private float sueldoBase;
    private int annioIngreso;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String paterno, String materno, float sueldoBase, int annioIngreso, int horasExtra) {
        this.id = id;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldoBase = sueldoBase;
        this.annioIngreso = annioIngreso;
        this.horasExtra = horasExtra;
    }

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return "Empleado:" + "\n\tId: " + id + "\n\tNombre: " + nombre + "\n\tPaterno: " + paterno + "\n\tMaterno: " + materno + "\n\tSueldo base: " + sueldoBase + "\n\tAño de ingreso: " + annioIngreso + "\n\tHoras extra: " + horasExtra + "\n-----------------------\n";
    }
    
    
    
}
