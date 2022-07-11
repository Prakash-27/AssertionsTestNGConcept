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

public class TakeElementScreenShot {

	static WebDriver driver;
	static File srcFile;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://app.hubspot.com/login");

		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("example@123.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("pngjpeggif");
		WebElement loginButton = driver.findElement(By.id("loginBtn"));

//		srcFile = email.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\email.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		srcFile = password.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\password.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		srcFile = loginButton.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\loginButton.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		driver.quit();
		
		takeElementScreenshot(email, "Email");
		takeElementScreenshot(password, "password");
		takeElementScreenshot(loginButton, "loginButton");

	}

	public static void takeElementScreenshot(WebElement element, String fileName) {
		srcFile = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(".\\target\\screenshots\\" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}