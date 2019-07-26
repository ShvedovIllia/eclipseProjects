package main;

import java.util.Comparator;

public class CarComparatorByYear implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		int res = Integer.compare(o1.getYear(), o2.getYear());
		if(res==0) {
			res= o1.getModel().compareToIgnoreCase(o2.getModel());
			}
		if(res==0) {
			res=Double.compare(o1.getVolume(), o2.getVolume());
		}
		return res;
	}

}
