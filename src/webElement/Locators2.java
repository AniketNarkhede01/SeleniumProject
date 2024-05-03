package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.manage().window().maximize();
		
	//	driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("abc");
		
		driver.findElement(By.cssSelector("input[id*='log']")).sendKeys("ab"); // using substring
		
		driver.findElement(By.cssSelector("input[id*=pass]")).sendKeys("123");
	}

}
