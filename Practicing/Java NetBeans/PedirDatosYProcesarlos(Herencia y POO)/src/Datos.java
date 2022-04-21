import java.util.Scanner;

public class Datos {
	
	int[] arreglos;
	
	public void PedirDatos() {
		
		Scanner in = new Scanner(System.in);
		int[] numeros = new int[10];
		
		for(int i= 0; i < numeros.length; i++) {
			System.out.print("Dame el numero " + (i + 1) + ": ");
			numeros[i] = in.nextInt();
		}
		
		arreglos = numeros;
	}

}
