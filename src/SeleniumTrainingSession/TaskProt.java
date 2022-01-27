package SeleniumTrainingSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskProt {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.1.1/login.html#/dashboard");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		Thread.sleep(2000);
		driver.findElement(By.name("loginUserId")).sendKeys("heli.s");
		driver.findElement(By.name("password")).sendKeys("(Hs@0911)");
		driver.findElement(By.id("loginButton")).click();

	}

}
