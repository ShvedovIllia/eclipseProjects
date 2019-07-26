package main;

import java.io.Serializable;

public class Commodity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8905870944671367309L;
	private String name;
	private String price;
	private String category;
	public Commodity(String name, String price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return name + "---" + price + "---" + category;
	}
	

	
	
	

}
