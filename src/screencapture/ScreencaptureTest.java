package screencapture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreencaptureTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("aniket");
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(screenShot, new File("E:\\TestSelenium\\resources\\ScreenShot\\userName.PNG"));
        
		driver.findElement(By.name("password")).sendKeys("narkhede");
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
