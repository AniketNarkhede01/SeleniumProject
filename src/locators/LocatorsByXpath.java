package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsByXpath {
	public static void main(String[] args) throws InterruptedException {

		System.out.println("locators");

		System.out.println("hello world from first test");
		// setting the browser configuration
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input"))
				.sendKeys("aniket");
		Thread.sleep(5000);

		driver.findElement(By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input"))
				.sendKeys("aniket");

		driver.quit();
	}

}
