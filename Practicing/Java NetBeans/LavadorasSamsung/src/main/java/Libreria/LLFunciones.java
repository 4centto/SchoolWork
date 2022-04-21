//Clase para las funciones logicas de una lavadora

package Libreria;

public class LLFunciones {
    
    private int kilos = 0, LlenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;
    
    //Aqui se obtieenen los valores que manda el programa a esta clase
    public LLFunciones(int kilos, int TipoDeRopa){
        
        this.kilos = kilos;
        this.TipoDeRopa = TipoDeRopa;
    
    }
    
    //Este metodo sirve para el llenado de la lavadora
    private void Llenado(){
    
        if(getKilos() <= 12){
        
            setLlenadoCompleto(1);
            System.out.println("Llenando... ");
            System.out.println("Llenado completo");
        
        } else {
        
            System.out.println("La carga de ropa es muy pesada, reduce la carga");
        
        }
    
    }
   
    //Este metodo sirve para el lavado de ropa
    private void Lavado(){
    
        Llenado();
        
        if(getLlenadoCompleto() == 1){
        
            if(TipoDeRopa == 1){
            
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando... ");
                LavadoCompleto = 1;
            
            } else if(TipoDeRopa == 2){
            
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando... ");
                LavadoCompleto = 1;
            
            } else {
            
                System.out.println("El tipo de ropa no esta disponible");
                System.out.println("Se lavara como ropa de color / Lavado Intenso");
                LavadoCompleto = 1;
            
            }
        
        }
    
    }
    
    //Este metodo sirve para el secado de ropa
    private void Secado(){
    
        Lavado();
        
        if(LavadoCompleto == 1){
        
            System.out.println("Secando... ");
            SecadoCompleto = 1;
            
        }
    
    }
    
    //Este metodo nos indica que ya finalizo el ciclo de lavado
    public void CicloCompletado(){
    
        Secado();
        
        if(SecadoCompleto == 1){
        
            System.out.println("¡Tu ropa ya esta lista!");
        
        }
    
    }
    
    //Metodos Setter y Getter
    public int getTipoDeRopa(){
    
        return TipoDeRopa;
    
    }
    
    public void setTipoDeRopa(int TipoDeRopa){
    
        this.TipoDeRopa = TipoDeRopa;
    
    }

}
