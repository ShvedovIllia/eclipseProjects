package entity;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public Person() {
		System.out.println("Person()");
	}
	public Person(String name, int age, String gender) {
		this();
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println("Person(...)");
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age>=0 && age <=120) {
			this.age = age;
		} else {
			System.out.println("Smth went wrong");
		}
		
	}
	
	public void setGender(String gender) {
		if (gender.toLowerCase().equals("male") || gender.toLowerCase().equals("female")) {
			this.gender = gender;
		} else {
			System.out.println("Smth went wrong");
		}
	}

}
