
package com.mycompany.pruebafor;

public class Logica {
    
    private int NumeroDeRepeticiones, NumeroInicial, Aumento;
    
    public Logica(int NumeroDeRepeticiones, int Numeros, int Aumento){
    
        this.NumeroDeRepeticiones = NumeroDeRepeticiones;
        this.NumeroInicial = Numeros;
        this.Aumento = Aumento;
    
    }
    
    public void Formula(){
    
        for(int i = 0; i <= NumeroDeRepeticiones; i++){
            
            i += 1;
            
            while(i <= NumeroDeRepeticiones){
                
                NumeroInicial += Aumento;
                System.out.println(NumeroInicial);
                
                i++;
            }
            
        }
    
    }
    
}
