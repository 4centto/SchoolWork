import java.util.Scanner;

public class JuegoDeBolos {

	public static void main(String[] args) {
		
		Bowling game = new Bowling();
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			String input = in.nextLine();
			String[] values = input.split(" ");
			String name = values[0];
			int points = Integer.parseInt(values[1]);
			
			game.addPlayer(name, points);
		}
		
		game.getWinner();

	}

}
