package main;

public class Legs {
	
	private int lenght;
	private int size;
	
	public Legs(int lenght, int size) {
		
		this.lenght = lenght;
		this.size = size;
	}
	
	public void run() {
		System.out.println("Legs are running");
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Legs [lenght=" + lenght + ", size=" + size + "]";
	}
	
	
	
	

}
