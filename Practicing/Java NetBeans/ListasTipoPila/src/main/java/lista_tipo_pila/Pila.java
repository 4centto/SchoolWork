
package lista_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {
    private Nodo UltimoValorIngresado;
    int tamano = 0;
    String lista = "";
    
    public Pila(){
        UltimoValorIngresado = null;
        tamano = 0;
    }
    
    //Metodo para conocer si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
    //Metodo para insertar un nodo
    public void InsertarNodo(int nodo){
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamano++;
    }
    
    //Metodo para eliminar Nodo
    public int EliminarNodo(){
        int auxiliar = UltimoValorIngresado.informacion;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamano--;
        return auxiliar;
    }
    
    //Metodo para conocer el ultimo valor ingresado
    public int MostrarUltimoValorIngresado(){
        return UltimoValorIngresado.informacion;
    }
    
    //Metodo para conocer el tamaño de la pila
    public int TamanoPila(){
        return tamano;
    }
    
    //Metodo para vaciar la pila
    public void VaciarPila(){
        while(!PilaVacia()){
            EliminarNodo();
        }
    }
    
    //Metodo para mostrar el contenido de la pila
    public void MostrarValores(){
        Nodo recorrido = UltimoValorIngresado;
        while(recorrido != null){
            lista += recorrido.informacion + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }
}
