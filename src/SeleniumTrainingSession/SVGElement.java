package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SVGElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/index.htm");

		// identify element
		WebElement m = driver
				.findElement(By.xpath("//*[local-name()='svg' and @dataicon='home']/*[localname()='path']"));
		// Action class to move and click element
		Actions act = new Actions(driver);
		act.moveToElement(m).click().build().perform();
		driver.quit();
	}
}
