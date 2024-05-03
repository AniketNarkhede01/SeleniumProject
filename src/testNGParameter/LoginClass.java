package testNGParameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class LoginClass {
	WebDriver driver;
	
	@Parameter({"browser"})
	@Test
	public void launchURLTest(String browser) 
	{
		System.out.println("Running browser is :" + );
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		}
		else if(browser.equals("firfox")) 
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie")) 
		{
			driver=new InternetExplorerDriver();
		}
		else if(browser.equals("safari")) 
		{
			driver=new SafariDriver();
		}
		driver.get("http://www.freecrm.com");
	}
	
	@Parameter("username","password")
	@Test()
	public void loginTest(String username,String password) 
	{
		driver.findElement(By.name("username")).sendKeys("username");
		driver.findElement(By.name("password")).sendKeys("password");
	}

}
