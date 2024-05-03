package actionClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassesDemo {
	public static void main(String[] args) {
		/*
		 * Methods:-
		 * 
		 * action class enables us to handle different mouse and keyboard events.
		 * 
		 * click() , doubleClick() , contextClick() ,moveToElement() , sendKeys () ,
		 * keyDown() , keyDown() , keyUp() , dragAndDrop() , dragAndDropBy(), build() ,
		 * perform()
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement blogMenuElement = driver.findElement(By.id("blogsmenu"));

		actions.moveToElement(blogMenuElement).perform();

		WebElement sbaOptionElement = driver.findElement(By.xpath("//a/span[text()='SeleniumByArun']"));

		actions.moveToElement(sbaOptionElement).click().build().perform();
	}

}
