
package main;

import operaciones.ClaseHija_Resta;
import operaciones.ClaseHija_Suma;

public class ClasePrincipal {
    public static void main(String[] args) {
                
        //Se crean las instancias de las clases a las que se quiere comunicar
        ClaseHija_Suma mensajero_suma = new ClaseHija_Suma();
        mensajero_suma.PedirDatos();
        mensajero_suma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajero_suma.MostrarResultado();
        
        ClaseHija_Resta mensajero_resta = new ClaseHija_Resta();
        mensajero_resta.Restar();
        System.out.print("El resultado de la resta es: ");
        mensajero_resta.MostrarResultado();
        
    }
}
