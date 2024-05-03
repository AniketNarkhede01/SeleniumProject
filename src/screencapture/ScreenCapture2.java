package screencapture;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenCapture2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chromedriver.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");

		Thread.sleep(2000);
		driver.findElement(By.name("userName")).sendKeys("aniket");

		CaptureScreenshotFormat("userName", driver);

		driver.findElement(By.name("password")).sendKeys("narkhede");

		CaptureScreenshotFormat("password", driver);

		driver.findElement(By.name("submit")).click();

		CaptureScreenshotFormat("submit", driver);

		driver.quit();

	}

	private static void CaptureScreenshotFormat(String screenName, WebDriver driver) throws IOException {
		File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(screenShot, new File("E:\\TestSelenium\\resources\\ScreenShot\\"+screenName+".PNG"));

	}

}
