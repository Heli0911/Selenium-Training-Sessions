package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HighLightElement2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Inspect element
		// Collects the webelement
		WebElement username = driver.findElement(By.id("email"));

		// Call the highlighterMethod and pass webdriver and WebElement which you want
		// to highlight as arguments.
		highLightElement(driver, username);

	}

	// Element highlighter code
	public static void highLightElement(WebDriver driver, WebElement element) {

		// Create object of a JavascriptExecutor interface
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// use executeScript() method and pass the arguments
		// Here i pass values based on css style. Yellow background color with solid red
		// color border.
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	}

}
