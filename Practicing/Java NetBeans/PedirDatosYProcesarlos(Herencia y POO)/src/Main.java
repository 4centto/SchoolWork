
public class Main {

	public static void main(String[] args) {
		
		//Primero se ejecutan la suma y el numero mayor
		SumMax sm = new SumMax();
		sm.Sumar();
		sm.Mayor();
		
		//Luego se ejecutaran la resta y el numero menor
		ResMin rm = new ResMin();
		rm.Restar();
		rm.Menor();

	}

}
