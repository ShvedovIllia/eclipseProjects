package main;

public class Body {
	
	private String size;

	public Body(String size) {
		this.size = size;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Body [size=" + size + "]";
	}
	
	
	

}
