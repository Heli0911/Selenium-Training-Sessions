package SeleniumTrainingSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle3 {

	public static void main(String[] args) throws InterruptedException {

		// Simple Alert --- The simple alert class in Selenium displays some information
		// or warning on the screen.

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com/users/sign_up");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.findElement(By.id("user_full_name")).sendKeys("Heli Shah");
		driver.findElement(By.id("user_email_login")).sendKeys("helishah6999@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Princeam2275");
		driver.findElement(By.id("tnc_checkbox")).click();
		driver.findElement(By.id("user_submit")).click();

		Thread.sleep(2000);

		Alert alert = driver.switchTo().alert(); // switch to alert

		String alertMessage = driver.switchTo().alert().getText(); // capture alert message

		System.out.println(alertMessage); // Print Alert Message
		Thread.sleep(2000);
		alert.accept();

	}

}
