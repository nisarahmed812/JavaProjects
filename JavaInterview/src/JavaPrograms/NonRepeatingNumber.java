package JavaPrograms;

public class NonRepeatingNumber {

	public static void main(String[] args) {
		// print NonRepeatingNumber from the array

		int[] a = { 4, 5, 5, 5, 4, 6, 6, 9, 4 };
		int NonRepeatingNumber = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					NonRepeatingNumber = a[i];
				}
			}
		}
		System.out.println("Non repeating number is: " + NonRepeatingNumber);
	}

}
