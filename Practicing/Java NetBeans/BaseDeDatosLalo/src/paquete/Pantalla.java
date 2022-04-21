
package paquete;

public class Pantalla {
    //Atributos obligatorios
    private String id;
    private String marca;
    private String modelo;
    private String precio;
    //Atributos especificos
    private String pulgadas;
    private String resolucion;
    private String tipo_led_oled_lcd;
    private String smart_tv;
    private String soporte_fisico;

    public Pantalla() {
    }

    public Pantalla(String id, String marca, String modelo, String precio, String pulgadas, String resolucion, String tipo_led_oled_lcd, String smart_tv, String soporte_fisico) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.tipo_led_oled_lcd = tipo_led_oled_lcd;
        this.smart_tv = smart_tv;
        this.soporte_fisico = soporte_fisico;
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

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTipo_led_oled_lcd() {
        return tipo_led_oled_lcd;
    }

    public void setTipo_led_oled_lcd(String tipo_led_oled_lcd) {
        this.tipo_led_oled_lcd = tipo_led_oled_lcd;
    }

    public String getSmart_tv() {
        return smart_tv;
    }

    public void setSmart_tv(String smart_tv) {
        this.smart_tv = smart_tv;
    }

    public String getSoporte_fisico() {
        return soporte_fisico;
    }

    public void setSoporte_fisico(String soporte_fisico) {
        this.soporte_fisico = soporte_fisico;
    }
    
    
    
}
