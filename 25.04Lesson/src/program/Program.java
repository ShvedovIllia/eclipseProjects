package program;

import entity.Counter;
import entity.Person;

public class Program {

	public static void main(String[] args) {
//	Person p = new Person ("Ivan", 23, "male");
//	
//	System.out.println(p.getName());
	
		
	Counter personCounter = new Counter();
	Person p = new Person();
	personCounter.increment();
	
	Person p2 = new Person();
	personCounter.increment();
	
	System.out.println(personCounter.getCount());
	
//	
//	Counter c = new Counter();
//	
//	c.increment ();
//	System.out.println(c.getCount());
	
	}

}
