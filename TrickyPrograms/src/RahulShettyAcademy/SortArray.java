package RahulShettyAcademy;

import java.util.stream.Stream;

public class SortArray {

	public static void main(String[] args) {
		// sort the array in ascending and descending order
		int a[] = { 2, 6, 1, 4, 9 };
		int temp;

		Stream.of(2, 6, 1, 4, 9).sorted().forEach(s -> System.out.println(s));

		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
