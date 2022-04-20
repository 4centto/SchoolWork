
package ico.fes;

import java.awt.Color;

public class Automovil {
    private String marca;
    private String sub_marca;
    public int modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String sub_marca, int modelo, Color color) {
        this.marca = marca;
        this.sub_marca = sub_marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSub_marca() {
        return sub_marca;
    }

    public void setSub_marca(String sub_marca) {
        this.sub_marca = sub_marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        if(modelo < 2022){
            this.modelo = modelo;
        } else {
            System.out.println("Año/Modelo fuera del rango");
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        System.out.println("Metiendo el auto al taller de pintura...");
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" + "marca=" + marca + ", sub_marca=" + sub_marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
}
