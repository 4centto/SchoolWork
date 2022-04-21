package clases;
import java.util.ArrayList;
import java.util.Scanner;
import paquete.BaseDatos;
import paquete.Bocina;
import paquete.Impresora;
import paquete.Laptop;
import paquete.Pantalla;
import paquete.Smartphone;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        int eleccion = 0;
        
        //Caracteristicas de los productos
        String c1 = "", c2 = "", c3 = "", c4 = "", c5 = "", c6 = "", c7 = "", c8 = "";
        
        //Contadores
        int lap = 1, boc = 1, pan = 1, sma = 1, imp = 1;
        
        Scanner in = new Scanner(System.in);
        BaseDatos bd = new BaseDatos();
        
        System.out.println("** MENU DEPARTAMENTO DE TECNOLOGIA **");
        
        do{

            System.out.println("\t 1. Leer");
            System.out.println("\t 2. Imprimir");
            System.out.println("\t 3. Buscar");
            System.out.println("\t 4. Editar");
            System.out.println("\t 5. Salir \n");
            System.out.println("Elija una opcion:");
            eleccion = in.nextInt();
            
            int eleccion_productos;
            
            switch(eleccion){
                
                //Opcion de Leer
                case 1:
                    
                    System.out.println("¿Que articulos deseas ingresar?");
                    System.out.println("\t 1. Laptops");
                    System.out.println("\t 2. Smartphones");
                    System.out.println("\t 3. Bocinas");
                    System.out.println("\t 4. Pantallas");
                    System.out.println("\t 5. Impresoras \n");
                    System.out.println("Elija una opcion: ");
                    eleccion_productos = in.nextInt();
                    
                    switch(eleccion_productos){
                        
                        //Laptops
                        case 1:
                            
                            System.out.println("Marca:");
                            c1 = in.next();
                            System.out.println("Modelo:");
                            c2 = in.next();
                            System.out.println("Precio:");
                            c3 = in.next();
                            System.out.println("Pulgadas:");
                            c4 = in.next();
                            System.out.println("Tipo de cargador:");
                            c5 = in.next();
                            System.out.println("RAM:");
                            c6 = in.next();
                            System.out.println("ROM:");
                            c7 = in.next();
                            System.out.println("Procesador:");
                            c8 = in.next();

                            Laptop l = new Laptop("L" + lap, c1, c2, c3, c4, c5, c6, c7, c8);
                            lap ++;
                            
                            bd.setBase_laptop(l);
                            
                            System.out.println("* Se agrego correctamente la laptop *");
                            
                            break;
                            
                        //Smartphones
                        case 2:
                            
                            System.out.println("Marca:");
                            c1 = in.next();
                            System.out.println("Modelo:");
                            c2 = in.next();
                            System.out.println("Precio:");
                            c3 = in.next();
                            System.out.println("Resolucion:");
                            c4 = in.next();
                            System.out.println("Tipo de cargador:");
                            c5 = in.next();
                            System.out.println("RAM:");
                            c6 = in.next();
                            System.out.println("ROM:");
                            c7 = in.next();
                            System.out.println("Camara:");
                            c8 = in.next();

                            Smartphone s = new Smartphone("S" + sma, c1, c2, c3, c4, c5, c6, c7, c8);
                            sma ++;
                            
                            bd.setBase_smartphone(s);
                            
                            System.out.println("* Se agrego correctamente el smartphone *");
                            
                            break;
                            
                        //Bocinas
                        case 3:
                            
                            System.out.println("Marca:");
                            c1 = in.next();
                            System.out.println("Modelo:");
                            c2 = in.next();
                            System.out.println("Precio:");
                            c3 = in.next();
                            System.out.println("Forma:");
                            c4 = in.next();
                            System.out.println("Duracion de bateria (hrs):");
                            c5 = in.next();
                            System.out.println("Peso:");
                            c6 = in.next();
                            System.out.println("Volumen maximo:");
                            c7 = in.next();
                            System.out.println("Materiales:");
                            c8 = in.next();

                            Bocina b = new Bocina("B" + boc, c1, c2, c3, c4, c5, c6, c7, c8);
                            boc ++;
                            
                            bd.setBase_bocina(b);
                            
                            System.out.println("* Se agrego correctamente la bocina *");
                            
                            break;
                            
                        //Pantallas
                        case 4:
                            
                            System.out.println("Marca:");
                            c1 = in.next();
                            System.out.println("Modelo:");
                            c2 = in.next();
                            System.out.println("Precio:");
                            c3 = in.next();
                            System.out.println("Pulgadas:");
                            c4 = in.next();
                            System.out.println("Resolucion:");
                            c5 = in.next();
                            System.out.println("Tipo (LED, OLED, LCD):");
                            c6 = in.next();
                            System.out.println("Smart TV:");
                            c7 = in.next();
                            System.out.println("Soporte fisico:");
                            c8 = in.next();

                            Pantalla p = new Pantalla("P" + pan, c1, c2, c3, c4, c5, c6, c7, c8);
                            pan ++;
                            
                            bd.setBase_pantalla(p);
                            
                            System.out.println("* Se agrego correctamente la pantalla *");
                            
                            break;
                            
                        //Impresoras
                        case 5:
                            
                            System.out.println("Marca:");
                            c1 = in.next();
                            System.out.println("Modelo:");
                            c2 = in.next();
                            System.out.println("Precio:");
                            c3 = in.next();
                            System.out.println("Tipo de cartucho:");
                            c4 = in.next();
                            System.out.println("Tipo de impresion:");
                            c5 = in.next();
                            System.out.println("Dimensiones de hoja:");
                            c6 = in.next();
                            System.out.println("Resolucion maxima:");
                            c7 = in.next();
                            System.out.println("Tecnologia de impresion:");
                            c8 = in.next();

                            Impresora i = new Impresora("I" + imp, c1, c2, c3, c4, c5, c6, c7, c8);
                            imp ++;
                            
                            bd.setBase_impresora(i);
                            
                            System.out.println("* Se agrego correctamente la impresora *");
                            
                            break;
                        default:
                            System.out.println("El producto seleccionado no existe");
                            break;
                    }
                    
                    break;
                    
                //Opcion de Imprimir
                case 2:
                    
                    System.out.println("¿Que articulos deseas imprimir?");
                    System.out.println("\t 1. Laptops");
                    System.out.println("\t 2. Smartphones");
                    System.out.println("\t 3. Bocinas");
                    System.out.println("\t 4. Pantallas");
                    System.out.println("\t 5. Impresoras \n");
                    System.out.println("Elija una opcion: ");
                    eleccion_productos = in.nextInt();
                    
                    switch(eleccion_productos){
                        
                        //Laptops
                        case 1:
                            
                            ArrayList<Laptop> lista_laptops = new ArrayList<>();
                            
                            lista_laptops = bd.getBase_laptop();
                            
                            if(lista_laptops.isEmpty()){
                                System.out.println("No hay laptops registradas aun");
                            } else {
                                
                                System.out.println("\nLaptops registradas: ");
                                for(int i = 0; i < lista_laptops.size(); i++){
                                    System.out.println("ID: " + lista_laptops.get(i).getId());
                                    System.out.println("   Marca: " + lista_laptops.get(i).getMarca());
                                    System.out.println("   Modelo: " + lista_laptops.get(i).getModelo());
                                    System.out.println("   Precio: " + lista_laptops.get(i).getPrecio());
                                    System.out.println("   Pulgadas: " + lista_laptops.get(i).getPulgadas());
                                    System.out.println("   Tipo de cargador: " + lista_laptops.get(i).getTipo_cargador());
                                    System.out.println("   RAM: " + lista_laptops.get(i).getMemoria_ram());
                                    System.out.println("   ROM: " + lista_laptops.get(i).getMemoria_interna());
                                    System.out.println("   Procesador: " + lista_laptops.get(i).getProcesador());
                                    System.out.println("");
                                    
                                }
                            }
                            break;
                        //Smartphones
                        case 2:

                            ArrayList<Smartphone> lista_smartphone = new ArrayList<>();
                            
                            lista_smartphone = bd.getBase_smartphone();
                            
                            if(lista_smartphone.isEmpty()){
                                System.out.println("No hay smartphones registrados aun");
                            } else {
                                
                                System.out.println("\nSmartphones registrados: ");
                                for(int i = 0; i < lista_smartphone.size(); i++){
                                    System.out.println("ID: " + lista_smartphone.get(i).getId());
                                    System.out.println("   Marca: " + lista_smartphone.get(i).getMarca());
                                    System.out.println("   Modelo: " + lista_smartphone.get(i).getModelo());
                                    System.out.println("   Precio: " + lista_smartphone.get(i).getPrecio());
                                    System.out.println("   Resolucion: " + lista_smartphone.get(i).getResolucion());
                                    System.out.println("   Tipo de cargador: " + lista_smartphone.get(i).getTipo_cargador());
                                    System.out.println("   RAM: " + lista_smartphone.get(i).getMemoria_ram());
                                    System.out.println("   ROM: " + lista_smartphone.get(i).getMemoria_interna());
                                    System.out.println("   Camara: " + lista_smartphone.get(i).getCamara());
                                    System.out.println("");
                                    
                                }
                            }
                            break;
                        //Bocinas
                        case 3:
                            ArrayList<Bocina> lista_bocinas = new ArrayList<>();
                            
                            lista_bocinas = bd.getBase_bocina();
                            
                            if(lista_bocinas.isEmpty()){
                                System.out.println("No hay bocinas registradas aun");
                            } else {
                                
                                System.out.println("\nBocinas registradas: ");
                                for(int i = 0; i < lista_bocinas.size(); i++){
                                    System.out.println("ID: " + lista_bocinas.get(i).getId());
                                    System.out.println("   Marca: " + lista_bocinas.get(i).getMarca());
                                    System.out.println("   Modelo: " + lista_bocinas.get(i).getModelo());
                                    System.out.println("   Precio: " + lista_bocinas.get(i).getPrecio());
                                    System.out.println("   Forma: " + lista_bocinas.get(i).getForma());
                                    System.out.println("   Duracion de bateria(hrs): " + lista_bocinas.get(i).getDuracion_bateria());
                                    System.out.println("   Peso: " + lista_bocinas.get(i).getPeso());
                                    System.out.println("   Volumen maximo: " + lista_bocinas.get(i).getVolumen_maximo());
                                    System.out.println("   Material: " + lista_bocinas.get(i).getMaterial());
                                    System.out.println("");
                                    
                                }
                            }
                            break;
                        //Pantallas
                        case 4:
                            ArrayList<Pantalla> lista_pantallas = new ArrayList<>();
                            
                            lista_pantallas = bd.getBase_pantalla();
                            
                            if(lista_pantallas.isEmpty()){
                                System.out.println("No hay pantallas registradas aun");
                            } else {
                                
                                System.out.println("\nPantallas registradas: ");
                                for(int i = 0; i < lista_pantallas.size(); i++){
                                    System.out.println("ID: " + lista_pantallas.get(i).getId());
                                    System.out.println("   Marca: " + lista_pantallas.get(i).getMarca());
                                    System.out.println("   Modelo: " + lista_pantallas.get(i).getModelo());
                                    System.out.println("   Precio: " + lista_pantallas.get(i).getPrecio());
                                    System.out.println("   Pulgadas: " + lista_pantallas.get(i).getPulgadas());
                                    System.out.println("   Resolucion: " + lista_pantallas.get(i).getResolucion());
                                    System.out.println("   Tipo: " + lista_pantallas.get(i).getTipo_led_oled_lcd());
                                    System.out.println("   Smart Tv: " + lista_pantallas.get(i).getSmart_tv());
                                    System.out.println("   Soporte fisico: " + lista_pantallas.get(i).getSoporte_fisico());
                                    System.out.println("");
                                    
                                }
                            }
                            break;
                        //Impresoras
                        case 5:
                            ArrayList<Impresora> lista_impresoras = new ArrayList<>();
                            
                            lista_impresoras = bd.getBase_impresora();
                            
                            if(lista_impresoras.isEmpty()){
                                System.out.println("No hay impresoras registradas aun");
                            } else {
                                
                                System.out.println("\nImpresoras registradas: ");
                                for(int i = 0; i < lista_impresoras.size(); i++){
                                    System.out.println("ID: " + lista_impresoras.get(i).getId());
                                    System.out.println("   Marca: " + lista_impresoras.get(i).getMarca());
                                    System.out.println("   Modelo: " + lista_impresoras.get(i).getModelo());
                                    System.out.println("   Precio: " + lista_impresoras.get(i).getPrecio());
                                    System.out.println("   Cartuchos: " + lista_impresoras.get(i).getTipo_cartucho());
                                    System.out.println("   Tipo de impresion: " + lista_impresoras.get(i).getTipo_impresion());
                                    System.out.println("   Dimensiones: " + lista_impresoras.get(i).getDimensiones());
                                    System.out.println("   Resolucion maxima: " + lista_impresoras.get(i).getResolucion_maxima());
                                    System.out.println("   Tecnologia de impresion: " + lista_impresoras.get(i).getTecnologia_impresion());
                                    System.out.println("");
                                    
                                }
                            }
                            break;
                        default:
                            System.out.println("El producto seleccionado no existe");
                            break;
                    }
                    
                    break;
                    
                //Opcion de Buscar
                case 3:
                    
                    int eleccion_dos = 0;
                    
                    System.out.println("¿Que articulos deseas buscar?");
                    System.out.println("\t 1. Laptops");
                    System.out.println("\t 2. Smartphones");
                    System.out.println("\t 3. Bocinas");
                    System.out.println("\t 4. Pantallas");
                    System.out.println("\t 5. Impresoras \n");
                    System.out.println("Elija una opcion: ");
                    eleccion_productos = in.nextInt();
                    
                    switch(eleccion_productos){
                        
                        //Laptop
                        case 1:
                            
                            ArrayList<Laptop> lista_laptops = new ArrayList<>();
                            
                            System.out.println("\n¿Cual es su criterio de busqueda?");
                            System.out.println("\t 1. Marca");
                            System.out.println("\t 2. Modelo");
                            System.out.println("\t 3. Precio");
                            System.out.println("\t Elija una opcion: \n");
                            eleccion_dos = in.nextInt();
                            
                            switch(eleccion_dos){
                                
                                //Marca
                                case 1:
                                    
                                    String marca = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es la marca?");
                                    marca = in.next();

                                    lista_laptops = bd.getBase_laptop();
                                    
                                    if(lista_laptops.isEmpty()){
                                        System.out.println("No hay laptops registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_laptops.size(); i++){
                                            
                                            String marca_dos = lista_laptops.get(i).getMarca();
                                            
                                            if(marca.equalsIgnoreCase(marca_dos)){
                                                
                                                System.out.println("ID: " + lista_laptops.get(i).getId());
                                                System.out.println("   Marca: " + lista_laptops.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_laptops.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_laptops.get(i).getPrecio());
                                                System.out.println("   Pulgadas: " + lista_laptops.get(i).getPulgadas());
                                                System.out.println("   Tipo de cargador: " + lista_laptops.get(i).getTipo_cargador());
                                                System.out.println("   RAM: " + lista_laptops.get(i).getMemoria_ram());
                                                System.out.println("   ROM: " + lista_laptops.get(i).getMemoria_interna());
                                                System.out.println("   Procesador: " + lista_laptops.get(i).getProcesador());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Modelo
                                case 2:
                                    
                                    String modelo = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el modelo?");
                                    modelo = in.next();

                                    lista_laptops = bd.getBase_laptop();
                                    
                                    if(lista_laptops.isEmpty()){
                                        System.out.println("No hay laptops registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_laptops.size(); i++){
                                            
                                            String modelo_dos = lista_laptops.get(i).getModelo();
                                            
                                            if(modelo.equalsIgnoreCase(modelo_dos)){
                                                
                                                System.out.println("ID: " + lista_laptops.get(i).getId());
                                                System.out.println("   Marca: " + lista_laptops.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_laptops.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_laptops.get(i).getPrecio());
                                                System.out.println("   Pulgadas: " + lista_laptops.get(i).getPulgadas());
                                                System.out.println("   Tipo de cargador: " + lista_laptops.get(i).getTipo_cargador());
                                                System.out.println("   RAM: " + lista_laptops.get(i).getMemoria_ram());
                                                System.out.println("   ROM: " + lista_laptops.get(i).getMemoria_interna());
                                                System.out.println("   Procesador: " + lista_laptops.get(i).getProcesador());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                    }
                                    
                                    break;
                                    
                                //Precio
                                case 3:
                                    
                                    String precio = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el precio?");
                                    precio = in.next();

                                    lista_laptops = bd.getBase_laptop();
                                    
                                    if(lista_laptops.isEmpty()){
                                        System.out.println("No hay laptops registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_laptops.size(); i++){
                                            
                                            String precio_dos = lista_laptops.get(i).getPrecio();
                                            
                                            if(precio.equalsIgnoreCase(precio_dos)){
                                                
                                                System.out.println("ID: " + lista_laptops.get(i).getId());
                                                System.out.println("   Marca: " + lista_laptops.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_laptops.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_laptops.get(i).getPrecio());
                                                System.out.println("   Pulgadas: " + lista_laptops.get(i).getPulgadas());
                                                System.out.println("   Tipo de cargador: " + lista_laptops.get(i).getTipo_cargador());
                                                System.out.println("   RAM: " + lista_laptops.get(i).getMemoria_ram());
                                                System.out.println("   ROM: " + lista_laptops.get(i).getMemoria_interna());
                                                System.out.println("   Procesador: " + lista_laptops.get(i).getProcesador());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                    
                                default:
                                    System.out.println("El criterio de busqueda seleccionado no existe");
                                    break;
                            }
                            
                            break;
                            
                        //Smatphone
                        case 2:
                            
                            ArrayList<Smartphone> lista_smartphone = new ArrayList<>();
                            
                            System.out.println("\n¿Cual es su criterio de busqueda?");
                            System.out.println("\t 1. Marca");
                            System.out.println("\t 2. Modelo");
                            System.out.println("\t 3. Precio");
                            System.out.println("\t Elija una opcion: \n");
                            eleccion_dos = in.nextInt();
                            
                            switch(eleccion_dos){
                                
                                //Marca
                                case 1:
                                    
                                    String marca = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es la marca?");
                                    marca = in.next();

                                    lista_smartphone = bd.getBase_smartphone();
                                    
                                    if(lista_smartphone.isEmpty()){
                                        System.out.println("No hay smartphones registrados aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_smartphone.size(); i++){
                                            
                                            String marca_dos = lista_smartphone.get(i).getMarca();
                                            
                                            if(marca.equalsIgnoreCase(marca_dos)){
                                                
                                                System.out.println("ID: " + lista_smartphone.get(i).getId());
                                                System.out.println("   Marca: " + lista_smartphone.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_smartphone.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_smartphone.get(i).getPrecio());
                                                System.out.println("   Resolucion: " + lista_smartphone.get(i).getResolucion());
                                                System.out.println("   Tipo de cargador: " + lista_smartphone.get(i).getTipo_cargador());
                                                System.out.println("   RAM: " + lista_smartphone.get(i).getMemoria_ram());
                                                System.out.println("   ROM: " + lista_smartphone.get(i).getMemoria_interna());
                                                System.out.println("   Camara: " + lista_smartphone.get(i).getCamara());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Modelo
                                case 2:
                                    
                                    String modelo = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el modelo?");
                                    modelo = in.next();

                                    lista_smartphone = bd.getBase_smartphone();
                                    
                                    if(lista_smartphone.isEmpty()){
                                        System.out.println("No hay smartphones registrados aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_smartphone.size(); i++){
                                            
                                            String modelo_dos = lista_smartphone.get(i).getModelo();
                                            
                                            if(modelo.equalsIgnoreCase(modelo_dos)){
                                                
                                                System.out.println("ID: " + lista_smartphone.get(i).getId());
                                                System.out.println("   Marca: " + lista_smartphone.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_smartphone.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_smartphone.get(i).getPrecio());
                                                System.out.println("   Resolucion: " + lista_smartphone.get(i).getResolucion());
                                                System.out.println("   Tipo de cargador: " + lista_smartphone.get(i).getTipo_cargador());
                                                System.out.println("   RAM: " + lista_smartphone.get(i).getMemoria_ram());
                                                System.out.println("   ROM: " + lista_smartphone.get(i).getMemoria_interna());
                                                System.out.println("   Camara: " + lista_smartphone.get(i).getCamara());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Precio
                                case 3:
                                    
                                    String precio = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el precio?");
                                    precio = in.next();

                                    lista_smartphone = bd.getBase_smartphone();
                                    
                                    if(lista_smartphone.isEmpty()){
                                        System.out.println("No hay smartphones registrados aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_smartphone.size(); i++){
                                            
                                            String precio_dos = lista_smartphone.get(i).getPrecio();
                                            
                                            if(precio.equalsIgnoreCase(precio_dos)){
                                                
                                                System.out.println("ID: " + lista_smartphone.get(i).getId());
                                                System.out.println("   Marca: " + lista_smartphone.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_smartphone.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_smartphone.get(i).getPrecio());
                                                System.out.println("   Resolucion: " + lista_smartphone.get(i).getResolucion());
                                                System.out.println("   Tipo de cargador: " + lista_smartphone.get(i).getTipo_cargador());
                                                System.out.println("   RAM: " + lista_smartphone.get(i).getMemoria_ram());
                                                System.out.println("   ROM: " + lista_smartphone.get(i).getMemoria_interna());
                                                System.out.println("   Camara: " + lista_smartphone.get(i).getCamara());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                    
                                default:
                                    System.out.println("El criterio de busqueda seleccionado no existe");
                                    break;
                            }
                            
                            break;
                            
                        //Bocina
                        case 3:
                            
                            ArrayList<Bocina> lista_bocinas = new ArrayList<>();
                            
                            System.out.println("\n¿Cual es su criterio de busqueda?");
                            System.out.println("\t 1. Marca");
                            System.out.println("\t 2. Modelo");
                            System.out.println("\t 3. Precio");
                            System.out.println("\t Elija una opcion: \n");
                            eleccion_dos = in.nextInt();
                            
                            switch(eleccion_dos){
                                
                                //Marca
                                case 1:
                                    
                                    String marca = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es la marca?");
                                    marca = in.next();

                                    lista_bocinas = bd.getBase_bocina();
                                    
                                    if(lista_bocinas.isEmpty()){
                                        System.out.println("No hay bocinas registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_bocinas.size(); i++){
                                            
                                            String marca_dos = lista_bocinas.get(i).getMarca();
                                            
                                            if(marca.equalsIgnoreCase(marca_dos)){
                                                
                                                System.out.println("ID: " + lista_bocinas.get(i).getId());
                                                System.out.println("   Marca: " + lista_bocinas.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_bocinas.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_bocinas.get(i).getPrecio());
                                                System.out.println("   Forma: " + lista_bocinas.get(i).getForma());
                                                System.out.println("   Duracion de bateria(hrs): " + lista_bocinas.get(i).getDuracion_bateria());
                                                System.out.println("   Peso: " + lista_bocinas.get(i).getPeso());
                                                System.out.println("   Volumen maximo: " + lista_bocinas.get(i).getVolumen_maximo());
                                                System.out.println("   Material: " + lista_bocinas.get(i).getMaterial());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Modelo
                                case 2:
                                    
                                    String modelo = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el modelo?");
                                    modelo = in.next();

                                    lista_bocinas = bd.getBase_bocina();
                                    
                                    if(lista_bocinas.isEmpty()){
                                        System.out.println("No hay bocinas registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_bocinas.size(); i++){
                                            
                                            String modelo_dos = lista_bocinas.get(i).getModelo();
                                            
                                            if(modelo.equalsIgnoreCase(modelo_dos)){
                                                
                                                System.out.println("ID: " + lista_bocinas.get(i).getId());
                                                System.out.println("   Marca: " + lista_bocinas.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_bocinas.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_bocinas.get(i).getPrecio());
                                                System.out.println("   Forma: " + lista_bocinas.get(i).getForma());
                                                System.out.println("   Duracion de bateria(hrs): " + lista_bocinas.get(i).getDuracion_bateria());
                                                System.out.println("   Peso: " + lista_bocinas.get(i).getPeso());
                                                System.out.println("   Volumen maximo: " + lista_bocinas.get(i).getVolumen_maximo());
                                                System.out.println("   Material: " + lista_bocinas.get(i).getMaterial());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Precio
                                case 3:
                                    
                                    String precio = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el precio?");
                                    precio = in.next();

                                    lista_bocinas = bd.getBase_bocina();
                                    
                                    if(lista_bocinas.isEmpty()){
                                        System.out.println("No hay bocinas registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_bocinas.size(); i++){
                                            
                                            String precio_dos = lista_bocinas.get(i).getPrecio();
                                            
                                            if(precio.equalsIgnoreCase(precio_dos)){
                                                
                                                System.out.println("ID: " + lista_bocinas.get(i).getId());
                                                System.out.println("   Marca: " + lista_bocinas.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_bocinas.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_bocinas.get(i).getPrecio());
                                                System.out.println("   Forma: " + lista_bocinas.get(i).getForma());
                                                System.out.println("   Duracion de bateria(hrs): " + lista_bocinas.get(i).getDuracion_bateria());
                                                System.out.println("   Peso: " + lista_bocinas.get(i).getPeso());
                                                System.out.println("   Volumen maximo: " + lista_bocinas.get(i).getVolumen_maximo());
                                                System.out.println("   Material: " + lista_bocinas.get(i).getMaterial());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                    
                                default:
                                    System.out.println("El criterio de busqueda seleccionado no existe");
                                    break;
                            }
                            
                            break;
                            
                        //Pantalla
                        case 4:
                            
                            ArrayList<Pantalla> lista_pantallas = new ArrayList<>();
                            
                            System.out.println("\n¿Cual es su criterio de busqueda?");
                            System.out.println("\t 1. Marca");
                            System.out.println("\t 2. Modelo");
                            System.out.println("\t 3. Precio");
                            System.out.println("\t Elija una opcion: \n");
                            eleccion_dos = in.nextInt();
                            
                            switch(eleccion_dos){
                                
                                //Marca
                                case 1:
                                    
                                    String marca = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es la marca?");
                                    marca = in.next();

                                    lista_pantallas = bd.getBase_pantalla();
                                    
                                    if(lista_pantallas.isEmpty()){
                                        System.out.println("No hay pantallas registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_pantallas.size(); i++){
                                            
                                            String marca_dos = lista_pantallas.get(i).getMarca();
                                            
                                            if(marca.equalsIgnoreCase(marca_dos)){
                                                
                                                System.out.println("ID: " + lista_pantallas.get(i).getId());
                                                System.out.println("   Marca: " + lista_pantallas.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_pantallas.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_pantallas.get(i).getPrecio());
                                                System.out.println("   Pulgadas: " + lista_pantallas.get(i).getPulgadas());
                                                System.out.println("   Resolucion: " + lista_pantallas.get(i).getResolucion());
                                                System.out.println("   Tipo: " + lista_pantallas.get(i).getTipo_led_oled_lcd());
                                                System.out.println("   Smart Tv: " + lista_pantallas.get(i).getSmart_tv());
                                                System.out.println("   Soporte fisico: " + lista_pantallas.get(i).getSoporte_fisico());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Modelo
                                case 2:
                                    
                                    String modelo = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el modelo?");
                                    modelo = in.next();

                                    lista_pantallas = bd.getBase_pantalla();
                                    
                                    if(lista_pantallas.isEmpty()){
                                        System.out.println("No hay pantallas registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_pantallas.size(); i++){
                                            
                                            String modelo_dos = lista_pantallas.get(i).getModelo();
                                            
                                            if(modelo.equalsIgnoreCase(modelo_dos)){
                                                
                                                System.out.println("ID: " + lista_pantallas.get(i).getId());
                                                System.out.println("   Marca: " + lista_pantallas.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_pantallas.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_pantallas.get(i).getPrecio());
                                                System.out.println("   Pulgadas: " + lista_pantallas.get(i).getPulgadas());
                                                System.out.println("   Resolucion: " + lista_pantallas.get(i).getResolucion());
                                                System.out.println("   Tipo: " + lista_pantallas.get(i).getTipo_led_oled_lcd());
                                                System.out.println("   Smart Tv: " + lista_pantallas.get(i).getSmart_tv());
                                                System.out.println("   Soporte fisico: " + lista_pantallas.get(i).getSoporte_fisico());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Precio
                                case 3:
                                    
                                    String precio = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el precio?");
                                    precio = in.next();

                                    lista_pantallas = bd.getBase_pantalla();
                                    
                                    if(lista_pantallas.isEmpty()){
                                        System.out.println("No hay pantallas registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_pantallas.size(); i++){
                                            
                                            String precio_dos = lista_pantallas.get(i).getPrecio();
                                            
                                            if(precio.equalsIgnoreCase(precio_dos)){
                                                
                                                System.out.println("ID: " + lista_pantallas.get(i).getId());
                                                System.out.println("   Marca: " + lista_pantallas.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_pantallas.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_pantallas.get(i).getPrecio());
                                                System.out.println("   Pulgadas: " + lista_pantallas.get(i).getPulgadas());
                                                System.out.println("   Resolucion: " + lista_pantallas.get(i).getResolucion());
                                                System.out.println("   Tipo: " + lista_pantallas.get(i).getTipo_led_oled_lcd());
                                                System.out.println("   Smart Tv: " + lista_pantallas.get(i).getSmart_tv());
                                                System.out.println("   Soporte fisico: " + lista_pantallas.get(i).getSoporte_fisico());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                    
                                default:
                                    System.out.println("El criterio de busqueda seleccionado no existe");
                                    break;
                            }
                            
                            break;
                            
                        //Impresora
                        case 5:
                            
                            ArrayList<Impresora> lista_impresoras = new ArrayList<>();
                            
                            System.out.println("\n¿Cual es su criterio de busqueda?");
                            System.out.println("\t 1. Marca");
                            System.out.println("\t 2. Modelo");
                            System.out.println("\t 3. Precio");
                            System.out.println("\t Elija una opcion: \n");
                            eleccion_dos = in.nextInt();
                            
                            switch(eleccion_dos){
                                
                                //Marca
                                case 1:
                                    
                                    String marca = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es la marca?");
                                    marca = in.next();

                                    lista_impresoras = bd.getBase_impresora();
                                    
                                    if(lista_impresoras.isEmpty()){
                                        System.out.println("No hay impresoras registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_impresoras.size(); i++){
                                            
                                            String marca_dos = lista_impresoras.get(i).getMarca();
                                            
                                            if(marca.equalsIgnoreCase(marca_dos)){
                                                
                                                System.out.println("ID: " + lista_impresoras.get(i).getId());
                                                System.out.println("   Marca: " + lista_impresoras.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_impresoras.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_impresoras.get(i).getPrecio());
                                                System.out.println("   Cartuchos: " + lista_impresoras.get(i).getTipo_cartucho());
                                                System.out.println("   Tipo de impresion: " + lista_impresoras.get(i).getTipo_impresion());
                                                System.out.println("   Dimensiones: " + lista_impresoras.get(i).getDimensiones());
                                                System.out.println("   Resolucion maxima: " + lista_impresoras.get(i).getResolucion_maxima());
                                                System.out.println("   Tecnologia de impresion: " + lista_impresoras.get(i).getTecnologia_impresion());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Modelo
                                case 2:
                                    
                                    String modelo = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el modelo?");
                                    modelo = in.next();

                                    lista_impresoras = bd.getBase_impresora();
                                    
                                    if(lista_impresoras.isEmpty()){
                                        System.out.println("No hay impresoras registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_impresoras.size(); i++){
                                            
                                            String modelo_dos = lista_impresoras.get(i).getModelo();
                                            
                                            if(modelo.equalsIgnoreCase(modelo_dos)){
                                                
                                                System.out.println("ID: " + lista_impresoras.get(i).getId());
                                                System.out.println("   Marca: " + lista_impresoras.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_impresoras.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_impresoras.get(i).getPrecio());
                                                System.out.println("   Cartuchos: " + lista_impresoras.get(i).getTipo_cartucho());
                                                System.out.println("   Tipo de impresion: " + lista_impresoras.get(i).getTipo_impresion());
                                                System.out.println("   Dimensiones: " + lista_impresoras.get(i).getDimensiones());
                                                System.out.println("   Resolucion maxima: " + lista_impresoras.get(i).getResolucion_maxima());
                                                System.out.println("   Tecnologia de impresion: " + lista_impresoras.get(i).getTecnologia_impresion());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                //Precio
                                case 3:
                                    
                                    String precio = "";
                                    
                                    //Obtener marca
                                    System.out.println("¿Cual es el precio?");
                                    precio = in.next();

                                    lista_impresoras = bd.getBase_impresora();
                                    
                                    if(lista_impresoras.isEmpty()){
                                        System.out.println("No hay impresoras registradas aun");
                                    } else {
                                        int contador = 0;
                                        for(int i = 0; i < lista_impresoras.size(); i++){
                                            
                                            String precio_dos = lista_impresoras.get(i).getPrecio();
                                            
                                            if(precio.equalsIgnoreCase(precio_dos)){
                                                
                                                System.out.println("ID: " + lista_impresoras.get(i).getId());
                                                System.out.println("   Marca: " + lista_impresoras.get(i).getMarca());
                                                System.out.println("   Modelo: " + lista_impresoras.get(i).getModelo());
                                                System.out.println("   Precio: " + lista_impresoras.get(i).getPrecio());
                                                System.out.println("   Cartuchos: " + lista_impresoras.get(i).getTipo_cartucho());
                                                System.out.println("   Tipo de impresion: " + lista_impresoras.get(i).getTipo_impresion());
                                                System.out.println("   Dimensiones: " + lista_impresoras.get(i).getDimensiones());
                                                System.out.println("   Resolucion maxima: " + lista_impresoras.get(i).getResolucion_maxima());
                                                System.out.println("   Tecnologia de impresion: " + lista_impresoras.get(i).getTecnologia_impresion());
                                                System.out.println("");
                                                
                                                contador ++;
                                                
                                            }
                                            
                                        }
                                        
                                        if(contador == 0){
                                            System.out.println("** Articulos no encontrados **");
                                        }
                                        
                                    }
                                    
                                    break;
                                    
                                    
                                default:
                                    System.out.println("El criterio de busqueda seleccionado no existe");
                                    break;
                            }
                            
                            break;
                            
                            
                        default:
                            System.out.println("La opcion seleccionada no existe");
                            break;
                    }
                    
                    break;
                    
                //Opcion de Editar
                case 4:
                    
                    String ID = "";
                    
                    System.out.println("¿Que articulos deseas editar?");
                    System.out.println("\t 1. Laptops");
                    System.out.println("\t 2. Smartphones");
                    System.out.println("\t 3. Bocinas");
                    System.out.println("\t 4. Pantallas");
                    System.out.println("\t 5. Impresoras \n");
                    System.out.println("Elija una opcion: ");
                    eleccion_productos = in.nextInt();
                    
                    switch(eleccion_productos){
                        
                        //Laptops
                        case 1:
                            
                            ArrayList<Laptop> lista_laptops = new ArrayList<>();
                            lista_laptops = bd.getBase_laptop();
                            
                            System.out.println("Introduzca el ID del articulo a editar: ");
                            ID = in.next();
                            
                            if(lista_laptops.isEmpty()){
                                System.out.println("No hay laptops registradas aun");
                            } else {
                                int contador = 0;
                                for(int i = 0; i < lista_laptops.size(); i++){
                                    
                                    String id = lista_laptops.get(i).getId();
                                    
                                    if(ID.equals(id)){
                                        
                                        System.out.println("\t** Ingrese los nuevos datos **");
                                        System.out.println("Marca:");
                                        c1 = in.next();
                                        System.out.println("Modelo:");
                                        c2 = in.next();
                                        System.out.println("Precio:");
                                        c3 = in.next();
                                        System.out.println("Pulgadas:");
                                        c4 = in.next();
                                        System.out.println("Tipo de cargador:");
                                        c5 = in.next();
                                        System.out.println("RAM:");
                                        c6 = in.next();
                                        System.out.println("ROM:");
                                        c7 = in.next();
                                        System.out.println("Procesador:");
                                        c8 = in.next();
                                        
                                        //Establecer Datos
                                        lista_laptops.get(i).setId(id);
                                        lista_laptops.get(i).setMarca(c1);
                                        lista_laptops.get(i).setModelo(c2);
                                        lista_laptops.get(i).setPrecio(c3);
                                        lista_laptops.get(i).setPulgadas(c4);
                                        lista_laptops.get(i).setTipo_cargador(c5);
                                        lista_laptops.get(i).setMemoria_ram(c6);
                                        lista_laptops.get(i).setMemoria_interna(c7);
                                        lista_laptops.get(i).setProcesador(c8);

                                        System.out.println("* Se modifico correctamente la laptop *");
                                        
                                        contador ++;
                                        
                                    }
                                    
                                }
                                if(contador == 0){
                                    System.out.println("** No se encontro el articulo **");
                                }
                            }
                            
                            break;
                            
                        //Smartphones
                        case 2:
                            
                            ArrayList<Smartphone> lista_smartphones = new ArrayList<>();
                            lista_smartphones = bd.getBase_smartphone();
                            
                            System.out.println("Introduzca el ID del articulo a editar: ");
                            ID = in.next();
                            
                            if(lista_smartphones.isEmpty()){
                                System.out.println("No hay smartphones registrados aun");
                            } else {
                                int contador = 0;
                                for(int i = 0; i < lista_smartphones.size(); i++){
                                    
                                    String id = lista_smartphones.get(i).getId();
                                    
                                    if(ID.equals(id)){
                                        
                                        System.out.println("\t** Ingrese los nuevos datos **");
                                        System.out.println("Marca:");
                                        c1 = in.next();
                                        System.out.println("Modelo:");
                                        c2 = in.next();
                                        System.out.println("Precio:");
                                        c3 = in.next();
                                        System.out.println("Resolucion:");
                                        c4 = in.next();
                                        System.out.println("Tipo de cargador:");
                                        c5 = in.next();
                                        System.out.println("RAM:");
                                        c6 = in.next();
                                        System.out.println("ROM:");
                                        c7 = in.next();
                                        System.out.println("Camara:");
                                        c8 = in.next();
                                        
                                        //Establecer Datos
                                        lista_smartphones.get(i).setId(id);
                                        lista_smartphones.get(i).setMarca(c1);
                                        lista_smartphones.get(i).setModelo(c2);
                                        lista_smartphones.get(i).setPrecio(c3);
                                        lista_smartphones.get(i).setResolucion(c4);
                                        lista_smartphones.get(i).setTipo_cargador(c5);
                                        lista_smartphones.get(i).setMemoria_ram(c6);
                                        lista_smartphones.get(i).setMemoria_interna(c7);
                                        lista_smartphones.get(i).setCamara(c8);

                                        System.out.println("* Se modifico correctamente el celular *");
                                        
                                        contador ++;
                                        
                                    }
                                    
                                }
                                if(contador == 0){
                                    System.out.println("** No se encontro el articulo **");
                                }
                            }
                            
                            break;
                            
                        //Bocinas
                        case 3:
                            
                            ArrayList<Bocina> lista_bocinas = new ArrayList<>();
                            lista_bocinas = bd.getBase_bocina();
                            
                            System.out.println("Introduzca el ID del articulo a editar: ");
                            ID = in.next();
                            
                            if(lista_bocinas.isEmpty()){
                                System.out.println("No hay bocinas registradas aun");
                            } else {
                                int contador = 0;
                                for(int i = 0; i < lista_bocinas.size(); i++){
                                    
                                    String id = lista_bocinas.get(i).getId();
                                    
                                    if(ID.equals(id)){
                                        
                                        System.out.println("\t** Ingrese los nuevos datos **");
                                        System.out.println("Marca:");
                                        c1 = in.next();
                                        System.out.println("Modelo:");
                                        c2 = in.next();
                                        System.out.println("Precio:");
                                        c3 = in.next();
                                        System.out.println("Forma:");
                                        c4 = in.next();
                                        System.out.println("Duracion de bateria (hrs):");
                                        c5 = in.next();
                                        System.out.println("Peso:");
                                        c6 = in.next();
                                        System.out.println("Volumen maximo:");
                                        c7 = in.next();
                                        System.out.println("Materiales:");
                                        c8 = in.next();
                                        
                                        //Establecer Datos
                                        lista_bocinas.get(i).setId(id);
                                        lista_bocinas.get(i).setMarca(c1);
                                        lista_bocinas.get(i).setModelo(c2);
                                        lista_bocinas.get(i).setPrecio(c3);
                                        lista_bocinas.get(i).setForma(c4);
                                        lista_bocinas.get(i).setDuracion_bateria(c5);
                                        lista_bocinas.get(i).setPeso(c6);
                                        lista_bocinas.get(i).setVolumen_maximo(c7);
                                        lista_bocinas.get(i).setMaterial(c8);

                                        System.out.println("* Se modifico correctamente la bocina *");
                                        
                                        contador ++;
                                        
                                    }
                                    
                                }
                                if(contador == 0){
                                    System.out.println("** No se encontro el articulo **");
                                }
                            }
                            
                            break;
                            
                        //Pantallas
                        case 4:
                            
                            ArrayList<Pantalla> lista_pantallas = new ArrayList<>();
                            lista_pantallas = bd.getBase_pantalla();
                            
                            System.out.println("Introduzca el ID del articulo a editar: ");
                            ID = in.next();
                            
                            if(lista_pantallas.isEmpty()){
                                System.out.println("No hay pantallas registradas aun");
                            } else {
                                int contador = 0;
                                for(int i = 0; i < lista_pantallas.size(); i++){
                                    
                                    String id = lista_pantallas.get(i).getId();
                                    
                                    if(ID.equals(id)){
                                        
                                        System.out.println("Marca:");
                                        c1 = in.next();
                                        System.out.println("Modelo:");
                                        c2 = in.next();
                                        System.out.println("Precio:");
                                        c3 = in.next();
                                        System.out.println("Pulgadas:");
                                        c4 = in.next();
                                        System.out.println("Resolucion:");
                                        c5 = in.next();
                                        System.out.println("Tipo (LED, OLED, LCD):");
                                        c6 = in.next();
                                        System.out.println("Smart TV:");
                                        c7 = in.next();
                                        System.out.println("Soporte fisico:");
                                        c8 = in.next();
                                        
                                        //Establecer Datos
                                        lista_pantallas.get(i).setId(id);
                                        lista_pantallas.get(i).setMarca(c1);
                                        lista_pantallas.get(i).setModelo(c2);
                                        lista_pantallas.get(i).setPrecio(c3);
                                        lista_pantallas.get(i).setPulgadas(c4);
                                        lista_pantallas.get(i).setResolucion(c5);
                                        lista_pantallas.get(i).setTipo_led_oled_lcd(c6);
                                        lista_pantallas.get(i).setSmart_tv(c7);
                                        lista_pantallas.get(i).setSoporte_fisico(c8);

                                        System.out.println("* Se modifico correctamente la pantalla *");
                                        
                                        contador ++;
                                        
                                    }
                                    
                                }
                                if(contador == 0){
                                    System.out.println("** No se encontro el articulo **");
                                }
                            }
                            
                            break;
                            
                        //Impresoras
                        case 5:
                            
                            ArrayList<Impresora> lista_impresoras = new ArrayList<>();
                            lista_impresoras = bd.getBase_impresora();
                            
                            System.out.println("Introduzca el ID del articulo a editar: ");
                            ID = in.next();
                            
                            if(lista_impresoras.isEmpty()){
                                System.out.println("No hay inpresoras registradas aun");
                            } else {
                                int contador = 0;
                                for(int i = 0; i < lista_impresoras.size(); i++){
                                    
                                    String id = lista_impresoras.get(i).getId();
                                    
                                    if(ID.equals(id)){
                                        
                                        System.out.println("Marca:");
                                        c1 = in.next();
                                        System.out.println("Modelo:");
                                        c2 = in.next();
                                        System.out.println("Precio:");
                                        c3 = in.next();
                                        System.out.println("Tipo de cartucho:");
                                        c4 = in.next();
                                        System.out.println("Tipo de impresion:");
                                        c5 = in.next();
                                        System.out.println("Dimensiones de hoja:");
                                        c6 = in.next();
                                        System.out.println("Resolucion maxima:");
                                        c7 = in.next();
                                        System.out.println("Tecnologia de impresion:");
                                        c8 = in.next();
                                        
                                        //Establecer Datos
                                        lista_impresoras.get(i).setId(id);
                                        lista_impresoras.get(i).setMarca(c1);
                                        lista_impresoras.get(i).setModelo(c2);
                                        lista_impresoras.get(i).setPrecio(c3);
                                        lista_impresoras.get(i).setTipo_cartucho(c4);
                                        lista_impresoras.get(i).setTipo_impresion(c5);
                                        lista_impresoras.get(i).setDimensiones(c6);
                                        lista_impresoras.get(i).setResolucion_maxima(c7);
                                        lista_impresoras.get(i).setTecnologia_impresion(c8);

                                        System.out.println("* Se modifico correctamente la impresora *");
                                        
                                        contador ++;
                                        
                                    }
                                    
                                }
                                if(contador == 0){
                                    System.out.println("** No se encontro el articulo **");
                                }
                            }
                            
                            break;
                            
                            
                        default:
                            System.out.println("El producto seleccionado no existe");
                            break;
                    }
                    
                    break;
                    
                //Opcion de Salir
                case 5:
                    break;
                    
                default:
                    System.out.println("La opcion ingresada no existe, vuelve a intentarlo...");
                    break;
            }
            
        } while(eleccion != 5);
        
        System.out.println("¡Hasta Luego!");
        
    }
    
}