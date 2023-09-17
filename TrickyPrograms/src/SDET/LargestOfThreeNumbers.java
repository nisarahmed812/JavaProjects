package SDET;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// with Ternary Operator

		int a = 2;
		int b = 4;
		int c = 8;

		int largest1 = a > b ? a : b;
		int largest2 = c > largest1 ? c : largest1;

		System.out.println(largest2 + " is largest number");

	}

}
