package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map <String, Car> cars = new HashMap<>();
//		
//		cars.size();
//		cars.isEmpty();
//		cars.clear();
		
//		System.out.println(cars);
//		
//		Scanner scan = new Scanner(System.in);
//		
//		String name = scan.nextLine();
//		
//		for(String key : cars.keySet()) {
//			if(cars.get(key) == name) {
//				System.out.println(key);
//				System.out.println(cars.get(key));
//			}
//		}
		
		
		
		Iterator<String> i = cars.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			if(cars.get(key).getMake().contains("BMW")) {
				i.remove();
			}
	}
//		for(String key : cars.keySet()) {
//			System.out.println(key);
//			System.out.println(cars.get(key));
//		}
		 
		Iterator<Map.Entry<String, Car>> it = cars.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String, Car> el = it.next();
			if(el.getValue().getVolume() > 2.0) {
				it.remove();
			}
		}
		
		for(String key : cars.keySet()) {
			System.out.println(key);
			System.out.println(cars.get(key));
		}
		
//		for(Car car : cars.values()) {
//			System.out.println(car);
//		}
		
		
	}

}
