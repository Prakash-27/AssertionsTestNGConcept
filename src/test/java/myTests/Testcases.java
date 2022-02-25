package myTests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	//hard assertion: hard validation: if a hard assertion is getting failed--> immediately test case will be marked as failed and test case will be Terminated.
	//soft assertion Or Verify Or Verification: soft validation: if a soft assertion is getting failed--> test case will not be marked as passed as well as next lines will be executed
	// assertAll(): to mark the test case as failed, if any soft assertion is getting failed
	
	SoftAssert softAssert = new SoftAssert(); //Global variable object
	
	@BeforeClass
	public void setUp() {
		System.out.println("Open Browser");
		softAssert.assertEquals(true, false);

	}
	@Test
	public void test1() {
		
		SoftAssert softAssert1 = new SoftAssert(); //Local variable object

		System.out.println("Click login button");
		
		Assert.assertEquals(true, true);
		
		System.out.println("enter username");
		System.out.println("enter password");
		System.out.println("click on signin button");

		Assert.assertEquals(true, true);

		System.out.println("validate Home Page");

		Assert.assertEquals(true, false); //hard assertion
        //Testcase will fail after this assert
		
		softAssert1.assertEquals(true, false,"Home Page title is missing"); //soft assertion
		//Testcase will execute if its failed also but in Result of running class Testcases it will assumed as Passed case
		
		System.out.println("Go to Deal's Page");
		System.out.println("create a Deal");
		softAssert1.assertEquals(true, false,"not able to create a deal"); //soft assertion
		
		System.out.println("Go to contact Page");
		System.out.println("create a contact");
		softAssert1.assertEquals(true, false,"not able to create a contact"); //soft assertion
		
		softAssert1.assertAll();
		//assertAll method can fail the softassert testcase
	}
	
	
	@Test
	public void test2() {
		
		SoftAssert softAssert2 = new SoftAssert();

		System.out.println("logout");
		softAssert2.assertEquals(true, false);
		softAssert2.assertAll();
	}
	
	
	@AfterClass
	public void tearDown() {
		//softAssert.assertAll();
	}
	
}
