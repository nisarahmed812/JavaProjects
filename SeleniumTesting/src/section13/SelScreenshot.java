package section13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// maximize window
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();

		// delete specific cookie
		driver.manage().deleteCookieNamed("cookie name mention here");

		// get full page screenshot
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:\\WebDrivers\\SeleniumScreenshots\\FullPageScreenshot.png"));

		// get element screenshot
		WebElement searchElement = driver.findElement(By.className("SDkEP"));
		File fileName = searchElement.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fileName, new File("C:\\WebDrivers\\SeleniumScreenshots\\ElementScreenshot.png"));

		driver.quit();
	}

}
