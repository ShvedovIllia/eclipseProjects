package OOP;

public class Phone {
	
	String color = "black";
	int price = 1000;
	String model = "iPhone X";
	
	Phone (String c, int p, String m){
		c = color;
		p = price;
		m = model;
	}
	
	Phone (){
		
	}

	
	void ring(String melody) {
		System.out.println(model + " can ring " + melody);
	}

	void makePhoto (int mpx) {
		System.out.println(model + " can make photos on " + mpx + " mpx camera");
	}
	void netSurf () {
		System.out.println("You can surfing the net on " + model);
	}
}
