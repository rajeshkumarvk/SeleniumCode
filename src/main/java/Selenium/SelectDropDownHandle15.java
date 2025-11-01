package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandle15 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		//dropdown
		//if htmltag <select> , please use select class- default class in Selenium
		
		driver = new ChromeDriver();
		
	//	driver.get("https://www.facebook.com/r.php?entry_point=login");
		
	
		
		
		Thread.sleep(1000);
//		
//		By day = By.id("day");
//		By month = By.id("month");
//		By year = By.id("year");
		
		
//		WebElement dayele = driver.findElement(day);
//		WebElement monthele = driver.findElement(month);
//		WebElement yearele = driver.findElement(year);
//		
//		Select select = new Select(dayele);
//		select.selectByIndex(0);
//		
//		Select select2 = new Select(monthele);
//		select2.selectByVisibleText("May");
//		
//		
//		Select select3 = new Select(yearele);
//		select3.selectByValue("2020");
	
		
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		By country =By.xpath("//select[@id='Form_getForm_Country']");
		
//		doSelectDropDownbyIndex(day, 20);
//		doSelectDropDownbyIndex(month, 10);
//		doSelectDropDownbyIndex(year, 40);
//		
//		boolean flag = doSelectDropDownbyIndex(day, 100);
//		System.out.println(flag);
//		doSelectDropDownbyVisibleText(month, "Dec");
//		doSelectDropDownbyValue(year, "2001");
		
		doSelectDropDownbyValue(country, "Andorra");
		doSelectDropDownbyValue(country, "tttt");


	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static boolean doSelectDropDownbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		try{
			
			select.selectByIndex(index);
			return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(index + " is not present");
			return false;
		}
		
	}
	
	public static boolean doSelectDropDownbyVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		try{
			select.selectByVisibleText(visibleText);
			return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(visibleText + " is not present");
			return false;
		}
	}
	
	public static boolean doSelectDropDownbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		try{
			select.selectByVisibleText(value);
			return true;
		}
		catch(NoSuchElementException e) {
			System.out.println(value + " is not present");
			return false;
		}
	}
}
