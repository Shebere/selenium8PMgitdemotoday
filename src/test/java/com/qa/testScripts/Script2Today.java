package com.qa.testScripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Script2Today extends Base {
	
	@Test
	public void Test1() throws InterruptedException
	{
	setup("https://ironspider.ca/forms/checkradio.htm");
		
		Thread.sleep(3000);
		
		// Checkbox
		
		boolean sel= driver.findElement(By.xpath("//input[@value='red']")).isSelected(); 
		
	
		driver.findElement(By.xpath("//input[@value='red']")).click();
		
			System.out.println("checkbox is selected");
		
		driver.findElement(By.xpath("//input[@value='blue']")).click();
		driver.findElement(By.xpath("//input[@value='orange']")).click();
		
		Thread.sleep(5000);
		
		

	}
	}


