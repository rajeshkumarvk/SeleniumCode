package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendKeys {

	
	//1. Normal Click: we click
	
	//2. Actions Click: Move to Element and then click(user action)
	
	//3. JavaScript Executor Click	

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		Actions act = new Actions(driver);
		
		WebElement email =driver.findElement(By.id("input-email"));
		WebElement cont = driver.findElement(By.linkText("Continue"));
		
		//Equivalent to calling: Actions.click(element).sendKeys(keysToSend). 
		act.sendKeys(email, "test@123").perform();
		
		//Clicks in the middle of the given element.
		//Equivalent to: Actions.moveToElement(onElement).click()
			act.click(cont).perform();
	}
	
	public static void doActionSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
