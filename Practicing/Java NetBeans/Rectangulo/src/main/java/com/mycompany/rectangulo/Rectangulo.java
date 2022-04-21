
package com.mycompany.rectangulo;

public class Rectangulo {
    
    private int vbase, valtura, area;
    
    public Rectangulo(int base, int altura){
    
        this.vbase = base;
        this.valtura = altura;
    
    }
    
    public void Calcular(){
    
        area = vbase * valtura;
    
    }
    
    public void Imprimir(){
    
        Calcular();
        System.out.print("El resultado del area es: " + area);
    
    }
    
}
