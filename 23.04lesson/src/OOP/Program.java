package OOP;

public class Program {

	public static void main(String[] args) {
//		Person p1 = new Person();
//		p1.name = "Ihor";
//		p1.age = 88;
//		p1.gender = "Male";
//		Person p2 = p1;
//		
//		System.out.println(p1.name);
//		p2.name = "Ivan";
//		System.out.println(p1.name);
//		Person p3 = new Person ("Yura", "Male", 22);
//		
//		p3.breath();
//		
//		p3.eat("chicken");
//	
//		Person person = new Person ();
//		System.out.println(person.name);
//		person.name = "Andriy";
//		if (person.name != null)
//		System.out.println(person.name.toUpperCase());
		
		Phone iPhone = new Phone() ;
		
		Phone Samsung = new Phone("yellow", 500, "S6"));
		
		System.out.println(iPhone.color + " " + iPhone.model + ". It cost " + iPhone.price + " $");
		
			iPhone.makePhoto(20);
			iPhone.ring("Sharmanka");
			iPhone.netSurf();
			
			System.out.println(Samsung.color + " " + Samsung.model + ". It cost " + Samsung.price + " $");
			
	}

}
