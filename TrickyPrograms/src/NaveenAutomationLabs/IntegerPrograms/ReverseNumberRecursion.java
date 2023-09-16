package NaveenAutomationLabs.IntegerPrograms;

public class ReverseNumberRecursion {

	public static void main(String[] args) {
		rev(12345);

	}

	private static void rev(int number) {
		if (number < 10) {
			System.out.print(number);
			return;
		} else {
			System.out.print(number % 10); // 12345%10
			rev(number / 10);
		}

	}

}
