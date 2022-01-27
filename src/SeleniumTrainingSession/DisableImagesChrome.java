package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.HashMap;
import java.util.Map;

public class DisableImagesChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();

		// browser setting to disable image
		prefs.put("profile.managed_default_content_settings.images", 2);

		// adding capabilities to browser
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		// putting desired capabilities to browser
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in/");

	}

}
