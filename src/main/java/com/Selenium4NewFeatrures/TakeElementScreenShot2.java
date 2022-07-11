package com.Selenium4NewFeatrures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeElementScreenShot2 {

	static WebDriver driver;
	static File srcFile;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.get("https://app.hubspot.com/login");

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("example@123.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("pngjpeggif");
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		WebElement forgotPwd = driver.findElement(By.id("password-description"));

//		TakesScreenshot scrShot = ((TakesScreenshot)driver); //When we are taking full ScreenShot we have to TypeCast driver instance.
//		srcFile = scrShot.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\Page.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		takeFullWebPageScreenShot(driver, "Page1");

		takeWebElementScreenShot(email, "email1");
		takeWebElementScreenShot(password, "password1");
		takeWebElementScreenShot(loginButton, "loginButton1");
		takeWebElementScreenShot(forgotPwd, "forgotPwd1");

	}

	public static void takeFullWebPageScreenShot(WebDriver driver, String imageName) {
		TakesScreenshot scrShot = ((TakesScreenshot) driver); // When we are taking full ScreenShot we have to TypeCast
																// driver instance.
		srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\" + imageName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeWebElementScreenShot(WebElement element, String imageName) {
		TakesScreenshot scrShot = ((TakesScreenshot) element); // When we are taking Particular WebElements ScreenShot
																// we have to TypeCast That WebElement instance.
		srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\" + imageName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}