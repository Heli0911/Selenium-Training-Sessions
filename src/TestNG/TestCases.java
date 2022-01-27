package TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCases {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();			

	// Test to pass as to verify listeners .		
	@Test		
	public void Login()				
	{		
	    driver.get("http://demo.guru99.com/V4/");					
	    driver.findElement(By.name("uid")).sendKeys("mngr34926");							
	    driver.findElement(By.name("password")).sendKeys("amUpenu");							
	    driver.findElement(By.name("btnLogin")).click();					
	}		

	// Forcefully failed this test as to verify listener.		
	@Test		
	public void TestToFail()				
	{		
	    System.out.println("This method to test fail");					
	    Assert.assertTrue(false);			
	}		

}
