package SeleniumTrainingSession;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	private static WebDriver driver = null;

	public static void main(String[] args) {

		String homePage = "http://www.zlti.com";
		String url = "";
		HttpURLConnection huc = null;
		int respCode = 200;

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(homePage);

		// Identify all links in a webpage and store them in List.
		List<WebElement> links = driver.findElements(By.tagName("a"));
		// Obtain Iterator to traverse through the List.
		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			// Get href of anchor tag and store it in url variable.
			url = it.next().getAttribute("href");

			System.out.println(url);

			// Check if URL is null or Empty and skip the remaining steps if the condition
			// is satisfied.
			if (url == null || url.isEmpty()) {
				System.out.println("URL is either not configured for anchor tag or it is empty");
				continue;
			}

			// Check whether URL belongs to a main domain or third party. Skip the remaining
			// steps if it belongs to third party domain.
			if (!url.startsWith(homePage)) {
				System.out.println("URL belongs to another domain, skipping it.");
				continue;
			}

			try {

				// HttpURLConnection class has methods to send HTTP request and capture HTTP
				// response code.
				// So, output of openConnection() method (URLConnection) is type casted to
				// HttpURLConnection.
				huc = (HttpURLConnection) (new URL(url).openConnection());

				// We can set Request type as “HEAD” instead of “GET”. So that only headers are
				// returned and not document body.
				huc.setRequestMethod("HEAD");

				// On invoking connect() method, actual connection to url is established and the
				// request is sent.
				huc.connect();

				// Using getResponseCode() method we can get response code for the request.
				respCode = huc.getResponseCode();

				// Based on response code we will try to check link status.
				if (respCode >= 400) {
					System.out.println(url + " is a broken link");
				} else {
					System.out.println(url + " is a valid link");
				}

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		driver.quit();

	}
}