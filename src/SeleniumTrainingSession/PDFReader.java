package SeleniumTrainingSession;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PDFReader {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.pdf995.com/samples/pdf.pdf");
		driver.manage().window().maximize();
		
		// Open your class file and define the URL of PDF file
		String Currentlink=driver.getCurrentUrl();
		URL url=new URL(Currentlink);
		InputStream is=url.openStream();
		
		// to convert PDF content to text. PDFBox API is used along with Java input stream for this purpose.
		BufferedInputStream fp=new BufferedInputStream(is);
		PDDocument document=null;
		document=PDDocument.load(fp);
		String pdfContent= new PDFTextStripper().getText(document);
		
		System.out.println(pdfContent);
		driver.quit();

	}

}
