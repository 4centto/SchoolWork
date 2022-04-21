
package arreglos;

import java.util.Scanner;

public class Problema16 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int cantidadDeProductos = 0;
        String PRO[];
        int CANT[];
        String Producto;
        int Cantidad = 0;
        
        System.out.println("¿Cuántos productos ingresará?");
        cantidadDeProductos = in.nextInt();
        
        PRO = new String[cantidadDeProductos];
        CANT = new int[cantidadDeProductos];
        
        //Llenado de los productos
        for(int i = 0; i < cantidadDeProductos; i++){
            System.out.println("Producto " + i + ": ");
            Producto = in.next();
            System.out.println("Cantidad de " + Producto + ": ");
            Cantidad = in.nextInt();
            
            PRO[i] = Producto;
            CANT[i] = Cantidad;
        }
        System.out.println("");
        
        //Impresion de los datos
        for(int i = 0; i < cantidadDeProductos; i++){
            System.out.print(PRO[i] + ": " + CANT[i]);
            System.out.println("");
        }
        
        //Impresion de producto con mayor cantidad
        int MAYOR = 1;
        String CLAVE = "";
        
        for(int i = 0; i < cantidadDeProductos; i++){
            if(CANT[i] > MAYOR){
                MAYOR = CANT[i];
                CLAVE = PRO[i];
            }
        }
        
        System.out.println("El producto con mayor existencia es " + CLAVE + " con: " + MAYOR + " existencias");
        System.out.println("");
        System.out.println("");
        
        //La clave de los productos que se deben pedir al proveedor y su diferencia
        int DIFERENCIA = 0;
        
        System.out.println("PEDIR AL PROVEEDOR: ");
        System.out.println("");
        
        for(int i = 0; i < cantidadDeProductos; i++){
            if(CANT[i] >= 1 && CANT[i] < 50){
                DIFERENCIA = 50 - CANT[i];
                System.out.println(PRO[i] + ": " + DIFERENCIA);
                
            } else if(CANT[i] > 50){
                System.out.println(PRO[i] + ": (NO HACE FALTA TIENES " + CANT[i] + " cajas)");
            } else if(CANT[i] < 1){
                System.out.println(PRO[i] + ": Debes pedir al menos 10 cajas");
            }
        }
        
        System.out.println("");
        //Eliminar los productos que ya no esten en existencia
        for(int i = 0; i < cantidadDeProductos; i++){
            if(CANT[i] == 0){
                System.out.println("Se eliminó " + PRO[i] + " por tener 0 cajas");
            } else {
                System.out.println(PRO[i] + ": " + CANT[i]);
            }
        }
        
    }
}
