package main;

public interface Venicle extends Moveable {
	void turnOn();
	void turnOff();
	
	default void goingFast() {
		System.out.println("from interface ven");
	}
}
