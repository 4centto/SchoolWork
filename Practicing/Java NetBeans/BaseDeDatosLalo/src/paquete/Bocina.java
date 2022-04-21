
package paquete;

public class Bocina {
    //Atributos obligatorios
    private String id;
    private String marca;
    private String modelo;
    private String precio;
    //Atributos especificos
    private String forma;
    private String duracion_bateria;
    private String peso;
    private String volumen_maximo;
    private String material;

    public Bocina() {
    }

    public Bocina(String id, String marca, String modelo, String precio, String forma, String duracion_bateria, String peso, String volumen_maximo, String material) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.forma = forma;
        this.duracion_bateria = duracion_bateria;
        this.peso = peso;
        this.volumen_maximo = volumen_maximo;
        this.material = material;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getDuracion_bateria() {
        return duracion_bateria;
    }

    public void setDuracion_bateria(String duracion_bateria) {
        this.duracion_bateria = duracion_bateria;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getVolumen_maximo() {
        return volumen_maximo;
    }

    public void setVolumen_maximo(String volumen_maximo) {
        this.volumen_maximo = volumen_maximo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}
