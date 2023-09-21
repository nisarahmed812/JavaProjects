package SDET;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		// Approach 1
		String systemPath = System.getProperty("user.dir");
		FileReader fileReader = new FileReader(systemPath + "\\src\\SDET\\DataFile.txt");
		
		BufferedReader reader = new BufferedReader(fileReader);
		String currLine = reader.readLine().trim(); // remove before and after space from line
		
		while (currLine != null) {
			System.out.println(currLine);
			currLine = reader.readLine();
		}
		reader.close();

		// Approach 2
		File file = new File(systemPath + "\\src\\SDET\\DataFile.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

		// Approach 3
		File file2 = new File(systemPath + "\\src\\SDET\\DataFile.txt");
		Scanner sc2 = new Scanner(file);

		sc2.useDelimiter("\\Z");
		System.out.println(sc2.next());
	}

}
