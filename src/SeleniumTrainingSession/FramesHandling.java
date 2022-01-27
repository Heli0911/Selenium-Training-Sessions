package SeleniumTrainingSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  //navigates to the Browser
		
		// navigates to the page consisting an iframe
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
	            
	    driver.switchTo().frame(0); //Switching to the frame
		System.out.println("********We are switched to the iframe*******");
		driver.findElement(By.xpath("/html/body/a/img")).click();
		
		//Clicking the element in line with Advertisement
	    System.out.println("*********We are done***************");
	        }

	}

