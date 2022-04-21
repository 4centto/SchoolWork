import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Bowling {
	HashMap<String, Integer> players;
	public Bowling() {
		players = new HashMap<String, Integer>();
	}
	public void addPlayer(String name, int p) {
		players.put(name, p);
	}
	
	public void getWinner() {
		String nombre = "";
		int aux = 0;
		for(Map.Entry<String, Integer> entry : players.entrySet()) {
			if(entry.getValue() > aux) {
				aux = entry.getValue();
				nombre = entry.getKey();
			}
		}
		System.out.print(nombre);
	}
}
