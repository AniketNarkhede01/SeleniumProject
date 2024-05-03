package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		driver.findElement(By.id("login1")).sendKeys("aniket");

		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("aniket@123");

		Thread.sleep(2000);
		driver.findElement(By.className("lblkeepme")).click();

		Thread.sleep(2000);
		// driver.findElement(By.className("signinbtn")).click();
		// driver.findElement(By.name("proceed")).click();

		// driver.findElement(By.linkText("Forgot Password?")).click();
		driver.findElement(By.partialLinkText("Password")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.navigate().forward();
	    
		
	


	}

}
