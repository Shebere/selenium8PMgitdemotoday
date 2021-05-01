package com.qa.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MouseOverDemo {
	
	public static WebDriver driver;
	
		@BeforeClass
		public static void setup()
		{
			
	         System.setProperty("webdriver.chrome.driver", "C:\\Users\\vishal mittal\\Downloads\\chromedriver_win32 (12)\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();  // maximize the browser window
			
			driver.manage().deleteAllCookies();  // delete cookies on the browser
			
			driver.get("https://www.amazon.com/");
			
			driver.getCurrentURL();
			
		}
    }
