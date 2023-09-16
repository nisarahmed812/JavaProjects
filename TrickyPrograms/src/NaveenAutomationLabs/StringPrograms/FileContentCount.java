package NaveenAutomationLabs.StringPrograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileContentCount {

	static String path = "C:\\Users\\iamni\\git\\JavaProjects\\TrickyPrograms\\src\\NaveenAutomationLabs\\StringPrograms\\FileContentCount.txt";

	public static void main(String[] args) throws IOException {
		// count total chars, words and lines in a given file

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		BufferedReader reader = new BufferedReader(new FileReader(path));
		String currLine = reader.readLine().trim(); // remove before and after space from line
		while (currLine != null) {
			lineCount++;

			// words
			String[] words = currLine.split(" ");
			wordCount = wordCount + words.length;

			// line
			for (String word : words) {
				charCount = charCount + word.length();
			}
			currLine = reader.readLine();
		}
		System.out.println("total lines: " + lineCount);
		System.out.println("total words: " + wordCount);
		System.out.println("total chars: " + charCount);
	}

}
