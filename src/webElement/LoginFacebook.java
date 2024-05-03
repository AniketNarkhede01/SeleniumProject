package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com"); // perfor

		WebElement weUserName = driver.findElement(By.id("email"));

		// boolean hasUserNameEnabled = driver.findElement(By.id("email")).isEnabled();
		boolean hasUserNameEnabled = weUserName.isEnabled();

		if (hasUserNameEnabled == true) {

			Thread.sleep(2000);

			// driver.findElement(By.id("email")).sendKeys("an");
			weUserName.sendKeys("1");

			Thread.sleep(2000);

			// boolean hasPasswordEnabled = driver.findElement(By.id("pass")).isEnabled();
			WebElement wePassword = driver.findElement(By.id("pass"));
			
			boolean hasPasswordEnabled = wePassword.isEnabled();
			
			if (hasPasswordEnabled == true) {

				driver.findElement(By.id("pass")).sendKeys("1");

				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@type='submit']")).click();

				Thread.sleep(1000);
               
				WebElement createUserElement=driver.findElement(By.linkText("Forgotten password?"));
				boolean hasForgetPasswordLinkDisplayed=createUserElement.isDisplayed();
				String buttonName=createUserElement.getText();
				System.out.println("The forgetpassword button is : " +buttonName);
				/*
				 * boolean hasForgetPasswordLinkDisplayed =
				 * driver.findElement(By.linkText("Forgotten password?")) .isDisplayed();
				 */
				System.out.println("The hasForgetPasswordLinkDisplayed ? " + hasForgetPasswordLinkDisplayed);

			} else {
				System.out.println("Username field was not enabled");
			}
			driver.quit();
		}
	}
}
