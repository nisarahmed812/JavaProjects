package Main_Classes;

import java.util.ArrayList;
import java.util.List;

import POJO_Classes.ColorsBundle.ColorsBundle;
import POJO_Classes.ColorsBundle.ColorsBundleList;

public class ColorsBundle_Instance {

	public static void main(String[] args) {
		// Create ColorInfo instances
		ColorsBundle red = new ColorsBundle();
		red.setColor("red");
		red.setValue("#f00");

		ColorsBundle green = new ColorsBundle();
		green.setColor("green");
		green.setValue("#0f0");

		ColorsBundle blue = new ColorsBundle();
		blue.setColor("blue");
		blue.setValue("#00f");

		// Create a list of ColorInfo instances
		List<ColorsBundle> colorList = new ArrayList<>();
		colorList.add(red);
		colorList.add(green);
		colorList.add(blue);

		// Create a ColorList instance and set the colorList
		ColorsBundleList colorListWrapper = new ColorsBundleList();
		colorListWrapper.setColorList(colorList);

		// Access and print values for demonstration
		List<ColorsBundle> retrievedColorList = colorListWrapper.getColorsBundleList();
		for (ColorsBundle colorInfo : retrievedColorList) {
			System.out.println("Color: " + colorInfo.getColor());
			System.out.println("Value: " + colorInfo.getValue());
		}
	}
}
