package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	driver.get("https://bigbasket.com/");
		
		//partial scrolling
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
	//	act.sendKeys(Keys.PAGE_DOWN).perform();
		
	//	Thread.sleep(2000);
		
	//	act.sendKeys(Keys.PAGE_UP).perform();
		
		//bottom or footer of the page
		
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
	
	//to top of the page
	
		Thread.sleep(2000);
	
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).perform();
	
	//scroll to element
	
	act
	.scrollToElement(driver.findElement(By.linkText("OpenCart")))
		.pause(2000)
			.click(driver.findElement(By.linkText("OpenCart")))
				.perform();

	}

}
