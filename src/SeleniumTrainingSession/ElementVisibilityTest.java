package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 1. isDisplayed() method : applicable for all the elements
		Boolean Display = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).isDisplayed();
		System.out.println(Display);

		// 2. isEnabled() method : applicable for all the elements
		Boolean Enable = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).isEnabled();
		System.out.println(Enable);
		

		// 3. isSelected() method : applicable only for radio buttons,dropdowns,checkboxes
		Boolean Select = driver.findElement(By.xpath("//*[@id=\"lang-chooser\"]/div[1]/div[1]/div[9]")).isSelected();
		System.out.println(Select);
		
	}

}
