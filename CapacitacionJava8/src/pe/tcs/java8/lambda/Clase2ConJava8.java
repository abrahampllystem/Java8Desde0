package pe.tcs.java8.lambda;

import java.util.Arrays;
import static java.util.Comparator.comparing;

import java.util.List;
import static java.util.stream.Collectors.toList;

public class Clase2ConJava8 {

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
				
		List<String> nombres = dishes.stream()
				.filter(d -> d.getCalories()<400)
				.sorted(comparing(Dish::getCalories))
				.map(Dish::getName)
				.collect(toList());
		
		nombres.forEach(System.out::println);
								

	}

}
