package VerboseConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verboseTestNGConcept {
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void setUp() {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prakash\\eclipse-workspace\\AssertionsTestNG\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/");
	}

	@Test(priority = 1)
	public void FlipkartTitletest1() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority = 2)
	public void FlipkartTitletest2() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority = 3)
	public void FlipkartTitletest3() {
		String title = driver.getTitle();
		System.out.println("Title of the page is: " + title);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	
	@AfterMethod
	public void teardown() {
		
		driver.quit();
	}
}
