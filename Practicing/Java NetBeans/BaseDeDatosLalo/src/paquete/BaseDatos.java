package paquete;

import java.util.ArrayList;

public class BaseDatos {
    
    private ArrayList<Laptop> base_laptop = new ArrayList<>();
    private ArrayList<Smartphone> base_smartphone = new ArrayList<>();
    private ArrayList<Bocina> base_bocina = new ArrayList<>();
    private ArrayList<Pantalla> base_pantalla = new ArrayList<>();
    private ArrayList<Impresora> base_impresora = new ArrayList<>();

    public BaseDatos() {
    }

    public ArrayList<Laptop> getBase_laptop() {
        return base_laptop;
    }

    public void setBase_laptop(Laptop laptop) {
        this.base_laptop.add(laptop);
    }

    public ArrayList<Smartphone> getBase_smartphone() {
        return base_smartphone;
    }

    public void setBase_smartphone(Smartphone celular) {
        this.base_smartphone.add(celular);
    }

    public ArrayList<Bocina> getBase_bocina() {
        return base_bocina;
    }

    public void setBase_bocina(Bocina bocina) {
        this.base_bocina.add(bocina);
    }

    public ArrayList<Pantalla> getBase_pantalla() {
        return base_pantalla;
    }

    public void setBase_pantalla(Pantalla pantalla) {
        this.base_pantalla.add(pantalla);
    }

    public ArrayList<Impresora> getBase_impresora() {
        return base_impresora;
    }

    public void setBase_impresora(Impresora impresora) {
        this.base_impresora.add(impresora);
    }
    
    
    
}