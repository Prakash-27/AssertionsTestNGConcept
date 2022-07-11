package com.Selenium4NewFeatrures;

import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthHandle {

	private static final String username = "admin";
	private static final String password = "admin";
	
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		Optional<DevTools> devTools = ((ChromeDriver)driver).maybeGetDevTools();
		
		
	}

}
