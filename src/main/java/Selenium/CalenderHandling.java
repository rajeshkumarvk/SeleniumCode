package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandling {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			
			driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
			
			driver.findElement(By.id("datepicker")).click();	
			
			
			
			
		
			
		futureDate("November 2025" , "30");
			
		//	earlierDate("February 2025" , "28");

	}
	
	public static void futureDate(String expmonthyear, String day) {
		
		if(expmonthyear.contains("April")|| expmonthyear.contains("June")
			||expmonthyear.contains("September")||expmonthyear.contains("November") && Integer.parseInt(day)>30){
			System.out.println("Incorrect date and please provide the valid date");
			return;
			}
		
		if(expmonthyear.contains("February") && Integer.parseInt(day)>29) {
			System.out.println("Incorrect date and please provide the valid date");
			return;
		}
		
		if(Integer.parseInt(day)>31) {
		System.out.println("Incorrect date and please provide the valid date");
		return;
		}
		
		if(Integer.parseInt(day)<=0) {
			System.out.println("Incorrect date and please provide the valid date");
			return;
			}
		
		String actmonthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
		System.out.println(actmonthyear);
		
		while(!actmonthyear.equalsIgnoreCase(expmonthyear)) {
			
			//pagination logic- Next
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			actmonthyear = driver.findElement(By.className("ui-datepicker-title")).getText();
			
		}
		
		driver.findElement(By.linkText(day)).click();	
			
	}
	
	
	
	public static void earlierDate(String expMonthyear, String day) {
		
		if(expMonthyear.contains("February") && Integer.parseInt(day)>29) {
			System.out.println("wrong date , please provide correct date");
			return;
		}
		
		if(Integer.parseInt(day)>31) {
			System.out.println("wrong date , please provide correct date");
			return;
		}
		
		if(Integer.parseInt(day)<=0) {
			System.out.println("wrong date , please provide correct date");
			return;
		}
		
		String actMonthyear =driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(actMonthyear);
		
		while(!actMonthyear.equalsIgnoreCase(expMonthyear)) {
			
			//pagination logic - prev
			
	driver.findElement(By.xpath("//span[text()='Prev']")).click();
	actMonthyear =driver.findElement(By.className("ui-datepicker-title")).getText();
			
			
			
		}
		
		driver.findElement(By.linkText(day)).click();
		
		
	}

}
