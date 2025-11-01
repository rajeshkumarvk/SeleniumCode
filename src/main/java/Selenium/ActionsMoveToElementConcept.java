package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
				
		By spiceClub= By.xpath("(//div[text()='SpiceClub'])[1]");
		
		By earnPoints = By.xpath("//div[text()='Earn Points']");
		
		By addons = By.xpath("//div[text()='Add-ons']");
		
		By visaServices = By.xpath("(//div[text()='Visa Services'])[1]");
		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(driver.findElement(addons)).build().perform();
//		
//		Thread.sleep(2000);
//		
//		driver.findElement(visaServices).click();
		
		
		handleParentSubMenu(spiceClub, earnPoints);
	

	}
	
	
	public static void handleParentSubMenu(By parentMenu, By subMenu) throws InterruptedException {
		
		Actions act = new Actions(driver);
	
		act.moveToElement(getElement(parentMenu)).build().perform();
		Thread.sleep(2000);
		getElement(subMenu).click();
	}
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}

}
