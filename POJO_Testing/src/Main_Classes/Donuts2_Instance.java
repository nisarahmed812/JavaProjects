package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import POJO_Classes.Donuts2.Batter2;
import POJO_Classes.Donuts2.Batters2;
import POJO_Classes.Donuts2.Donuts2;
import POJO_Classes.Donuts2.Donuts2List;
import POJO_Classes.Donuts2.Topping2;

public class Donuts2_Instance {

	public static void main(String[] args) {
		// Create Batter instances and set values
		Batter2 regularBatter = new Batter2();
		regularBatter.setId("1001");
		regularBatter.setType("Regular");

		Batter2 chocolateBatter = new Batter2();
		chocolateBatter.setId("1002");
		chocolateBatter.setType("Chocolate");

		// Create Batters instance and set the list of batters
		Batters2 batters = new Batters2();
		List<Batter2> batterList = new ArrayList<>();
		batterList.add(regularBatter);
		batterList.add(chocolateBatter);
		batters.setBatter(batterList);

		// Create Topping instances and set values
		Topping2 noneTopping = new Topping2();
		noneTopping.setId("5001");
		noneTopping.setType("None");

		Topping2 glazedTopping = new Topping2();
		glazedTopping.setId("5002");
		glazedTopping.setType("Glazed");

		// Create a list of toppings
		List<Topping2> toppingList = new ArrayList<>();
		toppingList.add(noneTopping);
		toppingList.add(glazedTopping);

		// Create Donut instances and set values
		Donuts2 donut1 = new Donuts2();
		donut1.setId("0001");
		donut1.setType("donut");
		donut1.setName("Cake");
		donut1.setPpu(0.55);
		donut1.setBatters(batters);
		donut1.setTopping(toppingList);

		Donuts2 donut2 = new Donuts2();
		donut2.setId("0002");
		donut2.setType("donut");
		donut2.setName("Chocolate Cake");
		donut2.setPpu(0.65);
		donut2.setBatters(batters);
		donut2.setTopping(toppingList);

		// Create DonutList instance and set the list of donuts
		Donuts2List donutList = new Donuts2List();
		List<Donuts2> donuts = new ArrayList<>();
		donuts.add(donut1);
		donuts.add(donut2);
		donutList.setDonuts(donuts);

		// Access and print values for demonstration
		for (Donuts2 donut : donutList.getDonuts()) {
			System.out.println("Donut Name: " + donut.getName());
			System.out.println("Batter Type 1: " + donut.getBatters().getBatter().get(0).getType());
			System.out.println("Topping Type 1: " + donut.getTopping().get(0).getType());
		}
	}
}
