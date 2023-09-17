package SDET;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		int[] a = { 50, 30, 40, 20, 60, 10, 80 };
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Max number in Array is: " + max);
		System.out.println("Max number in Array is: " + min);
	}

}
