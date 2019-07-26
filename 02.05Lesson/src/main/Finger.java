package main;

public class Finger {
	
	private int lenght;
	private int thickness;
	public Finger(int lenght, int thickness) {
		this.lenght = lenght;
		this.thickness = thickness;
	}
	
	public void bends() {
		System.out.println("I`m bedns)))");
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getThickness() {
		return thickness;
	}
	public void setThickness(int thickness) {
		this.thickness = thickness;
	}
	@Override
	public String toString() {
		return "Finger [lenght=" + lenght + ", thickness=" + thickness + "]";
	}
	
	
	
	
	
	
	
	

}
