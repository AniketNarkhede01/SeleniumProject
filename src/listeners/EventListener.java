package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.WebDriverListener;

import webElement.EventFiringWebDriver;

public class EventListener {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\TestSelenium\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		EventFiringWebDriver eventsDriver=new EventFiringWebDriver(driver);
		MyEventHandler myEventHandler=new MyEventHandler();
		eventsDriver.register(myEventHandler);
		driver.get("http://omayo.blogspot.com/");
		driver.navigate().to("http://omayo.blog//omayo.blogspot.com/");

	}

}
