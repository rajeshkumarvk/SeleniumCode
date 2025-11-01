package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		
//		String fn= firstname.getDomAttribute("placeholder");
	//	String fn = firstname.getDomAttribute("placeholder");
//		System.out.println(fn);
//		
//		String fs= firstname.getDomProperty("tagName");
		
	//	firstname.getDomProperty("tagname");
//		
//		System.out.println(fs);
//		
//	String isDisabled = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("disabled");
//		
//		System.out.println(isDisabled);
		
		//webelement:
		//1. DOM Attribute
		//2. DOM Property
		
//	String defaultValue = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).getDomProperty("defaultValue");
//	
//	System.out.println(defaultValue);
		
		By fnfield = By.id("input-firstname");
		String domattr =getElementDOMAttributeValue(fnfield, "placeholder");
		System.out.println(domattr);
		
		String domprop =getElementDOMPropertyValue(fnfield, "tagName");
		System.out.println(domprop);

	}
	
	public static String getElementDOMAttributeValue(By locator , String attrName) {
		return getElement(locator).getDomAttribute(attrName);
	}
	
	public static String getElementDOMPropertyValue(By locator, String propName) {
		return getElement(locator).getDomProperty(propName);
	}
	
  public static WebElement getElement(By locator) {
	  return driver.findElement(locator);
	  
  }
}
