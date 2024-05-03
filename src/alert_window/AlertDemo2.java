package alert_window;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.xpath.XPathExpression;

public class AlertDemo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("aniket");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();

		String alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertMessage is : " + alertMessage);

		if (alertMessage.equalsIgnoreCase("Do you really want to delete this customer?")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}

		Thread.sleep(2000);
		Alert secondAlert = driver.switchTo().alert();
		alertMessage = driver.switchTo().alert().getText();
		System.out.println("alertMessage is 2nd time " + alertMessage);
		secondAlert.accept();
		// driver.switchTo().alert().accept();
		Thread.sleep(2000);

		try {
			Alert alert2 = driver.switchTo().alert();

			if (alert2 != null) {
				alert2.accept();
			} else {
				System.out.println("No alert found");
			}
			driver.quit();

		} catch (NoAlertPresentException Nape) {
			System.out.println("No alert found exception: ");
		}
		System.out.println("Test completed");
		driver.quit();
	}

}
