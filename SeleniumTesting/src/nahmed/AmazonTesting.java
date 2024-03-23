package nahmed;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class AmazonTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions actions = new Actions(driver);

		// move to signIn element and click
		WebElement signInEle = driver.findElement(By.id("nav-link-accountList"));
		actions.moveToElement(signInEle).click().perform();

		// enter username
		WebElement userName = driver.findElement(By.id("ap_email"));
		userName.click();
		userName.sendKeys("nisarahmed812@gmail.com");

		driver.findElement(By.id("continue")).click();

		// enter password
		WebElement password = driver.findElement(By.id("ap_password"));
		password.click();
		password.sendKeys("Testpass@123");
		password.sendKeys(Keys.ENTER);

		// Find the puzzle image element and get its source
		WebElement puzzleImageElement = driver.findElement(By.cssSelector("img[alt='captcha']"));
		String puzzleImageUrl = puzzleImageElement.getAttribute("src");

		// Download the image and process it (if necessary)
		// Use Tesseract OCR to extract text from the image
		ITesseract tesseract = new Tesseract();
		try {
			String puzzleText = tesseract.doOCR(new java.io.File(puzzleImageUrl));

			// Solve the puzzle (analyze the extracted text to determine the solution)
			// Here, we assume the puzzle is a simple math problem
			int solution = Integer.parseInt(puzzleText); // Parse the text to an integer for calculation
			System.out.println(solution);
			// Enter the solution into the input field
			WebElement solutionInput = driver.findElement(By.id("solution_input"));
			solutionInput.sendKeys(Integer.toString(solution));

			// Submit the form
			WebElement submitButton = driver.findElement(By.id("submit_button"));
			submitButton.click();
		} catch (TesseractException e) {
			e.printStackTrace();
		}

		// click on search field
		WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
		searchField.click();
		searchField.sendKeys("xiaomi 14");
		searchField.sendKeys(Keys.ENTER);

		driver.close();
	}

}
