package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysClickWithDisableElement8 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
		WebElement pass =driver.findElement(By.id("pass"));
		
		pass.sendKeys("testing");//Element not Intractable exception
		
	
		pass.click(); //click on disabled element. Doesn't throw any error

	}

}
