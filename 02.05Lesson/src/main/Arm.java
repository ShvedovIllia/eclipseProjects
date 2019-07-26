package main;

public class Arm {
	private int lenght;

	public Arm(int lenght) {
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public String toString() {
		return "Arm [lenght=" + lenght + "]";
	}
	
	
	

}
