package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariLaunch {

	public static void main(String[] args) {

		// use safari extension for selenium  -- safari --> preferences --> Advanced
		// need to enable -- develop --> allow remote automation
		WebDriver driver = new SafariDriver(); // launch safari

		driver.get("https://www.google.co.in"); // enter URL

		String title = driver.getTitle(); // get title
		System.out.println(title);
	}

}
