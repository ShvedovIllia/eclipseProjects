package main;

public class Head {
	private String shape;
	
	public Head(String shape) {
		this.shape = shape;
	
	}
	
	public void talk() {
		System.out.println("I`m talking");
	
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	@Override
	public String toString() {
		return "Head [shape=" + shape + "]";
	}
	
	
}
