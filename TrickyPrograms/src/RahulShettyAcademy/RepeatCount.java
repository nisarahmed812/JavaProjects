package RahulShettyAcademy;
import java.util.ArrayList;

public class RepeatCount {

	public static void main(String[] args) {
		// print unique numbers from the array

		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (!aList.contains(a[i])) {
				aList.add(a[i]);
				count++;

				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
					}
				}
				System.out.println("" + a[i] + " is repeated " + count + " tines");
			}
			
			if (count == 1) {
				System.out.println("Unique number is " + a[i]);
			}
		}
	}

}
