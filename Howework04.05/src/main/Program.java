package main;

public class Program {
	public static void main(String[] args) {
		
		Body b = new Body("blue");
		Helm h = new Helm("Oval");
		Whell w = new Whell(20);
		
		Car c = new Car(b, w, h);
		
		c.move();
		System.out.println();
		c.turn();
		System.out.println();
		c.turnAround();
		
	}

	
}
