
package lista_tipo_pila;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        int Opcion = 0, Nodo = 0;
        
        Pila pila = new Pila();
        
        do{
            try{
                
                Opcion = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Menu Opciones \n\n"
                + "1. Insertar un nodo \n"
                + "2. Eliminar un nodo \n"
                + "3. ¿La pila esta vacia? \n"
                + "4. ¿Cual es el ultimo valor ingresado en la Pila? \n"
                + "5. ¿Cuantos nodos tiene la lista? \n"
                + "6. Vaciar Pila \n"
                + "7. Mostrar contenido de la Pila \n"
                + "8. Salir \n"));
                
                switch(Opcion){
                    case 1:
                        Nodo = Integer.parseInt(JOptionPane.showInputDialog(null, 
                                "Por favor ingresa el valor a guardar en el nodo"));
                        pila.InsertarNodo(Nodo);
                        break;
                        
                    case 2:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "Se ha eliminado el nodo con el valor: " + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 3:
                        if(pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO esta vacia");
                        }
                        break;
                        
                    case 4:
                        if(!pila.PilaVacia()){
                            JOptionPane.showMessageDialog(null, "El ultimo valor ingresado en la pila es: " 
                                                          + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene: " + pila.TamanoPila() + " nodos.");
                        break;
                        
                    case 6:
                        if(!pila.PilaVacia()){
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;
                        
                    case 7:
                        pila.MostrarValores();
                        break;
                        
                    case 8:
                        Opcion = 8;
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta, vuelve a intentarlo");
                        break;
                }
                
            } catch(NumberFormatException e){
                
            }
        } while(Opcion != 8);
        
    }
}
