package main;

import java.util.Comparator;

public class CarComparatorByVolume implements Comparator<Car> {

	@Override
	public int compare(Car o1, Car o2) {
		int res = Double.compare(o1.getVolume(), o2.getVolume());
		if (res == 0) {
			res = o1.getModel().compareToIgnoreCase(o2.getModel());
		}
		if (res == 0) {
			res = Double.compare(o1.getYear(), o2.getYear());
		}
		return res;
	}

}
