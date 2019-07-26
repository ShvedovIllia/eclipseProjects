package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {

//		Set<String> names = new TreeSet<>();
//		names.add("Anna");
//		names.add("Vasa");
//		names.add("Yura");
//		names.add("Anton");
//		names.add("Vitalik");
//		names.add("Roman");
//		names.add("Marta");
//		
//		for (String string : names) {
//			System.out.println(string);
//		}
		
		Set<Car> cars = new TreeSet<>(new CarComparatorByVolume().reversed());
			
		cars.add(new Car("Audi A3", 2008, 1.8));
		cars.add(new Car("Audi A3", 2017, 2.0));
		cars.add(new Car("Audi A5", 2014, 3.0));
		cars.add(new Car("BMW 3", 2015, 3.0));
		cars.add(new Car("BMW 3", 2010, 2.0));
		cars.add(new Car("BMW 5", 2012, 3.0));
		cars.add(new Car("BMW 5", 2017, 3.0));
		cars.add(new Car("VW Golf", 2015, 2.0));
		cars.add(new Car("VW Golf", 2015, 1.4));
		cars.add(new Car("VW Golf", 2015, 2.0));
		cars.add(new Car("VW Golf", 2015, 1.8));
		
		List<Car> dealer = new ArrayList<>();
		
		dealer.add(new Car("BMW 3", 2010, 2.0));
		dealer.add(new Car("BMW 5", 2012, 3.0));
		dealer.add(new Car("BMW 5", 2017, 3.0));
		dealer.add(new Car("VW Golf", 2015, 2.0));
		dealer.add(new Car("VW Golf", 2015, 1.4));
		dealer.add(new Car("VW Golf", 2015, 2.0));
		dealer.add(new Car("VW Golf", 2015, 1.8));
		
//		Collections.sort(dealer);
//		for (Car car : dealer) {
//			System.out.println(car);
//		}
//				System.out.println();
//		Collections.sort(dealer, new CarComparatorByVolume());
//		for (Car car : dealer) {
//			System.out.println(car);
//	
//		}
//		System.out.println();
//		Collections.sort(dealer, new CarComparatorByYear());
//		for (Car car : dealer) {
//			System.out.println(car);
//		}
//		
		
		
		
//		for (Car car : cars) {
//			System.out.println(car);
//		}
//		
	}
}
