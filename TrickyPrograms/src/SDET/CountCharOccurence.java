package SDET;

public class CountCharOccurence {

	public static void main(String[] args) {
		String str = "Java programming java oops";
		int stringLength = str.length();
		int lengthAfterRemovingChar = str.replace("p", "").length();

		int totalCount = stringLength - lengthAfterRemovingChar;
		System.out.println("Char occurence is " + totalCount);
	}

}
