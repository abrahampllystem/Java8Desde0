package pe.tcs.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Clase2AntesJava8 {

	public static void main(String[] args) {
		
		List<Dish> dishes = Arrays.asList(
				new Dish("pork",800,DishType.MEAT),
				new Dish("beef",700,DishType.MEAT),
				new Dish("chicken",400,DishType.MEAT),
				new Dish("french",530,DishType.OTHER),
				new Dish("rice",350,DishType.OTHER),
				new Dish("season",120,DishType.OTHER),
				new Dish("pizza",550,DishType.OTHER),
				new Dish("prawns",300,DishType.FISH),
				new Dish("salmon",450,DishType.FISH)
			
			);
		
		List<Dish> bajaCalorias = new ArrayList<>();
		for(Dish d : dishes) {
			if(d.getCalories()<300) {
				bajaCalorias.add(d);
			}
			
		}
		
		Collections.sort(bajaCalorias, new Comparator<Dish>() {

			@Override
			public int compare(Dish arg0, Dish arg1) {
				// TODO Auto-generated method stub
				return Integer.compare(arg0.getCalories(), arg1.getCalories());
			}
			
			
		} );
		
		List<String> nombres = new ArrayList<>();
		for(Dish d : bajaCalorias) {
			nombres.add(d.getName());
		}
		
		System.out.println(nombres);
		
	}
}
