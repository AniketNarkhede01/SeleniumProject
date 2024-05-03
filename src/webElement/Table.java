package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

		WebElement webtable = driver.findElement(
				By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));

		int totalRows = webtable
				.findElements(By.xpath(
						"/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"))
				.size();
		System.out.println("Total number of rows = " + totalRows);

		int totalColumns = webtable
				.findElements(By.xpath(
						"/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody//td"))
				.size();
		System.out.println("Total number of columns = " + totalColumns);

		Thread.sleep(2000);
		WebElement table = driver
				.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table")); // show all
																												// links

		// WebElement table=
		// driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]"));//
		// show only 3rd link
		List<WebElement> links = table.findElements(By.tagName("a"));

		System.out.println(links.size());

		for (WebElement link : links) {
			System.out.println("Clicking the link: " + link.getText());
		}

		driver.quit();
	}

}
