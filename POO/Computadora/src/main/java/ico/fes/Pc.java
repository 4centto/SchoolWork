/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes;

import ico.fes.componentes.Computadora;
import ico.fes.componentes.Cpu;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author acer_usuario
 */
public class Pc {
    public static void main(String[] args) {
        
        Computadora computadora_Uno = new Computadora();
        computadora_Uno.setMarca(1);
        computadora_Uno.setModelo(1271);
        computadora_Uno.setCpu(new Cpu("Alienware", "NightVision", 3));
        computadora_Uno.setMonitor(new Monitor("HP", "Light", 6));
        computadora_Uno.setMouse(new Mouse("Intel", "Logic", "Inalambrico"));
        computadora_Uno.setTeclado(new Teclado("Eagle warrior", "Black", 105, 0));
        
        System.out.println(computadora_Uno);
        
    }
}
