package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.chrome.ChromeDriver;

public class HTMLUnitDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// Creating a new instance of the HTML unit driver
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// Locate the searchbox using its name
		WebElement element = driver.findElement(By.name("q"));

		// Enter a search query
		element.sendKeys("Guru99");

		// Submit the query. Webdriver searches for the form using the text input
		// element automatically
		// No need to locate/find the submit button
		element.submit();

		// This code will print the page title
		System.out.println("Page title is: " + driver.getTitle());

		driver.quit();

	}

}
