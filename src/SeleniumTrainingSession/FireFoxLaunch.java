package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(); // launch FF
		driver.get("https://www.google.co.in"); // enter URL

	}

}
