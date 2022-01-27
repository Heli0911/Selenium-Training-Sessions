package SeleniumTrainingSession;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {

		// Confirmation Alert --- This confirmation alert asks permission to do some
		// type of operation.

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String text = alert.getText();

		if (text.equals("Do you really want to delete this Customer?")) {
			System.out.println("Correct alert message.");
		} else {
			System.out.println("Wrong alert message.");
		}

		alert.accept(); // click on ok button to accept entered data.
		alert.dismiss(); // click on cancel button to dismiss the alert popup.

	}

}
