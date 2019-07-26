package main;

public class Developer extends Worker {

	public Developer(int salary, String name, Adrress adrress) {
		super(salary, name, adrress);
	}
	
	public void work() {
		System.out.println(getName() + " is coding!");
	}

	@Override
	public String toString() {
		return "Developer [getAdrress()=" + getAdrress() + ", getSalary()=" + getSalary() + ", getName()=" + getName()
				+ "]";
	}

}
