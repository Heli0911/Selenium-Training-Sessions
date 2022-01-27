package SeleniumTrainingSession;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class ReadingBarCode {

	public static void main(String[] args) throws ReaderException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		String barCodeURL = driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img")).getAttribute("src");
		// barCodeURL=driver.findElement(By.xpath("//*[@id=\"HTML12\"]/div[1]/img[2]")).getAttribute("src");
		System.out.println(barCodeURL);

		// Create an object of URL Class
		URL url = new URL(barCodeURL);
		
		// Pass the URL class object to store the file as image
		BufferedImage bufferedimage = ImageIO.read(url);

		// Process the image
		LuminanceSource luminanceSource = new BufferedImageLuminanceSource(bufferedimage);
		BinaryBitmap binaryBitmap = new BinaryBitmap(new HybridBinarizer(luminanceSource));

		// To Capture details of QR code
		Result result = new MultiFormatReader().decode(binaryBitmap);
		System.out.println(result.getText());
	}

}
