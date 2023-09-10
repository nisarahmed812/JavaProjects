package RahulShettyAcademy;

public class CountString {

	public static void main(String[] args) {
		// count string occurence

		String name = "aaanjda";
		char character = 'a';
		int count = 0;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == character) {
				count++;
			}
		}

		System.out.println("character is present " + count + " times");
	}

}
