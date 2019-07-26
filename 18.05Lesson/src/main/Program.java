package main;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<Car> cars = new HashSet<>();
			
			
		cars.add(new Car("Audi", "A5", 2015, 3.0));
		cars.add(new Car("Audi", "A6", 2012, 3.0));
		cars.add(new Car("Audi", "A1", 2012, 1.4));
		cars.add(new Car("Audi", "A5", 2015, 3.0));
		cars.add(new Car("BMW", "1", 2010, 1.6));
		cars.add(new Car("BMW", "4", 2014, 2.0));
		cars.add(new Car("BMW", "5", 2010, 3.0));
		cars.add(new Car("BMW", "7", 2014, 4.0));
		cars.add(new Car("Seat", "Leon", 2014, 1.6));
		
		Iterator<Car> i1 = cars.iterator();
		
		while (i1.hasNext()) {
			if ()) {
				
			}
		}
	
		
		for (Car car : cars) {
			System.out.println(car);
		}
	}

}
