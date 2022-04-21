package clases;

public class Circle extends Shape{
	
	public Circle(int y) {
		this.width = y;
	}
	
	@Override
	public void area() {
		System.out.println(Math.PI * (this.width * this.width));
	}
	
}
