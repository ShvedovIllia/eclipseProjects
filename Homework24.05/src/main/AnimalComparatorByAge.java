package main;

import java.util.Comparator;

public class AnimalComparatorByAge implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		
			int res = Integer.compare(o1.getAge(), o2.getAge());
			if (res == 0) {
				res = o1.getName().compareToIgnoreCase(o2.getName());
			}
			if (res == 0) {
				res = o1.getType().name().compareToIgnoreCase(o2.getType().name());
			}
			return res;
		}
		
	

}
