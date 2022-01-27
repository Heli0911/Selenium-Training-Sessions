package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;

public class LoadURL {

	public static void main(String[] args) {


		SingletonBrowserClass sbc1= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver1 = sbc1.getDriver();
		
		
		SingletonBrowserClass sbc2= SingletonBrowserClass.getInstanceOfSingletonBrowserClass();
		WebDriver driver2 = sbc2.getDriver();
		driver2.get("https://www.google.com");

	}

}
