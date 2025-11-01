package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	static WebDriver driver;
	
	public static void main(String[] args) {

	//Explicit Wait
		
//Wait(I): until();<---- FluentWait(C): until()+other methods <----extends WebDriverWait(C)-No methods
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By pwdID = By.id("input-password");
		By loginBtn	= By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement email_ele = wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//		email_ele.sendKeys("rajesh@gmail.com");
		
	//	driver.findElement(pwdID).sendKeys("test123");
	//	driver.findElement(loginBtn).click();
		
		waitForElementPresence(emailId, 10).sendKeys("rajesh@gmail.com");
		getElement(pwdID).sendKeys("123@123");
		getElement(loginBtn).click();
		

	}
	
	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
