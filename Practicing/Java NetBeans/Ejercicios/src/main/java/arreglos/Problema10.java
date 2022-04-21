
package arreglos;

import java.util.Scanner;

public class Problema10 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int SUC = 0, AÑOS = 0;
        int Arreglo[][];
        //Sucursal que mas vendio
        int MAYOR = 1, SUCURSAL = 0, ACUM = 0;
        //Promedios
        int PROM = 0, ACUMPROM = 0, MAYOR2 = 0, PROM2 = 0, AÑO = 0;
        
        System.out.println("************************");
        System.out.println("* VENTA DE AUTOMÓVILES *");
        System.out.println("************************");
        System.out.println("");
        
        System.out.println("¿Cuantas sucursales se registraran?");
        SUC = in.nextInt();
        System.out.println("");
        
        System.out.println("¿Cuantos años seran registrados?");
        AÑOS = in.nextInt();
        System.out.println("");
        
        Arreglo = new int[SUC][AÑOS];
        
        //Llenado de la tabla
        for(int i = 0; i < SUC; i++){
            for(int j = 0; j < AÑOS; j++){
                
                Arreglo[i][j] =(int)(Math.random() * 10000);
                
            }
        }
        
        //Impresion de tabla
        for(int i = 0; i < SUC; i++){
            for(int j = 0; j < AÑOS; j++){
                
                if(i <= SUC){
                    if(j ==0){
                        System.out.print("SUCURSAL " + i + " ");
                        System.out.print("[" + Arreglo[i][j] + "]");
                    } else {
                        System.out.print("[" + Arreglo[i][j] + "]");
                    }
                }
                
            }
            System.out.println("");
        }
        
        //Sucursal que mas vendio
        for(int i = 0; i < SUC; i++){
            ACUM = 0;
            for(int j = 0; j < AÑOS; j++){
                
                ACUM = ACUM + Arreglo[i][j];
                
            }
            if(ACUM > MAYOR){
                MAYOR = ACUM;
                SUCURSAL = i;
            }
        }
        System.out.println("");
        System.out.println("La sucursal " + SUCURSAL + " fue la que mas vendio en los " + AÑOS + " años");
        System.out.println("");
        
        //Promedio de ventas por año
        for(int i = 0; i < AÑOS; i++){
            ACUMPROM = 0;
            for(int j = 0; j < SUC; j++){
                
                ACUMPROM = ACUMPROM + Arreglo[j][i];
                
            }
            PROM = ACUMPROM / SUC;
            System.out.println("El promedio de ventas del año " + i + " fue de: " + PROM + " ventas");
        }
        
        //El año con mayor promedio de ventas
        for(int i = 0; i < AÑOS; i++){
            ACUMPROM = 0;
            for(int j = 0; j < SUC; j++){
                
                ACUMPROM = ACUMPROM + Arreglo[j][i];
                
            }
            PROM2 = ACUMPROM / SUC;
            if(PROM2 > MAYOR2){
                MAYOR2 = PROM2;
                AÑO = i;
            }
        }
        
        System.out.println("");
        System.out.println("El año " + AÑO + " fue el año con mayor promedio en ventas con un promedio de: " + MAYOR2 + " ventas");
        
    }
    
}
