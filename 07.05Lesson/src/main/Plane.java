package main;

public class Plane implements Venicle{
	
	private int number;
	private int posX;
	private int posY;
	private boolean active;
	
	
	public Plane(int number) {
		this.number = number;
	}
	public void move(int x, int y) {
		posX += x;
		posY += y;
		System.out.println(number + "moved to: x= " + posX + ", y = "+ posY);
		
	}
	@Override
	public void turnOn() {
		active = true;
		System.out.println( number + "Engine start!");
		
	}
	@Override
	public void turnOff() {
		active = false;
		System.out.println( number + "Engine stop!");
		
	}
	@Override
	public String toString() {
		return "Plane [number=" + number + ", posX=" + posX + ", posY=" + posY + ", active=" + active + "]";
	}
	
	
}