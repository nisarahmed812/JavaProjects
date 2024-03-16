package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import POJO_Classes.Donuts.Batter;
import POJO_Classes.Donuts.Batters;
import POJO_Classes.Donuts.Donuts;
import POJO_Classes.Donuts.DonutsList;
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

		// Create Donut instances and set values
		Donuts donut1 = new Donuts();
		donut1.setId("0001");
		donut1.setType("donut");
		donut1.setName("Cake");
		donut1.setPpu(0.55);
		donut1.setBatters(batters);
		donut1.setTopping(toppingList);

		Donuts donut2 = new Donuts();
		donut2.setId("0002");
		donut2.setType("donut");
		donut2.setName("Chocolate Cake");
		donut2.setPpu(0.65);
		donut2.setBatters(batters);
		donut2.setTopping(toppingList);

		// Create DonutList instance and set the list of donuts
		DonutsList donutList = new DonutsList();
		List<Donuts> donuts = new ArrayList<>();
		donuts.add(donut1);
		donuts.add(donut2);
		donutList.setDonuts(donuts);

		// Access and print values for demonstration
		for (Donuts donut : donutList.getDonuts()) {
			System.out.println("Donut Name: " + donut.getName());
			System.out.println("Batter Type 1: " + donut.getBatters().getBatter().get(0).getType());
			System.out.println("Topping Type 1: " + donut.getTopping().get(0).getType());
		}
	}
}
