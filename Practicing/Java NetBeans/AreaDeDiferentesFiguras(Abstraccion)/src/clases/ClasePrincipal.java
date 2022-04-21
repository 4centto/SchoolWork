package clases;

public class ClasePrincipal {

	public static void main(String[] args) {
		
		//Primero obtenemos los datos de la clase que los va a pedir
		String[] datos = PedirDatos.Pedir().split(",");
		
		//Se converten los datos obtenidos
		int x = Integer.parseInt(datos[0]);
		int y = Integer.parseInt(datos[1]);
		
		//Se imprime el area del cuadrado
		Cuadrado c = new Cuadrado(x, y);
		System.out.println("Area de un cuadrado: " + c.area());
		
		// Se imprime el area del circulo
		Circulo ci = new Circulo(x, y);
		System.out.print("Suma de los dos numeros: " + ci.area());
		
	}

}
