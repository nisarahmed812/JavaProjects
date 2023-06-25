package section13;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Miscellaneous {

	public static void main(String[] args) throws IOException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//maximize window
		driver.manage().window().maximize();
		
		//delete all cookies
		driver.manage().deleteAllCookies();
		
		//delete specific cookie
		driver.manage().deleteCookieNamed("cookie name mention here");
		
		//screenshot code
		File src=	 ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\WebDrivers\\SeleniumScreenshots\\screenshot.png"));

	}

}
