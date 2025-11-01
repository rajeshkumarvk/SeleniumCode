package Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	
	static WebDriver driver;
	
	public static void main(String[] args) {

		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //sel 4.x
		//login page: 10 sec
		//e1:  10 --> 2 : 2
		//e2:  10 --> 5 : 5
		//e3:  10 --> 4 : 4
		
		//Implicit is global wait and it is applied to all the web elements 
		// and it is not applicable to non-web elements such as title, url, alerts, windows
		
		//Disadvantage are:
		//1. It is applied globally to all the web elements 
		//2. It is un-neccesary(implicit wait method) called for each element and it overhead and 
		//performance issue, some may not require wait time but it is applied unnecessary
		//3. It cannot be applied for non-web elements

		
		//product page: 15 seconds
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); //sel 4.x
		//e4:
		//e5:
	}

}
