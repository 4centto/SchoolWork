
package com.mycompany.pruebasencriptacion;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        String mensaje = "";
        
        //El usuario ingresa el valor a encriptar
        System.out.println("Ingresa la palabra que quieras encriptar: ");
        mensaje = entrada.nextLine();
        
       
        //Metodo para encriptar datos en codigo ASCII
        char array[] = mensaje.toCharArray();
        
        for(int i = 0; i < array.length; i++){
        
            array[i] = (char)(array[i] + (char)5);
            
        }
        
        //Mensaje encriptado
        String encriptado = String.valueOf(array);
        System.out.println(encriptado);
        
        
        //Metodo para desencriptar la frase en codigo ASCII
        char arrayD[] = encriptado.toCharArray();
        
        for(int i = 0; i < arrayD.length; i++){
            
            arrayD[i] = (char)(array[i] - (char)5);
            
        }
        
        //Mensaje Desencriptado
        String Desencriptado = String.valueOf(arrayD);
        System.out.println(Desencriptado);
    }
}
