package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonAccessibiltyTest {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.co.in/");
		
	//	driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		
//		Actions act = new Actions(driver);
//		
//Action searchAction = act.sendKeys(Keys.TAB)
//							.pause(200)
//							.sendKeys(Keys.TAB)
//							.pause(200)
//							.sendKeys(Keys.TAB)
//							.pause(200)
//							.sendKeys(Keys.TAB)
//							.pause(200)
//							.sendKeys(Keys.TAB)
//							.pause(200)
//							.sendKeys("Mac Book pro")
//							.pause(200)
//							.sendKeys(Keys.ENTER)
//								.build();
		
		//		searchAction.perform();
		
	
	performAction(createAmazonSearchAction("Mac Book pro"));
	}

	public static Action createAmazonSearchAction(String value) {
		Actions act = new Actions(driver);
		
		return
				act.sendKeys(Keys.TAB)
					.pause(200)
					.sendKeys(Keys.TAB)
					.pause(200)
					.sendKeys(Keys.TAB)
					.pause(200)
					.sendKeys(Keys.TAB)
					.pause(200)
					.sendKeys(Keys.TAB)
					.pause(200)
					.sendKeys(value)
					.pause(200)
					.sendKeys(Keys.ENTER)
						.build();	
	}
	public static void performAction(Action action) {
		action.perform();
	}
}
