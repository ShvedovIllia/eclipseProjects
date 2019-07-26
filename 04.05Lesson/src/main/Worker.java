package main;

public abstract class Worker {
	
	public static final int HEAD_COUNT;
	
	private static int count = 0;
	
	private final int salary;
	private final String name;
	private final Adrress adrress;
	
	static {
		count = 0;
		HEAD_COUNT = 1;
	}

	public Worker(int salary, String name, Adrress adrress) {
		this.salary = salary;
		this.name = name;
		this.adrress = adrress;
		count++;
	}
	
	public abstract void work();

	public Adrress getAdrress() {
		return adrress;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return "Worker [salary=" + salary + ", name=" + name + ", adrress=" + adrress + "]";
	}

	public static int getCount() {
		return count;
	}
	
	

	
	
	
	

}
