package javaBasics;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntro2 {

	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
