
package arbolbinario;

public class Arbol {
    
    Nodo arbol = null;
    int elementos;
    
    public Arbol(){
        this.arbol = null;
        this.elementos = 0;
    }
    
    public Arbol(int value){
        this.arbol = new Nodo(value);
        this.elementos = 1;
    }
    
    public int getSize(){
        return this.elementos;
    }
    
    public boolean isEmpty(){
        return this.arbol == null;
    }
    
    public void insert(int value){
        if(this.isEmpty() == true){
            
            this.arbol = new Nodo(value);
            this.arbol.setPadre(null);
            this.elementos ++;
            
            System.out.println("Nodo agregado correctamente!!");
            
        } else {
            this.auxInsert(this.arbol, value, this.arbol);
        }
    }
    
    private void auxInsert( Nodo arbol, int value, Nodo padre ){
        
        if(value > arbol.getData()){
            
            if(arbol.getDerecha() == null){
                
                arbol.setDerecha(new Nodo(value));
                arbol.getDerecha().setPadre(padre);
                
                System.out.println("Nodo agregado correctamente!!");
                
                this.elementos ++;
                
            } else {
                
                auxInsert(arbol.getDerecha(), value, arbol);
                
            }
            
        } else {
            
            if(arbol.getIzquierda() == null){
                
                arbol.setIzquierda(new Nodo(value));
                arbol.getIzquierda().setPadre(padre);
                
                System.out.println("Nodo agregado correctamente!!");
                
                this.elementos ++;
                
            } else {
                
                auxInsert(arbol.getIzquierda(), value, arbol);
                
            }
            
        }
        
    }
    
    public void preOrden(){
        this.auxPreOrden(this.arbol);
        System.out.println("");
    }
    
    private void auxPreOrden( Nodo arbol ){
        if(arbol == null){
            return;
        } else {
            System.out.print("[" + arbol.getData() + "]");
            auxPreOrden(arbol.getIzquierda());
            auxPreOrden(arbol.getDerecha());
        }
    }
    
    public void inOrden(){
        this.auxInOrden(this.arbol);
        System.out.println("");
    }
    
    private void auxInOrden( Nodo arbol ){
        if(arbol == null){
            return;
        } else {
            auxInOrden(arbol.getIzquierda());
            System.out.print("[" + arbol.getData() + "]");
            auxInOrden(arbol.getDerecha());
        }
    }
    
    public void postOrden(){
        this.auxPostOrden(this.arbol);
        System.out.println("");
    }
    
    private void auxPostOrden( Nodo arbol ){
        if(arbol == null){
            return;
        } else {
            auxPostOrden(arbol.getIzquierda());
            auxPostOrden(arbol.getDerecha());
            System.out.print("[" + arbol.getData() + "]");
            
        }
    }
    
    public void showThree(){
        this.auxShowThree(this.arbol, 0);
    }
    
    private void auxShowThree( Nodo arbol, int contador ){
        if(arbol == null){
		return;
	} else {
		auxShowThree(arbol.getDerecha(), contador+1);
		for(int i = 0; i < contador; i++){
                    System.out.print("   ");
		}
		System.out.println(arbol.getData());
		auxShowThree(arbol.getIzquierda(), contador+1);
	}
    }
    
}
