/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize.objetos;

import java.io.Serializable;

/**
 *
 * @author Ivan Michel
 */
public class Texto implements Serializable{
    
    private String texto;

    public Texto() {
    }

    public Texto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Texto{" + "texto=" + texto + '}';
    }
    
}
