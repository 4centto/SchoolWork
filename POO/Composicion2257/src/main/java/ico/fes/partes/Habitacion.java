/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

/**
 *
 * @author acer_usuario
 */
public class Habitacion {
    
    private int apagadores;
    private int contactos;
    private Muro[] muro;

    public Habitacion() {
    }

    public Habitacion(int apagadores, int contactos, Muro[] muro) {
        this.apagadores = apagadores;
        this.contactos = contactos;
        this.muro = muro;
    }

    public Muro[] getMuro() {
        return muro;
    }

    public void setMuro(Muro[] muro) {
        this.muro = muro;
    }

    public int getApagadores() {
        return apagadores;
    }

    public void setApagadores(int apagadores) {
        this.apagadores = apagadores;
    }

    public int getContactos() {
        return contactos;
    }

    public void setContactos(int contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "apagadores=" + apagadores + ", contactos=" + contactos + ", muro=" + muro + '}';
    }
    
    public void pintar(){
        System.out.println("Pintando...");
    }
    
}
