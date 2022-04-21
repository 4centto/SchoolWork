
package clases;

public class Logica {
    
    //Metodo para saber cual es el mayor
    public int MAYOR(int Cand1, int Cand2, int Cand3){
        if(Cand1 > Cand2 && Cand1 > Cand3){
            return Cand1;
        } else if(Cand2 > Cand3){
            return Cand2;
        } else {
            return Cand3;
        }
        
    }
    
}
