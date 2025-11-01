package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept8 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//Webelement --->sendkeys 
		
		WebElement fn = driver.findElement(By.id("input-firstname"));
		
		String fs = "Rajesh";
		
		StringBuilder sb = new StringBuilder("Kumar");
		
		StringBuffer sbf = new StringBuffer("Bangalore");
		
		fn.sendKeys(fs ,",", sb, ",",sbf);
		
		
		WebElement ln = driver.findElement(By.id("input-lastname"));
		
	//	ln.sendKeys(null); //illegal Argument Exception
		
		
			
			
	
	}

}
