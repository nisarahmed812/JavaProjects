package NaveenAutomationLabs.IntegerPrograms;

public class StringToInteger {
	// WAP: write a program
	// wap to convert string to integer without using Integer.parseInt() method

	public static int stringToNumber(String str) {
		int num = 0;
		int len = str.length();

		for (int i = 0; i < len; i++) {
			num = num * 10 + ((int) str.charAt(i) - 48); // 0+1=1, 10+2=12, 120+3=123
		}
		return num;
	}

	// use this
	public static int stringToInt(String str) {
		char[] ch = str.toCharArray();
		int num = 0;
		int zeroAsc = (int) '0'; // This line calculates the ASCII value of the character '0'/zero i.e 48
		for (int i = 0; i < ch.length; i++) {
			int asc = (int) ch[i];
			num = num * 10 + (asc - zeroAsc);
		}
		return num;
	}

	public static int singleValueConversion(String str) {
		int value = 0;
		if (str.length() == 1) {
			value = (int) str.charAt(0) - 48;
		}
		return value;
	}

	public static void main(String[] args) {
		String s = "123";
		System.out.println(stringToNumber(s) + 10);
		System.out.println(stringToInt(s) + 10);

		String singleValue = "9";
		System.out.println(singleValueConversion(singleValue) + 10);
	}

}
