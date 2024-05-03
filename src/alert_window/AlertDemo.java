package alert_window;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		// three types of alert 1.simple alert 2.confirmation alert 3.prompt alert

		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		// 1.simple alert
//		driver.findElement(By.id("alertBox")).click();
//		Alert simpleAlert = driver.switchTo().alert();
//		System.out.println(simpleAlert.getText());
//
//		Thread.sleep(2000);
//		simpleAlert.accept();
//		Thread.sleep(2000);
//		driver.quit();

		// 2.confirmation alert
//		driver.findElement(By.id("confirmBox")).click();
//		Alert confirmationAlert = driver.switchTo().alert();
//		System.out.println(confirmationAlert.getText());
//	
//		//confirmationAlert.accept();
//		confirmationAlert.dismiss();
//		
//		System.out.println(driver.findElement(By.id("output")).getText());
//
//		driver.quit();
        
		// prompt alert
		driver.findElement(By.id("promptBox")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println(promptAlert.getText());
	
		promptAlert.sendKeys("aniket");
		promptAlert.accept();
		
		System.out.println(driver.findElement(By.id("output")).getText());

		driver.quit();

		
	}

}
