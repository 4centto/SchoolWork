
package services.uber.uber;

import java.util.Scanner;

/*
    - $20 Pesos cada kilometro recorrido
    - El usuario recorrera 25 kilometros
    - Imprima la salida de cada servicio

    1. Servicio de Uber pool (Sube a mas de un clinete y se hace un descuento del 15%)
    2. Servicio de Uber elite y se le incrementa un 20% a la tarifa
    3. Servicio de Uber normal, en el que lleva una promocion en el que si lleva mas de 5 viajes el 6 sera gratis
*/

public class ClasePrincipal {
    public static void main(String[] args) {
        
        int id_usuario = 0, servicio = 0, cantidad = 0;
        long tarjeta_credito = 0;
        Scanner in = new Scanner(System.in);
        
        //Se genera automaticamente un numero de id
        id_usuario = (int)(Math.random() * 1000000);
        
        System.out.println("ID: " + id_usuario);
        System.out.println("Ingresa tu tarjeta de credito: ");
        tarjeta_credito = in.nextLong();
        
        //Se crea la instancia a la clase UberUsuario
        UberUsuario uberUsuario = new UberUsuario(id_usuario, tarjeta_credito);
        
        do{
        
            System.out.println("");
            System.out.println("******************");
            System.out.println("* 1. Uber Pool   *");
            System.out.println("* 2. Uber Elite  *");
            System.out.println("* 3. Uber Normal *");
            System.out.println("* 4. Terminar    *");
            System.out.println("******************");
            System.out.println("");
            System.out.println("¿Cual servicio desea usar?  ");
            servicio = in.nextInt();
        
            switch(servicio){
                case 1:
                    uberUsuario.UberPool();
                    cantidad++;
                    break;

                case 2:
                    uberUsuario.UberElite();
                    cantidad++;
                    break;

                case 3:
                    uberUsuario.UberNormal(cantidad);
                    cantidad++;
                    break;
                    
                case 4:
                    System.out.println("¡Gracias por tu preferencia! Hasta luego. ");
                    break;

                default:
                    System.out.println("¡La opcion elegida no existe!");
                    break;
            }
        
        } while(servicio != 4);
        
    }
}
