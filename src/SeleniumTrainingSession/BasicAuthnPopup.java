package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthnPopup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String u = "admin";

		// adding username, password with URL
		String str = "https://" + u + ":" + u + "@" + "the-internet.herokuapp.com/basic_auth";
		driver.get(str);
		
		// identify and get text after authentication of popup
		String t = driver.findElement(By.cssSelector("p")).getText();
		System.out.println("Text is: " + t);
		driver.quit();
	}

}
