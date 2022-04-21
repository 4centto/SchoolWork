
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alfabeticos {
    public static void main(String[] args) {
        
        //Es necesario que los datos del arreglo se inserten en un arrayList
        List lista = new ArrayList<>();
        
        String[] paises = {"Canada", "Brazil", "Mexico", "Guatemala", "Argentina", "Uruguay", "Chile", "Alaska"};
        
        for(int i = 0; i < paises.length; i++){
            System.out.println("Pais " + (i + 1) + ": " + paises[i]);
            lista.add(paises[i]);
        }
        
        //Ordenar los paises
        Collections.sort(lista);
        
        System.out.println(lista);
        
    }
}
