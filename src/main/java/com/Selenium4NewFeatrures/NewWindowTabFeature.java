package com.Selenium4NewFeatrures;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWindowTabFeature {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB); //Open a new blank tab
		
		//driver.switchTo().newWindow(WindowType.WINDOW); //Open a new Window
		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> ls = new ArrayList<String>(handles);
		
		String parentWindowID = ls.get(0);
		String ChildWindowID = ls.get(1);
		
		System.out.println(parentWindowID);
		System.out.println(ChildWindowID);
		
		System.out.println("after switching title is: " + driver.getTitle());
		
		driver.get("https://www.facebook.com/");
		System.out.println("after switching to facebook title is: " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(parentWindowID);
		
		System.out.println("parent window title is: " + driver.getTitle()); 
		
		
		
	}

}
