package SeleniumTrainingSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingletonBrowserClass {

//		To create a singleton class, we need to do following steps:
//		Declare constructor of class as private so that no one instantiate class outside of it.
//		Declare a static reference variable of class. Static is needed to make it available globally.
//		Declare a static method with return type as object of class which should check if class is already instantiated once.

	// instance of singleton class
	private static SingletonBrowserClass instanceOfSingletonBrowserClass = null;
	private WebDriver driver;

	// Constructor
	private SingletonBrowserClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	// TO create instance of class
	public static SingletonBrowserClass getInstanceOfSingletonBrowserClass() {
		if (instanceOfSingletonBrowserClass == null) {
			instanceOfSingletonBrowserClass = new SingletonBrowserClass();
		}
		return instanceOfSingletonBrowserClass;
	}

	// To get driver
	public WebDriver getDriver() {
		return driver;
	}

}
