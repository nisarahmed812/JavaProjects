package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import POJO_Classes.Values;

public class Values_Instance {

	public static void main(String[] args) {
		// Create a list of integers
		List<Integer> intList = new ArrayList<>();
		intList.add(100);
		intList.add(500);
		intList.add(300);
		intList.add(200);
		intList.add(400);

		// Create an instance of IntArray and set the list of integers
		Values intArray = new Values();
		intArray.setValues(intList);

		// Access and print the values for demonstration
		List<Integer> retrievedValues = intArray.getValues();
		for (Integer value : retrievedValues) {
			System.out.println("Value: " + value);
		}
	}
}
