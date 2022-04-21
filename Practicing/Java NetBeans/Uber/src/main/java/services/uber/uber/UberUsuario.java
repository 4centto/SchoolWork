package services.uber.uber;

public class UberUsuario {
    
    private int id_usuario;
    private long tarjeta_credito;
    
    public UberUsuario(int id_usuario, long tarjeta_credito){
        this.id_usuario = id_usuario;
        this.tarjeta_credito = tarjeta_credito;
    }
    
    public void UberPool(){
        int resultado = 25 * 20;
        resultado -= (resultado * 0.15);
        System.out.println("El precio total a pagar es de: $" + resultado);
    }
    
    public void UberElite(){
        int resultado = 25 * 20;
        resultado += (resultado * 0.20);
        System.out.println("El precio total a pagar es de: $" + resultado);
    }
    
    public void UberNormal(int cantidad){
        if(cantidad == 6){
            System.out.println("¡Felicidades! Hs viajado 6 veces, este ultimo va por nuestra cuenta");
        } else {
            int resultado = (25 * 20);
            System.out.println("El precio total a pagar es de: $" + resultado);
        }
    }
    
}
