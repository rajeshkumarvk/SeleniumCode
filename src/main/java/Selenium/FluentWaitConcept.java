package Selenium;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitConcept {

	public static void main(String[] args) {
	// WebDriverWait(C)(no methods)--->FluentWait(C)(until{}, other methods)-->Wait(I):until();
		
//WebDriverWait(C) Is-A Relationship with FluentWait. It inherits all the methods of FluentWait
	//	and doesn't have any own methods.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By userName = By.name("username");
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(10))
								.pollingEvery(Duration.ofSeconds(2))
								.ignoring(NoSuchElementException.class)
								.ignoring(StaleElementReferenceException.class)
								.withMessage("===Element not found====");
		
	WebElement username_ele = wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
	username_ele.sendKeys("Rajesh@gmail.com");
		
		

	}

}
