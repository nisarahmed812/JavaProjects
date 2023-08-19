package section7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		// Create a new instance of ChromeDriver.
        WebDriver driver = new ChromeDriver();

        // Open the Google website.
        driver.get("www.google.com");

        // Get the title of the page.
        String title = driver.getTitle();

        // Print the title of the page to the console.
        System.out.println(title);

        // Close the browser.
        driver.quit();
    }
}
