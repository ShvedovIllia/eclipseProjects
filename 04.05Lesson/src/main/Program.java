package main;

public class Program {
	public static void main(String[] args) {
	
		Worker worker = new Developer(500, "Anna", new Adrress("Lviv", "Franka"));
//		System.out.println(worker.getSalary());
//		worker.salary = 400; спіткала невдача...
//		
//		worker.getName().toUpperCase();
//		System.out.println(worker.getName());
//		
//		worker.getAdrress().setCity("Odesa");
//		worker.getAdrress().setStreet("Pushkina");
//		
//		System.out.println(worker.toString());
		
//		System.out.println(Worker.count);
//		Worker.count = 234;
//		System.out.println(Worker.count);
		
		Developer dev = new Developer(2000, "Ihor", new Adrress ("Lviv", "Franka"))	;
		System.out.println(Worker.getCount());
		
		Worker[] workers = {
				worker,
				dev,
				new Recruter(500, "anna", new Adrress ("Lviv", "Franka")),
				new Recruter(800, "Ivan", new Adrress ("Lviv", "Franka"))
		};
		
		for(int i = 0; i<workers.length; i++) {
			workers[i].work();
		}
		
		int sum = 0;
		for (int i = 0; i<workers.length; i++) {
			sum+= workers[i].getSalary();
		}
		
		System.out.println(sum);
		
		
	}
	
}
