package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFieldText {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		WebElement emailid = driver.findElement(By.id("input-email"));
		 emailid.sendKeys("rajesh@gmail.com");
		
		String text = emailid.getDomProperty("value");
		System.out.println(text);
		
		
		

	}

}
