package SDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInToTextFile {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\iamni\\git\\JavaProjects\\TrickyPrograms\\src\\SDET\\WriteFile.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Selenium with Java\n");
		bw.write("Selenium with Python\n");
		bw.write("RestAssured with Java\n");

		bw.close();

		System.out.println("Finished Writing");
	}

}
