package SeleniumTrainingSession;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		String fileDownloadPath = "C:\\Users\\Avinash\\SeleniumDownload";

		Map<String, Object> prefsMap = new HashMap<String, Object>();
		
		//used to handle the download notification bar.
		prefsMap.put("profile.default_content_settings.popups", 0);
		
		//used to set the default or desired path of our downloaded file. 
		prefsMap.put("download.default_directory", fileDownloadPath);

		ChromeOptions option = new ChromeOptions();
		option.setExperimentalOption("prefs", prefsMap);
		option.addArguments("--test-type");
		option.addArguments("--disable-extensions");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumhq.org/download/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("64 bit Windows IE")).click();
		System.out.println("Downloaded");
	}

}
