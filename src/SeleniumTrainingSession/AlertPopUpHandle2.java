package SeleniumTrainingSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle2 {

	public static void main(String[] args) throws InterruptedException {

		// Prompt Alert --- This Prompt Alert asks some input from the user and Selenium
		// webdriver can enter the text using sendkeys("").

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

}
