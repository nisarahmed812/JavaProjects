package SDET;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 7 };
		int b[] = { 6, 4, 5, 7 };

		boolean status = Arrays.equals(a, b);

		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

		System.out.println("--------------------------");

		boolean status2 = true;
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i]) {
					status2 = false;
					break;
				}
			}
		} 

		if (status2 == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

}
