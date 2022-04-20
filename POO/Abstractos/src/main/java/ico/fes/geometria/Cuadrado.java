
package ico.fes.geometria;

public class Cuadrado implements Figura{
    
    private float lado;

    public Cuadrado() {
    }

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public void area() {
        System.out.println("El area del cuadrado es: " + (this.lado * this.lado));
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    
    
}
