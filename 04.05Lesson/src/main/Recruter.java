package main;

public class Recruter extends Worker {

	public Recruter(int salary, String name, Adrress adrress) {
		super(salary, name, adrress);
	}

	@Override
	public void work() {
		System.out.println(getName() + " is searching!");
		
	}
	

}
