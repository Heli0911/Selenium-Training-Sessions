package TestNG;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import ChromeDrTestNGListenerConceptiver;
//import TestNGListenerConcept.File;
//import TestNGListenerConcept.TakesScreenshot;
//import TestNGListenerConcept.WebDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
	}

	public void failed(String testMethodName) throws IOException {

		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			// Now copy the screenshot to the desired location using copyFile method
			FileUtils.copyFile(file,
					new File("C:\\Users\\Heli Shah\\eclipse-workspace\\DemoGoogle\\src\\TestNG\\Screenshots"
							+ "456" + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
