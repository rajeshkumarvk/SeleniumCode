package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShadowDOMElement {	
	
//shadow dom is a light weight container that includes the number of elements inside the shadowDom to provide the security 
//if the application is full of shadow DOM use playwright instead of selenium	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom");
		
		Thread.sleep(3000);
		
//	String script ="return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")";
//		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//				
//		WebElement pizza = (WebElement)js.executeScript(script); //it will give the html element to convert as WebElement, cast it
		
//		Thread.sleep(500);
//		
//		pizza.sendKeys("Veg pizza");
		
		WebElement frame = driver.findElement(By.cssSelector("iframe#pact1"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(frame));
		driver.switchTo().frame(frame);
			
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Destiny']")).sendKeys("test");
			
	
		//driver.findElement(By.id("pizza")).sendKeys("Veg-pizza");
		
		
		
		

	}

}
