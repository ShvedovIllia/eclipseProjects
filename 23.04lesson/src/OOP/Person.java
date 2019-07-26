package OOP;

public class Person {

	String name;
	String gender;
	int age;

	Person(String n, String g, int a){
		name = n;
		gender = g;
		age = a;
	}
	Person(){
		
	}
	
	void breath() {
		System.out.println(name + " is breathing");
	}
	
	void eat (String meal) {
		System.out.println(name + " is eating the " + meal);
	}
	}