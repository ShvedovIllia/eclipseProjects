package main;

public class Body {
	private String color;

	public Body(String color) {
		this.color = color;
	}
	
	public void move() {
		System.out.println("i`m moving");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Body [color=" + color + "]";
	}
	
	

}
