package SDET;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {
	/*
	 * get(): accepts only one string parameter
	 * navigate().to(): accepts only string parameter and URL instance as parameter
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//driver.navigate().to("https://flipkart.com");
		driver.get("https://flipkart.com");
		driver.get("https://amazon.in");

		driver.navigate().back();
		driver.navigate().forward();

		driver.navigate().refresh();

		driver.quit();

	}

}
