package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AssertTest {

	public String baseUrl = "http://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\\\Driver\\\\chromedriver.exe";
	public WebDriver driver;

	@Test
	public void verifyHomepageTitle() {

		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Test(priority = 0)
	public void register() {
		driver.findElement(By.linkText("REGISTER")).click();
		String expected = "Register: Mercury Tours";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@Test(priority = 1)
	public void support() {
		driver.findElement(By.linkText("SUPPORT")).click();
		String expected = "Under Construction: Mercury Tours";
		String actual = driver.getTitle();
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void goBackToHomepage() {
		driver.findElement(By.linkText("Home")).click();
	}

	@AfterTest
	public void terminateBrowser() {
		driver.close();
	}
}
