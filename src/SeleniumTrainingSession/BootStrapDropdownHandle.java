package SeleniumTrainingSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdownHandle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// First we have to click on menu item then only dropdown items will display
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();

		// adding 2 seconds wait to avoid Sync issue
		Thread.sleep(2000);

		// Dropdown items are coming in <a> tag so below xpath will get all
		// elements and findElements will return list of WebElements
		List<WebElement> list = (List<WebElement>) driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li/a"));

		// We are using enhanced for loop to get the elements
		for (WebElement element : list)

		{

			// for every elements it will print the name using innerHTML
			System.out.println("Values " + element.getAttribute("innerHTML"));

			// Here we will verify if link (item) is equal to Java Script
			if (element.getAttribute("innerHTML").contains("JavaScript")) {

				// if yes then click on link (item)
				element.click();

				// break the loop or come out of loop
				break;

			}

		}

	}

}
