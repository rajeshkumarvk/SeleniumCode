package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DomProperties {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//String fn= driver.findElement(By.id("input-firstname")).getDomAttribute("name");
		
		//String def= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("defaultValue");
		
		//String def= driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("disabled");
	
		
		//System.out.println(def);
		By path = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
	
		By email= By.id("input-firstname");
		System.out.println(getElementDomAttribute(email,"name"));
		System.out.println(getElementDomProperty(path,"defaultValue"));
	}
	
	public static String getElementDomProperty(By locator, String value) {
		return getElement(locator).getDomProperty(value);
	}

	public static String getElementDomAttribute(By locator, String attribute) {
		return getElement(locator).getDomAttribute(attribute);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
