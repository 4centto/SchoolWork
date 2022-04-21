
public class ResMin extends SumMax{
	
	int[] arreglo_dos;
	
	public void Restar() {
		
		PedirDatos();
		arreglo_dos = super.arreglos;
		
		int aux = 0;
		for(int i = 0; i < arreglo.length; i++) {
			if(i == 0) {
				aux = arreglo[i];
			} else {
				aux -= arreglo[i];
			}
		}
		
		System.out.println("La resta de todos los numeros es: " + aux);
		
	}
	
	public void Menor() {
		
		int aux = 1000000;
		for(int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] < aux) {
				aux = arreglo[i];
			}
		}
		
		System.out.println("El numero emnor es: " + aux);
		
	}
	
}
