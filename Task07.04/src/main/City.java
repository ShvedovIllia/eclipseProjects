package main;

public class City implements Animal {
	private String name;
	
	public City(String name) {
		this.name = name;
	}

	@Override
	public void eat(String meal) {
		
	}
	

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}

	@Override
	public void breathe() {
		System.out.println(name + " is breathing!");
		
	}

}
