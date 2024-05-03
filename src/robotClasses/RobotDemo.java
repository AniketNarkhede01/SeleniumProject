package robotClasses;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {
	/*
	 * 1. predefined class in java 2. basically robot class simulate the keyboard
	 * and mouse action 3. Predefined methods :-
	 * KeyPress(),KeyRelease(),mouseMove,mousePress(),mouseRelease(),mouseWheel(),
	 * delay(),createScreenCapture(),
	 * 
	 * 4.capturing screenshot two ways :-1.Rectangle 2.Dimention
	 */

	public static void main(String[] args) throws AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aniket\\Desktop\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();


		driver.get("https://tutorialsninja.com/demo/");

		driver.findElement(By.name("search")).sendKeys("HP");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		// i am getting an error of to update cpd 122 version so let me know how to solve this issue.
		
//		  Rectangle rectangle = new Rectangle(25, 50, 1000, 300); BufferedImage imgSRC
//		  = robot.createScreenCapture(rectangle); ImageIO.write(imgSRC, "PNG", new
//		  File("E:\\TestSelenium\\resources\\ScreenShot.robot.png"));
		 

		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle r = new Rectangle(d);
		BufferedImage srcFile = robot.createScreenCapture(r);
		ImageIO.write(srcFile, "PNG", new File("E:\\TestSelenium\\resources\\ScreenShot.robot3.png"));
		
		robot.mouseWheel(15);
		robot.mouseWheel(-8);
		robot.delay(2000);

	}

}
