package NaveenAutomationLabs.IntegerPrograms;

public class ArmstrongNumber {

	// check given number is Armstrong/Narcissistic number
	// pluperfect digital invariant (PPDI) number/ plus perfect number

	public static boolean isArmStrongNumber(int num) {
		if (num < 0) {
			return false;
		}

		int power = power(num);
		int copyNum = num;
		int sum = 0;
		while (copyNum != 0) {
			int lastDigit = copyNum % 10;
			int factor = 1;
			for (int i = 0; i < power; i++) {
				factor = factor * lastDigit;
			}
			sum = sum + factor;
			copyNum = copyNum / 10;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}

	public static int power(int num) {
		int n = 0;
		while (num != 0) {
			n++;
			num = num / 10;
		}
		return n;
	}

	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(0)); // true
		System.out.println(isArmStrongNumber(-1));
		System.out.println(isArmStrongNumber(153)); // true
		System.out.println(isArmStrongNumber(1674));
		System.out.println(isArmStrongNumber(12));
	}

}
