package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Find the date time picker control

		WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));

		// Fill date as mm/dd/yyyy as 06/09/1999

		dateBox.sendKeys("06091999");

		// Press tab to shift focus to time field

		dateBox.sendKeys(Keys.TAB);

		// Fill time as 10:45 PM

		dateBox.sendKeys("1045PM");

	}

}
