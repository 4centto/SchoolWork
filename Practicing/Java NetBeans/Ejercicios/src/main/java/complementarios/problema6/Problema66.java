
package complementarios.problema6;

public class Problema66 {
    
    private int PRECIO = 0;
    
    public Problema66(int PRECIO){
        this.PRECIO = PRECIO;
    }
    
    public void ENGANCHE(){
        
        float enganche = (float)(PRECIO * 0.35);
        System.out.println("* ENGANCHE: " + enganche);
        
    }
    
    public void MESES(){
        
        float enganche = (float)(PRECIO - (PRECIO * 0.35));
        float total = (float)((enganche + (PRECIO * 0.12)) / 36);
        
        System.out.println("* MESES(36): " + total);
    }
}
