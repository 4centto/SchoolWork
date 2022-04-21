
package complementarios.problema2;

public class Problema22 {
    
    private float r = 0;
    
    public Problema22(float r){
        this.r = r;
    }
    
    public void AREA(){
        float AREA = 0;
        AREA = (float)(Math.PI * (r * r));
        
        System.out.println("Area: " + AREA);
    }
    
    public void CIRCUNFERENCIA(){
        float CIRCUNFERENCIA = 0;
        CIRCUNFERENCIA = 2 * (float)(Math.PI * r);
        
        System.out.println("Circunferencia: " + CIRCUNFERENCIA);
    }
}
