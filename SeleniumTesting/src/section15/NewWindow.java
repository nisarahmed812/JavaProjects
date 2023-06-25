package section15;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindow {

	public static void main(String[] args) throws IOException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//open new window
		driver.switchTo().newWindow(WindowType.TAB);
		//driver.switchTo().newWindow(WindowType.WINDOW);
		
		//get window handles
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		//switch to childWindow
		driver.switchTo().window(childWindow);
		driver.get("https://courses.rahulshettyacademy.com/");
		String courseName = driver.findElement(By.cssSelector("div[title*='Postman']:nth-child(2)")).getText();
		
		//switch to parentWindow
		driver.switchTo().window(parentWindow);
		WebElement name = driver.findElement(By.name("name"));
		name.sendKeys(courseName);
		
		//get partial screenshot
		File fileName = name.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(fileName, new File("logo.png"));
		
		//get height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
