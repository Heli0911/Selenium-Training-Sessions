package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			// Navigate to Url
			driver.get("https://google.com");

			// Store 'google search' button web element
			WebElement searchBtn = driver.findElement(By.linkText("Sign in"));
			Actions actionProvider = new Actions(driver);
			
			// Perform double-click action on the element
			actionProvider.doubleClick(searchBtn).build().perform();
		} finally {
			driver.quit();
		}
	}

}
