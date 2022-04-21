
package hilos;

public class Hilo2 extends Thread{
    
    @Override
    public void run(){
        
        for(int i = 0; i <= 5; i++){
            System.out.print("e");
        }
        
        try {
            
                Hilo2.sleep(1000);
                
            } catch (InterruptedException e) {
                
                System.out.print("Error en la clase Hilo2");
                
            }
        
    }
    
}
