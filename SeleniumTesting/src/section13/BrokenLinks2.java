package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks2 {

	public static void main(String[] args) throws MalformedURLException, IOException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		SoftAssert sa = new SoftAssert();
		
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link: links)
		{
			String url = link.getAttribute("href");
			
			HttpURLConnection conn= (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
	        conn.connect();
	        int respCode = conn.getResponseCode();
	        System.out.println(respCode);
	        
	        sa.assertTrue(respCode<400, "Broken Link = "+link.getText()+" & Status Code = " +respCode);
	        
		}
		sa.assertAll();
		
	}

}
