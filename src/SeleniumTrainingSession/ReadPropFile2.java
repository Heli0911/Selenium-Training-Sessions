package SeleniumTrainingSession;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile2 {

	public static void main(String[] args) throws IOException {

		// Create WebDriver Instance
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		// Load the properties File
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Heli Shah\\eclipse-workspace\\DemoGoogle\\src\\SeleniumTrainingSession\\application.properties.test");
		prop.load(fis);
		
		// Enter Data into Form
		driver.findElement(By.id(prop.getProperty("EmailTextBox"))).sendKeys("heli@gmail.com");
		driver.findElement(By.id(prop.getProperty("SignUpButton"))).click();
	}

}
