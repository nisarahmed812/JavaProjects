package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import POJO_Classes.Donuts.Batter;
import POJO_Classes.Donuts.Batters;
import POJO_Classes.Donuts.Donuts;
import POJO_Classes.Donuts.Topping;

public class Donuts_Instance {

	public static void main(String[] args) {
		
		// Create Batter instances and set values
		Batter regularBatter = new Batter();
		regularBatter.setId("1001");
		regularBatter.setType("Regular");

		Batter chocolateBatter = new Batter();
		chocolateBatter.setId("1002");
		chocolateBatter.setType("Chocolate");

		// Create Batters instance and set the list of batters
		Batters batters = new Batters();
		List<Batter> batterList = new ArrayList<>();
		batterList.add(regularBatter);
		batterList.add(chocolateBatter);
		batters.setBatter(batterList);

		// Create Topping instances and set values
		Topping noneTopping = new Topping();
		noneTopping.setId("5001");
		noneTopping.setType("None");

		Topping glazedTopping = new Topping();
		glazedTopping.setId("5002");
		glazedTopping.setType("Glazed");

		// Create a list of toppings
		List<Topping> toppingList = new ArrayList<>();
		toppingList.add(noneTopping);
		toppingList.add(glazedTopping);

		// Create a Donut instance and set values
		Donuts donuts = new Donuts();
		donuts.setId("0001");
		donuts.setType("donut");
		donuts.setName("Cake");
		donuts.setPpu(0.55);
		donuts.setBatters(batters);
		donuts.setTopping(toppingList);

		// Access and print values for demonstration
		System.out.println("Donut Name: " + donuts.getName());
		System.out.println("Batter Type 1: " + donuts.getBatters().getBatter().get(0).getType());
		System.out.println("Topping Type 1: " + donuts.getTopping().get(0).getType());
	}
}
