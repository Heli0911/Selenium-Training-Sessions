package TestNG;

import org.testng.TestNG;

public class TestRunner {

	static TestNG testNg;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		ExtentReportListener ext = new ExtentReportListener();

		testNg = new TestNG();

		testNg.setTestClasses(new Class[] { Test001.class });
		testNg.addListener(ext);
		testNg.run();

	}

}
