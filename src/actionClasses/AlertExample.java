package actionClasses;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.example.com");
        // Click a button to trigger an alert
        driver.findElement(By.tagName("button")).click();
        // Switch to the alert
        Alert alert = driver.switchTo().alert();
        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);
        // Accept the alert
        alert.accept(); // You can also use alert.dismiss() to dismiss/cancel the alert.
        driver.quit();
    } }                                                             


