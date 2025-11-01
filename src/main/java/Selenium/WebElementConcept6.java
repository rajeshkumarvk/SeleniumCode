package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementConcept6 {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// create a WebElement + perform action(sendkeys, click, isDisplayed, getText())

		// 1. directly using driver.findelement

		// driver.findElement(By.id("input-email")).sendKeys("rajesh@test.com");
		// driver.findElement(By.id("input-password")).sendKeys("rajesh@test");

		// 2. find element and then perform action. This better than 1st because creating the webelements first 
		//and then we can pass any number of values.

		
		/*
		 * WebElement email = driver.findElement(By.id("input-email")); 
		 * WebElement password = driver.findElement(By.id("input-password"));
		 * 
		 * email.sendKeys("rajesh@test.com"); 
		 * password.sendKeys("rajesh@test");
		 */
		
		//3. By locator- create a webelement and perform action
		 
//		By email = By.id("input-email");
//		By password = By.id("input-password");
		
		//create a webelement
		
//		WebElement emailfield = driver.findElement(email);
//		WebElement pwdfield = driver.findElement(password);
		
		//perform action
//		emailfield.sendKeys("rajesh@test.com");
//		pwdfield.sendKeys("rajesh@123");
		
		
		//4. By locator - create a generic function to get webelement
		
//		By emailfield= By.id("input-email");
//		
//		By passwordfield = By.id("input-password");
//		
//		getElement(emailfield).sendKeys("rajesh@test.com");
//		getElement(passwordfield).sendKeys("rajesh@123");

		
		
		//5. By locator - create generic functions to get element and perform action
		
//		By email = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(email, "rajesh@test.com");
//		doSendKeys(password, "rajesh@123");
		
		//6. By locator- create generic function to get element and perform actions using ElementUtil
		
		By email = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil6  ele = new ElementUtil6(driver);
		ele.doSendKeys(email, "rajesh@test.com");
		ele.doSendKeys(password, "rajesh@123");
		
	}

	
	
//	public static void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//		
//	}
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}

}
