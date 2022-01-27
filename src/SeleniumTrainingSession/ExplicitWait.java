package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/guru99home/");

		WebElement SeleniumDropdown = driver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
		clickOn(driver, SeleniumDropdown, 20);

		WebElement Email = driver.findElement(By.id("philadelphia-field-email"));
		sendKeys(driver, Email, 10, "heli@gmail.com");
	}

	// Explicit Wait :-
	// 1. No explicit keyword or method
	// 2. Available with Webdriver wait with some expected conditions
	// 3. Specific to element
	// 4. Dynamic in nature

	private static void clickOn(WebDriver driver, WebElement element, int timeout) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();

	}

	private static void sendKeys(WebDriver driver, WebElement element, int timeout, String value) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);

	}

}
