package webdriverlistener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;

import com.google.common.util.concurrent.Service.Listener;

public class Demo {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	   EventListener listener=new EventListener();
	   EventFiringDecorator<WebDriver> decorator = new EventFiringDecorator<WebDriver>(listener);
	   WebDriver decoratedDriver=decorator.decorate(driver);
	   decoratedDriver.get("https://www.amazon.in/");
	   decoratedDriver.quit();
	   
	}

}
