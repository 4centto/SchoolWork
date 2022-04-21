
package com.mycompany.factorialrecursividad;

public class Recursividad {
    public int Imprimir(int x){
        if(x > 0){
            int valor = x * Imprimir(x - 1);
            return valor;
        }
        return 1;
    }
}
