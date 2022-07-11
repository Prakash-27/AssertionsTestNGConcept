package com.Selenium4NewFeatrures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GroupsOfElementsScreenShots {

	public static void main(String[] args) {

		//Take ScreenShot of Group of Elements like WebTable,Form etc.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		driver.get("https://register.freecrm.com/register/");
		driver.get("https://app.hubspot.com/signup-hubspot/crm?hubs_signup-cta=login-signup-cta&hubs_signup-url=app.hubspot.com%2Flogin&step=landing_page");
		
		
//		WebElement Webtable = driver.findElement(By.id("customers"));
//		File srcFile = Webtable.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\webtable.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		driver.quit();
		
//		WebElement FreeCRMRegisterForm = driver.findElement(By.cssSelector(".ui.raised.segment"));
//		File srcFile = FreeCRMRegisterForm.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\FreeCRMRegisterForm.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		driver.quit();
		
		WebElement hubspotSignUpPage = driver.findElement(By.xpath("//div[@data-selenium='LANDING_PAGE_VIEW']"));
		File srcFile = hubspotSignUpPage.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\hubspotSignUpPage.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
		
	}

}
