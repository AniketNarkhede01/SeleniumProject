package alert_window;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMultipleWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentHandle = driver.getWindowHandle();
		System.out.println("parent window-" + parentHandle);
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> handles = driver.getWindowHandles();
		for (String handle : handles) {
			System.out.println(handle);
			if(!handle.equals(parentHandle)) 
			{
				driver.switchTo().window(handle);
				driver.findElement(By.id("firstName")).sendKeys("aniket");
				Thread.sleep(5000);
				driver.close();
			}
		}
		driver.switchTo().window(parentHandle);
		driver.findElement(By.id("name")).sendKeys("narkhede");
		Thread.sleep(2000);
		driver.quit();
	}

}
