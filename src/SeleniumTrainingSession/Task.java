package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {

		//*[@class='q-box qu-display--block qu-cursor--pointer qu-hover--textDecoration--none Link___StyledBox-t2xg9c-0 KlcoI']

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quora.com/What-is-the-latest-Selenium-WebDriver-architecture");
		
		//driver.findElement(By.xpath("//span[@style='background: none;']")).click();
		driver.findElement(By.xpath("//span[contains(text(),'How can I write test scripts using Selenium Webdriver?')]")).click();
		//driver.findElement(By.linkText("How can I write test scripts using Selenium Webdriver?")).click();
		//driver.findElement(By.xpath("//*[@class='q-box qu-display--block qu-cursor--pointer qu-hover--textDecoration--none Link___StyledBox-t2xg9c-0 KlcoI']\r\n")).click();
	}

}
