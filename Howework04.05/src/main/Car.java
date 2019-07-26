package main;

public class Car {
	
	private Body b;
	private Whell w;
	private Helm h;
	
	public Car (Body b, Whell w, Helm h) {
		this.b = b;
		this.h= h;
		this.w = w;
	}
	
	public void move() {
		b.move();
	}
	
	public void turnAround() {
		w.turnAround();
	}
	
	public void turn() {
		h.turn();
	}

}
