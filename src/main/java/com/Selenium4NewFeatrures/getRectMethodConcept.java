package com.Selenium4NewFeatrures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getRectMethodConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://app.hubspot.com/login");

		WebElement loginButton = driver.findElement(By.id("loginBtn"));

		// Seleniumn 3:
		Dimension loginButtonDim = loginButton.getSize();
		System.out.println(loginButtonDim.getHeight());
		System.out.println(loginButtonDim.getWidth());

		Point point = loginButton.getLocation();
		System.out.println(point.getX());
		System.out.println(point.getY());

		// Selenium 4:
		Rectangle loginButtonRect = loginButton.getRect();

		System.out.println(loginButtonRect.getHeight());
		System.out.println(loginButtonRect.getWidth());

		System.out.println(loginButtonRect.getX());
		System.out.println(loginButtonRect.getY());

		driver.quit();
	}

}
//In Google console Command:
//document.getElementById("loginBtn").getBoundingClientRect(); --> Enter
//DOMRect {x: 127.5, y: 61, width: 425, height: 40, top: 61, …}
//document.getElementById("loginBtn").getBoundingClientRect(); --> Enter
//DOMRect {x: 462, y: 61, width: 425, height: 40, top: 61, …}