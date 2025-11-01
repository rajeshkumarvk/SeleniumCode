package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClassConcept14 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/legacy");
		
		Thread.sleep(4000);
		//1. with Classname- cascading classes will not work. Invalid
		//InvalidSelectorException
		
	//	driver.findElement(By.className("TextInput__StyledInput-sc-1vx01eh-0 bUtxmd")).sendKeys("test@12.com");
		
		//2. Use CSSselctor- for multiple classes. Valid
		
	//	driver.findElement(By.cssSelector("input.TextInput__StyledInput-sc-1vx01eh-0.bUtxmd")).sendKeys("test@12.com");
		
		//3. Use Xpath- works Valid
		
//		driver.findElement(By.xpath("//input[@class='TextInput__StyledInput-sc-1vx01eh-0 bUtxmd']")).sendKeys("raj@test.com");

		//4. Classname -single works- valid
		
	//	driver.findElement(By.className("TextInput__StyledInput-sc-1vx01eh-0")).sendKeys("test@test.com");
		
		//5. /InvalidSelectorException
		
		//driver.findElement(By.xpath("////[@@id, 'ra']")).click();
	}

}
