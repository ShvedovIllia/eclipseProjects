package main;

public class Person {
	private Head head;
	private Body body;
	private Legs legs;
	private Ear ear;
	private Finger finger;
	
	public Person(Head head, Body body, Legs legs, Ear ear, Finger finger) {
		this.head = head;
		this.body = body;
		this.legs = legs;
		this.ear = ear;
		this.finger = finger;
		
	}
	
	public void bends() {
		finger.bends();
	}
	
	public void hear() {
		ear.hear();
	}
	
	public void run() {
		legs.run();
	}
	
	public void setBodySize(String size) {
		body.getSize();
	}

	public Head getHead() {
		return head;
	}

	public Body getBody() {
		return body;
	}

	public Legs getLegs() {
		return legs;
	}

	@Override
	public String toString() {
		return "Person [head=" + head + ", body=" + body + ", legs=" + legs + "]";
	}
	
	

}
