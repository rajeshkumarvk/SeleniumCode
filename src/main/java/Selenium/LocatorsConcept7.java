package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept7 {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//1. by id-  mostly unique attribute and should be recommended first use- I
		
		driver.findElement(By.id("input-firstname")).sendKeys("rajesh");
		
		//2. By name - attribute (may be unique or duplicate) should check and use -II
		
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		
		//3, by classname- attribute- Mostly duplicate and should be used when unique- III
		//driver.findElement(By.className("form-control")).sendKeys("raj@gmail.com");
		
		//form-control - 1of 7 - duplicate
		//img-responsive -1 of 1 - unique
		
		//driver.findElement(By.className("img-responsive")).click();
		
		//4. by xpath - not attribute- address of the webelement in the DOM.
		//dynamic elements handling
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("raj@gmail.com");
		
		//5. by CssSelector - not attribute
		//dynamic elements handling
		
		driver.findElement(By.cssSelector("#input-telephone")).sendKeys("8397464433");
		
		//6. by linkText- only for links
		//htmltag should be <a>
		
		driver.findElement(By.linkText("Login")).click();
		
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. by partiallinktext- only for links

	//	driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//8. by tagName
		
		//String header =driver.findElement(By.tagName("h2")).getText();
		//System.out.println(header);
		
		By header = By.tagName("h2");
		
		String actHeader = doElementGetText(header);
		if(actHeader.equals("New Customer")) {
			System.out.println("header is correct --PASS");
		}

	}
	
	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		System.out.println(eleText);
		return eleText;
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
