package main;

public class Program {
	public static void main(String[] args) {
//		Moveable car = new Car();
//		car.move(234, 342);
//		car.move(24, 34);
//		
//		Venicle venicle = new Car();
//		venicle.turnOn();
//		venicle.turnOff();
		
		Garage g = new Garage();
		System.out.println(g.getVenicle());
		
		g.turnOnVenicle();
		
		g.setVenicle(new Plane(747));
		g.getVenicle().turnOn();
		
		g.turnOnVenicle();
		g.turnOffVenicle();
		
		Venicle v = new Plane (34);
		v.turnOn();
		Moveable m = new Plane (45);
		m.move(40, 45);
		v.goingFast();
		
		Venicle ve = new SportCar();
		ve.goingFast();
	}
	
}
