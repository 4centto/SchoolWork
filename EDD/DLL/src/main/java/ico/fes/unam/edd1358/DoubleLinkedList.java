package ico.fes.unam.edd1358;

public class DoubleLinkedList {
    
    private class NodoDoble<T> {
        private T data;
        private NodoDoble next = null;
        private NodoDoble prev = null;

        public NodoDoble() {
        }

        public NodoDoble(T data) {
            this.data = data;
        }

        public NodoDoble(T data, NodoDoble siguiente, NodoDoble anterior){
            this.data = data;
            this.next = siguiente;
            this.prev = anterior;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public NodoDoble getNext() {
            return next;
        }

        public void setNext(NodoDoble next) {
            this.next = next;
        }

        public NodoDoble getPrev() {
            return prev;
        }

        public void setPrev(NodoDoble prev) {
            this.prev = prev;
        }

    }
    
    private NodoDoble head;
    private NodoDoble tail;
    private int size;
    
    public DoubleLinkedList(){
        this.size = 0;
    }
    
    public DoubleLinkedList(Object value){
        this.head = new NodoDoble(value);
        this.tail = this.head;
        this.size = 1;
    }
    
    public int getSize(){
        return this.size;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public void append(Object value){
        if(this.isEmpty()){
            this.head = new NodoDoble(value);
            this.tail = this.head;
        } else {
            this.tail.setNext(new NodoDoble(value, null, this.tail));
            this.tail = this.tail.getNext();
        }
        this.size ++;
    }
    
    public NodoDoble findFromTail(Object value){
        NodoDoble currNode = this.tail;
        //Buscamos el valor
        while(currNode != null){
            if(currNode.getData().toString().equals(value.toString())){
                return currNode;
            }
            currNode = currNode.getPrev();
        }
        return null;
    }
    
    public NodoDoble findFromHead(Object value){
        NodoDoble currNode = this.head;
        while(currNode != null){
            if(currNode.getData().toString().equals(value.toString())){
                return currNode;
            }
            currNode = currNode.getNext();
        }
        return null;
    }
    
    public void removeFromTail(Object value){
        NodoDoble currNode = this.tail;
        //Buscamos el valor
        while(currNode != null){
            if(currNode.getData().toString().equals(value.toString())){
                
                if(currNode.getNext() == null){
                    NodoDoble aux = currNode.getPrev();
                    aux.setNext(null);
                    currNode.setPrev(null);
                    System.out.println("Eliminado correctamente.");
                    this.size --;
                } else if(currNode.getPrev() == null){
                    NodoDoble aux = currNode.getNext();
                    aux.setPrev(null);
                    currNode.setNext(null);
                    this.head = aux;
                    System.out.println("Eliminado correctamente.");
                    this.size --;
                } else {
                    NodoDoble aux = currNode.getPrev();
                    NodoDoble auxDos = currNode.getNext();
                    
                    currNode.setNext(null);
                    currNode.setPrev(null);
                    
                    aux.setNext(auxDos);
                    auxDos.setPrev(aux);
                    System.out.println("Eliminado correctamente.");
                    this.size --;
                }
            }
            currNode = currNode.getPrev();
        }
        this.updateTail();
    }
    
    public void removeFromHead(Object value){
        NodoDoble currNode = this.head;
        while(currNode != null){
            if(currNode.getData().toString().equals(value.toString())){
                
                if(currNode.getNext() == null){
                    NodoDoble aux = currNode.getPrev();
                    aux.setNext(null);
                    currNode.setPrev(null);
                    System.out.println("Eliminado correctamente.");
                    this.size --;
                } else if(currNode.getPrev() == null){
                    NodoDoble aux = currNode.getNext();
                    aux.setPrev(null);
                    currNode.setNext(null);
                    this.head = aux;
                    System.out.println("Eliminado correctamente.");
                    this.size --;
                } else {
                    NodoDoble aux = currNode.getPrev();
                    NodoDoble auxDos = currNode.getNext();
                    
                    currNode.setNext(null);
                    currNode.setPrev(null);
                    
                    aux.setNext(auxDos);
                    auxDos.setPrev(aux);
                    
                    System.out.println("Eliminado correctamente.");
                    this.size --;
                }
            }
            currNode = currNode.getPrev();
        }
        this.updateTail();
    }
    
    public void transversal(){
        NodoDoble currNode = this.head;
        while(currNode != null){
            System.out.print("[\n" + currNode.getData().toString() + "\n], ");
            currNode = currNode.getNext();
        }
        System.out.println("");
    }
    
    public void reverseTransversal(){
        NodoDoble currNode = this.tail;
        //Ya en el ultimo elemento hacemos el recorrido al reves
        while(currNode != null){
            System.out.print("[\n" + currNode.getData().toString() + "\n], ");
            currNode = currNode.getPrev();
        }
        System.out.println("");
    }
    
    private void updateTail(){
        NodoDoble currNode = this.head;
        while(currNode.getNext() != null){
            currNode = currNode.getNext();
        }
        this.tail = currNode;
    }
    
}
