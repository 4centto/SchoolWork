
package paquete;

public class Laptop {
    
    //Atributos obligatorios
    private String id;
    private String marca;
    private String modelo;
    private String precio;
    //Atributos especificos
    private String pulgadas;
    private String tipo_cargador;
    private String memoria_ram;
    private String memoria_interna;
    private String procesador;

    public Laptop() {
    }

    public Laptop(String id, String marca, String modelo, String precio, String pulgadas, String tipo_cargador, String memoria_ram, String memoria_interna, String procesador) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.pulgadas = pulgadas;
        this.tipo_cargador = tipo_cargador;
        this.memoria_ram = memoria_ram;
        this.memoria_interna = memoria_interna;
        this.procesador = procesador;
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

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    
}