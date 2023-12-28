package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import POJO_Classes.Donuts3.Batter3;
import POJO_Classes.Donuts3.Batters3;
import POJO_Classes.Donuts3.Topping3;
import POJO_Classes.Donuts3.Donuts3;
import POJO_Classes.Donuts3.Donuts3List;

public class Donuts3_Instance {

	public static void main(String[] args) {
		// Create Batter instances and set values
		Batter3 regularBatter = new Batter3();
		regularBatter.setId("1001");
		regularBatter.setType("Regular");

		Batter3 chocolateBatter = new Batter3();
		chocolateBatter.setId("1002");
		chocolateBatter.setType("Chocolate");

		// Create Batters instance and set the list of batters
		Batters3 batters = new Batters3();
		List<Batter3> batterList = new ArrayList<>();
		batterList.add(regularBatter);
		batterList.add(chocolateBatter);
		batters.setBatter(batterList);

		// Create Topping instances and set values
		Topping3 noneTopping = new Topping3();
		noneTopping.setId("5001");
		noneTopping.setType("None");

		Topping3 glazedTopping = new Topping3();
		glazedTopping.setId("5002");
		glazedTopping.setType("Glazed");

		// Create a list of toppings
		List<Topping3> toppingList = new ArrayList<>();
		toppingList.add(noneTopping);
		toppingList.add(glazedTopping);

		// Create Item instances and set values
		Donuts3 item1 = new Donuts3();
		item1.setId("0001");
		item1.setType("donut");
		item1.setName("Cake");
		item1.setPpu(0.55);
		item1.setBatters(batters);
		item1.setTopping(toppingList);

		Donuts3 item2 = new Donuts3();
		item2.setId("0002");
		item2.setType("donut");
		item2.setName("Chocolate Cake");
		item2.setPpu(0.65);
		item2.setBatters(batters);
		item2.setTopping(toppingList);

		// Create Items instance and set the list of items
		Donuts3List items = new Donuts3List();
		List<Donuts3> itemList = new ArrayList<>();
		itemList.add(item1);
		itemList.add(item2);
		items.setItem(itemList);

		// Access and print values for demonstration
		for (Donuts3 item : items.getDonuts()) {
			System.out.println("Item Name: " + item.getName());
			System.out.println("Batter Type 1: " + item.getBatters().getBatter().get(0).getType());
			System.out.println("Topping Type 1: " + item.getTopping().get(0).getType());
		}
	}
}
