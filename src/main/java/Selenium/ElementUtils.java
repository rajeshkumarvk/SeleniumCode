package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtils {
	private WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
		}
	
	private void nullCheck(CharSequence... value) {
		if(value==null) {
			throw new RuntimeException("value cannot be null");
		}
	}
	public void doSendKeys(By locator, String value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	
	public void doSendKeys(By locator, CharSequence... value) {
		nullCheck(value);
		getElement(locator).sendKeys(value);
	}
	public void doElementClick(By locator) {
		getElement(locator).click();
	}
	
	public String doElementText(By locator) {
		String elementext = getElement(locator).getText();
		System.out.println(elementext);
		return elementext;
		
	}
	
	public  String getElementDomAttribute(By locator, String attribute) {
		nullCheck(attribute);
		return getElement(locator).getDomAttribute(attribute);
	}
	
	public  String getElementDomProperty(By locator, String propvalue) {
		nullCheck(propvalue);
		return getElement(locator).getDomProperty(propvalue);
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
//	================================find Elements Utils ============================================
	
	public List<String> getElementsTextList(By locator) {
		List<WebElement>eleList =getElements(locator);
		List<String>eleTextList = new ArrayList<String>();
		for(WebElement e: eleList) {
			String text =e.getText();
			if(text.length()!=0) {
				System.out.println(text);
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public int getElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println(eleCount);
		return eleCount;
	}
	
	public boolean getElementsDisplayed(By locator) {
		 if(getElements(locator).size()==1) {
			 System.out.println("element :" +locator +" is displayed once in the page");
			 return true;
		 }
		 return false;
	}
	public  boolean getElementsDisplayed(By locator, int value) {
		 if(getElements(locator).size()==value) {
			 System.out.println("element :" +locator +" is displayed  in the page " +value +" times");
			 return true;
		 }
		 return false;
	}
	
	public  void clickElement(By locator, String value) {
		List<WebElement> eleList = getElements(locator);
		System.out.println("total number of elements " +eleList.size());
		for(WebElement e: eleList) {
			String text = e.getText();
			System.out.println(text);						
			if(text.contains(value)) {
				e.click();
				break;
			}
		}
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

}
