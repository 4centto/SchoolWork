
package Clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        //Primero se crean las instacias de donde se encuentran los hilos
        Proceso1 hilo1 = new Proceso1();
        Thread hilo2 = new Thread(new Proceso2());
        
        //Y para que funcionen de manera simultanea, al final se ejecutan los hilos con el metodo .start();
        hilo1.start();
        hilo2.start();
    }
    
}
