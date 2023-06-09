package pe.tcs.java8.lambda;

import java.util.Comparator;

public class CaloricComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish o1, Dish o2) {
		// TODO Auto-generated method stub
		return  Integer.compare(o1.getCalories() , o2.getCalories());
	}

}
