package TimeOutsExampleInTestNG;

import org.testng.annotations.Test;

public class DependsOnFails {
	
	@Test(timeOut = 2000)
	public void parents_permission() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Permission Given");
		
	}

	@Test(dependsOnMethods = "parents_permission", alwaysRun = true)// This alwaysRun Method will have any dependsOnMethods Method with is failed means we can tell the 
	public void love_marriage() {         //alwaysRun = true --> this will run the test case wether the above test is failed also it can run the test  
		System.out.println("Marriage Happend");
	}
}
