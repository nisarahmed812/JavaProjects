package Main_Classes;

import POJO_Classes.ColorInfo;

public class Color_Instance {

	public static void main(String[] args) {
		// Create an instance of ColorInfo and set values
		ColorInfo colorInfo = new ColorInfo();
		colorInfo.setColor("red");
		colorInfo.setValue("#f00");

		// Access and print the values for demonstration
		System.out.println("Color: " + colorInfo.getColor());
		System.out.println("Value: " + colorInfo.getValue());
	}
}
