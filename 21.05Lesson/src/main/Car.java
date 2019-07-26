package main;

public class Car implements Comparable<Car>{
	private String model;
	private int year;
	private double volume;
	public Car(String model, int year, double volume) {
		this.model = model;
		this.year = year;
		this.volume = volume;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	
	
	@Override
	public int compareTo(Car o) {
		
		int res = model.compareTo(o.model);
		if(res==0) {
			res=Double.compare(volume, o.volume);
		}
		if (res==0) {
			res = Integer.compare(year, o.year);
		}
		
		return res;
	}
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", volume=" + volume + "]";
	}
	
	
	
}
