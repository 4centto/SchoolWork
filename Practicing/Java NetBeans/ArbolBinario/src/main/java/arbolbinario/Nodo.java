
package arbolbinario;

public class Nodo {
    
    private Nodo izquierda = null;
    private int data;
    private Nodo derecha = null;
    private Nodo padre = null;
    
    public Nodo(){
        
    }
    
    public Nodo(int value){
        this.data = value;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }
    
}
