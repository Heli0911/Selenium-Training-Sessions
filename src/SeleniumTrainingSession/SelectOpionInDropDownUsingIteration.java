package SeleniumTrainingSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectOpionInDropDownUsingIteration {

	@Test
	public void iterateOverOptionsUsingStream() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		// Select Day
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		List<WebElement> allDayDropDownOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
		selectOptionInDropDownUsingStream(allDayDropDownOptions, "3");

		// Select Month
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		List<WebElement> allMonthDropDownOptions = driver.findElements(By.xpath("//select[@id='month']/option"));
		selectOptionInDropDownUsingStream(allMonthDropDownOptions, "Aug");

		// Select year
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		List<WebElement> allYearDropDownOptions = driver.findElements(By.xpath("//select[@id='year']/option"));
		selectOptionInDropDownUsingStream(allYearDropDownOptions, "1990");

	}

	private void selectOptionInDropDownUsingStream(List<WebElement> dropDownOptions, String optionToBeSelected) {
		// anyMatch() method will not continue once rue is returned unlike forEach where
		// we can not break loop.
		dropDownOptions.stream().anyMatch(option -> {
			if (option.getText().equals(optionToBeSelected)) {
				option.click();
				return true;
			} else
				return false;
		});

	}
}
