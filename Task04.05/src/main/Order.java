package main;

public class Order {

	Commodity [] comm = {
			
			new Phone(2000, "Samsung", "Phones"),
			new Phone(2000, "Apple", "Phones"),
			new TV(2000, "Philips", "TV"),
			new TV(2000, "LG", "TV"),	
	};

	for(
	int i = 0;i<comm.lenght;i++)
	{
		comm[i].toString();

	}
}
