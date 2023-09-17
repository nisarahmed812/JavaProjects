package RahulShettyAcademy;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortArray {

	public static void main(String[] args) {
		// sort the array in ascending and descending order
		// This is also called bubble sort

		int a[] = { 2, 6, 1, 4, 9 };
		int temp;

		System.out.println("Arrays before sorting: " + Arrays.toString(a));

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Arrays after sorting: " + Arrays.toString(a));

		System.out.println("--------------------------------------");

		Stream.of(2, 6, 1, 4, 9).sorted().forEach(s -> System.out.print(s + "\t"));

	}

}
