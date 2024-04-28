package com.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void LaunchAUT() throws InterruptedException
	{
		//locate the driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Drivers\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		//intiate object for chromeDriver
		WebDriver driver=new ChromeDriver();
		//Launch the application URL
		driver.get("https://www.flipkart.com/");
		//lets wait some time
		Thread.sleep(2000);
		//convert min to max
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
