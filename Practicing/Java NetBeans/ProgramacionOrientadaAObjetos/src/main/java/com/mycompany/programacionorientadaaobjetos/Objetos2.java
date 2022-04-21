
package com.mycompany.programacionorientadaaobjetos;

public class Objetos2 {

    //Se declaran variables de tipo private para poder utiliazrlas en las operaciones de las sumas
    private int vUno, vDos, Resultado;
    
    //Se cre un objeto de tipo Objeto2 en el que se recuperan los datos enviados de Objetos
    public Objetos2(int valor_uno, int valor_dos){
    
        this.vUno = valor_uno;
        this.vDos = valor_dos;
    
    }
    
    //En este metodo se realizan las operaciones para la suma
    public void Operacion(){
    
        Resultado = vUno + vDos;
        
    }
    
    //En este metodo se imprime el resultado de la suma
    public void Imprimir(){
    
        //Se recupera el resultado de el metodo Operacion
        Operacion();
        
        //Se imprime el resultado de la suma
        System.out.println("El resultado de la suma es: " + Resultado);
    
    }
    
}
