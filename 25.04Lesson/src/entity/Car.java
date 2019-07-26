package entity;

public class Car {
	private String make;
	private String model;
	private int power;
	private double capacity;
	
	//alt shift S
	
	Car (String make, int power, String model){
		this.make = make;
		this.power = power;
		this.model = model;
	}

	public Car(String make, String model, int power, double capacity) {
		this.make = make;
		this.model = model;
		this.power = power;
		this.capacity = capacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	
}
