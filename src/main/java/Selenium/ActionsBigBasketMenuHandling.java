package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsBigBasketMenuHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
	
		By firstLevelMenu = By.xpath("(//span[text()='Shop by'])[2]");
		By secondLevelMenu = By.linkText("Fashion");
		By thirdLevelMenu = By.linkText("Fashion Essentials");
		By forthLevelMenu = By.linkText("Socks");
		
//		Actions act = new Actions(driver);
//		Thread.sleep(2000);
//		driver.findElement(firstLevelMenu).click();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(secondLevelMenu)).build().perform();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(thirdLevelMenu)).build().perform();
//		Thread.sleep(2000);
//		driver.findElement(forthLevelMenu).click();
	}

	
	public static void doMoveToElement(By locator) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();
		Thread.sleep(2000);
		
	}
	public static void handle4LevelMenu(By firstLevelMenu, By secondLevelMenu, By thirdLevelMenu, By forthLevelMenu) throws InterruptedException {
		
		doClick(firstLevelMenu);
		Thread.sleep(2000);
		doMoveToElement(secondLevelMenu);
		Thread.sleep(2000);
		doMoveToElement(thirdLevelMenu);
		Thread.sleep(2000);
		doClick(forthLevelMenu);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
		
	}
	
	public static WebElement  getElement(By locator) {
		return driver.findElement(locator);
	}
}
