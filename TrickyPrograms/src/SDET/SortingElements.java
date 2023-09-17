package SDET;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		int a[] = { 2, 6, 1, 4, 9 };
		System.out.println("Arrays before sorting: " + Arrays.toString(a));

		// Approach 1
		Arrays.parallelSort(a);
		System.out.println("Arrays after sorting: " + Arrays.toString(a));

		// Approach 2
		System.out.println("------------------------------------------------");
		int b[] = { 2, 6, 1, 4, 9 };
		System.out.println("Arrays before sorting: " + Arrays.toString(b));

		Arrays.sort(b);
		System.out.println("Arrays after sorting: " + Arrays.toString(b));

		
		// Approach 3 (Descending Order)
		System.out.println("------------------------------------------------");
		Integer c[] = { 2, 6, 1, 4, 9 };
		System.out.println("Arrays before sorting: " + Arrays.toString(c));
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println("Arrays after sorting: " + Arrays.toString(c));
	}

}
