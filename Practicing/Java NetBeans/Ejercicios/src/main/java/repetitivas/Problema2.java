
package repetitivas;

public class Problema2 {
    
    public static void main(String[] args) {
        
        boolean Flag = true;
        int Suma_Numeros = 0;
        int i = 2;
        
        while(i <= 1800){
            
            Suma_Numeros = Suma_Numeros + i;
            
            System.out.println(i);
            
            if(Flag == true){
                Flag = false;
                i = i + 3;
            } else if(Flag == false){
                Flag = true;
                i = i + 2;
            }
            
        }
        
        System.out.println(Suma_Numeros);
        
    }
    
}
