/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize.clase.serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import serialize.objetos.Texto;

/**
 *
 * @author Ivan Michel
 */
public class Main{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Texto text = new Texto();
        String texto = "";
        
        System.out.println("Ingresa tu texto aqui: ");
        texto = in.nextLine();
        
        text.setTexto(texto);
        
        try{
            
            ObjectOutputStream objeto = new ObjectOutputStream(new FileOutputStream("C:\\Users\\acer_usuario\\Desktop\\Documento.txt"));
            objeto.writeObject(texto);
            objeto.close();
            
        } catch(Exception e){
            System.out.println("Error al generar archivo: " + e);
        }
        
    }
}
