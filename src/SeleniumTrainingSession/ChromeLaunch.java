package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://www.google.co.in"); // enter URL

		String title = driver.getTitle(); // get title
		System.out.println(title);

		// validation point :
		if (title.equals("Google")) {
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		driver.quit(); // quit the browser

	}
}
