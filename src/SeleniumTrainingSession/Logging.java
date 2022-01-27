package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logging {

	static Logger log = Logger.getLogger(Logging.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("C:\\Users\\Heli Shah\\eclipse-workspace\\DemoGoogle\\src\\SeleniumTrainingSession\\log4j.properties");
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.IGNORE);
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.browserstack.com/users/sign_in");
		log.info("Open browserstack");
		driver.manage().window().maximize();
		log.info("Maximize window size");
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		log.info("enter username");
		js.executeScript("document.getElementById('user_password').value='password';");
		log.info("enter password");
		js.executeScript("document.getElementById('user_submit').click();");
		log.info("click on login");
		driver.close();

	}
}
