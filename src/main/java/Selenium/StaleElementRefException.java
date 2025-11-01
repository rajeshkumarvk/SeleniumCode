package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) throws InterruptedException {
		
	//StaleElementException occurs when the page is refreshed or navigate to back and forward.
	//The DOM gets refreshed and the new id got generated so the stale element exception is occured.
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//DOM v1
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
		//DOM v1
		
		firstname.sendKeys("Rajesh");
		
		driver.navigate().refresh();
		
		//DOM v2
		Thread.sleep(1000);
		
		//DOM v2
		firstname = driver.findElement(By.id("input-firstname"));
		
		//DOM v2
		firstname.sendKeys("Veeresh");
		
	}

}
