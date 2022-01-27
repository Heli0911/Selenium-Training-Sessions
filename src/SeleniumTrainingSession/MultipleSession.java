package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleSession {

	@Test
	public void executSessionOne() {
		// First session of WebDriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Go to guru99 site
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 1");

	}

	@Test
	public void executeSessionTwo() {
		// Second session of WebDriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Go to guru99 site
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 2");

	}

	@Test
	public void executSessionThree() {
		// Third session of WebDriver
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Go to guru99 site
		driver.get("http://demo.guru99.com/V4/");
		// find user name text box and fill it
		driver.findElement(By.name("uid")).sendKeys("Driver 3");

	}
}
