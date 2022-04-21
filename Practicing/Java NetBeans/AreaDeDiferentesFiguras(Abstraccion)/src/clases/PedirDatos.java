package clases;

import java.util.Scanner;

public class PedirDatos {
	
	public static String Pedir() {
		String datos = "";
		Scanner in = new Scanner(System.in);
		
		System.out.println("Dame un valor: ");
		datos += in.nextLine();
		
		System.out.print("Dame otro valor:");
		datos += "," + in.nextLine();
		
		return datos;
	}
	
}
