package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();
		
		// parent to child
		//div[@class='css-1dbjc4n r-knv0ih r-1k1q3bj r-ql8eny r-1dqxon3']//div[contains(text(),'BLR')]
		driver.findElement(By.xpath("//div[contains(text(),'BLR')]")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'MAA')])")).click();
		Thread.sleep(2000);
		
	}

}
