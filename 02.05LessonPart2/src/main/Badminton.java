package main;

public class Badminton {
	
	private String equipment;
	private int players;
	public Badminton(String equipment, int players) {
		this.equipment = equipment;
		this.players = players;
	}
	public String getEquipment() {
		return equipment;
	}
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}
	public int getPlayers() {
		return players;
	}
	public void setPlayers(int players) {
		this.players = players;
	}
	@Override
	public String toString() {
		return "Badminton [equipment=" + equipment + ", players=" + players + "]";
	}
	
	
	

}
