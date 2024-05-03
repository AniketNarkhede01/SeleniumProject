package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example implements WebDriverEventListener {
    // Implement methods of WebDriverEventListener interface
    // e.g., beforeNavigateTo, afterNavigateTo, beforeClickOn, afterClickOn, etc.
}
public class ListenerExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        WebDriverEventListener listener = new Example();
        eventDriver.register(listener);
        // Now use eventDriver for WebDriver operations
        eventDriver.get("https://www.example.com");
        // Close the browser
        eventDriver.quit();
    }
}

