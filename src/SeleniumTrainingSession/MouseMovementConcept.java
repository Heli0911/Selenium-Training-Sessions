package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize(); // maximize the window
		driver.manage().deleteAllCookies(); // delete all cookies

		// Store 'google search' button web element
		WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));

		Actions action = new Actions(driver);

		Thread.sleep(2000);
		// Perform click-and-hold action on the element
		action.clickAndHold(searchBtn).build().perform();

		// Performs mouse move action onto the element
		action.moveToElement(gmailLink).build().perform();

		Thread.sleep(2000);
		driver.quit();
	}

}
