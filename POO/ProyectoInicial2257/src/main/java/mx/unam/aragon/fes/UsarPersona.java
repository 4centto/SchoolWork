package mx.unam.aragon.fes;

public class UsarPersona {
    public static void main(String[] args) {
        
        System.out.println("Programa usar persona");
        
        Persona p = new Persona();
        Persona p2 = new Persona();
        
        System.out.println(p.getNombre());
        
        p2.setNombre("Ivan");
        System.out.println(p2.getNombre());
        System.out.println(p2.toString());
        p2.setEdad(18);
        System.out.println(p2.toString());
        
    }
}