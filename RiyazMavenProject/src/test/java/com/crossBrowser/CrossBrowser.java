package com.crossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	WebDriver driver;
	@BeforeClass
	@Parameters("browser")
	public void cross(String bowser) {
		
		switch(bowser.toLowerCase()) 
		{
		case"chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Drivers\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver();
	        driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		    break;
		case"fire":
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Drivers\\geckodriver-v0.34.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
	        driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();
		    break;
		}
		
	}
	
	@Test
	public void getTitle() {
		String actualTitle=driver.getTitle();
		System.out.println("Title of Page :"+actualTitle);
		driver.close();
	}

}
