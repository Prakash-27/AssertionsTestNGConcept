package TimeOutsExampleInTestNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeOutException {
	
	
	@Test(timeOut = 2000, expectedExceptions = ThreadTimeoutException.class)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Hi TestNg");
	}
	
	
	

}
