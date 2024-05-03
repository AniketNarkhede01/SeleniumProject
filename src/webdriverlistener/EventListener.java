package webdriverlistener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class EventListener implements WebDriverListener{

	
	
	@Override
	public void afterGet(WebDriver driver, String url) {
		System.out.println("after navigating url:" + url);
	}

	@Override
	public void beforeGet(WebDriver driver, String url) {
		System.out.println("Before navigating url:" + url);
	}
	
}