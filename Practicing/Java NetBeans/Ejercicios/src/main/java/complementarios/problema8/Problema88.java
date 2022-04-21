
package complementarios.problema8;

public class Problema88 {
    
    private float r = 0;
    
    public Problema88(float r){
        this.r = r;
    }
    
    public void AREA(){
        
        float area = 4 * (float)(Math.PI * (r * r));
        System.out.println("* AREA: " + area);
        
    }
    
    public void VOLUMEN(){
        
        float volumen = (float)((Math.PI) * (4 / 3) * (r * r * r));
        System.out.println("* VOLUMEN: " + volumen);
        
    }
    
}
