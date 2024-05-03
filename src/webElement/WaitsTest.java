package webElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); //
		// applying implicit wait for the test
		// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		driver.findElement(By.name("q")).sendKeys("seleniumHq.org");
		driver.findElement(By.name("q")).submit();
		System.out.println("Search result title : " + driver.getTitle());

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement linkSeleniumHQ =

				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//cite[@class='tjvcx GvPZzd cHaqb' and text()='https://www.seleniumhq.org']")));
		
		System.out.println(linkSeleniumHQ.getText());
		linkSeleniumHQ.click();

		
		driver.quit();

	}

}
