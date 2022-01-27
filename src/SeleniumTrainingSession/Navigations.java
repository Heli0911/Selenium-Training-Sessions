package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.get("http://www.google.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println(driver.getTitle());

		driver.navigate().refresh();

	}

}
