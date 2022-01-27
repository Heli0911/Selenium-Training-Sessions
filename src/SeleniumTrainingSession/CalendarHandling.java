package SeleniumTrainingSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// click on date picker so that we can get the calendar in view
		driver.findElement(By.id("datepicker")).click();

		// this will find all matching nodes in calendar
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		// now we will iterate all values and will capture the text. We will select when
		// date is 28
		for (WebElement element : allDates) {

			String date = element.getText();

			// once date is 28 then click and break
			if (date.equalsIgnoreCase("19")) {
				element.click();
				break;
			}
		}
	}
}
