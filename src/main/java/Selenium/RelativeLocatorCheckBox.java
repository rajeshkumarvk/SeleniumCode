package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorCheckBox {

	public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
		
	//driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
	//WebElement  ele = driver.findElement(By.cssSelector("a.agree"));
	
	WebElement ele1 =driver.findElement(By.cssSelector("form .control-label[for='input-email']"));
	
	WebElement ele2 =driver.findElement(By.cssSelector("form .control-label[for='input-password']"));
	
	Thread.sleep(4000);
	
	//driver.findElement(RelativeLocator.with(By.xpath("//input[@name='agree']")).toRightOf(ele)).click();
	
	//String text = driver.findElement(with(By.cssSelector("form div.pull-right")).near(ele)).getText();
	
	//System.out.println(text);
	
	driver.findElement(with(By.cssSelector("input#input-email")).below(ele1)).sendKeys("test@test123");
	driver.findElement(with(By.cssSelector("input#input-password")).below(ele2)).sendKeys("test@123");
	
	

	}

}
