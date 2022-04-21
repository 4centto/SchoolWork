/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;
import clases.Libro;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author acer_usuario
 */
public class Main {

    //Metodo main
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println(" -- ELIGE UNA OPCION -- ");
            System.out.println("1. Registrar ISBN.");
            System.out.println("2. Leer un registro.");
            System.out.println("3. Salir.");

            opcion = in.nextInt();
            determine(opcion);

        } while (opcion != 3);
    }

    //Metodo para determinar que opcion se ha elegido
    public static void determine(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                showForm();
                break;
            case 2:
                searchBook();
                break;
            case 3:
                System.out.println("Hasta luego!!");
                break;
            default:
                System.out.println("Debes ingresar una opcion valida.");
                break;
        }
    }
    
    //Metodo para buscar los datos de un libro
    public static void searchBook() throws IOException{
        Scanner in = new Scanner(System.in);
        String isbn;
        
        System.out.println("\n------------------------");
        
        do{
            System.out.println("ISBN: (ISBN-486-243-9879-33-9)");
            isbn = in.nextLine();
            validateISBN(isbn);
        } while(validateLength(isbn, 30, "ISBN debe ser menor a 20 caractéres.") == false || validateISBN(isbn) == false);
        
        RandomAccessFile indices = new RandomAccessFile("indices.log", "rw");
        if(indices.length() == 0){
            System.out.println("\n * No hay registros aun * \n");
        } else {
            searchingBook(isbn, 0, indices);
        }
        
    }
    
    //Metodo recursivo para buscar un libro
    public static void searchingBook(String ISBN, int index, RandomAccessFile indices) throws IOException{
        if(index >= 0){
            indices.seek(index);
            String[] fatherFields = getFields(indices.readLine());

            if(fatherFields[1].equals(ISBN)){ //Se comparan los ISBN's para saber si son iguales o hay que seguir buscando

                //Obtenemos los datos del libro
                RandomAccessFile registros = new RandomAccessFile("registros.log", "rw");

                int position = (Integer.parseInt(fatherFields[0]) - 1) * 576;
                registros.seek(position);

                System.out.println("\n********************");
                System.out.println(formatBook(registros.readLine()));
                System.out.println("********************\n");

            } else {
                if(compareISBN(ISBN, fatherFields[1]) == true){ // Quiere decir que el libro a buscar es mayor
                    int rightSon = (Integer.parseInt(fatherFields[3]) - 1) * 51;
                    searchingBook(ISBN, rightSon, indices);
                } else { // El libro a buscar es menor
                    int leftSon = (Integer.parseInt(fatherFields[2]) - 1) * 51;
                    searchingBook(ISBN, leftSon, indices);
                }
            }
        } else {
            System.out.println("\n * El libro no ha sido encontrado *\n");
        }
        
    }

    //Metodo que muestra al usuario el menu para ingresar los datos del libro
    public static void showForm() throws IOException {
        
        String isbn, titulo, nomAutor, patAutor, matAutor, editorial, prologo,
        genero, sintesis, nomAutorDos, patAutorDos, matAutorDos, annioEdicion, paginas, edicion, volumen, capitulos;
        
        Libro libro = new Libro();
        Scanner in = new Scanner(System.in);
        
        RandomAccessFile file = new RandomAccessFile("registros.log", "rw");

        System.out.println("\n----------------------");
        
        do{
            System.out.println("ISBN: (ISBN-486-243-9879-33-9)");
            isbn = in.nextLine();
            validateISBN(isbn);
        } while(validateLength(isbn, 30, "ISBN debe ser menor a 20 caractéres.") == false || validateISBN(isbn) == false);
        libro.setIsbn(isbn);
      
        do{
            System.out.println("Titulo del libro:");
            titulo = in.nextLine();
        } while(validateLength(titulo, 100, "El titulo debe ser menor a 100 caractéres.") == false);
        libro.setTitulo(titulo);
        
        do{
            System.out.println("Nombre del autor:");
            nomAutor = in.nextLine();
        } while(validateLength(nomAutor, 30, "El nombre debe ser menor a 30 caractéres.") == false);
        libro.setNombreAutor(nomAutor);
        
        do{
            System.out.println("Apellido paterno:");
            patAutor = in.nextLine();
        } while(validateLength(patAutor, 20, "El apellido paterno debe ser menor a 20 caractéres.") == false);
        libro.setPaternoAutor(patAutor);        

        do{
            System.out.println("Apellido materno:");
            matAutor = in.nextLine();
        } while(validateLength(matAutor, 20, "El apellido materno debe ser menor a 20 caractéres.") == false);
        libro.setMaternoAutor(matAutor);
        
        do{
            System.out.println("Editorial:");
            editorial = in.nextLine();
        } while(validateLength(editorial, 20, "La editorial debe ser menor a 20 caractéres.") == false);
        libro.setEditorial(editorial);
        
        do{
            System.out.println("Año de edicion:");
            annioEdicion = in.nextLine();
        } while(validateLength(annioEdicion, 4, "El año de edicion debe ser menor a 4 caractéres.") == false);
        libro.setAnnioEdicion(annioEdicion);
        
        do{
            System.out.println("Numero de paginas:");
            paginas = in.nextLine();
        } while(validateLength(paginas, 4, "El numero de paginas debe ser menor a 4 caractéres.") == false);
        libro.setPaginas(paginas);
        
        do{
            System.out.println("Prologo por:");
            prologo = in.nextLine();
        } while(validateLength(prologo, 60, "El prologo debe ser menor a 60 caractéres.") == false);
        libro.setPrologo(prologo);        

        do{
            System.out.println("Genero:");
            genero = in.nextLine();
        } while(validateLength(genero, 10, "El genero debe ser menor a 10 caractéres.") == false);
        libro.setGenero(genero);

        do{
            System.out.println("Sintesis:");
            sintesis = in.nextLine();
        } while(validateLength(sintesis, 200, "La sintesis debe ser menor a 200 caractéres.") == false);
        libro.setSintesis(sintesis);
        
        do{
            System.out.println("Numero de edicion:");
            edicion = in.nextLine();
        } while(validateLength(edicion, 3, "El numero de edicion debe ser menor a 3 caractéres.") == false);
        libro.setNumeroEdicion(edicion);
        
        do{
            System.out.println("Numero de volumen:");
            volumen = in.nextLine();
        } while(validateLength(volumen, 2, "El numero de volumen debe ser menor a 2 caractéres.") == false);
        libro.setNumVolumen(volumen);
        
        do{
            System.out.println("Numero de capitulos:");
            capitulos = in.nextLine();
        } while(validateLength(capitulos, 2, "El numero de capitulos debe ser menor a 2 caractéres.") == false);
        libro.setNumCapitulos(capitulos);
        
        do{
            System.out.println("Nombre del segundo autor:");
            nomAutorDos = in.nextLine();
        } while(validateLength(nomAutorDos, 30, "El nombre debe ser menor a 30 caractéres.") == false);
        libro.setNombreAutorDos(nomAutorDos);
        

        do{
            System.out.println("Apellido paterno del segundo autor:");
            patAutorDos = in.nextLine();
        } while(validateLength(patAutorDos, 20, "El apellido paterno debe ser menor a 20 caractéres.") == false);
        libro.setPaternoAutorDos(patAutorDos);
        
        do{
            System.out.println("Apellido materno del segundo autor:");
            matAutorDos = in.nextLine();
        } while(validateLength(matAutorDos, 20, "El apellido materno debe ser menor a 20 caractéres.") == false);
        libro.setMaternoAutorDos(matAutorDos);
        
        writeDataIntoFile(file, libro);
        
    }
    
    //Metodo para escribir en el archivo los datos mandados
    public static void writeDataIntoFile(RandomAccessFile file, Libro libro) throws IOException{
        //Luego guardamos el ISBN en nuestro archivo de indices
        //Cada registro de indices mide 50 + 1 bytes
        RandomAccessFile indices = new RandomAccessFile("indices.log", "rw");
        
        if(indices.length() == 0){
            //Primero añadimos el ISBN al archivo de indices
            String numIndices = String.valueOf((indices.length() / 51) + 1);
            for(int i = 0; i <= (7-numIndices.length()); i++){
                numIndices += " ";
            }
            indices.seek(indices.length());
            indices.writeBytes(numIndices + libro.getIsbn() + "0    0    0    \n");  
            
            //Luego se añade el libro al archivo de registros
            file.seek(file.length());
            file.writeBytes(libro.toString() + "\n");
            
            System.out.println("\n************************");
            System.out.println(" LIBRO REGISTRADO ");
            System.out.println("************************\n");
            
        } else {
            
            if(insertISBN(libro.getIsbn(), 0, indices) == true){
                //Se añade el libro al archivo de registros
                file.seek(file.length());
                file.writeBytes(libro.toString() + "\n");
                
                System.out.println("\n************************");
                System.out.println(" LIBRO REGISTRADO ");
                System.out.println("************************\n");
                
            } else {
                System.out.println("\n * El libro YA existe *\n");
            }
            
        }
        
    }
    
    //Metodo que  busca si es menor o manyor el archivo a ingresar
    public static boolean insertISBN(String ISBN, int index, RandomAccessFile indices) throws IOException{
        
        indices.seek(index);
                
        String[] fatherFields = getFields(indices.readLine());
        
        if(!ISBN.equalsIgnoreCase(fatherFields[1])){
            if(compareISBN(ISBN, fatherFields[1]) == true){ //Si el nuevo ISBN es mayor
                /* Si el ISBN es mayor ahora tenemos que ir al hijo derecho, y validar que sea diferente de 0,
                de lo contrario, añadimos el registro, y establecemos que en su hijo derecho, tenga el nuevo
                registro, y que como padre tenga el numero de registro del que viene el hijo*/
                
                if(fatherFields[3].equals("0")){
                    //Primero actualizamos el hijo derecho del padre
                    indices.seek(index + 40);
                    indices.writeBytes(String.valueOf((indices.length() / 51) + 1));
                    
                    //Ahora añadimos el registro, con el padre actualizado
                    String numIndices = String.valueOf((indices.length() / 51) + 1);
                    for(int i = 0; i <= (7-numIndices.length()); i++){
                        numIndices += " ";
                    }
                    
                    String numFather = String.valueOf(fatherFields[0]);
                    for(int i = 0; i <= (7-numFather.length()); i++){
                        numFather += " ";
                    }
                    
                    String newISBN = ISBN;
                    for(int i = 0; i <= (29-newISBN.length()); i++){
                        newISBN += " ";
                    }
                    
                    indices.seek(indices.length());
                    indices.writeBytes(numIndices + newISBN + "0    0    " + numFather + "\n");
                    
                    return true;
                    
                } else {
                    int rightSon = (Integer.parseInt(fatherFields[3]) - 1) * 51;
                    insertISBN(ISBN, rightSon, indices);
                }
                
            } else { //Si el nuevo ISBN es menor
                /* Si el ISBN es menor ahora tenemos que ir al hijo izquierdo, y validar que sea diferente de 0,
                de lo contrario, añadimos el registro, y establecemos que en su hijo izquierdo, tenga el nuevo
                registro, y que como padre tenga el numero de registro del que viene el hijo*/
                
                if(fatherFields[2].equals("0")){
                    //Primero actualizamos el hijo derecho del padre
                    indices.seek(index + 35);
                    indices.writeBytes(String.valueOf((indices.length() / 51) + 1));
                    
                    //Ahora añadimos el registro, con el padre actualizado
                    String numIndices = String.valueOf((indices.length() / 51) + 1);
                    for(int i = 0; i <= (7-numIndices.length()); i++){
                        numIndices += " ";
                    }
                    
                    String numFather = String.valueOf(fatherFields[0]);
                    for(int i = 0; i <= (7-numFather.length()); i++){
                        numFather += " ";
                    }
                    
                    String newISBN = ISBN;
                    for(int i = 0; i <= (29-newISBN.length()); i++){
                        newISBN += " ";
                    }
                    
                    indices.seek(indices.length());
                    indices.writeBytes(numIndices + newISBN + "0    0    " + numFather + "\n");
                    
                    return true;
                    
                } else {
                    int leftSon = (Integer.parseInt(fatherFields[2]) - 1) * 51;
                    insertISBN(ISBN, leftSon, indices);
                }
            }
        } else {
            return false;
        }
        return true;
    }
    
    //Metodo que valida los ISBNS, para saber quien es el mayor de los dos
    public static boolean compareISBN(String newOne, String oldOne){
        String[] formatedNew = newOne.split("-");
        String[] formatedOld = oldOne.split("-");
        
        //Validamos cual de los dos tiene menos sectores
        if(formatedNew.length < formatedOld.length){
            for(int i = 1; i < formatedNew.length; i++){
                int newValue = Integer.parseInt(formatedNew[i]);
                int oldValue = Integer.parseInt(formatedOld[i]);
                
                if(newValue > oldValue){
                    return true;
                } else if(newValue < oldValue) {
                    return false;
                }
            }
            return false;
        } else if(formatedOld.length < formatedNew.length){
            for(int i = 1; i < formatedOld.length; i++){
                int newValue = Integer.parseInt(formatedNew[i]);
                int oldValue = Integer.parseInt(formatedOld[i]);
                
                if(newValue > oldValue){
                    return true;
                } else if(newValue < oldValue) {
                    return false;
                }
            }
            return true;
        } else {
            for(int i = 1; i < formatedOld.length; i++){
                int newValue = Integer.parseInt(formatedNew[i]);
                int oldValue = Integer.parseInt(formatedOld[i]);
                
                if(newValue > oldValue){
                    return true;
                } else if(newValue < oldValue) {
                    return false;
                }
            }
            return false;
        }
        
    }
    
    //Metodo para obtener un campo de un registro
    public static String[] getFields(String cadena) throws IOException{
        String[] fields = new String[5];
        String aux = "";
        
        //Obtenemos el index del registro
        for(int i = 0; i < 5; i++){
            if(!String.valueOf(cadena.charAt(i)).equals(" ")){
                aux += cadena.charAt(i);
            }
        }
        fields[0] = aux;
        aux = "";
        
        //Obtenemos el ISBN del registro
        for(int i = 5; i < 30; i++){
            if(!String.valueOf(cadena.charAt(i)).equals(" ")){
                aux += cadena.charAt(i);
            }
        }
        fields[1] = aux;
        aux = "";
        
        //Obtenemos el hijo izquierdo del registro
        for(int i = 35; i < 40; i++){
            if(!String.valueOf(cadena.charAt(i)).equals(" ")){
                aux += String.valueOf(cadena.charAt(i));
            }
        }
        fields[2] = aux;
        aux = "";
        
        //Obtenemos el hijo derecho del registro
        for(int i = 40; i < 45; i++){
            if(!String.valueOf(cadena.charAt(i)).equals(" ")){
                aux += String.valueOf(cadena.charAt(i));
            }
        }
        fields[3] = aux;
        aux = "";
        
        //Obtenemos el padre del registro
        for(int i = 45; i < 50; i++){
            if(!String.valueOf(cadena.charAt(i)).equals(" ")){
                aux += String.valueOf(cadena.charAt(i));
            }
        }
        fields[4] = aux;
        aux = "";
        
        return fields;
        
    }

    //Metodo para validar la longitud del campo dado
    public static boolean validateLength(String cadena, int length, String message) {
        if (cadena.length() > length) {
            System.out.println(" * " + message + " * ");
            return false;
        }
        return true;
    }

    //Metodo que valida si el ISBN esta escrito correctamente
    public static boolean validateISBN(String isbn){
        String[] formatedISBN = isbn.split("-");
        if(!formatedISBN[0].equalsIgnoreCase("ISBN")){
            System.out.println(" * Debes ingresar un ISBN valido * ");
            return false;
        }
        
        for(int i = 1; i < formatedISBN.length; i++){
            Pattern pattern = Pattern.compile("[a-zA-Z\s]");
            Matcher match = pattern.matcher(formatedISBN[i]);
            
            if(match.find()){
                System.out.println(" * El ISBN contiene letras o espacios en: " + formatedISBN[i] + " * ");
                return false;
            }
            
        }
        
        return true;
    }
    
    //Metodo que da forma al libro obtenido por medio de la busqueda
    public static String formatBook(String data){
        String newString = "";
        String aux = "ISBN: ";
        
        for(int i = 0; i < 30; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nTitulo: ";
        for(int i = 30; i < 130; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nNombre del autor: ";
        for(int i = 130; i < 160; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nApellido paterno del autor: ";
        for(int i = 160; i < 180; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nApellido materno del autor: ";
        for(int i = 180; i < 200; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nEditorial: ";
        for(int i = 200; i < 220; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nAño de edicion: ";
        for(int i = 220; i < 224; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nPaginas: ";
        for(int i = 224; i < 228; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nPrologo por: ";
        for(int i = 228; i < 288; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nGenero: ";
        for(int i = 288; i < 298; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nSintesis: ";
        for(int i = 298; i < 498; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nEdicion N°";
        for(int i = 498; i < 501; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nVolumen: ";
        for(int i = 501; i < 503; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nCapitulos: ";
        for(int i = 503; i < 505; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nNombre del segundo autor: ";
        for(int i = 505; i < 535; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nApellido paterno del segundo autor: ";
        for(int i = 535; i < 555; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        aux = "\nApellido materno del segundo autor: ";
        for(int i = 555; i < 575; i++){
            aux += String.valueOf(data.charAt(i));
        }
        newString += aux;
        
        return newString;
    }
    
}
