package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldText {

	static WebDriver driver;
	public static void main(String[] args) {
	
	driver = new ChromeDriver();
		
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	WebElement fn=  driver.findElement(By.id("input-firstname"));
	  
	  fn.sendKeys("raj");
	

	  WebElement ln=  driver.findElement(By.id("input-lastname"));
		
	  ln.sendKeys("heggade");
	  
	WebElement email=  driver.findElement(By.id("input-email"));
	
	  email.sendKeys("raj@test.com");
	  
	  WebElement tele=  driver.findElement(By.id("input-telephone"));
		
	  tele.sendKeys("98456765432");
	  
	  WebElement pass=  driver.findElement(By.id("input-password"));
		
	  pass.sendKeys("test123");
	  
	  WebElement confpass=  driver.findElement(By.id("input-confirm"));
		
	  confpass.sendKeys("test123");
	  
	  String fnVal= fn.getDomProperty("value");
	  String lnVal= ln.getDomProperty("value");
	  String emailVal= email.getDomProperty("value");
	  String teleVal= tele.getDomProperty("value");
	  String passVal= pass.getDomProperty("value");
	
	 String passconfVal= confpass.getDomProperty("value");
	 
	 System.out.println(fnVal + " , "+lnVal +" , " + emailVal +" ," +teleVal + " ," +passVal +" ," +passconfVal);
	
	
		
		

	}

}
