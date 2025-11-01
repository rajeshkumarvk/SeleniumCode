package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	
	public static void main(String[] args) throws InterruptedException {
	//This is available from Selenium 4.x: RelativeLocator
		
//					  above
//						|
//						|
//				left--- ele---Right
//				   near	|
//						|
//					  below
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.aqi.in/dashboard/india");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Deo']"));
		
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String RightAQIStatus = driver.findElement(with(By.cssSelector("div.aqi-status")).toRightOf(ele)).getText();
		System.out.println(RightAQIStatus);
		
		String RightAQILevel = driver.findElement(with(By.cssSelector("div.aqi-level")).toRightOf(ele)).getText();
		System.out.println(RightAQILevel);
		
		
		String BelowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(BelowCity);
		
		String AboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(AboveCity);
		
		
		String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
		System.out.println(nearCity);
		
		
		
		
		
		

	}

}
