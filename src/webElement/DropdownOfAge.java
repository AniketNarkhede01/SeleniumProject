package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownOfAge {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://economictimes.indiatimes.com/news/age-calculator?from=mdr");

		driver.manage().window().maximize();

		Select birthMonth = new Select(driver.findElement(By.id("month")));

		//birthMonth.selectByIndex(7);
		birthMonth.selectByVisibleText("Aug");

		Select day = new Select(driver.findElement(By.id("day")));
		//day.selectByIndex(25);
		day.selectByVisibleText("26");

		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1996");

	}

}
