package main;

public class Whell {
	
	private int diameter;

	public Whell(int diameter) {
		this.diameter = diameter;
	}
	
	public void turnAround() {
		System.out.println("I`m turning around!");
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Whell [diameter=" + diameter + "]";
	}
	
	
	
	

}
