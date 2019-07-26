package entity;

public class Robot {
	private int h;
	private int v;
	
	public Robot(int h, int v) {
		this.h=h;
		this.v=v;
	}
	
	public void moveH() {
		h++;
	}
	public void moveV() {
		v++;
	}
	
	public int getHor() {
		return h;
	}
	public int getVer() {
		return v;
	}
	
}
