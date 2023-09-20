package SDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter(
				"C:\\Users\\iamni\\git\\JavaProjects\\TrickyPrograms\\src\\SDET\\WriteFile.txt");
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write("Selenium with Java\n");
		writer.write("Selenium with Python\n");
		writer.write("RestAssured with Java\n");

		writer.close();

		System.out.println("Finished Writing");
	}

}
