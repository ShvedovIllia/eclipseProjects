package main;

public class Animal {
	private String type;
	private int age;
	private String name;
	private Animal(String type, int age, String name) {
		this.type = type;
		this.age = age;
		this.name = name;
	}
	private Animal () {
		
	}
	@Override
	public String toString() {
		return "Animal [type=" + type + ", age=" + age + ", name=" + name + "]";
	}
	public static Animal con(String type, int age, String name) {
		return new Animal(type, age, name);
	}
	
}
