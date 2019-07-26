package main;

public class Car implements Moveable, Venicle {
	
	private int posX;
	private int posY;
	private boolean active;
	
	public void move(int x, int y) {
		posX += x;
		posY += y;
		System.out.println("moved to: x= " + posX + ", y = "+ posY);
		
	}
	@Override
	public void turnOn() {
		active = true;
		System.out.println("Engine start!");
		
	}
	@Override
	public void turnOff() {
		active = false;
		System.out.println("Engine stop!");
		
	}
	@Override
	public String toString() {
		return "Car [posX=" + posX + ", posY=" + posY + ", active=" + active + "]";
	}
	
	
}
