package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://staging.beperfeqta.com/wbtw/#/login");

		// 1.Name :

		Thread.sleep(7000);
		driver.findElement(By.name("username")).sendKeys("perfeqta_heli");
		driver.findElement(By.name("password")).sendKeys("Princeam@22795");

		// 2.Xpath :

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/button")).click();

		// 3.Id:

		// driver.findElement(By.id("username")).sendKeys("perfeqta_heli");

		// 4.Linktext : this is only for links

		// driver.findElement(By.linkText(null)).click();

		// 5.Partial Linktext : Not Useful

		// driver.findElement(By.partialLinkText(null)).click();

		// 6.Class Name :

		// driver.findElement(By.className(null)).sendKeys(args);

		// 7.CSSSelector :
		// if id is there -- #{id}
		// if class is there -- .{class}

		// driver.findElement(By.cssSelector(null)).sendKeys(args);

	}

}
