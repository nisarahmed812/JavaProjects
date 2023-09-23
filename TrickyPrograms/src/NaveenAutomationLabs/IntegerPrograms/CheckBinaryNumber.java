package NaveenAutomationLabs.IntegerPrograms;

public class CheckBinaryNumber {

	public static void main(String[] args) {
		// check the given number is binary or not
		isBinaryNumber(1011);
		isBinaryNumber(23405);
		isBin(1011);
	}

	private static void isBin(int number) {
		if (String.valueOf(number).matches("[0-1]+")) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " not a binary number");
		}
	}

	private static void isBinaryNumber(int number) {
		boolean isBinary = true;
		int copyNumber = number;
		
		while (copyNumber != 0) {
			int rem = copyNumber % 10; // 1011%10->1
			if (rem > 1) {
				isBinary = false;
				break;
			} else {
				copyNumber = copyNumber / 10;
			}
		}
		if (isBinary) {
			System.out.println(number + " is a binary number");
		} else {
			System.out.println(number + " not a binary number");
		}
	}
}
