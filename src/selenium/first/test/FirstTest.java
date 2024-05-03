package selenium.first.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
public static void main(String[] args) throws InterruptedException {
	System.out.println("hello world from first test");
	// setting the browser configuration
	System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	
	String actualbrowserTitle=driver.getTitle();
	String expectedBrowserTitle="google";
	
	if(expectedBrowserTitle.equalsIgnoreCase(actualbrowserTitle)) 
	{
		System.out.println("PASSED: Browser Title validated");
	}
	else 
	{
	System.out.println("FAILED: Browser Title did not match" + actualbrowserTitle);	
	}
	
	driver.findElement(By.name("q")).sendKeys("seleniumhq");
	Thread.sleep(3000);
	driver.findElement(By.name("q")).submit();
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	Thread.sleep(1000);
	
	driver.navigate().forward();
	//driver.quit(); // closing all the browser window
	driver.close(); // closing the browser
}
}
