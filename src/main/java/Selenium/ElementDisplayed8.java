package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed8 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
	//	WebElement firstname = driver.findElement(By.id("input-firstname11"));
		
	//	boolean f1 = firstname.isDisplayed();//NoSuchElementException
		
	//boolean b1 =driver.findElement(By.id("input-firstname11")).isDisplayed();
	//System.out.println(b1);
		
	By fs =By.id("input-firstname11");
	
	By image = By.className("img-responsive");
	
	if(isElementDisplayed(image)) {
		System.out.println("element is displayed : PASS");
				
	}
	else {
		System.out.println("element not displayed : FAIL");
	}
	}
	
	
	
	public static boolean  isElementDisplayed(By locator) {
		try{
			return getElement(locator).isDisplayed();
		}
		
		catch(NoSuchElementException e) {
			System.out.println("element is not present in the page");
			return false;
		}
	}

	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
