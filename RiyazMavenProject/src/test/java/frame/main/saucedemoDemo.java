package frame.main;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemoDemo {
	WebDriver  driver;
	public void LaunchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\user\\Desktop\\Drivers\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=120&lwc=1348028");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	}
	
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("7396340919");
		//Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("riyaz123");
		driver.findElement(By.xpath("//input[@name='")).click();
driver.close();
		
	}
// https://www.saucedemo.com/v1/
	public static void main(String[] args) throws InterruptedException {

		saucedemoDemo obj=new saucedemoDemo();
		obj.LaunchAUT();
		obj.login();
	}

}

			

