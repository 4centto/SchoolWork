package arbolbinario;

public class Main {
    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        
        arbol.insert(100);
        arbol.insert(200);
        arbol.insert(150);
        arbol.insert(50);
        
        System.out.println("");
        
        arbol.preOrden();
        arbol.inOrden();
        arbol.postOrden();
        
        System.out.println("");
        
        arbol.showThree();
        
    }
}
