package mx.unam.aragon.fes.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    
    public void guardarEmpleados(ArrayList<Empleado> datos){
        //Aquí el código para grabar en disco duro
        try{
            ObjectOutputStream fSalida = new ObjectOutputStream(new FileOutputStream(archivo));
            fSalida.writeObject(datos);
            fSalida.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Empleado> leerEmpleados(){
        ArrayList<Empleado> tmp=null;        
        // Leer del disco duro
        // Se sube al  Arraylist tmp
        
        try{
            ObjectInputStream fLectura = new ObjectInputStream(new FileInputStream(archivo));
            tmp = (ArrayList<Empleado>) fLectura.readObject();
            if(tmp == null){
                System.out.println("No hay nada");
            } else {
                System.out.println("Nombre: " + tmp.size());
            }
            fLectura.close();
        } catch(Exception e){
            System.out.println("Error. " + e.toString());
        }
        
        return tmp;
    }
}
