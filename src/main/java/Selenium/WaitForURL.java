package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForURL {

	static WebDriver driver;
	
	public static void main(String[] args) {
	
	driver = new ChromeDriver();
	
	driver.get("https://orangehrm.com/30-day-free-trial");
	
	WebElement ele =driver.findElement(By.xpath("//a[@href='/en/book-a-free-demo']"));
	
	
	
	JavaScriptUtil js = new JavaScriptUtil(driver);
	js.clickElementByJS(ele);
	

	
	String url =waitForUrlContains("book-a-free-demo", 5);
	System.out.println(url);

	}
	
	public static String waitForUrlContains(String fractionURL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			wait.until(ExpectedConditions.urlContains(fractionURL));
				return driver.getCurrentUrl();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	public static String waitForUrlIs(String URL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try{
			wait.until(ExpectedConditions.titleIs(URL)) ;
				return driver.getCurrentUrl();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}

}
