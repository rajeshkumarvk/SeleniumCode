package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases10 {

	static WebDriver driver;
	
	public static void main(String[] args) {
		

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
				
	//	WebElement ele = driver.findElement(By.id("input-email11"));//NosuchElement Exception
		
//		  List<WebElement> eleList =driver.findElements(By.id("input-email11"));
//		 System.out.println(eleList);
//		 System.out.println(eleList.size());
		
//		By emailId= By.id("input-email1");
//		System.out.println(getElementsDisplayed(emailId));
//		
//		By forgotPasswordLink= By.linkText("Forgotten Password");
//		if(getElementsDisplayed(forgotPasswordLink, 2)) {
//			System.out.println("forgot password is coming 2 times on the page");
//		}
//		  
//	}
//	
//	public static boolean getElementsDisplayed(By locator) {
//		 if(getElements(locator).size()==1) {
//			 System.out.println("element :" +locator +" is displayed once in the page");
//			 return true;
//		 }
//		 return false;
//	}
//
//	public static boolean getElementsDisplayed(By locator, int value) {
//		 if(getElements(locator).size()==value) {
//			 System.out.println("element :" +locator +" is displayed  in the page " +value +" times");
//			 return true;
//		 }
//		 return false;
//	}
		
		By emailId = By.id("input-email1");
		System.out.println(getElementDisplayed(emailId));
		
		By forgotPwdLink =By.linkText("Forgotten Password");
		
		if(getElementDisplayed(forgotPwdLink, 2)) {
			System.out.println("forgot password is coming 2 times on the page");
		}

	}
	
	public static boolean getElementDisplayed(By locator) {
		if(getElements(locator).size()==1) {
			System.out.println("element : " +locator +" is dispalyed once in the page");
			return true;
		}
		return false;
	}
	
	public static boolean getElementDisplayed(By locator, int value) {
		if(getElements(locator).size()==value) {
			System.out.println("element : " +locator +" is dispalyed " +value +" times in the page");
			return true;
		}
		return false;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
