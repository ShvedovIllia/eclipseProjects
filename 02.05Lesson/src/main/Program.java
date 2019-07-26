package main;

public class Program {
	public static void main(String[] args) {
		Head head = new Head("Circle");
		Body body = new Body("L");
		Legs legs = new Legs(100,40);
		Ear ear = new Ear("long");
		Finger finger = new Finger(10, 2);
		Person person1 = new Person (head, body, legs, ear, finger);
		
		System.out.println(person1);
//		
//		person1.getLegs().run();
//		person1.run();
		person1.hear();
		person1.bends();
		
		
		
		person1.setBodySize("XL");
	}

}
