
package ico.fes.unam.edd1358;

public class LinkedListADT {
    public class Nodo<T>{
        private T data;
        private Nodo next;
        
        public Nodo( T valor ){
            this.data = valor;
        }
        
        public Nodo( T valor, Nodo siguiente ){
            this.data = valor;
            this.next = siguiente;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
        
    }
    
    private Nodo head;
    
    public LinkedListADT(){
        this.head = null;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public Nodo getTail(){
        Nodo currNode = this.head;
        if(!this.isEmpty()){
            while(currNode.getNext() != null){
                currNode = currNode.getNext();
            }
        }
        return currNode;
    }
    
    public void append( Object valor ){
        if(this.isEmpty()){
            this.head = new Nodo(valor);
        } else {
            this.getTail().setNext(new Nodo(valor));
        }
    }
    
    public void prepend( Object valor ){
        if(this.isEmpty()){
            this.head = new Nodo(valor);
        } else {
            Nodo nuevo = new Nodo(valor);
            nuevo.setNext(this.head);
            head = nuevo;
        }
    }
    
    public void transversal(){
        Nodo currNode = this.head;
        while(currNode != null){
            System.out.print(currNode.getData().toString() + " --> ");
            currNode = currNode.getNext();
        }
        System.out.println("");
    }
    
    public void remove( Object value ){
        Nodo currNode = this.head;
        int contador = 0; //Este contador es para saber en que posicion se encuentra el ultimo elemento
        
        while(currNode != null){
            
            if(currNode.data.toString().equals(value.toString())){
                
                if(currNode.next == null){
                    
                    Nodo aux = this.head;
                    
                    for(int i = 0; i < contador - 1; i++){
                        aux = aux.getNext();
                    }
                    
                    aux.setNext(null);
                    System.out.println(value + " fue eliminado correctamente.");
                    
                } else if(currNode.next != null){
                    
                    Nodo aux = currNode.next;
                    this.head = aux;
                    currNode.next = null;
                    System.out.println(value + " fue eliminado correctamente.");
                    
                }
                
            }
            
            currNode = currNode.next;
            contador ++;
            
        }
        
    }
    
    public Nodo pop(){
        return this.getTail();
    }
    
    public Nodo popFirst(){
        return this.head;
    }
    
}
