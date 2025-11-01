package Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithFluentFeatures {

	public static void main(String[] args) {
		// WebDriverWait(C)(no methods)--->FluentWait(C)(until{}, other methods)-->Wait(I):until();
			
	//WebDriverWait(C) Is-A Relationship with FluentWait. It inherits all the methods of FluentWait
		//	and doesn't have any own methods.
		//Suppose, if you want to create your own wait, you can extend FluentWait
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
			
			By userName = By.name("username");
			
			TimeUtil.shortWait();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			
			wait.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.ignoring(StaleElementReferenceException.class)
				.withMessage("===Element is not found=======");
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys("rajesh@test.com");

}
}
