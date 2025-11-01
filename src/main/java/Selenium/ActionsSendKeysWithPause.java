package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSendKeysWithPause {

	//In order to use pause and send values use char array
	
	
	//sendkeys use CharSequence which String, String builder, String buffer 
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	//	Actions act = new Actions(driver);
		
	//	WebElement email = driver.findElement(By.id("input-email"));
		
	//	String value = "Rajesh_Kumar@gmail.com";
		
		
		
	//	char[] charval = value.toCharArray();
		
	//	for(char ch: charval) {
			
	//	act.sendKeys(email, String.valueOf(ch)).pause(400).perform();

//	}
		
		By email =By.id("input-email");
      
	    doSendKeysWithPause(email, "test@test123.com ", 500);
	}
	

	public static void doSendKeysWithPause(By locator, String value, long pauseTime) {
		Actions act = new Actions(driver);
		char val[]= value.toCharArray();
		for(char ch : val) {
			act.sendKeys(getElement(locator), String.valueOf(ch)).pause(pauseTime).build().perform();
		}
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
