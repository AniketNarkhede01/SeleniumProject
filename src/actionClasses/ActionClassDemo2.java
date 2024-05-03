package actionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		WebElement emailField = driver.findElement(By.id("input-email"));
		emailField.sendKeys("aniket123@gmail.com");

		WebElement passwordField = driver.findElement(By.id("input-password"));
		passwordField.sendKeys("1234");

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
	}

}
