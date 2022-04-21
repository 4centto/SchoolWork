package clases;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		
		Square a = new Square(x);
		Circle b = new Circle(y);
		
		a.area();
		b.area();

	}

}
