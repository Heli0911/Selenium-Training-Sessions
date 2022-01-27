package SeleniumTrainingSession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		WebElement username = driver.findElement(By.id("email"));
		WebElement PasswordButton = driver.findElement(By.id("pass"));
		WebElement LoginButton = driver.findElement(By.name("login"));

		highLightElement(driver, username); // highlight the element
		drawBorder(driver, PasswordButton); // draw a border
		// generateAlert(driver, "There is an issue."); // generate alert)
		clickElement(driver, LoginButton); // click element

		// refresh the page
		// 1. by using selenium
		driver.navigate().refresh();

		// 2. by using js executor
		refreshBrowser(driver);

		// get title of the page
		System.out.println(getTitle(driver));

		// get page inner text
		System.out.println(getPageInnerText(driver));
		
		//scroll page down
		scrollPageDown(driver);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"pageFooterChildren\"]/ul/li[29]/a"));
		scrollIntoView(driver,element);
	}

	public static void highLightElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);

	}

	public static void drawBorder(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','border: 2px solid green;');", element);

	}

	public static void generateAlert(WebDriver driver, String message) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElement(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void refreshBrowser(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");
	}

	public static String getTitle(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}
	
	public static void scrollPageDown(WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

}
