package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameDemo {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Hello");
		
		driver.switchTo().frame(driver.findElement(By.id("frm1")));

		Thread.sleep(2000);
		Select couserDD = new Select(driver.findElement(By.id("course")));
		couserDD.selectByVisibleText("Python");
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("World");

	}

}
