package main;

public class Person {
	
	private static int counter;

	private String name;
	@Random
	private int age;
	
	public String gender;
	
	public Person() {
		
	}
	public Person(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	

}
