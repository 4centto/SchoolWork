
package main;

public class Main {
    
    public static Nodo createNodo(int n){
        Nodo nuevo = new Nodo(n);
        nuevo.setSiguiente(null);
        return nuevo;
    }
    
    public static void insertNodo(Nodo lista, int dato){
        if(lista == null){
            Nodo nuevo = createNodo(dato);
            lista = nuevo;
        } else {
            if(lista.getSiguiente() == null){
                Nodo nuevo = createNodo(dato);
                lista.setSiguiente(nuevo);
            } else {
                insertNodo(lista.getSiguiente(), dato);
            }
        }
    }
    
    public static void showList(Nodo lista){
        if(lista == null){
            return;
        } else {
            System.out.print("[" + String.valueOf(lista.getDato()) + "]");
            showList(lista.getSiguiente());
        }
    }
    
    public static void main(String[] args) {
        
        Nodo lista = new Nodo();
        for(int i = 0; i < 10; i++){
            insertNodo(lista, i);
        }
        showList(lista);
        System.out.println("");
        
    }
}
