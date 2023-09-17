package SDET;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // should be in sorted order
		boolean flag = false;

		int key = 7;

		int l = 0; // 0th position
		int h = a.length - 1; // last position

		while (l <= h) {
			int m = (l + h) / 2; // mid position
			if (key == a[m]) {
				System.out.println("Element Found");
				flag = true;
				break;
			}

			if (key > a[m]) { // key greater than mid
				l = m + 1; // l moving right side
			}

			if (key < a[m]) { // key less than mid
				h = m - 1; // l moving left side
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}

		// Approach2
		System.out.println(Arrays.binarySearch(a, 100)); // it will display value at 8th position
	}

}
