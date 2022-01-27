package SeleniumTrainingSession;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.google.com/");
		
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now copy the screenshot to the desired location using copyFile method
		FileUtils.copyFile(file,
				new File("C:\\Users\\Heli Shah\\eclipse-workspace\\DemoGoogle\\src\\SeleniumTrainingSession\\"
						+ "123" + ".jpg"));
//		takeScreenshot("Google");
	}

//	public static void takeScreenshot(String fileName, Dri) throws IOException {
//		// Take a screenshot and store as a file format
//		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		// Now copy the screenshot to the desired location using copyFile method
//		FileUtils.copyFile(file,
//				new File("C:\\Users\\Heli Shah\\eclipse-workspace\\DemoGoogle\\src\\SeleniumTrainingSession\\"
//						+ "123" + ".jpg"));
//
//	}

}
