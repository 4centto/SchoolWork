package paquete;

public class Impresora {
    //Atributos obligatorios
    private String id;
    private String marca;
    private String modelo;
    private String precio;
    //Atributos Especificos
    private String tipo_cartucho;
    private String tipo_impresion;
    private String dimensiones;
    private String resolucion_maxima;
    private String tecnologia_impresion;

    public Impresora() {
    }

    public Impresora(String id, String marca, String modelo, String precio, String tipo_cartucho, String tipo_impresion, String dimensiones, String resolucion_maxima, String tecnologia_impresion) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipo_cartucho = tipo_cartucho;
        this.tipo_impresion = tipo_impresion;
        this.dimensiones = dimensiones;
        this.resolucion_maxima = resolucion_maxima;
        this.tecnologia_impresion = tecnologia_impresion;
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

    public String getTipo_cartucho() {
        return tipo_cartucho;
    }

    public void setTipo_cartucho(String tipo_cartucho) {
        this.tipo_cartucho = tipo_cartucho;
    }

    public String getTipo_impresion() {
        return tipo_impresion;
    }

    public void setTipo_impresion(String tipo_impresion) {
        this.tipo_impresion = tipo_impresion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getResolucion_maxima() {
        return resolucion_maxima;
    }

    public void setResolucion_maxima(String resolucion_maxima) {
        this.resolucion_maxima = resolucion_maxima;
    }

    public String getTecnologia_impresion() {
        return tecnologia_impresion;
    }

    public void setTecnologia_impresion(String tecnologia_impresion) {
        this.tecnologia_impresion = tecnologia_impresion;
    }
    
    
    
}
