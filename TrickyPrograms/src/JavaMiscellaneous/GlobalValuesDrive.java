package JavaMiscellaneous;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {

		String systemPath = System.getProperty("user.dir"); // Get the current working directory
		FileInputStream fis = new FileInputStream(systemPath + "\\src\\JavaMiscellaneous\\data.properties");

		Properties properties = new Properties();
		properties.load(fis);

		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		properties.setProperty("browser", "chrome");
		System.out.println(properties.getProperty("browser"));
	}

}
