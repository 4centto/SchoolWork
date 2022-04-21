package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    //Se declaran las variables que se utilizaran
    protected int transacciones, retiro, deposito;

    private static int saldo;

    Scanner in = new Scanner(System.in);

    //Se crea el metodo para hacer la consulta de datos
    public void Operaciones() {

        int bandera = 0;
        int seleccion = 0;

        do {

            do {

                System.out.println("Por favor seleccione una opcion: ");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro de efectivo");
                System.out.println("    3. Deposito de efectivo");
                System.out.println("    4. Salir");
                seleccion = in.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {

                    bandera = 1;

                } else {
                    System.out.println("************************************");
                    System.out.println("* La opcion seleccionada no existe *");
                    System.out.println("************************************");
                }

            } while (bandera == 0);
            
            if(seleccion == 1){
                
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
                
            } else if(seleccion == 2){
                
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
                
            } else if(seleccion == 3){
                
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
                
            } else if(seleccion == 4){
                
                System.out.println("**************************");
                System.out.println("* Gracias, vuelva pronto *");
                System.out.println("**************************");
                
                bandera = 2;
                
            }

        } while (bandera != 2);

    }
    
    //Metodo para solicitar cantidad de retiro
    public void Retiro(){
        
        retiro = in.nextInt();
        
    }
    
    //Metodo para solicitar depositos
    public void Deposito(){
        
        deposito = in.nextInt();
        
    }
    
    //Metodo abstracto
    public abstract void Transacciones();

    //Metodos setter y getter para el saldo
    public static int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    

}
