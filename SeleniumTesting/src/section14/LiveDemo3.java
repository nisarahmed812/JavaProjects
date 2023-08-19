package section14;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// capture all webelements into new(original) list
		List<WebElement> elementsList = driver.findElements(By.xpath("//tr/td[1]"));
		elementsList.stream().map(s -> s.getText()).forEach(s -> System.out.println(s));

		List<String> originalList = elementsList.stream().map(s -> s.getText()).collect(Collectors.toList());

		// sort in the list of step 3 -> sorted list
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

		// compare original list vs sorted list
		// Assert.assertTrue(originalList.equals(sortedList));

		// scan the name column with getText -> Rice-> print the price of the Rice
		List<String> price;
		do {
			List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
			price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVeggiePrice(s))
					.collect(Collectors.toList());

			price.forEach(a -> System.out.println(a)); // 38
			if (price.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
			}
		} while (price.size() < 1);
	}

	public static String getVeggiePrice(WebElement s) {
		String pricevalue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return pricevalue;
	}

}
