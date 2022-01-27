package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGBasics {

	WebDriver driver;
	// 1 //4 //7
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in");
	}

	// 2
	@Test(priority = 1, groups = "Title")
	public void googleTitleTest() {
		WebDriver driver = new ChromeDriver();
		String title = driver.getTitle();
		System.out.println(title);
	}

	// 8
	@Test(priority = 3, groups = "Logo")
	public void googleLogoTest() {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.className("lnXdpd")).isDisplayed();

	}

	// 5
	@Test(priority = 2, groups = "Link")
	public void GmailLinkTest() {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.linkText("Images")).isDisplayed();
	}

	@Test(priority = 4, groups = "Test")
	public void test1() {
		System.out.println("Test1");
	}

	@Test(priority = 5, groups = "Test")
	public void test2() {
		System.out.println("Test2");
	}

	@Test(priority = 6, groups = "Test")
	public void test3() {
		System.out.println("Test3");
	}

	// 3 //6 //9
	@AfterMethod
	public void tearDown() {
		WebDriver driver = new ChromeDriver();
		driver.quit();
	}

}
