package section8;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class greenKart {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //after selenium 4
		
		String[] itemsNeeded = {"Cucumber","Brocolli"};
		
		addItems(driver, itemsNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));

		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		
	}
		public static void addItems(WebDriver driver, String[] itemsNeeded)
		{
			int j = 0;
			
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			
			for(int i=0; i<products.size(); i++)
			{
				String[] name = products.get(i).getText().split("-");
				String formattedName = name[0].trim();
				
				//check whether name you extracted is present in array or not
				//convert array to arrayList for easy search
				List<String> itemsNeededList = Arrays.asList(itemsNeeded);
				
				if(itemsNeededList.contains(formattedName))
				{
					//click on add to cart
					driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					
					if(j == itemsNeeded.length)
					{
						break;
					}
				}
			}
		}
		
}
