
public class SumMax extends Datos{
	
	int arreglo[];
	
	public void Sumar() {
		PedirDatos();
		arreglo = super.arreglos;
		int aux = 0;
		
		for(int i = 0; i < arreglo.length; i++) {
			aux += arreglo[i];
		}
		
		System.out.println("La suma de todos los numeros es: " + aux);
		
	}
	
	public void Mayor() {
		
		int aux = 0;
		
		for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] > aux) {
				aux = arreglo[i];
			}
		}
		
		System.out.println("El numero mayor es: " + aux);
		
	}
	
}
