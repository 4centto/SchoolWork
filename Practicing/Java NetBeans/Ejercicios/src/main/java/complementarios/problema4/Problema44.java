
package complementarios.problema4;

public class Problema44 {
    
    private float ACRES = 0;
    
    public Problema44(float ACRES){
        this.ACRES = ACRES;
    }
    
    public void HECTAREAS(){
        
        float hectareas = (float)(ACRES * 0.404686);
        System.out.println(ACRES + " acres son en total " + hectareas + " hectareas");
    }
}
