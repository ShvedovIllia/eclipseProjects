package main;

public abstract class Commodity {
	
private int price;
private String name;
private String category;


public Commodity(int price, String name, String category) {
	this.price = price;
	this.name = name;
	this.category = category;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Commodity [price=" + price + ", name=" + name + ", category=" + category + "]";
}






}
