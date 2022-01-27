package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSHeadlessBrowser {

	public static void main(String[] args) {

		System.setProperty("phantomjs.binary.path", "C:\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin.exe");
		WebDriver driver = new PhantomJSDriver(); 
		driver.get("https://www.google.co.in"); 

		String title = driver.getTitle(); 
		System.out.println(title);
		driver.quit();
	}

}

