package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GoogleSearchTest {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
//		driver.findElement(By.name("q")).sendKeys("Selenium Automation");
//		
//		Thread.sleep(3000);
		
	//	List<WebElement> suggList =driver.findElements(By.xpath("//div[@class='wM6W7d']/span"));
		
//		System.out.println(suggList.size());
//		
//		for(WebElement e: suggList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.contains("python")) {
//				Thread.sleep(5000);
//				e.click();
//				break;
//			}
//		}
		
		By nameid = By.name("q");
		dosendKeys(nameid, "Selenium Automation");
		
		By xpathele =By.xpath("//div[@class='wM6W7d']/span");
		
		clickElement(xpathele, nameid ,"python");

	}
	
	
	public static void clickElement(By locator,  By query, String value) throws InterruptedException {
		getElement(locator);
		Thread.sleep(3000);
		
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String text = e.getText();
			System.out.println(text);
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	


	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static void dosendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
