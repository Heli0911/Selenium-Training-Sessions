package SeleniumTrainingSession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Get the total counts of links on the page
		//Get the text of each link on the page
		
		//all the links are represented by <a> html tag
		
		List <WebElement> linkList = (List<WebElement>) driver.findElement(By.tagName("a"));
		
		//size of linklist
		System.out.println(linkList.size());
		
		for (int i = 0; i<linkList.size(); i++)
		{
			String linkText = linkList.get(i).getText();
			System.out.println(linkList);
		}

	}

}
