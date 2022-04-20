
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Habitacion;
import ico.fes.partes.Muro;
import ico.fes.partes.PuertaDeSeguridad;
import java.awt.Color;

public class Composicion2257 {
    public static void main(String[] args) {
        
        //Se crea el muro
        Muro muroNorte = new Muro();
        muroNorte.setPuerta(new Puerta("Madera", Color.white, true));
        
        //Se crean las ventanas (2)
        Ventana[] ventana = new Ventana[2];
        ventana[0] = new Ventana("Madera", Color.black, 0.5f, 1.0f);
        ventana[1] = new Ventana("Madera", Color.gray, 0.5f, 1.0f);
        
        //Se agregan las ventanas al muro
        muroNorte.setVentana(ventana);
        
        System.out.println(muroNorte);
        System.out.println(muroNorte.getVentana());
        
        for(int i = 0; i < muroNorte.getVentana().length; i++){
            System.out.println("Ventana " + (i + 1) + ": ");
            System.out.println(muroNorte.getVentana()[i]);
            System.out.println("");
            System.out.println("************");
        }
        
        /* Crearción de mi habitacion */
        System.out.println("\n\n");
        System.out.println(" ** HABITACIÓN ** ");
        
        Habitacion habitacion = new Habitacion();
        habitacion.setApagadores(2);
        habitacion.setContactos(2);
        
        Muro[] muros  = new Muro[4];
        muros[0] = new Muro(2f, 2f, 2.5f, Color.white, new Puerta("Madera", Color.black, false), null);
        muros[1] = new Muro(2f, 2f, 2.5f, Color.white, null, null);
        
        Ventana[] ventana_habitacion = new Ventana[1];
        ventana_habitacion[0] = new Ventana("Aluminio", Color.yellow, 0.8f, 1.0f);
        
        muros[2] = new Muro(2f, 2f, 2.5f, Color.white, null, ventana_habitacion);
        muros[3] = new Muro(2f, 2f, 2.5f, Color.white, null, null);
        
        habitacion.setMuro(muros);
        
        //Impresion de la habitacion
        for(int i= 0; i < habitacion.getMuro().length; i++){
            System.out.println("Muro " + (i+1) + ": ");
            System.out.println(" ******************* ");
            Muro m = habitacion.getMuro()[i];
            
            System.out.println("   Alto: " + m.getAlto());
            System.out.println("   Ancho: " + m.getAncho());
            System.out.println("   Largo: " + m.getLargo());
            System.out.println("   Color: " + m.getColor().toString());
            System.out.println("\n");
            
            if(m.getPuerta() != null){
                System.out.println("   - PUERTA - ");
                System.out.println("   Color: " + m.getPuerta().getColor());
                System.out.println("   Material: " + m.getPuerta().getMaterial());
                if(m.getPuerta().isConVidrio() == true){
                    System.out.println("   Vidrio: Si");
                } else {
                    System.out.println("   Vidrio: N0");
                }
                System.out.println("\n");
            } else {
                System.out.println("   - NO TIENE PUERTA - ");
                System.out.println("\n");
            }
            
            if(m.getVentana() != null){
                
                for(int j = 0; j < m.getVentana().length; j++){
                    
                    System.out.println("   - VENTANA " + (j + 1) + " - ");
                    System.out.println("   Material: " + m.getVentana()[j].getMaterial());
                    System.out.println("   Alto: " + m.getVentana()[j].getAlto());
                    System.out.println("   Ancho: " + m.getVentana()[j].getAncho());
                    System.out.println("   Color: " + m.getVentana()[j].getColor().toString());
                    System.out.println("   ------------------- ");
                    
                }
                
                System.out.println("\n");
            } else {
                System.out.println("   - NO TIENE VENTANAS - ");
                System.out.println("\n");
            }
            
            System.out.println(" ******************* ");
            
        }
        
        //Creacion de una puerta de seguridad
        PuertaDeSeguridad ps = new PuertaDeSeguridad("12345", "Electronico", "Acero", Color.black, false);
        System.out.println(ps);
        
        ps.verificar("12345");
        
    }
}
