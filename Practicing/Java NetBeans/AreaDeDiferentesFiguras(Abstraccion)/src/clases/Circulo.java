package clases;

public class Circulo extends Formas{
	public Circulo(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int area() {
		this.resultado = this.x + this.y;
		return this.resultado;
	}
}
