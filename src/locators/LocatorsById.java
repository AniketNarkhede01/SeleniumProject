package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsById {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("locators");

		System.out.println("hello world from first test");
		// setting the browser configuration
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.id("email")).sendKeys("sqaguru@gmail.com");

		driver.findElement(By.id("pass")).sendKeys("password123");

		driver.findElement(By.id("login")).click();

		driver.close();
		
		
		

	}

}
