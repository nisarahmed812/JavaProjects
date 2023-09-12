package NaveenAutomationLabs.StarPatternLogic;

public class SimilarAlphabetPattern {

	public static void main(String[] args) {

		int alpha = 65; // 65=A // 97=a

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) alpha + " ");
			}
			alpha++;
			System.out.println("");
		}

	}

}
