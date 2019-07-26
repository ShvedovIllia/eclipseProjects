package main;

public class Garage {
	private Venicle venicle;

	public Garage() {
	}
	
	public void turnOnVenicle() {
		if (venicle != null) {
			venicle.turnOn();
		} else {
			System.out.println("There is no venicle");
		}
	}
	
	public void turnOffVenicle() {
		if (venicle != null) {
			venicle.turnOff();
		} else {
			System.out.println("There is no venicle");
		}
	}

	public Venicle getVenicle() {
		return venicle;
	}

	public void setVenicle(Venicle venicle) {
		this.venicle = venicle;
	}
	
	
	
	
}
