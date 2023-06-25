package section11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class calendar {

	public static void main(String[] args) {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.path2usa.com/travel-companion/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[name='form_fields[travel_comp_date]']")).click();
		List<WebElement> dates = driver.findElements(By.cssSelector(".flatpickr-day.disabled"));
		
		int count = driver.findElements(By.cssSelector(".flatpickr-day.disabled")).size();
		for(int i=0; i<count; i++)
		{
			String text = driver.findElements(By.cssSelector(".flatpickr-day.disabled")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".flatpickr-day.disabled")).get(i).click();
				break;
			}
		}
	}

}
