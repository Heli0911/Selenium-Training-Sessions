package SeleniumTrainingSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {

		//WebDriver driver = null;
		// Load the properties File
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Heli Shah\\eclipse-workspace\\DemoGoogle\\src\\SeleniumTrainingSession\\config.properties");

		prop.load(fis);

		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Age"));

		System.out.println(prop.getProperty("URL"));
		String URL = prop.getProperty("URL");

		System.out.println(prop.getProperty("Browser"));
		String browser = prop.getProperty("Browser");

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
		} else if (browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Driver\\geckodriver.exe");
			WebDriver driver1 = new FirefoxDriver();
		}
		
		Properties driver1 = null;
		driver1.get("URL");

	}

}
