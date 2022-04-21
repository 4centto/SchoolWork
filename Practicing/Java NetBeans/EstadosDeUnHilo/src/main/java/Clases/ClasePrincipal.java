
package Clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        hilo1.start();
        
        try{
            
        hilo1.sleep(1000);
        
        } catch(InterruptedException e){
            
            System.err.println("¡¡¡Error en el hilo 1!!!" + e);
            
        }
        
        hilo2.start();
        
        hilo2.stop();
        
        try{
        
        hilo2.sleep(1000);
        
        } catch(InterruptedException e){
            
            System.err.println("¡¡¡Error en el hilo 2!!!" + e);
             }
        
    }   
    
}
