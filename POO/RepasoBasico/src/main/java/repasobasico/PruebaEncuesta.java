/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.SmartPhone;
import ico.fes.inegi.EncuestadorInegi;

/**
 *
 * @author acer_usuario
 */
public class PruebaEncuesta {
    public static void main(String[] args) {
        
        EncuestadorInegi ei = new EncuestadorInegi();
        ei.setNombre("Ivan");
        ei.setDispositivo(new SmartPhone("LG", "Rojo", "MT1", 6.0f));
        
        System.out.println(ei.getNombre());
        ei.setNombre("Mario");
        System.out.println(ei.getNombre());
        System.out.println(ei.getDispositivo().getColor());
        ei.getDispositivo().setModelo("LTT23");
        System.out.println(ei.getDispositivo());
        
    }
}
