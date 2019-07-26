package main;

public class Office implements Worker, Human{
	private String name;
	
	

	public Office(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public void think() {
		System.out.println(name + " is thinking!");
	}

	@Override
	public void work() {
		System.out.println(name + " is working!");
	}

	@Override
	public String toString() {
		return "Office [name=" + name + "]";
	}

	
}
