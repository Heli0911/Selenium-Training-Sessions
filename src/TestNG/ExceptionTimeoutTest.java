package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	@Test(timeOut = 2)
	public void infiniteLoopTest() {
		int i = 1;
		while (i == 1) {
			System.out.println(i);
		}
	}

	@Test(expectedExceptions=NumberFormatException.class)
	public void test1() {
		String x = "10A";
		Integer.parseInt(x);
	}

}
