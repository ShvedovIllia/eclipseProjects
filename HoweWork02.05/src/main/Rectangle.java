package main;

public class Rectangle extends Figure {
	
	private int lenght;
	private int wight;
	
	public Rectangle(int lenght, int wight) {
		this.lenght = lenght;
		this.wight = wight;

	}
	
	public int area() {
		return lenght*wight;
	}
	public int perimeter () {
		return (lenght + wight) * 2;
	}

}
