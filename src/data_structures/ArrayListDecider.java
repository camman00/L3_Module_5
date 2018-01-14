package data_structures;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDecider {
	static ArrayList<Food> avFood = new ArrayList<Food>();
	public static void main(String[] args) {
		avFood.add(new Food("pizza"));
		avFood.add(new Food("brownie"));
		avFood.add(new Food("watermelo"));
		System.out.println(avFood.get(new Random().nextInt(avFood.size())));
	}
}
class Food {
	private String name;
	public Food(String name) {
		this.setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}