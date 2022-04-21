
package clases;

public class ClaseMain {
    public static void main(String[] args) {
        
        ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
        
    }
    
}
