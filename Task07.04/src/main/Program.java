package main;

public class Program {

	public static void main(String[] args) {

		City [] animals = {
			new City ("lion"),
			new City ("tiger"),
			new City ("monkey")
		};
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].toString());
		}
		
		animals[0].breathe();
		
		
		Worker [] workers = {
				
				new Office ("Ivan"),
				new Office("Ihor"),
				new Office ("Roman"),
		};
		for (int i = 0; i < workers.length; i++) {
			System.out.println(workers[i].toString());
		}
		
		workers[0].work();
	}

}
