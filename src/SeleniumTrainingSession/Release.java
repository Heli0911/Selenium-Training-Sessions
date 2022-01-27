package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Release {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			// Navigate to Url
			driver.get("https://crossbrowsertesting.github.io/drag-and-drop");

			// Store 'google search' button web element
			WebElement searchBtn = driver.findElement(By.linkText("Sign in"));

			// Store 'box A' as source element
			WebElement sourceEle = driver.findElement(By.id("draggable"));
			
			// Store 'box B' as source element
			WebElement targetEle = driver.findElement(By.id("droppable"));
			
			Actions actionProvider = new Actions(driver);
			actionProvider.clickAndHold(sourceEle).moveToElement(targetEle).build().perform();
			Thread.sleep(5000);
			
			// Performs release event
			actionProvider.release().build().perform();
			Thread.sleep(5000);
			
		} finally {
			driver.quit();
		}

	}

}
