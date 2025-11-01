package Selenium;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForWindows {

static WebDriver driver;
	
	public static void main(String[] args){
		
		 driver= new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
						
	WebElement fb_ele =driver.findElement(By.xpath("//img[@alt='facebook']"));
	
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		
		fb_ele.click();
		
		
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//	wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		if(waitForWindow(2, 5)) {
		
		Set<String> handles =driver.getWindowHandles();
			Iterator<String>it = handles.iterator();
			
			String parentWindowId = it.next();
			System.out.println("parent window Id is " +parentWindowId);
			
			String childWindowId = it.next();
			System.out.println("child window Id is " +childWindowId);
			
			
			driver.switchTo().window(childWindowId);
			System.out.println("title of child window is " +driver.getTitle());
			
			driver.close();
			
			driver.switchTo().window(parentWindowId);
			System.out.println("title of parent window is " +driver.getTitle());
		}
			
	
}
	
	public static boolean waitForWindow(int expectedNumberofWindows, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			return wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberofWindows));
		}
		catch(TimeoutException e) {
			return false;
		}
	}
	
	
	
}