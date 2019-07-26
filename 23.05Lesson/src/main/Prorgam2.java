package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Prorgam2 {
	public static void main(String[] args) {
//		
//	Map <String, Car> cars = new HashMap<>();
//	List<Car> list1 = new ArrayList<>();
//	list1.add(new Car("Audi Q3", 2015, 2.0));
//	list1.add(new Car("Audi A3", 2015, 2.0));
//	cars.put("Ivan", (Car) list1);
//	
//	List<Car> list2 = new ArrayList<>();
//	list2.add(new Car("VW Passat", 2010, 1.6));
//	cars.put("Roman", (Car) list2);
//	
//	cars.put("Anton", null);
//	
//	Iterator<Map.Entry<String, Car>> i = cars.entrySet().iterator();
//	while (i.hasNext()) {
//		Map.Entry<String, List<Car>> el = i.next();
//		System.out.println(el.getKey());
//		
//		if (el.getValue() != null)
//			for(Car car : el.getValue()) {
//				System.out.println(car);
//			}
//	}
	
		
		Map<String, Car> autofans = new HashMap<>();
		List<Car> list1 = new ArrayList<>();
		list1.add(new Car ("Audi A4", 2010, 1.6));
		list1.add(new Car ("Audi A6", 2014, 1.8));
		list1.add(new Car ("Audi A8", 2015, 2.0));
		autofans.put("Anton", (Car) list1);
		
		List<Car> list2 = new ArrayList<>();
		list2.add(new Car ("Zhygul 1", 1990, 1.6));
		list2.add(new Car ("Zhygul 5", 1985, 1.8));
		list2.add(new Car ("Zhygul 8", 1980, 1.6));
		autofans.put("Ivan", (Car) list2);
		
		List<Car> list3 = new ArrayList<>();
		list3.add(new Car ("VW Passat", 2010, 1.6));
		list3.add(new Car ("VW Polo", 2014, 1.8));
		autofans.put("Ihor", (Car) list3);
		
		autofans.put("Roman", null);
	
	

}
	
}
