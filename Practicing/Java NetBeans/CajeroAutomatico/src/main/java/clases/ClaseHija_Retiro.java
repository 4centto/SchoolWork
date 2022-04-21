
package clases;

public class ClaseHija_Retiro extends ClasePadre_Abstracta{
    
    @Override
    public void Transacciones(){
        
        System.out.print("¿Cuanto deseas retirar? ");
        Retiro();
        if(retiro <= getSaldo()){
            
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            
            System.out.println("**********************************");
            System.out.println("* Retiraste: " + retiro);
            System.out.println("**********************************");
            System.out.println("Tu saldo actual es: " + getSaldo());
            
        } else {
        
            System.out.println("**********************************");
            System.out.println("* No puedes retirar " + retiro);
            System.out.println("**********************************");
        
        }
        
    }
    
}
