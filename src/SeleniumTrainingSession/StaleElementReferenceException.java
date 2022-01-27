package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String title = driver.getTitle();
		System.out.println(title);

		if (title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
