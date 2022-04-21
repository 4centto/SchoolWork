package clases;

public class Square extends Shape{
	public Square(int x) {
		this.width = x;
	}

	@Override
	public void area() {
		System.out.println(this.width * this.width);
	}
}
