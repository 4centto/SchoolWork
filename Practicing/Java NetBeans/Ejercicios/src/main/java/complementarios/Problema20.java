
package complementarios;

import java.util.Scanner;

public class Problema20 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        String NOMBRES[] = new String[100];
        String NUMEROS[] = new String[100];
        int FLAG = 1;
        String Nombre = "";
        String Numero = "";
        int i = 0;
        
        System.out.println("INGRESA CONTACTOS");
        
        while(FLAG != 0){
            
            System.out.println("Nombre: ");
            Nombre = in.nextLine();
            
            if(Nombre.equals("-1")){
                FLAG = 0;
            } else {
                
                System.out.println("Numero: ");
                Numero = in.nextLine();
                
                if(Numero.equals("-1")){
                    FLAG = 0;
                } else {
                    NOMBRES[i] = Nombre;
                    NUMEROS[i] = Numero;
                    i++;
                }
                
            }
            
        }
        
        //Impresion de datos
        for(int j = 0; j < 100; j++){
            
            if(NUMEROS[j] == null){
                
            } else if(NOMBRES[j] == null){
                
            } else {
                System.out.print("[" + NOMBRES[j] + "]");
                System.out.print("[" + NUMEROS[j] + "]");
                System.out.println("");
            }
            
            
        }
        
        //Buscar algun contacto
        String busqueda = "";
        
        System.out.println("Nombre o numero del contacto: ");
        busqueda = in.nextLine();
        
        for(int j = 0; j < 100; j++){
            if(busqueda.equalsIgnoreCase(NOMBRES[j])){
                System.out.print("[" + NOMBRES[j] + "]");
                System.out.print("[" + NUMEROS[j] + "]");
                System.out.println("");
                j = 100;
            } else if(busqueda.equalsIgnoreCase(NUMEROS[j])){
                System.out.print("[" + NOMBRES[j] + "]");
                System.out.print("[" + NUMEROS[j] + "]");
                System.out.println("");
                j = 100;
            } else{
                String confirmacion = "";
                
                System.out.println("No se encontro el contacto ¿Deseas agregarlo?");
                confirmacion = in.nextLine();
                
                if(confirmacion.equalsIgnoreCase("Si")){
                    String NuevoNombre = "";
                    String NuevoNumero = "";
                    
                    System.out.println("Nombre: ");
                    NuevoNombre = in.nextLine();
                    
                    if(NuevoNombre.equalsIgnoreCase("-1")){
                        
                        System.out.println("Proceso finalizado");
                        j = 100;
                        
                    } else {
                        
                        System.out.println("Numero: ");
                        NuevoNumero = in.nextLine();
                        
                        if(NuevoNumero.equalsIgnoreCase("-1")){
                            System.out.println("Proceso finalizado");
                            j = 100;
                        } else {
                            
                            for(int k = 0; k < 100; k++){
                                
                                if(NOMBRES[k] != null){
                                    if(NUMEROS[k] != null){
                                        
                                        NOMBRES[k] = NuevoNombre;
                                        NUMEROS[k] = NuevoNumero;
                                        
                                        
                                    }
                                }
                                
                            }
                            for(int k = 0; k < 100; k++){
                                
                                if(NUMEROS[k] == null){
                
                                } else if(NOMBRES[k] == null){
                
                                } else {
                                    System.out.print("[" + NOMBRES[k] + "]");
                                    System.out.print("[" + NUMEROS[k] + "]");
                                    System.out.println("");
                                    j = 100;
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                } else {
                    
                    System.out.println("Proceso finalizado");
                    j = 100;
                    
                }
                
                
            }
        }
        
    }
}
