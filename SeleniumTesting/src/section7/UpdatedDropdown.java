package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		
		driver.findElement(By.xpath("//div[contains(text(),'1 Adult')]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
		int i = 1;
		while(i<5) //loop to add 5 times
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
			i++;
		}
		
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']"));
		
		System.out.println(driver.findElement(By.cssSelector("div[data-testid='home-page-travellers']")).getText());
		
		//count the number of checkboxes
		System.out.println(driver.findElements(By.cssSelector("div[class='css-1dbjc4n'] div[style='cursor: pointer;']")).size());
		
		

	}

}
