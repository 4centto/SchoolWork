package listasadt1358;

import ico.fes.unam.edd1358.LinkedListADT;
import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.DoubleLinkedList;
import ico.fes.unam.edd1358.LinkedListADT.Nodo;

public class ListasADT1358 {
    public static void main(String[] args) {
       
        LinkedListADT lsl = new LinkedListADT();
        lsl.append("Ivan");
        lsl.append("Angel");
        lsl.append("Daniel");
        lsl.append("Eduardo");
        lsl.prepend("Luis");
        lsl.transversal();
        
        Nodo nodo = lsl.pop();
        System.out.println(nodo.getData().toString());
        
        nodo = lsl.popFirst();
        System.out.println(nodo.getData().toString());
        
        lsl.remove("Luis");
        lsl.transversal();
        
        lsl.remove("Eduardo");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        //Objeto empleado
        lsl2.append(new Empleado(2, "Jose", "Perez", "Garcia", 1850.5f, 2015, 4));
        lsl2.append(new Empleado(3, "Ivan", "Michel", "Garcia", 2000.5f, 2018, 2));
        lsl2.append(new Empleado(4, "Daniel", "Garcia", "Cordova", 1500.5f, 2013, 5));
        lsl2.prepend(new Empleado(1, "Angel", "Avila", "Garcia", 2000.8f, 2010, 10));
        
        //Imprimir la lista completa de los empleados
        lsl2.transversal();
        
        //Obtener el primer nodo
        nodo = lsl2.popFirst();
        System.out.println("\n " + nodo.getData().toString());
        
        //Obtener el ultimo valor
        nodo = lsl2.pop();
        System.out.println("\n " + nodo.getData().toString());
        
        //Quitar un valor de la lista
        System.out.println("\n\nMetodo para remover elementos.\n");
        lsl2.remove(new Empleado(1, "Angel", "Avila", "Garcia", 2000.8f, 2010, 10));
        
        System.out.println("\n\n");
        lsl2.transversal();
        
        System.out.println("\n\n\n");
        System.out.println(" - LISTAS DOBLEMENTE LIGADAS - ");
        
        DoubleLinkedList dll = new DoubleLinkedList();
        System.out.println("El tamaño es de: " + dll.getSize() + " elementos.");
        System.out.println("Esta vacia: " + dll.isEmpty() + "\n\n");
        
        //Objeto empleado
        dll.append(new Empleado(1, "Angel", "Avila", "Garcia", 2000.8f, 2010, 10));
        dll.append(new Empleado(2, "Jose", "Perez", "Garcia", 1850.5f, 2015, 4));
        dll.append(new Empleado(3, "Ivan", "Michel", "Garcia", 2000.5f, 2018, 2));
        dll.append(new Empleado(4, "Daniel", "Garcia", "Cordova", 1500.5f, 2013, 5));
        
        //Lectura normal
        System.out.println(" - - - Lectura Normal - - - ");
        dll.transversal();
        
        //Lectura al reves
        System.out.println(" - - - Lectura al Reves - - - ");
        dll.reverseTransversal();
        
        System.out.println("\n\nEl tamaño es de: " + dll.getSize() + " elementos.");
        System.out.println("Esta vacia: " + dll.isEmpty());
        
        System.out.println(dll.findFromTail(new Empleado(1, "Angel", "Avila", "Garcia", 2000.8f, 2010, 10)));
        System.out.println(dll.findFromHead(new Empleado(4, "Daniel", "Garcia", "Cordova", 1500.5f, 2013, 5)));
        
        dll.removeFromHead(new Empleado(1, "Angel", "Avila", "Garcia", 2000.8f, 2010, 10));
        dll.removeFromTail(new Empleado(4, "Daniel", "Garcia", "Cordova", 1500.5f, 2013, 5));
        
        System.out.println("\n\n");
        dll.transversal();     

    }
}
