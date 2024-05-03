package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByName {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("locators");

		System.out.println("hello world from first test");
		// setting the browser configuration
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("aniket");

		Thread.sleep(2000);

		driver.findElement(By.name("pass")).sendKeys("narkhede");
		Thread.sleep(2000);

		int numberOfLinks = driver.findElements(By.tagName("a")).size(); // it will show total link present in website
		System.out.println("number of links = " + numberOfLinks);
		/*
		 * int numberOfTables = driver.findElements(By.tagName("table")).size(); // it
		 * will show total of tables which is present in website page
		 * System.out.println("number of tables is = " + numberOfTables);
		 */
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for(WebElement link:allLinks) 
		{
			System.out.println("Link Text = "+link.getText());
		}
        System.out.println("Total link present in facebook login page " + allLinks.size());
		/*
		 * Dimension numberOfLinks = driver.findElement(By.tagName("a")).getSize();
		 * System.out.println("number of links is = " + numberOfLinks);
		 * 
		 * Dimension numberOfTable = driver.findElement(By.tagName("table")).getSize();
		 * System.out.println("number of table is = " + numberOfTable);
		 */
		// driver.findElement(By.partialLinkText("forgotten"));
		// driver.close();
		driver.quit();
	}

};