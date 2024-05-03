package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByCss {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("locators");

		System.out.println("hello world from first test");
		// setting the browser configuration
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);
	    driver.findElement(By.cssSelector("input#email")).sendKeys("aniket");

		Thread.sleep(2000);
     //   driver.findElement(By.cssSelector("input[type='password']")).sendKeys("narkhede");
        
        driver.findElement(By.cssSelector("input.inputtext[type='password']")).sendKeys("narkhede");
		
		
		driver.quit();
	}

}
