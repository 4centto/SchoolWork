import ico.fes.Persona;

public class UsarPersona{
	public static void main(String[] args){

		System.out.println("Programa usar persona");

		Persona p1 = new Persona();
		Persona p2 = new Persona();

		System.out.println(p1.getNombre());

		p2.setNombre("Ivan");
		System.out.println(p2.getNombre());

		System.out.println("Hola " + p2.getNombre() + " bienvenido");

	}
}