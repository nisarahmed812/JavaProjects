package JavaPrograms;
import java.util.ArrayList;

public class UniqueNumbers {

	public static void main(String[] args) {
		// print unique numbers from the array

		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (!aList.contains(a[i])) {
				aList.add(a[i]);
			}
		}
		for (int unique : aList) {
			System.out.println("Unique numbers are: " + unique);
		}
	}

}
