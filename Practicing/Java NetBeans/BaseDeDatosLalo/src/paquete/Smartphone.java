
package paquete;

public class Smartphone {
    //Atributos obligatorios
    private String id;
    private String marca;
    private String modelo;
    private String precio;
    //Atributos especificos
    private String resolucion;
    private String tipo_cargador;
    private String memoria_ram;
    private String memoria_interna;
    private String camara;

    public Smartphone() {
    }

    public Smartphone(String id, String marca, String modelo, String precio, String resolucion, String tipo_cargador, String memoria_ram, String memoria_interna, String camara) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.resolucion = resolucion;
        this.tipo_cargador = tipo_cargador;
        this.memoria_ram = memoria_ram;
        this.memoria_interna = memoria_interna;
        this.camara = camara;
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

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo_cargador() {
        return tipo_cargador;
    }

    public void setTipo_cargador(String tipo_cargador) {
        this.tipo_cargador = tipo_cargador;
    }

    public String getMemoria_ram() {
        return memoria_ram;
    }

    public void setMemoria_ram(String memoria_ram) {
        this.memoria_ram = memoria_ram;
    }

    public String getMemoria_interna() {
        return memoria_interna;
    }

    public void setMemoria_interna(String memoria_interna) {
        this.memoria_interna = memoria_interna;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }
    
    
    
}
