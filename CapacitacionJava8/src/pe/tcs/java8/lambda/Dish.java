package pe.tcs.java8.lambda;

public class Dish {

	private int calories;
	private String name;
	private DishType dishType;
	
	public Dish(String name,int calories,DishType dishType) {
		this.name = name;
		this.calories = calories;
		this.dishType = dishType;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	public DishType getDishType() {
		return dishType;
	}
}
